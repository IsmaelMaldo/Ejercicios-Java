/*
 * Ejercicio 25
 *
 * Genera 50 número entre 10 y 200 de los cuales los que son múltiplos
 * de 5 van entre corchetes y los primos entre almohadillas.
 *  
 * @author Ismael Maldonado González
*/

public class Ejercicio25 {
  public static void main(String[] args){
    for (int i = 0; i < 100; i++) {
      int numero = (int)(Math.random() * 201 + 10);
      if ((numero % 5) == 0) {
        System.out.printf("[%d] ", numero);
      } else {
        boolean primo = true;
        int j = numero - 1;
        while ((primo) && (j > 1)) {
          if ((numero % j) == 0) {
            primo = false;
          }
          j--;
        }
        if (primo) {
          System.out.printf("#%d# ", numero);
        } else {
          System.out.printf("%d ", numero);
        }
      }
    }
  }
}

