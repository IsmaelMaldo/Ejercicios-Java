/*
 * Ejercicio 25
 * 
 * Pide un número y lo muestra luego al revés
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio25 {
  public static void main(String[] args){
    int num_usuario;
    System.out.printf("Introduce un número para darle la vuelta: ");
    num_usuario = Integer.parseInt(System.console().readLine());
    while (num_usuario > 0) {
      System.out.printf("%d", num_usuario % 10);
      num_usuario = num_usuario / 10;
    }
  }
}
