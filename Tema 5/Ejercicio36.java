/*
 * Ejercicio 36
 * 
 * Dice si un número dado es capicúo o no
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio36 {
  public static void main(String[] args){
    System.out.printf("Introduce un número entero positivo: ");
    long num_usuario = Long.parseLong(System.console().readLine());
    long aux = num_usuario;
    String comprobador = "";
    while (aux > 0) {
       comprobador = comprobador + (aux % 10);
      aux = aux / 10;
    }
    if (Long.parseLong(comprobador) == num_usuario) {
      System.out.printf("El número %d es capicúo", num_usuario);
    } else {
      System.out.printf("El número %d no es capicúo", num_usuario);
    }
    
  }
}
