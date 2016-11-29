/*
 * Ejercicio 22
 *
 * Pinta una serpiente que serpentea de forma aleatoria
 *  
 * @author Ismael Maldonado González
*/

public class Ejercicio22 {
  public static void main(String[] args){
    System.out.printf("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int serpiente = Integer.parseInt(System.console().readLine());
    int espacios = 12;
    System.out.printf("            @\n");
    for (int i = 1; i < serpiente; i++) {
      switch ((int)(Math.random() * 3)) {
        case 0:
          espacios--;
          break;
        case 1:
          espacios++;
          break;
      }
      for (int j = 0; j < espacios; j++) {
        System.out.printf(" ");
      }
      if (espacios < 0) {
        espacios = 0;
      }
      System.out.printf("*\n");
    }
  }
}

