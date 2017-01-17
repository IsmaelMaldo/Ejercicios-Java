/*
 * Ejercicio 18
 *
 * Transforma de binario a decimal
 *
 * @author Ismael Maldonado González
*/

import matematicas.Varias;
import java.io.*;

public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Introduce un número en binario:");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(decABin(numero));
  }

  public static long decABin (long decimal) {
    String binario = "";
    while (decimal > 0) {
      binario = binario + (decimal % 2);
      decimal = decimal / 2;
    }
    String resultado = "";
    for (int i = (binario.length() - 1); i >= 0; i--) {
      resultado = resultado + binario.charAt(i);
    }
    return Long.parseLong(resultado);
  }
}
