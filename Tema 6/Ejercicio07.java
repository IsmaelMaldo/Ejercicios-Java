/*
 * Ejercicio 7
 * 
 * Hace apuestas en la quiniela
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio07 {
  public static void main(String[] args){
      System.out.println("            Quiniela");
      System.out.println("----------------------------------");
      for (int i = 1; i <= 14; i++) {
        int columna_num1 = (int)(Math.random() * 3);
        int columna_num2 = (int)(Math.random() * 3);
        int columna_num3 = (int)(Math.random() * 3);
        String columna1;
        String columna2;
        String columna3;
        if (columna_num1 == 0) {
          columna1 = "X";
        } else {
          columna1 = String.valueOf(columna_num1);
        }
        if (columna_num2 == 0) {
          columna2 = "X";
        } else {
          columna2 = String.valueOf(columna_num2);
        }
        if (columna_num3 == 0) {
          columna3 = "X";
        } else {
          columna3 = String.valueOf(columna_num3);
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
