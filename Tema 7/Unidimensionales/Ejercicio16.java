/*
 * Ejercicio 16
 * 
 * Muestra un array de números aleatorios y una vez señalada la opción
 * correspondiente resalta los números multiplos de 5 o de 7
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio16 {
  public static void main(String[] args){
    int[] num = new int[20];
    for (int i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 401);
      System.out.printf("%d ", num[i]);
    }
    System.out.printf("\n¿Qué número quieres resaltar? (1 - Los multiplos de 5, 2 - los multiplos de 7)");
    int opcion = Integer.parseInt(System.console().readLine());
    switch (opcion) {
      case 1:
        for (int n : num) {
          if ((n % 5) == 0) {
            System.out.printf("[%d] ", n);
          } else {
            System.out.printf("%d ", n);
          }
        }
        break;
      case 2:
        for (int n : num) {
          if ((n % 7) == 0) {
            System.out.printf("[%d] ", n);
          } else {
            System.out.printf("%d ", n);
          }
        }
        break;
      default:
        System.out.printf("\nError, opción no válida");
    }
  }
}
