/* Ejercicio 2
 *
 * @author Ismael Maldonado González
 * date 15/11/2016
 * modelo B
*/

public class Ex22img2 {
  public static void main(String[] args){
    int num_usuario;
    long contador = 0;
    // Pedimos los números
    System.out.println("Por favor, vaya introduciendo números y pulsando [INTRO]: ");
    do {
      num_usuario = Integer.parseInt(System.console().readLine());
      boolean primo = true;
      int num_aux = num_usuario - 1;
      // Averiguamos si el número introducido es primo o no y salimos 
      // del bucle en caso que que virifiquemos que no es primo o el
      // número sea menor que 2
      while (num_aux > 1 && (primo)) {
        if ((num_usuario % num_aux) == 0) {
          primo = false;
        }
        num_aux--;
      }
      if ((primo) && num_usuario > 0) {
        contador++;
      }
    } while (num_usuario >= 0);
    //Mientras que el número introducido no sea negativo seguimos dentro
    //del bucle

    //Imprimimos la cantidad de número primos encontrados
    System.out.printf("Ha introducido %d números primos", contador);
  }
}
