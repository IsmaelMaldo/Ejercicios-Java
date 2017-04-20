import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {
  public static void main(String[] args) {
    ArrayList<String> lista =  new ArrayList<String>();
    System.out.println("Por favor, introduce 10 nombres separados por intro para su ordenación:");
    for (int i = 0; i < 10; i++){
      lista.add(System.console().readLine());
    }
    Collections.sort(lista);
    System.out.println("\n\n");
    for (String palabra : lista){
      System.out.println(palabra);
    }
  }
}
