/* Ejercicio 1
 *
 * @author Ismael Maldonado González
 * date 15/12/2016
 * modelo B
*/

public class Ex22img1 {
  public static void main(String[] args){
    // Establecemos el contador de números a imprimir
    int i = 0;
    while (i < 10) {
      //Generamos el número aleatorio
      int j = (int)(Math.random() * 71 + 140);
      //Si el número generado es mútiplo de 7, lo imprimimos e
      //incrementamos el contador i
      if ((j % 7) == 0) {
        System.out.printf("%d ", j);
        i++;
      }
    }
  }
}
