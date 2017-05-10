import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio03 {
  public static void main(String[] args) {
    try {
      BufferedReader bf1 = new BufferedReader(new FileReader("origen1.txt"));
      BufferedReader bf2 = new BufferedReader(new FileReader("origen2.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("final.txt"));
      String linea1 = "";
      String linea2 = "";
      while (linea1 != null && linea2 != null){
        if (linea1.equals("")){
          linea1 = bf1.readLine();
          linea2 = bf2.readLine();
        }
        bw.write(linea1 + "\n");
        bw.write(linea2 + "\n");
        linea1 = bf1.readLine();
        linea2 = bf2.readLine();
      }
      while (linea1 != null) {
        bw.write(linea1 + "\n");
        linea1 = bf1.readLine();
      }
      while (linea2 != null) {
        bw.write(linea2 + "\n");
        linea2 = bf2.readLine();
      }
      bw.close();
    } catch (IOException e){
          System.out.println("Ha ocurrido un error");
    }
  }
}
