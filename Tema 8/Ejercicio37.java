/*
 * Ejercicio 37
 *
 * Transforma de decimal a sistema de palotes
 *
 * @author Ismael Maldonado González
*/

public class Ejercicio37 {
  public static void main(String[] args) {
    System.out.println("Introduce un número en decimal:");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(convierteEnMorse(numero));
  }

  /*
   * Convierte un número decimal a morse
   *
   * @param n    Número entero positivo
   * @return     Número convertido a morse
  */
  public static String convierteEnMorse(int n) {
    String morse = "";
    int aux = n;
    while (aux > 0){
      int dig = aux % 10;
      switch (dig) {
        case 0:
          morse = morse + " _ _ _ _ _";
          break;
        case 1:
          morse = morse + " _ _ _ _ .";
          break;
        case 2:
          morse = morse + " _ _ _ . .";
          break;
        case 3:
          morse = morse + " _ _ . . .";
          break;
        case 4:
          morse = morse + " _ . . . .";
          break;
        case 5:
          morse = morse + " . . . . .";
          break;
        case 6:
          morse = morse + " . . . . _";
          break;
        case 7:
          morse = morse + " . . . _ _";
          break;
        case 8:
          morse = morse + " . . _ _ _";
          break;
        case 9:
          morse = morse + " . _ _ _ _";
          break;
      }
      aux = aux / 10;
    }
    String resultado = "";
    for (int i = morse.length() - 1; i >= 0; i--) {
      resultado = resultado + morse.charAt(i);
    }
    return resultado;
  }
}
