/*
 * Ejercicio 12
 *
 * Pide 10 números por teclado, luego pide seleccionar un número a
 * través de su posición y pide otra posición para mover el número
 *
 * @author Ismael Maldonado González
*/
public class Ejercicio12 {
  public static void main(String[] args){
    int[] num = new int[10];
    int num_ini;
    int num_fin;
    boolean error = false;
    System.out.printf("Introduce 10 núemros: ");
    for (int i = 0; i < 10; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.printf("\n\n\n");
    for (int n : num) {
      System.out.printf("%d ", n);
    }
    System.out.printf("\n\n\n");
    do {
      if (error) {
        System.out.println("Error, los valores introducidos no son válidos");
      }
      System.out.printf("Introduce la posición del número que quieres cambiar de posición: ");
      num_ini = Integer.parseInt(System.console().readLine());;
      System.out.printf("Introduce la posición a donde quieres cambiar el número: ");
      num_fin = Integer.parseInt(System.console().readLine());
      error = true;
    } while ((num_ini > num_fin) && (num_fin < 9) && (num_fin > 0) && (num_ini < 9) && (num_ini > 0));
    int aux = num[num_ini];
    for (int i = num_ini; i != num_fin; i--) {
      if (i != 0) {
        num[i] = num[i - 1];
      } else {
        num[0] = num[9];
        i = 10;
      }
    }
    num[num_fin] = aux;
    for (int n : num) {
      System.out.printf("%d ", n);
    }
  }
}
