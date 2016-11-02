/*
 * Ejercicio 23
 *
 * Permite introducir cifras mientras que su suma no pase de 10000.
 * Cuando la suma pasa de 10000 se muestra el total de la suma de todas
 * las cifras, cuantos números se han introducido y la media de todos los
 * números introducidos
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio23 {
  public static void main(String[] args){
    System.out.println("Introduce una serie de números");
    double total = 0;
    int contador = 0;
    do {
      double num_usuario = Double.parseDouble(System.console().readLine());
      total = total + num_usuario;
      contador++;
    } while (total <= 10000);
    System.out.println("Has introducido " + contador + " números");
    System.out.println("La media de los números introducidos es " + (total / contador));
  }
}
