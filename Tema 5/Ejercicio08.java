/*
 * Ejercicio 8
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio08 {
  public static void main(String[] args){
    System.out.printf("Introduce un número para mostrarte la tabla de multiplicar de ese número: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    System.out.printf("------------------Tabla de multiplicar del %2d-----------------\n", num_usuario);
    for (int i = 0; i <=10; i++) {
      System.out.printf("%d x %d = %d\n", num_usuario, i, (num_usuario * i));
    }
  }
}
