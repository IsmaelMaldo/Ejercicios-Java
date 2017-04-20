import java.util.ArrayList;

public class Ejercicio2 {
  public static void main(String[] args) {
    ArrayList<Integer> lista =  new ArrayList<Integer>();
    int tamanoArray = (int)(Math.random() * 11 + 10);
    for (int i = 0; i < tamanoArray; i++){
      lista.add((int)(Math.random() * 101));
    }
    int max = lista.get(0);
    int min = lista.get(0);
    int suma = 0;
    for (int numero : lista){
      System.out.println(numero);
      suma += numero;
      if (max < numero){
        max = numero;
      }
      if (min > numero){
        min = numero;
      }
    }
    System.out.println("La suma de todos los números es: " + suma);
    System.out.println("La media de todos los números es: " + suma/tamanoArray);
    System.out.println("El máximo es: " + max);
    System.out.println("El mínimo es: " + min);
  }
}
