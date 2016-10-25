/*
 * Ejercicio 12
 * 
 * Muestra por pantalla una cantidad dada de números de la serie de fibonacci
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio12 {
  public static void main(String[] args){
    System.out.printf("Introduce un número: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    int fibo1 = 0;
    int fibo2 = 1;
    for (int i = 0; i < num_usuario; i++) {
      System.out.printf("%d, ", fibo1);
      int aux = fibo1;
      fibo1 = fibo1 + fibo2;
      fibo2 = aux;
    }
    
  }
}
