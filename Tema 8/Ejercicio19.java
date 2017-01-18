/*
 * Ejercicio 18
 *
 * Transforma de binario a decimal
 *
 * @author Ismael Maldonado González
*/

import matematicas.Varias;

public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Por favor, selecciona una de las siguientes opciones:");
    System.out.println("1) Binario >> Octal");
    System.out.println("2) Binario >> Decimal");
    System.out.println("3) Binario >> Hexadecimal");
    System.out.println("4) Octal >> Binario");
    System.out.println("5) Octal >> Decimal");
    System.out.println("6) Octal >> Hexadecimal");
    System.out.println("7) Decimal >> Binario");
    System.out.println("8) Decimal >> Octal");
    System.out.println("9) Decimal >> Hexadecimal");
    System.out.println("10) Hexadecimal >> Binario");
    System.out.println("11) Hexadecimal >> Decimal");
    System.out.println("12) Hexadecimal >> Octal");
    int opcion = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduce el valor a convertir:");
    String num_usuario = System.console().readLine();
    switch (opcion) {
      case 1:
        System.out.println(decAOct(binADec(Long.parseLong(num_usuario))));
        break;
      case 2:
        System.out.println(binADec(Long.parseLong(num_usuario)));
        break;
      case 3:
        System.out.println(decAHex(binADec(Long.parseLong(num_usuario))));
        break;
      case 4:
        System.out.println(decABin(octADec(Long.parseLong(num_usuario))));
        break;
      case 5:
        System.out.println(decAOct(Long.parseLong(num_usuario)));
        break;
      case 6:
        System.out.println(decAHex(octADec(Long.parseLong(num_usuario))));
        break;
      case 7:
        System.out.println(decABin(Long.parseLong(num_usuario)));
        break;
      case 8:
        System.out.println(decAOct(Long.parseLong(num_usuario)));
        break;
      case 9:
        System.out.println(decAHex(Long.parseLong(num_usuario)));
        break;
      case 10:
        System.out.println(decABin(hexADec(num_usuario)));
        break;
      case 11:
        System.out.println(hexADec(num_usuario));
        break;
      case 12:
        System.out.println(decAOct(hexADec(num_usuario)));
        break;
      default:
    }
  }

  /*
   * Convierte un número decimal a binario
   *
   * @param long Número entero positivo
   * @return long Número binario equivalente al decimal
  */
  public static long decABin(long decimal) {
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
  
  /*
   * Convierte un número binario a decimal
   *
   * @param long Número binario
   * @return long Número entero decimal equivalente al binario introducido
  */
  public static long binADec(long binario) {
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

  /*
   * Convierte un número decimal a octal
   *
   * @param long número decimal
   * @return String número octal equivalente al decimal introducido
  */
  public static String decAOct(long decimal) {
    return Long.toOctalString(decimal);
  }
  
  /*
   * Convierte un número octal a decimal
   *
   * @param long número en octal
   * @return long Número en decimal equivalente
  */
  public static long octADec(long octal) {
    int contador = 0;
    long digito;
    long resultado = 0;
    while (octal > 0) {
      digito = octal % 10;
      octal = octal / 10;
      resultado = resultado + (digito * matematicas.Varias.potencia(8, contador));
      contador++;
    }
    return resultado;
  }

  /*
   *Convierte un número decimal a hexadecimal
   *
   * @param long numero entero decimal
   * @return String Número en hexadecimal equivalente
  */
  public static String decAHex (long decimal) {
    long binario = decABin(decimal);
    String resultado = "";
    while (binario > 0) {
      long trozo = binario % 10000;
      binario = binario / 10000;
      trozo = binADec(trozo);
      if (trozo < 10) {
        resultado = resultado + trozo;
      } else if (trozo == 10) {
        resultado = resultado + "A";
      } else if (trozo == 11) {
        resultado = resultado + "B";
      } else if (trozo == 12) {
        resultado = resultado + "C";
      } else if (trozo == 13) {
        resultado = resultado + "D";
      } else if (trozo == 14) {
        resultado = resultado + "E";
      } else if (trozo == 15) {
        resultado = resultado + "F";
      }
    }
    return resultado;
  }
  
  /*
   * Convierte un número hexadecimal a decimal
   *
   * @param String Número en hexadecimal
   * @return long Número en decimal
  */
  public static long hexADec (String hexadecimal) {
    return Long.parseLong(hexadecimal, 16);
  }
}
