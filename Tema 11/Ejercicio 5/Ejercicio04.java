import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
  public static void main(String[] args) {
    File fichero = new File(args[0]);
    if (fichero.exists()){
      try {
        //Leemos el archivo dado como parametro
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        //Creamos el array list donde guardaremos cada una de las lineas
        ArrayList<String> textoArchivo = new ArrayList<String>();
        //Creamo el archivo nuevo donde meteremos el archivo dado ordenado
        String archivoNuevo = args[0].replace(".txt", "_sort.txt");
        File nf = new File(archivoNuevo);
        nf.createNewFile();
        //Metemos en el ArrayList las diferentes líneas del archivo
        String linea = "";
        while (linea != null){
          textoArchivo.add(linea);
          linea = br.readLine();
        }
        //Ordenamos el ArrayList
        Collections.sort(textoArchivo);
        //Metemos el ArrayList ordenado en el archivo
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo));
        for (String lineaNueva : textoArchivo){
          if (!(lineaNueva.equals(""))){
            System.out.printf(lineaNueva + "\n");
            bw.write(lineaNueva + "\n");
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
