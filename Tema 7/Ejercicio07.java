/*
 * Ejercicio 7
 * 
 * Muestra una lista de número aleatorios, de los cuales el usuario debe
 * introducir uno de ellos, y los sustituye por un segundo valor dado
 * por el usuario y los muestra entrecomillados
 * 
 * @author Ismael Maldonado González
*/
public class Ejercicio07 {
  public static void main(String[] args){
    int[] num = new int[100];
    int[] num_usuario = new int[2];
    for (int i = 0; i < 100; i++) {
      num[i] = (int)(Math.random() * 21);
    }
    for (int n : num) {
      System.out.printf("%d ", n);
    }
    System.out.printf("\nIntroduce un número de los anteriormente mostrados: ");
    num_usuario[0] = Integer.parseInt(System.console().readLine());
    System.out.printf("Introduce un número a sustituir: ");
    num_usuario[1] = Integer.parseInt(System.console().readLine());
    for (int i = 0; i < 100; i++) {
      if (num[i] == num_usuario[0]) {
        System.out.printf("\"%d\" ", num_usuario[1]);
      } else {
        System.out.printf("%d ", num[i]);
      }
    }
  }
}
