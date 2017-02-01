/*
 * Ejercicios 1-14
*/

package array;

public class Array {

  /*
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
  */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  /*
   * Devuelve un array de un tamaño dado con números aleatorios entre un
   * máximo y un mínimo tambien dados como parámetros
   *
   * @param tamano  Tamaño del array
   * @param minimo  Número mínimo que se puede obtener en la obtención
   *                de números
   * @param maximo  Número máximo que se puede obtener en la obtención
   *                de números
   * @return        Array de número enteros comprendidos entre el máximo
   *                y el mínimo
  */
  public static int[] generaArrayInt(int tamano, int minimo, int maximo) {
    int[] numeros = new int[tamano];
    for (int i = 0; i < tamano; i++) {
      numeros[i] = (int)(Math.random() * (maximo - minimo) + minimo);
    }
    return numeros;
  }

  /*
   * Devuelve el mínimo del array dado como parámetro
   *
   * @param numeros Array de una dimensión de números enteros para
   *                conseguir el mínimo
   * @return        Número mínimo del array
  */
  public static int minimoArrayInt(int[] numeros) {
    int minimo = numeros[0];
    for (int x : numeros){
      if (minimo > x){
        minimo = x;
      }
    }
    return minimo;
  }
  
  /*
   * Devuelve el máximo del array dado como parámetro
   *
   * @param numeros Array de una dimensión de números enteros para
   *                conseguir el máximo
   * @return        Número máximo del array
  */
  public static int maximoArrayInt(int[] numeros) {
    int maximo = numeros[0];
    for (int x : numeros){
      if (maximo < x){
        maximo = x;
      }
    }
    return maximo;
  }

  /*
   * Devuelve la media del array dado como parámetro
   *
   * @param numeros Array de una dimensión de número enteros para hacer
   *                la media
   * @return        Media de todos los números del array
  */
  public static double mediaArrayInt(int[] numeros) {
    int i = 0;
    int suma = 0;
    for (int x : numeros){
      suma = suma + x;
      i++;
    }
    return suma/i;
  }

  /*
   * Devuelve true si el número dado como parámetro está en el array
   * dado también como parámetro o no
   *
   * @param x       Número entero a comprobar si está en el array
   * @param numeros Array de números enteros
   * @return        <code>true</code> Si el número está en el array
   * @return        <code>false</code> Si el número no está en el array
  */
  public static boolean estaEnArrayInt(int x, int[] numeros) {
    for (int y : numeros) {
      if (x == y){
        return true;
      }
    }
    return false;
  }

  /*
   * Devuelve la posición dentro del array en la que se encuentra un
   * número dado
   *
   * @param x       Número entero a encontrar en el array
   * @param numeros Array de números enteros
   * @return        Posición en la que se encuentra el número a buscar,
   *                en caso de que el número dado no exista devuelve -1
  */
  public static int posicionEnArrayInt(int x, int[] numeros) {
    int i = 0;
    for (int y : numeros) {
      if (y == x) {
        return i;
      }
      i++;
    }
    return -1;
  }

  /*
   * Le da la vuelta al array pasado como parametro
   *
   * @param numeros Array de números enteros
   * @return        Array anterior pero con los valores en orden inverso
  */
  public static int[] volteaArrayInt(int[] numeros) {
    int[] volteado = new int[numeros.length];
    for (int i = 0; i < numeros.length; i++) {
      volteado[numeros.length - i - 1] = numeros[i];
    }
    return volteado;
  }

  
  /*
   * Devuelve el array dado como parámetro rotado un número determinado
   * de posiciones a la derecha
   *
   * @param posciones Posiciones hacia la derecha que se va a rotar el
   *                  array
   * @param numeros   Array de números enteros que se va a rotar
   * @return          Array rotado x posiciones a la derecha
  */
  public static int[] rotaDerechaArrayInt(int posiciones, int[] arnumeros) {
    int[] numeros = arnumeros.clone();
    for (int j = 0; j < posiciones; j++) {
      int aux = numeros[numeros.length - 1];
      for (int i = numeros.length - 1; i > 0; i--){
        numeros[i] = numeros[i - 1];
      }
      numeros[0] = aux;
    }
    return numeros;
  }
  
  /*
   * Devuelve el array dado como parámetro rotado un número determinado
   * de posiciones a la izquierda
   *
   * @param posciones Posiciones hacia la izquierda que se va a rotar el
   *                  array
   * @param array     Array de números enteros que se va a rotar
   * @return          Array rotado x posiciones a la derecha
  */
  public static int[] rotaIzquierdaArrayInt(int posiciones, int[] arnumeros) {
    int[] numeros = arnumeros.clone();
    for (int j = 0; j < posiciones; j++) {
      int aux = numeros[0];
      for (int i = 0; i < (numeros.length - 1); i++){
        numeros[i] = numeros[i + 1];
      }
      numeros[numeros.length - 1] = aux;
    }
    return numeros;
  }
}
