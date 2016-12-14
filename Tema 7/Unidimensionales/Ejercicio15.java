/*
 * Ejercicio 15
 *
 * Simula el programa de un restaurante rellenando mesas conforme van
 * llegando los clientes hasta que se introduce un -1 o el restaurante
 * está lleno.
 *
 * @author Ismael Maldonado González
*/
public class Ejercicio15 {
  public static void main(String[] args){
    int[] mesas = new int[10];
    int num_usuario;
    boolean lleno = false;
    boolean salir = false;
    //Rellenamos el array
    for (int i = 0; i < 10; i++) {
      mesas[i] = (int)(Math.random() * 5);
    }
    //Bucle para ir pidiendo comensales y mostrando el estado de las
    //mesas
    while (!lleno) {
      //Comprobamos que el restaurante no esté lleno
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
      //En caso de que el restaurante no esté lleno ejecutamos nuestro
      //algoritmo
      } else {
        //Pintamos el estado de las mesas
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
        //Verificamos que el usuario quiere salir del programa o no
        if (num_usuario == -1) {
          lleno = true;
          salir = true;
        //Controlamos si el usuario ha introducido que el grupo es de
        //más de 4 personas
        } else if (num_usuario > 4) {
          System.out.printf("Lo siento, no admitimos grupos de %d, haga grupos de 4 personas como máximo e intentelo de nuevo\n\n", num_usuario);
        //Controlamos que el usuario no nos esté trolleando poniendo números
        //negativos
        } else if (num_usuario < 0) {
          System.out.printf("Lo siento, pero no admitimos números negativos\n\n");
        } else {
          int i = 0;
          int sentarse = -1;
          boolean libre = false;
          boolean compartir = false;
          //Comprobamos si hay mesas libres
          while (!libre && i < 10) {
              System.out.println("Hi");
            //Si hay mesas libres lo sentamos
            if (mesas[i] == 0) {
              libre = true;
              sentarse = i + 1;
              mesas[i] = mesas[i] + num_usuario;
            }
            i++;
          }
          //Comprobamos si hemos encontrado antes una mesa libre
          if (!libre) {
            i = 0;
            do {
              if ((mesas[i] + num_usuario) <= 4) {
                if (mesas[i] != 0) {
                  //Comprobamos si los comensales tienen que compartir o no mesa
                  compartir = true;
                }
                mesas[i] = mesas[i] + num_usuario;
                //Guardamos la mesa en la que se sentarán los comensales
                sentarse = i + 1;
              }
              i++;
            } while ((i < 10) && (sentarse == -1));
          }
          //Si ha encontrado una mesa libre
          if (libre) {
            System.out.printf("Por favor, sientense en la mesa número %d.\n\n", sentarse);
          }
          //Si no ha encontrado hueco donde sentar al grupo
          else if (sentarse == -1) {
            System.out.printf("Lo siento, en estos momentos no queda sitio\n\n");
          //Si tienen que compartir mesa
          } else if (compartir) {
            System.out.printf("Lo siento, tendrá que compartir mesa. Por favor, sientense en la mesa número %d \n\n", sentarse);
          } else {
            System.out.printf("Por favor, sientense en la mesa número %d.\n\n", num_usuario);
          }
        }
      }
    }
    //Comprobamos si el usuario quería salir o si simplemente se ha llenado el
    //restaurante
    if (salir == false) {
      System.out.printf("Lo siento, ya estamos completos");
    } else {
      System.out.printf("Saliendo del programa");
    }
  }
}
