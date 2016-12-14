/*
 * Ejercicio 13
 *
 * Muestra un array relleno con números enteros aleatorios, depués se
 * pregunta si se quiere destacar el máximo o el mínimo, y se vuelve a
 * mostrar el array con el valor correspondiente destacado entre 2
 * asteriscos a cada lado
 *
 * @author Ismael Maldonado González
*/
public class Ejercicio13 {
  public static void main(String[] args){
    int[] num = new int[100];
    int min = 500;
    int max = 0;
    for (int i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 501);
      if (num[i] < min) {
        min = num[i];
      }
      if (num[i] > max) {
        max = num[i];
      }
    }
    for (int n : num) {
      System.out.printf("%d ", n);
    }
    boolean error = false;
    int opcion;
    do {
      if (error) {
        System.out.printf("\nError, opción no encontrada");
      }
      error = false;
      System.out.printf("\n¿Qué quieres destacar? (1 - minimo, 2 - maximo)");
      opcion = Integer.parseInt(System.console().readLine());
      if (opcion == 1) {
        error = false;
      } else if (opcion == 2) {
        error = false;
      } else {
        error = true;
      }
    } while (error);
    if (opcion == 1) {
      for (int n : num) {
        if (n == min) {
          System.out.printf("**%d** ", n);
        } else {
          System.out.printf("%d ", n);
        }
      }
    }
    if (opcion == 2) {
      for (int n : num) {
        if (n == max) {
          System.out.printf("**%d** ", n);
        } else {
          System.out.printf("%d ", n);
        }
      }
    }

  }
}
