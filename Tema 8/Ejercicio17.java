/*
 * Ejercicio 17
 *
 * Transforma de binario a decimal
 *
 * @author Ismael Maldonado González
*/

import matematicas.Varias;

public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Introduce un número en binario:");
    long binario = Long.parseLong(System.console().readLine());
    System.out.println(binADec(binario));
  }

  public static long binADec (long binario) {
    int contador = 0;
    for (int i = 1; i < binario; i = i * 10) {
      contador++;
    }
    long decimal = 0;
    for (int i = 0; i < contador; i++){
      decimal = decimal + (matematicas.Varias.digitoN(binario, i) * matematicas.Varias.potencia(2, i));
    }
    return decimal;
  }
}
