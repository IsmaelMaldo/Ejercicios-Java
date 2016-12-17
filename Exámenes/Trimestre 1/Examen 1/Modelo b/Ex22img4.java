/* Ejercicio 4
 *
 * @author Ismael Maldonado González
 * date 15/11/2016
 * modelo B
*/

public class Ex22img4 {
  public static void main(String[] args){
    //Pedimos la altura de la pirámide
    System.out.printf("Introduzca la altura de la pirámide maya: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    // Construyendo la pirámide
    for (int i = 1; i <= num_usuario; i++) {
      int j = 1;
      // Espacios antes de los astericos
      for (j = j; j < num_usuario - i + 1; j++) {
        System.out.printf(" ");
      }
      // Impresión de asteriscos
      // Imprime las filas con terraza, darse cuenta que la cantidad
      // de asteriscos a cada lado de la terraza pirámide coincide con 
      // el número de la línea que estamos imprimiendo
      if ((i % 2) == 0){
        for (int x = 1; x <= i ; x++) {
          System.out.printf("*");
        }
        for (int x = 1; x <= 4; x++) {
          System.out.printf(" ");
        }
        for (int x = 1; x <= i; x++) {
          System.out.printf("*");
        }
      } else {                    // Imprime las filas sin terraza
        for (j = j; j < num_usuario + i + 5; j++) {
          System.out.printf("*");
        }
      }
      System.out.printf("\n");
    }
  }
}
