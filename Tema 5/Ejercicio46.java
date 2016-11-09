/*
 * Ejercicio 46
 * 
 * Dibuja un rectágunlo a partir de una altura y una anchura dada
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio46 {
  public static void main(String[] args){
    boolean error;
    long ancho;
    long alto;
    do {
    System.out.printf("Introduce la anchura del rectángulo (como mínimo 2): ");
    ancho = Long.parseLong(System.console().readLine());
    System.out.printf("Introduce la altura del rectángulo (como mínimo 2): ");
    alto = Long.parseLong(System.console().readLine());
    if ((alto < 2) || (ancho < 2)) {
      error = true;
      System.out.println("Error, los datos no son correctos, la altura y la anchura tienen que ser como mínimo 2");
    } else {
      error = false;
    }
    } while (error);
    for (long i = 1; i <= alto; i++) {
      for (long j = 1; j <= ancho; j++) {
        if (((i == 1) || (i == alto) || (j == 1)) && (j != ancho)) {
          System.out.printf("*");
        }
        if ((i != 1) && (i != alto) && (j != 1) && (j != ancho)) {
          System.out.printf(" ");
        }
        if (j == ancho) {
          System.out.printf("*\n");
        } 
      }
    }
  }
}
