/*
 * Ejercicio 24
 * 
 * Monta una pirámide de una altura dada con números
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio24 {
  public static void main(String[] args){
    int num_usuario;
    do {
      System.out.printf("Introduce un número para definir la altura de la pirámide: ");
      num_usuario = Integer.parseInt(System.console().readLine());
    } while (num_usuario < 1);
    System.out.printf("\n\n");
    for (int i = 1; i <= num_usuario; i++) {
      int j;
      int num_imprimir = 1;
      for (j = 0; j < (num_usuario - i); j++) {
        System.out.printf(" ");
      }
      for (j = (j + 1); j < (num_usuario + i); j++) {
        System.out.printf("%d", num_imprimir);
        if (num_imprimir < i) {
          num_imprimir++;
        } else if (num_imprimir >= i) {
          num_imprimir--;
        }
      }
      System.out.printf("\n");
    }
  }
}
