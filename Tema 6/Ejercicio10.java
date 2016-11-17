/*
 * Ejercicio 10
 * 
 * Pinta 10 líneas hechas con caracteres aleatorios y de una logitud
 * aleatoria comprendida entre 1 y 40
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio10 {
  public static void main(String[] args){
    for (int i = 0; i < 10; i++) {
      for (int j = (int)(Math.random() * 40); j < 40; j++) {
        int alea = (int)(Math.random() * 6);
        switch (alea) {
          case 0:
            System.out.printf("*");
            break;
          case 1:
            System.out.printf("-");
            break;
          case 2:
            System.out.printf("=");
            break;
          case 3:
            System.out.printf(".");
            break;
          case 4:
            System.out.printf("|");
            break;
          case 5:
            System.out.printf("@");
            break;
        }
      }
      System.out.printf("\n");
    }
  }
}
