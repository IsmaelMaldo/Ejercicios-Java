/*
 * Ejercicio 8
 * 
 * Hace apuestas en la quiniela con distintas probabilidades para cada
 * resultado
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio08 {
  public static void main(String[] args){
      System.out.println("            Quiniela");
      System.out.println("----------------------------------");
      for (int i = 1; i <= 14; i++) {
        int columna_num1 = (int)(Math.random() * 6);
        int columna_num2 = (int)(Math.random() * 6);
        int columna_num3 = (int)(Math.random() * 6);
        String columna1;
        String columna2;
        String columna3;
        if (columna_num1 < 3) {
          columna1 = "1";
        } else if (columna_num1 < 5){
          columna1 = "2";
        } else {
          columna1 = "X";
        }
        if (columna_num2 < 3) {
          columna2 = "1";
        } else if (columna_num2 < 5){
          columna2 = "2";
        } else {
          columna2 = "X";
        }
        if (columna_num3 < 3) {
          columna3 = "1";
        } else if (columna_num3 < 5){
          columna3 = "2";
        } else {
          columna3 = "X";
        }
        System.out.printf("Partido %2d    %s    %s    %s\n", i, columna1, columna2, columna3);
      }
      int columna_num1 = (int)(Math.random() * 4);
      int columna_num2 = (int)(Math.random() * 4);
      String columna1;
      String columna2;
      if (columna_num1 == 3) {
        columna1 = "M";
      } else {
        columna1 = String.valueOf(columna_num1);
      }
      if (columna_num2 == 3) {
        columna2 = "M";
      } else {
        columna2 = String.valueOf(columna_num2);
      }
      System.out.printf("Pleno al 15 At. Madrid    %s     Las Palmas    %s", columna1, columna2);
      
  }
}
