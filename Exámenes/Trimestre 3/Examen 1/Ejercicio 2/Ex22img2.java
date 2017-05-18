import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex22img2 {
  public static void main(String[] args){
    try {
      BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader bf2 = new BufferedReader(new FileReader(args[1]));
      ArrayList<String> palabrasProhibidas = new ArrayList<String>();
      String linea = "";
      while (linea != null){
        if (!linea.equals("")){
          palabrasProhibidas.add(linea);
        }
        linea = bf2.readLine();
      }
      linea = "";
      while (linea != null){
        if (!linea.equals("")){
          for (String palabra : palabrasProhibidas){
            String censura = "";
            for (int i = 0; i < palabra.length(); i++){
              censura = censura + "*";
            }
            linea = linea.replace(palabra, censura);
          }
          System.out.println(linea);
        }
        linea = bf1.readLine();
      }
    } catch (IOException e){
      System.out.println("Error, artchivo no encontrado");
    }
  }
}
