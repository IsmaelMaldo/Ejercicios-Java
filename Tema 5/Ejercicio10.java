/*
 * Ejercicio 10
 * 
 * Programa que calcula la media a partir de una cantidad de números dados
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio10 {
  public static void main(String[] args){
    System.out.println("Introduce los números de los que quieres calcular la media (Para indicar que has terminado introduce un número negativo)");
    int num_usuario = Integer.parseInt(System.console().readLine());
    int res = 0;
    int i = 0;
    while (num_usuario > 0) {
      if (num_usuario > 0) {
        res = res + num_usuario;
        i++;
      }
      num_usuario = Integer.parseInt(System.console().readLine());
    }
    if ((num_usuario > 0) || (i != 0)) {
      System.out.println("La media de los número introducidos es " + (res / i));
    } else {
      System.out.println("No has introducido ningún valor válido");
    }
  }
}
