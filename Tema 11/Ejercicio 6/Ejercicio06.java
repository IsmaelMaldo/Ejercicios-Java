import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio06 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0]));
      String linea = "";
      int contador = 0;
      while (linea != null){
        while (linea.indexOf(args[1]) != -1){
          contador++;
          linea = linea.replaceFirst(args[1], "");
        }
        linea = br.readLine();
      }
      System.out.println("La palabra \"" + args[1] + "\" se han encontrado " + contador + " veces");
    } catch (IOException e){
      System.out.println("Ha habido un error");
    }
  }
}
