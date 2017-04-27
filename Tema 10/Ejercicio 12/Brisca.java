import java.util.HashMap;

public class Brisca {
  public static void main(String[] args) {
    HashMap<Integer,Integer> puntuacion = new HashMap<Integer,Integer>();
    String[] palos = {"bastos", "oros", "espadas", "corazones"};
    puntuacion.put(1, 11);
    puntuacion.put(3, 10);
    puntuacion.put(10, 2);
    puntuacion.put(11, 3);
    puntuacion.put(12, 4);
    int puntos = 0;
    for (int i = 0; i < 5; i++){
      int numero = (int)(Math.random() * 12 + 1);
      switch (numero){
        case 1:
          System.out.printf("As");
          break;
        case 2:
          System.out.printf("Dos");
          break;
        case 3:
          System.out.printf("Tres");
          break;
        case 4:
          System.out.printf("Cuatro");
          break;
        case 5:
          System.out.printf("Cinco");
          break;
        case 6:
          System.out.printf("Seis");
          break;
        case 7:
          System.out.printf("Siete");
          break;
        case 8:
          System.out.printf("Ocho");
          break;
        case 9:
          System.out.printf("Nueve");
          break;
        case 10:
          System.out.printf("Diez");
          break;
        case 11:
          System.out.printf("Once");
          break;
        case 12:
          System.out.printf("Doce");
          break;
        default:
          System.out.printf("Error");
      }
      System.out.println(" de " + palos[(int)(Math.random() * 4)]);
      if (puntuacion.containsKey(numero)){
        puntos += puntuacion.get(numero);
      }
    }

    System.out.println("Tienes " + puntos + " puntos");
  }
}
