/*
 * Ejercicio 8
 *
 * Muestra un diagrama de barras horizontales con la temperatura media
 * de cada més
 * 
 * @author Ismael Maldonado González
*/
public class Ejercicio08 {
  public static void main(String[] args){
    int[] temperatura = new int[12];
    String[] meses = {
      "Enero",
      "Febrero",
      "Marzo",
      "Abril",
      "Mayo",
      "Junio",
      "Julio",
      "Agosto",
      "Septiembre",
      "Octubre",
      "Noviembre",
      "Diciembre"
    };
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("Introduce la temperatura media en el mes de %s: ", meses[i]);
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i < 12; i++) {
      System.out.printf("%10s ||", meses[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.printf("█");
      }
      System.out.printf("\n");
    }
  }
}
