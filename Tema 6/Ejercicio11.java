/*
 * Ejercicio 11
 * 
 * Muestra 20 notas generadas al azar y muestra si es sobresaliente,
 * notable... y cuenta las diferentes notas
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio11 {
  public static void main(String[] args){
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    for (int i = 0; i < 10; i++) {
      int nota = (int)(Math.random() * 11);
      if (nota <= 4) {
        System.out.println("Suspenso");
        suspenso++;
      } else if (nota == 5) {
        System.out.println("Suficiente");
        suficiente++;
      } else if (nota == 6) {
        System.out.println("Bien");
        bien++;
      } else if (nota < 9) {
        System.out.println("Notable");
        notable++;
      } else {
        System.out.println("Sobresaliente");
        sobresaliente++;
      }
    }
    System.out.println("-------------------------------");
    System.out.println("Has obtenido:");
    System.out.println("Suspensos: " + suspenso);
    System.out.println("Suficiente: " + suficiente);
    System.out.println("Bien:" + bien);
    System.out.println("Notable: " + notable);
    System.out.println("Sobresaliente: " + sobresaliente);
  }
}
