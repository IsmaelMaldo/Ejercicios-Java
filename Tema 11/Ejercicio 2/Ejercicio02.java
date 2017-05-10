import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {
  public static void main(String[] args) {
    try {
      BufferedReader bf = new BufferedReader(new FileReader("primos.dat"));
      String linea = "";
      while (linea != null){
        System.out.println(linea);
        linea = bf.readLine();
      }
    } catch (IOException e){
          System.out.println("Ha ocurrido un error");
    }
  }
}
