/*
 * Ejercicio 7
 * 
 * Pide la contraseña para abrir la caja fuerte
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio07 {
  public static void main(String[] args){
    int intentos = 1;
    int contrasena = 1212;
    System.out.printf("Introduce la cobinación de la caja fuerte: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    while ((intentos < 4) && (num_usuario != contrasena)) {
      System.out.println("Lo siento, esa no es la combinación");
      num_usuario = Integer.parseInt(System.console().readLine());
      intentos++;
    }
    if (num_usuario == contrasena) {
      System.out.println("La caja fuerte se ha abierto satisfactoriamente");
    } else {
      System.out.println("Te has quedado sin intentos y la caja fuerte se ha bloqueado");
    }
  }
}
