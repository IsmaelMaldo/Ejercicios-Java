/*
 * Ejercicio 13
 *
 * Muestra un array relleno con números enteros aleatorios, depués se
 * pregunta si se quiere destacar el máximo o el mínimo, y se vuelve a
 * mostrar el array con el valor correspondiente destacado entre 2
 * asteriscos
 *
 * @author Ismael Maldonado González
*/
public class Ejercicio14 {
  public static void main(String[] args){
    String[] user_words = new String[8];
    String[] colores = new String[8];
    String[] no_colores = new String[8];
    String[] color_words = {
      "verde",
      "rojo",
      "azul",
      "amarillo",
      "naranja",
      "rosa",
      "negro",
      "blanco",
      "morado"
    };
    int j = 0;
    int x = 0;
    System.out.printf("Escribe 8 palabras separados por intro: ");
    for (int i = 0; i < 8; i++) {
      user_words[i] = System.console().readLine();
    }
    for (String n : user_words) {
      System.out.printf("%s ", n);
    }
    for (String n : user_words) {
      boolean flag = false;
      for (String a : color_words) {
        if (n.equals(a)) {
          colores[j] = n;
          j++;
          flag = true;
        }
      }
      if (!flag) {
        no_colores[x] = n;
        x++;
      }
    }
    int i = 0;
    for (i = i; i < j; i++) {
      user_words[i] = colores[i];
    }
    j = 0;
    for (i = i; i < 8; i++) {
      user_words[i] = no_colores[j];
      j++;
    }
    System.out.printf("\n\n\n");
    for (String n : user_words) {
      System.out.printf("%s ", n);
    }
  }
}
