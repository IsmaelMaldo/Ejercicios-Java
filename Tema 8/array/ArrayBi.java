/*
 * Ejercicios 1-14
*/

package array;
import matematicas.Varias;


public class ArrayBi {

  /*
   * Muestra por pantalla el contenido de un array bidimensional de números
   * enteros.
   *
   * @param x array bidimiensional de números enteros
  */
  public static void muestraArrayBiInt(int x[][]) {
    for (int f = 0; f < x.length; f++) {
      for (int c = 0; c < x[0].length; c++) {
        System.out.printf("%3d ", x[f][c]);
      }
      System.out.println();
    }
  }

  /*
   * Genera un array de bidimensional con un tamaño dado y con números
   * generados aleatoriamente entre un máximo y un mínimo
   *
   * @param x   Filas del array
   * @param y   Columnas del array
   * @param min Mínimo para generar números aleatorios
   * @param max Máximo para generar números aleatorios
   * @return    Devuelve el array bidimensional generado
  */
  public static int[][] generaArrayBiInt(int x, int y, int min, int max) {
    int[][] numeros = new int[x][y];
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        numeros[i][j] = (int)(Math.random() * (max - min) + min);
      }
    }
    return numeros;
  }

  /*
   * Devuelve la fila indicada en un array unidimensional
   *
   * @param x       Fila a obtener
   * @param numeros Array bidimensional
   * @return        Array unidimensional de la fila indicada
  */
  public static int[] filaDeArrayBiInt(int x, int[][] numeros) {
    int[] fila = new int[numeros[0].length];
    for (int i = 0; i < numeros[0].length; i++) {
      fila[i] = numeros[0][i];
    }
    return fila;
  }

  /*
   * Devuelve la columna indicada en un array unidimensional
   *
   * @param x       Columna a obtener
   * @param numeros Array bidimensional
   * @return        Array unidimensional de la columna indicada
  */
  public static int[] columnaDeArrayBiInt(int x, int[][] numeros) {
    int[] columna = new int[numeros.length];
    for (int i = 0; i < numeros.length; i++) {
      columna[i] = numeros[i][0];
    }
    return columna;
  }

  /*
   * Devuelve la coordenada dentro del array del primer número que
   * coincida en el array con el número dado, en caso de no encontrarlo
   * el array devuelto será {-1, -1}
   *
   * @param x       Número a buscar en el array
   * @param numeros Array bidimensional
   * @return        Array unidimensional con las coordenadas del número
   *                a buscar
  */
  public static int[] coordenadasEnArrayBiInt(int x, int[][] numeros) {
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[0].length; j++) {
        if (x == numeros[i][j]) {
          int[] coordenadas = {i, j};
          return coordenadas;
        }
      }
    }
    int[] coordenadas = {-1, -1};
    return coordenadas;
  }

  /*
   * Devuelve true o false dependiendo si el número indicado es punto de
   * silla o no
   *
   * @param x       Coordenada de la fila
   * @param y       Coordenada de la columna
   * @param numeros Array bidimensional
  */
  public static boolean esPuntoDeSilla(int x, int y, int[][] numeros) {
    int obtenida = numeros[x][y];
    for (int i = 0; i < numeros.length; i++) {
      if (obtenida < numeros[i][y]) {
        return false;
      }
    }
    for (int i = 0; i < numeros[0].length; i++) {
      if (obtenida > numeros[x][i]) {
        return false;
      }
    }
    return true;
  }

  /*
   * Devuelve un array unidimensional que contiene los números de la
   * diagonal indicada
   *
   * @param x1        Primera coordenada de la fila
   * @param y1        Primera coordenada de la columna
   * @param x2        Segunda coordenada de la fila
   * @param y2        Segunda coordenada de la columna
   * @param dirección Determina la dirección en la que se obtienen los
   *                  números, los valores son <code>nose</code> o
   *                  <code>seno</code>
   * @param numeros   Array bidimensional de números enteros
   * @return          Array unidimensional que contiene los números
   *                  correspondientes a la diagonal
  */
  public static int[] diagonal(int x1, int y1, int x2, int y2, String dirección, int[][] numeros) {
    int contador = x2 - x1;
    int[] numdig = new int[contador];
    switch (dirección) {
      case "nose":
        for (int i = 0; i < contador; i++) {
          numdig[i] = numeros[x1 + i][y1 + i];
        }
        return numdig;
      case "seno":
        for (int i = 0; i < contador; i++) {
          numdig[i] = numeros[x2 - i][y2 - i];
        }
        return numdig;
      default:
        for (int i = 0; i < contador; i++) {
          numdig[i] = -1;
        }
        return numdig;
    }
  }
}
