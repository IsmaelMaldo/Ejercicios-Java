/*
 * Ejercicio 14
 *
 * Simula el programa de un restaurante rellenando mesas conforme van
 * llegando los clientes hasta que se introduce un -1 o el restaurante
 * está lleno.
 *
 * @author Ismael Maldonado González
*/
public class Ejercicio14 {
  public static void main(String[] args){
    int[] mesas = new int[10];
    int num_usuario;
    boolean lleno = false;
    boolean salir = false;
    for (int i = 0; i < 10; i++) {
      mesas[i] = (int)(Math.random() * 5);
    }
    while (!lleno) {
      boolean hueco = false;
      int j = 0;
      while (!hueco && (j < 10)) {
        if (mesas[j] != 4) {
          hueco = true;
        }
        j++;
      }
      if (!hueco) {
        lleno = true;
      } else {
        System.out.println("┌╌╌╌╌╌╌╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┬╌╌╌┐");
        System.out.printf("╎Mesa nº  ╎");
        for (int i = 1; i < 11; i++) {
          System.out.printf("%2d ╎", i);
        }
        System.out.println("\n├╌╌╌╌╌╌╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┼╌╌╌┤");
        System.out.printf("╎Ocupación╎");
        for (int n : mesas) {
          System.out.printf(" %d ╎", n);
        }
        System.out.println("\n└╌╌╌╌╌╌╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┴╌╌╌┘");
        System.out.printf("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        num_usuario = Integer.parseInt(System.console().readLine());
        if (num_usuario == -1) {
          lleno = true;
          salir = true;
        } else if (num_usuario > 4) {
          System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de 4 personas como máximo e intentelo de nuevo\n\n", num_usuario);
        } else if (num_usuario < 0) {
          System.out.printf("Lo siento, pero no admitimos números negativos\n\n");
        } else {
          int i = 0;
          int sentarse = -1;
          boolean compartir = false;
          do {
            if ((mesas[i] + num_usuario) <= 4) {
              if (mesas[i] != 0) {
                compartir = true;
              }
              mesas[i] = mesas[i] + num_usuario;
              sentarse = i + 1;
            }
            i++;
          } while ((i < 10) && (sentarse == -1));
          if (sentarse == -1) {
            System.out.printf("Lo siento, en estos momentos no queda sitio\n\n");
          } else if (compartir) {
            System.out.printf("Lo siento, tendrá que compartir mesa. Por favor, sientense en la mesa número %d \n\n", sentarse);
          } else {
            System.out.printf("Por favor, sientense en la mesa número %d.\n\n", num_usuario);
          }
        }
      }
    }
    if (salir == false) {
      System.out.printf("Lo siento, ya estamos completos");
    } else {
      System.out.printf("Saliendo del programa");
    }
  }
}
