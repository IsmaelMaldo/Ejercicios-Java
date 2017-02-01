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
    for (int i = 0; i < n.length; i++){
      boolean hay7 = false;
      int aux = n[i];
      while (aux > 0 && !hay7) {
        int dig = aux % 10;
        aux = aux / 10;
        if (dig == 7){
          contador++;
          hay7 = true;
        }
      }
    }
    int[] num7 = new int[contador];
    contador = 0;
    for (int i = 0; i < n.length; i++){
      boolean hay7 = false;
      int aux = n[i];
      while (aux > 0 && !hay7) {
        int dig = aux % 10;
        aux = aux / 10;
        if (dig == 7){
          hay7 = true;
        }
      }
      if (hay7) {
        num7[contador] = n[i];
        contador++;
      }
    }
    return num7;
  }
}
