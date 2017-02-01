/*
 * Ejercicio 40
 *
 * Filtra los números que contienen el dígito 7
 *
 * @author Ismael Maldonado González
*/

import matematicas.Varias;

public class Ejercicio40 {
  public static void main(String[] args) {
    int[] numero = new int[100];
    for (int i = 0; i < 100; i++){
      numero[i] = i;
    }
    int[] siete = filtraCon7(numero);
    for (int x : siete) {
      System.out.println(x);
    }
  }

  /*
   * Filtra los números que contienen el dígito 7
   *
   * @param n    Número entero positivo
   * @return     Array sólo con el dígito 7
  */
  public static int[] filtraCon7(int[] n) {
    int contador = 0;
    for (int x : n){
        if (hay7(x)){
          contador++;
        }
    }
    int[] num7 = new int[contador];
    contador = 0;
    for (int x : n){
      if (hay7(x)) {
        num7[contador] = x;
        contador++;
      }
    }
    return num7;
  }

  /*
   * Devuelve verdadero o falso dependiendo de si el número dado tiene
   * el dígito 7 o no
   *
   * @param num Número entero
   * @return <code>true</code> Si está el dígito 7
   * @return <code>false</code> Si no está el dígito 7
  */
  public static boolean hay7(int num) {
    while (num > 0) {
      if ((num % 10) == 7){
        return true;
      }
      num = num / 10;
    }
    return false;
  }
}
