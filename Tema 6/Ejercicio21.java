/*
 * Ejercicio 21
 *
 * Simula el lanzamiento de 5 monedas diferentes al aire
 *  
 * @author Ismael Maldonado González
*/

public class Ejercicio21 {
  public static void main(String[] args){
    System.out.printf("2 céntimos - ");
    switch ((int)(Math.random() * 2)) {
      case 0:
        System.out.printf("cara\n");
        break;
      default:
        System.out.printf("cruz\n");
    }
    System.out.printf("20 céntimos - ");
    switch ((int)(Math.random() * 2)) {
      case 0:
        System.out.printf("cara\n");
        break;
      default:
        System.out.printf("cruz\n");
    }
    System.out.printf("50 céntimos - ");
    switch ((int)(Math.random() * 2)) {
      case 0:
        System.out.printf("cara\n");
        break;
      default:
        System.out.printf("cruz\n");
    }
    System.out.printf("1 euro - ");
    switch ((int)(Math.random() * 2)) {
      case 0:
        System.out.printf("cara\n");
        break;
      default:
        System.out.printf("cruz\n");
    }
    System.out.printf("2 euros - ");
    switch ((int)(Math.random() * 2)) {
      case 0:
        System.out.printf("cara\n");
        break;
      default:
        System.out.printf("cruz\n");
    }
  }
}

