/*
 * Ejercicio 24
 *
 * Elije al azar un dígito de un número dado
 *  
 * @author Ismael Maldonado González
*/

public class Ejercicio24 {
  public static void main(String[] args){
    System.out.printf("Por favor, introduce un número entero positivo: ");
    long num_usuario = Long.parseLong(System.console().readLine());
    long divisor = 1;
    int longitud = 0;
    //averiguamos cuanto mide el número introducido
    while (num_usuario > divisor) {
      divisor = divisor * 10;
      longitud++;
    }
    int selector = (int)(Math.random() * longitud);
    for (int i = 0; i < selector; i++) {
      num_usuario = num_usuario / 10;
    }
    for (int i = 0; i < longitud; i++) {
      num_usuario = num_usuario % 10;
    }
    System.out.println(num_usuario);
  }
}

