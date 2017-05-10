import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class quita_comentarios {
  public static void main(String[] args) {
    File fichero = new File(args[0]);
    if (fichero.exists()){
      try {
        //Leemos el archivo dado como parametro
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        //Creamos el array list donde guardaremos cada una de las lineas
        ArrayList<String> textoArchivo = new ArrayList<String>();
        //Creamo el archivo nuevo donde meteremos el archivo dado ordenado
        String archivoNuevo = args[1];
        File nf = new File(archivoNuevo);
        nf.createNewFile();
        //Metemos en el ArrayList las diferentes líneas del archivo
        String linea = "";
        while (linea != null){
          textoArchivo.add(linea);
          linea = br.readLine();
        }
        //Metemos el ArrayList el archivo
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo));
        boolean comentario = false;
        for (String lineaNueva : textoArchivo){
          //Comprobamos que no estemos escaneando un comentario de varias líneas
          if (lineaNueva.indexOf("/*")!= -1){
            comentario = true;
          }
          if (lineaNueva.indexOf("*/") != -1){
            comentario = false;
          }
          if (!comentario){
            //Quitamos los comentarios de doble barra
            lineaNueva = lineaNueva.replaceAll(" *//.*", "");
            //No metemos en el nuevo archivo las líneas sin contenido
            if (!(lineaNueva.equals("")) && (lineaNueva.indexOf("*/") == -1)){
              System.out.printf(lineaNueva + "\n");
              bw.write(lineaNueva + "\n");
            }
          }
        }
        bw.close();
      } catch (IOException e){
        System.out.println("Ha habido un error");
      }
    } else {
      System.out.println("El archivo no existe");
    }
  }
}
