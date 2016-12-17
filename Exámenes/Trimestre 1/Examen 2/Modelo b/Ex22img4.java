/* Ejercicio 4
 *
 * @author Ismael Maldonado González
 * date 15/12/2016
 * modelo B
*/

public class Ex22img4 {
  public static void main(String[] args){
    //Declaramos las variables requeridas en el ejecicio
    String[] pieza = {
      "Dama",
      "Torre",
      "Alfil",
      "Caballo",
      "Peón"
    };
    int[] valor = {
      9,
      5,
      3,
      2,
      1
    };
    //Generamos un número aleatorio para cada ficha en función de las
    //fichas que se puedan capturar
    int[] capturas = {
      (int)(Math.random() * 2),
      (int)(Math.random() * 3),
      (int)(Math.random() * 3),
      (int)(Math.random() * 3),
      (int)(Math.random() * 9)
    };
    //Establecemos la variable en la que iremos introduciendo los puntos
    int suma = 0;
    System.out.println("Fichas capturadas por el jugador:");
    //Imprimimos las capturas
    for (int i = 0; i < 5; i++) {
      //Si el número generado para una ficha es 0, no mostramos esa
      //ficha
      if (capturas[i] != 0) {
        System.out.printf("%s (%d peones)\n", pieza[i], valor[i] * capturas[i], capturas[i]);
        //Sumamos los puntos de del ficha
        suma = suma + (valor[i] * capturas[i]);
      }
    }
    //Mostramos el resultado final
    System.out.printf("Puntos totales: %d peones", suma);
  }
}
