/*
 * Ejercicios 1-14
*/ 
package matematicas;


public class Varias {

  /*
   * Devuelve true o flase dependiendo si el número pasado es capicúo o no
   * 
   * @param x numero entero positivo
   * @return <code>true</code> si el número es capicúo
   * @return <code>false</code> si el NO número es capicúo
  */
  public static boolean esCapicua(long x){
    long num_usuario = x;
    long aux = num_usuario;
    String comprobador = "";
    while (aux > 0) {
       comprobador = comprobador + (aux % 10);
      aux = aux / 10;
    }
    if (Long.parseLong(comprobador) == num_usuario) {
      return true;
    } else {
      return false;
    }
  }
    
  /*
   * Devuelve true o false dependiendo si el número es primo o no
   *
   * @param x numero entero positivo
   * @return <code>true</code> si el número es primo
   * @return <code>true</code> si el número NO es primo
   * 
   */

  public static boolean esPrimo(long x){
    long numero = x;
    boolean primo = true;
    long j = numero - 1;
    while ((primo) && (j > 1)) {
      if ((numero % j) == 0) {
        primo = false;
      }
      j--;
    }
    if (primo) {
      return true;
    } else {
      return false;
    }
  }
  
  /*
   * Devuetelelve el siguiente número primo al número que se le pasa
   * 
   * @param x numero entero positivo
   * @return long siguiente número primo
   */

  public static long siguientePrimo(long x){
    while (!esPrimo(x)) {
      x++;
    }
    return x;
  }

  /*
   * Devuelve la potencia a partir de una base y un exponente dados
   *
   * @param base número entero que es la base de la potencia
   * @param exponente numero entero que es el exponente de la potencia
   * @return long potencia
   */
  public static long potencia(long base, int exponente){
    long resultado = 1;
    for (int i = exponente; i > 0; i--) {
      resultado = resultado * base;
    }
    return resultado;
  }

  /*
   * Devuelve el número de dígitos que tiene un número dado
   *
   * @param num numero entero positivo
   * @return int número de dígitos que tiene el entero dado
   */
  public static int digitos(long num) {
    int contador = 0;
    while (num > 0) {
      num = num / 10;
      contador++;
    }
    return contador;
  }

  /*
   * Devuelve el número dado pero al revés
   *
   * @param num numero entero positivo
   * @return long numero al revés
   */
  public static long voltea(long num) {
    String resultado = "";
    boolean negativo = false;
    if (num < 0) {
      negativo = true;
      num = num * -1;
    }
    while (num > 0) {
      resultado = resultado + (num % 10);
      num = num / 10;
    }
    if (!negativo) {
      return Long.parseLong(resultado);
    } else {
      return Long.parseLong("-" + resultado);
    }
  }

  /*
   * Devuelve el dígito de un número dado en una posición concreta dada
   *
   * @param num numero entero positivo
   * @param pos posición del número que se quiere obtener
   * @return long numero de la posición dada
   */
  public static long digitoN(long num, int pos) {
    long digito = 0;
    pos++;
    for (int i = 0; i < pos; i++) {
      digito = num % 10;
      num = num / 10;
    }
    return digito;
  }

  /*
   * Devuelve la posición del dígito dado, en caso de que no lo
   * encuentre, devuelve -1
   *
   * @param num número entero positivo
   * @param dig número entero positivo de una cifra a buscar
   * @return int posición del dígito, si no se encuentra devuelve -1
   */
  public static int posicionDeDigito(long num, int dig) {
    boolean existe = false;
    int contador = 0;
    while (num > 0) {
      if (((num % 10) == dig) || existe) {
        existe = true;
        contador++;
      }
      num = num / 10;
    }
    if (!existe) {
      return -1;
    } else {
      return contador;
    }
  }

  /*
   * Devuelve el número dado con n dígitos quitados por la derecha
   *
   * @param num número entero positivo
   * @param n cantidad de números que se quitan por la derecha
   * @return long número con n digitos quitados por la derecha
   */
  public static long quitaPorDetras(long num, int cantidad) {
    return num / (cantidad * 10);
  }

  /*
   * Devuelve el número dado con n digitos quitados por la izquierda
   *
   * @param num número entero positivo
   * @param n cantidad de números que se quitan por la izquierda
   * @return long número con n digitos quitados por la izquierda
   */
  public static long quitaPorDelante(long num, int cantidad) {
    int i;
    for (i = 1; i < num; i = i * 10);
    i = (i / 10) / (cantidad * 10);
    return num % i;    
  }

  /*
   * Devuelve el número con un dígito extra dado por la derecha
   *
   * @param num número entero positivo
   * @param dig digito a pegar por la derecha
   * @return long número resultante
   */
  public static long pegaPorDetras(long num, int dig) {
    return Long.parseLong(num + "" + dig);
  }

  /*
   * Devuelve el número con un dígito extra dado por la izquierda
   *
   * @param num número entero positivo
   * @param dig digito a pegar por la izquierda
   * @return long número resultante
   */
  public static long pegaPorDelante(long num, int dig) {
    return Long.parseLong(dig + "" + num);
  }

  /*
   * Toma como parámetros las posiciones inicial y final dentro de un
   * número y devuelve el trozo correspondiente
   *
   * @param num número entero positivo
   * @param inicio posición inicial del número a obtener
   * @param fin poscicion final del número a obtener
   * @return long número cortado
   */
  public static long trozoDeNumero(long num, int inicio, int fin) {
    long resultado = num / (inicio * 10);
    resultado = resultado % ((fin - inicio) * 10);
    return resultado;
  }

  /*
   * Pega dos número dados para formar uno
   *
   * @param num1 numero entero positivo
   * @param num2 numero entero positivo
   * @return long números pegados
   */
  public static long juntaNumeros(long num1, long num2) {
    return Long.parseLong(num1 + "" + num2);
  }
}
