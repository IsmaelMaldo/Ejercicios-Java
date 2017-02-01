/*
 * Ejercicio 39
 *
 * Transforma de decimal a sistema de palotes
 *
 * @author Ismael Maldonado González
*/

public class Ejercicio39 {
  public static void main(String[] args) {
    System.out.println("Introduce un número en decimal:");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(convierteEnPalabras(numero));
  }

  /*
   * Convierte un número decimal a palabras
   *
   * @param n    Número entero positivo
   * @return     Número convertido a palabras
  */
  public static String convierteEnPalabras(int n) {
    String palabras = "";
    int aux = n;
    while (aux > 0){
      int dig = aux % 10;
      switch (dig) {
        case 0:
          palabras = palabras + " ,orec";
          break;
        case 1:
          palabras = palabras + " ,onu";
          break;
        case 2:
          palabras = palabras + " ,sod";
          break;
        case 3:
          palabras = palabras + " ,sert";
          break;
        case 4:
          palabras = palabras + " ,ortauc";
          break;
        case 5:
          palabras = palabras + " ,ocnic";
          break;
        case 6:
          palabras = palabras + " ,sies";
          break;
        case 7:
          palabras = palabras + " ,eteis";
          break;
        case 8:
          palabras = palabras + " ,ohco";
          break;
        case 9:
          palabras = palabras + " ,eveun";
          break;
      }
      aux = aux / 10;
    }
    String resultado = "";
    for (int i = palabras.length() - 1; i > 1; i--) {
      resultado = resultado + palabras.charAt(i);
    }
    return resultado;
  }
}
