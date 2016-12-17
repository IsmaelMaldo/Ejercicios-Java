/* Ejercicio 3
 *
 * @author Ismael Maldonado González
 * date 15/11/2016
 * modelo B
*/

public class Ex22img3 {
  public static void main(String[] args){
    //Pedimos el número
    System.out.printf("Por favor, introduzca un número: ");
    long num_usuario = Long.parseLong(System.console().readLine());
    //Declaramos las variables necesarias
    long num_conservar = num_usuario;
    long divisor = 1;
    String dislocado = "";
    long dislocado_num;
    // Averiguamos cuanto mide el primer número introducido
    while (num_usuario > divisor) {
      divisor = divisor * 10;
    }
    divisor = divisor / 10;
    //Dislocamos el número
    while (num_usuario > 0)  {
      long aux = num_usuario / divisor;
      if ((aux % 2) == 0) {
        aux++;
      } else {
        aux--;
      }
      //Vamos introduciendo los diferentes dígitos en la variable
      //dislocado
      dislocado = dislocado + aux;
      num_usuario = num_usuario % divisor;
      divisor = divisor / 10;
    }
    //Convertimos la variable dislocado a long para eliminar los ceros
    dislocado_num = Long.parseLong(dislocado);
    //Imprimimos el resultado
    System.out.printf("Dislocando el %d sale el %d", num_conservar, dislocado_num);
  }
}
