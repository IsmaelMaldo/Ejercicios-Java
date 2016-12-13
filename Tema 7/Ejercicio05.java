/*
 * Ejercicio 5
 * 
 * Pide al usuario que meta 10 números, luego los muestra y al lado del
 * máximo y del mínimo se pone "maximo" o "mínimo" repectivamente
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio05 {
  public static void main(String[] args){
    int[] numero = new int[10];
    System.out.println("Introduce 10 números separados por intro");
    for (int i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    int max = numero[0];
    int min = numero[0];
    for (int n : numero) {
      if (n < min) {
        min = n;
      }
      if (n > max) {
        max = n;
      }
    }
    System.out.println(min);
    System.out.println("A continuación se mostrarán los números introducidos y se inidicará el menor y el mayor");
    for (int n : numero) {
      if (n == max) {
        System.out.println("Máximo " + n);
      } else if (n == min) {
        System.out.println("Mínimo " + n);
      } else {
        System.out.println(n);
      }
    }
    
  }
}
