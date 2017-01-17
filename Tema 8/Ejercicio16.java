/*
 * Ejercicio 16
 *
 * Muestra los números capicúos que hay entre el 1 y el 1000.
 *
 * @author Ismael Maldonado González
*/

import matematicas.Varias;

public class Ejercicio16 {
  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
      if (matematicas.Varias.esCapicua(i)){
        System.out.printf(i + " ");
      }
    }
  }
}
