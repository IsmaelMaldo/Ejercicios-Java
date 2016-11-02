/*
 * Ejercicio 20
 * 
 * Monta una pirámide hueca de una altura dada con un caracter dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio20 {
  public static void main(String[] args){
    int num_usuario;
    String char_usuario;
    do {
      System.out.printf("Introduce un número para definir la altura de la pirámide: ");
      num_usuario = Integer.parseInt(System.console().readLine());
      System.out.printf("Introduce el caracter que formará la pirámide: ");
      char_usuario = System.console().readLine();
      System.out.printf("\n\n");
    } while ((num_usuario < 1) || (char_usuario == ""));
    for (int i = 1; i <= num_usuario; i++) {
      int j;
      if (i == num_usuario) {
        for (j = 0; j < (num_usuario - i); j++) {
          System.out.printf(" ");
        }
        for (j = j; j < (num_usuario + i); j++) {
          System.out.printf("%s", char_usuario);
        }
      } else {
        for (j = 0; j < (num_usuario - i); j++) {
          System.out.printf(" ");
        }
        for (j = j; j < (num_usuario + i); j++) {
          System.out.printf("%s", char_usuario);
          for (j = j; j < (num_usuario + i - 2); j++) {
            System.out.printf(" ");
          }
        }
        System.out.printf("\n");
      }
    }
  }
}
