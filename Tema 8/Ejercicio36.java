/*
 * Ejercicio 36
 *
 * Filtra los números primos de un array
 *
 * @author Ismael Maldonado González
*/

import matematicas.Varias;

public class Ejercicio36 {
  public static void main(String[] args) {
    int[] numero = new int[10];
    for (int i = 0; i < 10; i++){
      numero[i] = i;
    }
    int[] primos = filtraPrimos(numero);
    for (int x : primos) {
      System.out.println(x);
    }
  }

  /*
   * Filtra los primos de un array
   *
   * @param n    Número entero positivo
   * @return     Array sólo de primos
  */
  public static int[] filtraPrimos(int[] n) {
    int contador = 0;
    for (int i = 0; i < n.length; i++){
      if (matematicas.Varias.esPrimo(n[i])){
        contador++;
      }
    }
    int[] num_primos = new int[contador];
    contador = 0;
    for (int i = 0; i < n.length; i++){
      if (matematicas.Varias.esPrimo(n[i])){
        num_primos[contador] = n[i];
        contador++;
      }
    }
    return num_primos;
  }
}
