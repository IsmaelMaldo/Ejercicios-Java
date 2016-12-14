/*
 * Ejercicio 17
 * 
 * Muestra un array de 10 números, el programa le pide uno de esos
 * números al usuario, haciendo que dicho número muestre 
 * 
 * @author Ismael Maldonado González
*/
public class Ejercicio17 {
  public static void main(String[] args){
    int[] num = new int[10];
    int num_usuario;
    boolean error = true;
    for (int i = 0; i < 10; i++) {
      num[i] = (int)(Math.random() * 101);
      System.out.printf("%d ", num[i]);
    }
    do {
      System.out.printf("\n\nIntroduce un número de los anteriomente mostrados: ");
      num_usuario = Integer.parseInt(System.console().readLine());
      for (int i = 0; i < 10; i++) {
        if (num[i] == num_usuario) {
          error = false;
        }
      }
    } while (error);
    while (num[0] != num_usuario) {
      int aux = num[9];
      for (int i = 9; i > 0; i--) {
        num[i] = num[i - 1];
      }
      num[0] = aux;
    }
    for (int n : num) {
      System.out.printf("%d ", n);
    }
  }
}
