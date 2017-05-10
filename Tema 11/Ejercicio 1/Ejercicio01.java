import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      for (int i = 1; i <=500; i++){
        boolean primo = true;
        for (int j = i-1; j >= 2 && primo; j--){
          if ((i % j) == 0){
            primo = false;
          }
        }
          if (primo){
            System.out.println(i);
            bw.write(i + "\n");
          }
        }
        bw.close();
      } catch (IOException e){
          System.out.println("Ha ocurrido un error");
    }
  }
}
