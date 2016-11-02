/*
 * Ejercicio 28
 * 
 * Calcula el factorial de un número dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio28 {
  public static void main(String[] args){
    System.out.printf("Por favor, introduce un número entero: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    int res = 1;
    int aux;
    for (aux = num_usuario; aux >= 1; aux--) {
      res = res * aux;
    }
    System.out.println(num_usuario + "! = " + res);
  }
}
