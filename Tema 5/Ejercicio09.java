/*
 * Ejercicio 9
 * 
 * Dado un número nos dice cuantos dígitos tiene
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio09 {
  public static void main(String[] args){
    System.out.printf("Introduce un número: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    int i = 0;
    do {
      i++;
      num_usuario = num_usuario / 10;
    } while (num_usuario != 0);
    System.out.println("El número tiene " + i + " dígitos");
  }
}
