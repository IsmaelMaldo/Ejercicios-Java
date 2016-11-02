/*
 * Ejercicio 17
 * 
 * Suma los 100 números siguientes a un número dado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio17 {
  public static void main(String[] args){
    int num_usuario;
    int res = 0;
    do {
      System.out.printf("Introduce un número positivo: ");
      num_usuario = Integer.parseInt(System.console().readLine());
    } while (num_usuario < 0);
    for (int i = num_usuario; i < (num_usuario + 100); i++) {
      res = res + i;
    }
    System.out.println(res);
  }
}
