/*
 * Ejercicio 6
 * 
 * Juego el cual consiste en acertar un número del 1 al 100 y en el cual
 * se dan hasta 5 intentos, el programa dice si el número es mayor o
 * menor
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio06 {
  public static void main(String[] args){
    int numero = (int)(Math.random() * 100);
    boolean acierto = false;
    int i = 4;
    System.out.printf("Introduce un número entre el 0 y el 100: ");
    while ((!acierto) && (i >= 0)) {
      int num_usuario = Integer.parseInt(System.console().readLine());
      if (num_usuario == numero) {
        acierto = true;
        System.out.println("Acertaste :D");
      } else if (numero < num_usuario) {
        System.out.printf("El número es menor, te quedan %d intentos\n", i);
      } else {
        System.out.printf("El número es mayor, te quedan %d intentos\n", i);
      }
      i--;
    }
    if (!acierto) {
      System.out.println("Se te han acabado los intentos :'(");
    }
  }
}
