import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class Analizador {
  public static void main(String[] args){
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("popurri.txt"));
      for (int i = 0; i < ((int)(Math.random() * (10 * 10) + 20)); i++){
        String linea = "";
        for (int j = 0; j < ((int)(Math.random() * 900 + 20)); j++){
          linea = linea + generaCaracter();
        }
        bw.write(linea + "\n");
      }
      bw.close();
    } catch (IOException e){
      System.out.println(e);
    }
  }

  public static String generaCaracter(){
    int numero = (int)(Math.random() * 10045 + 1);
    if (numero <= 1253){
      return "a";
    } else if (numero <= 1395){
      return "b";
    } else if (numero <= 1863){
      return "c";
    } else if (numero <= 2449){
      return "d";
    } else if (numero <= 3817){
      return "e";
    } else if (numero <= 3886){
      return "f";
    } else if (numero <= 3987){
      return "g";
    } else if (numero <= 4057){
      return "h";
    } else if (numero <= 4682){
      return "i";
    } else if (numero <= 4726){
      return "j";
    } else if (numero <= 4727){
      return "k";
    } else if (numero <= 5224){
      return "l";
    } else if (numero <= 5539){
      return "m";
    } else if (numero <= 6210){
      return "n";
    } else if (numero <= 6241){
      return "ñ";
    } else if (numero <= 7109){
      return "o";
    } else if (numero <= 7360){
      return "p";
    } else if (numero <= 7448){
      return "q";
    } else if (numero <= 8135){
      return "r";
    } else if (numero <= 8933){
      return "s";
    } else if (numero <= 9396){
      return "t";
    } else if (numero <= 9789){
      return "u";
    } else if (numero <= 9879){
      return "v";
    } else if (numero <= 9881){
      return "w";
    } else if (numero <= 9903){
      return "x";
    } else if (numero <= 9993){
      return "y";
    } else{
      return "z";
    }
  }
}
