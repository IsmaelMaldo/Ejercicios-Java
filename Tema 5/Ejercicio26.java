/*
 * Ejercicio 26
 * 
 * Pide un número, luego pide otro y averigua en que posición se
 * encuentra ese número
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio26 {
  public static void main(String[] args){
    System.out.printf("Introduce un número: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    System.out.printf("Introduce un número para averiguar su posición: ");
    int num_usuario2 = Integer.parseInt(System.console().readLine());
    boolean existe = false;
    int contador = 0;
    while (num_usuario > 0) {
      if (((num_usuario % 10) == num_usuario2) || existe) {
        existe = true;
        contador++;
      }
      num_usuario = num_usuario / 10;
    }
    if (!existe) {
      System.out.println("Ese número no existe");
    } else {
      System.out.println("El número introducido está en la posición número " + (contador));
    }
  }
}
