/*
 * Ejercicio 38
 *
 * Filtra los números capicúos de un array
 *
 * @author Ismael Maldonado González
*/

import matematicas.Varias;

public class Ejercicio38 {
  public static void main(String[] args) {
    int[] numero = new int[100];
    for (int i = 0; i < 100; i++){
      numero[i] = i;
    }
    int[] capicuas = filtraCapicuas(numero);
    for (int x : capicuas) {
      System.out.println(x);
    }
  }

  /*
   * Filtra los números capicúos de un array
   *
   * @param n    Número entero positivo
   * @return     Array sólo de números capicúos
  */
  public static int[] filtraCapicuas(int[] n) {
    int contador = 0;
    for (int i = 0; i < n.length; i++){
      if (matematicas.Varias.esCapicua(n[i])){
        contador++;
      }
    }
    int[] num_primos = new int[contador];
    contador = 0;
    for (int i = 0; i < n.length; i++){
      if (matematicas.Varias.esCapicua(n[i])){
        num_primos[contador] = n[i];
        contador++;
      }
    }
    return num_primos;
  }
}
