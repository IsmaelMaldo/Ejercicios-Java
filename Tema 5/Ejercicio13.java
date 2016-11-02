/*
 * Ejercicio 13
 * 
 * Cuenta los números positivos y negativos dados por teclado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio13 {
  public static void main(String[] args){
    int pos = 0;
    int neg = 0;
    System.out.println("Introduce diez números: ");
    for (int i = 0; i < 10; i++) {
      int num_usuario = Integer.parseInt(System.console().readLine());
      if (num_usuario < 0) {
        neg++;
      } else {
        pos++;
      }
    }
    System.out.printf("Hay %d número positivos y %d números negativos.", pos, neg);
    
  }
}
