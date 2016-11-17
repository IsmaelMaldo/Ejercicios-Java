/*
 * Ejercicio 13
 * 
 * Tira los dados hasta que salen el mismo número
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio13 {
  public static void main(String[] args){
    int dado1 = 0;
    int dado2 = 1;
    while (dado1 != dado2) {
      dado1 = (int)(Math.random() * 6 + 1);
      dado2 = (int)(Math.random() * 6 + 1);
      System.out.printf("%d    %d\n", dado1, dado2);
    }    
  }
}
