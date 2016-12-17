/* Ejercicio 2
 *
 * @author Ismael Maldonado González
 * date 15/12/2016
 * modelo B
*/

public class Ex22img2 {
  public static void main(String[] args){
    //Declaramos la variable donde vamos a meter los número de usuario
    int[] num_usuario = new int[5];
    //Pedimos los números
    System.out.println("Por favor, introduzca sus 5 números favoritos: ");
    for (int i = 0; i < 5; i++) {
      num_usuario[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.printf("\n\n");
    //Empezamos a imprimir los número de 1 al 100
    for (int i = 1; i <= 100; i++) {
      //Declaramos una bandera para saber si el número que vamos a
      //imprimir conincide con alguno de los usuarios
      boolean gusta = false;
      //Comprobamos que el número a imprimir coincide o no con los del
      //usuario
      for (int j = 0; (j < 5) && !gusta; j++) {
        if (i == num_usuario[j]) {
          gusta = true;
        }
      }
      //Imprimimos en función del estado de la bandera
      if (gusta) {
        System.out.printf("%d ME GUSTA, ", i);
      } else {
        System.out.printf("%d no me gusta, ", i);
      }
      //Si el número a imprimir es múltiplo de 5, es decir, cada 5
      //números impresos, saltamos de línea
      if ((i % 5) == 0) {
        System.out.printf("\n");
      }
    }
  }
}
