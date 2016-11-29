/*
 * Ejercicio 15
 * 
 * Genera una melodía
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio15 {
  public static void main(String[] args){
    int nota1 = 0;
    int i = (int)(Math.random() * 7);
    int i1 = i;
    for (i = i; i < 7; i++) {
      for (int j = 0; j < 4; j++) {
        if ((i == 6) && (j == 3)) {
          switch (nota1) {
            case 0:
              System.out.printf("do ");
              break;
            case 1:
              System.out.printf("re ");
              break;
            case 2:
              System.out.printf("mi ");
              break;
            case 3:
              System.out.printf("fa ");
              break;
            case 4:
              System.out.printf("sol ");
              break;
            case 5:
              System.out.printf("la ");
              break;
            case 6:
              System.out.printf("si ");
              break;
          }
        } else {
          int nota = (int)(Math.random() * 7);
          switch (nota) {
            case 0:
              System.out.printf("do ");
              break;
            case 1:
              System.out.printf("re ");
              break;
            case 2:
              System.out.printf("mi ");
              break;
            case 3:
              System.out.printf("fa ");
              break;
            case 4:
              System.out.printf("sol ");
              break;
            case 5:
              System.out.printf("la ");
              break;
            case 6:
              System.out.printf("si ");
              break;
          }
          if ((j == 0) && (i == i1)) {
            nota1 = nota;
          }
        }
      }
      System.out.printf("| ");
    }
    System.out.printf("|");
  }
}

