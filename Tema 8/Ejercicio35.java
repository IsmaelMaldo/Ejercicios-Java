/*
 * Ejercicio 35
 *
 * Transforma de decimal a sistema de palotes
 *
 * @author Ismael Maldonado González
*/

public class Ejercicio35 {
  public static void main(String[] args) {
    System.out.println("Introduce un número en decimal:");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(convierteEnPalotes(numero));
  }

  /*
   * Convierte un número decimal a sistema de palotes
   *
   * @param n    Número entero positivo
   * @return     Número convertido a sistema de palotes
  */
  public static String convierteEnPalotes(int n) {
    String palotes = "";
    int aux = n;
    while (aux > 0){
      int dig = aux % 10;
      for (int i = 0; i < dig; i++){
        palotes = palotes + "| ";
      }
      palotes = palotes + "- ";
      aux = aux / 10;
    }
    String resultado = "";
    for (int i = palotes.length() - 4; i >= 0; i--) {
      resultado = resultado + palotes.charAt(i);
    }
    return resultado;
  }
}
