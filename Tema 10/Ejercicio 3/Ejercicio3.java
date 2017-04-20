import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
  public static void main(String[] args) {
    ArrayList<Integer> lista =  new ArrayList<Integer>();
    System.out.println("Por favor, introduce 10 números separados por intro para su ordenación:");
    for (int i = 0; i < 10; i++){
      lista.add(Integer.parseInt(System.console().readLine()));
    }
    Collections.sort(lista);
    System.out.println("\n\n");
    for (int numero : lista){
      System.out.println(numero);
    }
  }
}
