import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex22img1 {
  public static void main(String[] args){
    boolean argumento = false;
    boolean existe = true;
    double media = 0;
    int contador = 0;
    for (String archivo : args){
      argumento = true;
      try {
        BufferedReader bf = new BufferedReader(new FileReader(archivo));
        String linea = "";
        while (linea != null){
          if (!linea.equals("")){
            media += Double.parseDouble(linea);
            contador++;
          }
          linea = bf.readLine();
        }
      } catch (IOException e){
        System.out.println("Error, artchivo no encontrado");
        existe = false;
      }
      
    }
    if (argumento){
      if (existe){
        System.out.println("En total hay " + contador + " y la media es " + (media/contador));
      }
    } else {
      System.out.println("Error, no se han encontrado argumentos");
    }
  }
}
