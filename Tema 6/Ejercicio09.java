/*
 * Ejercicio 9
 * 
 * Genera números aleatoriamente hasta que saca un 24, en ese momento
 * para y muestra cuántos números a generado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio09 {
  public static void main(String[] args){
    int num = 0;
    long i = 0;
    while  (num != 24) {
      num = (((int)(Math.random() * 101) * 2 )% 100);
      System.out.printf("%d ", num);
      i++;
    }
    System.out.printf("\nSe han generado %d números aleatorios", i);
  }
}
