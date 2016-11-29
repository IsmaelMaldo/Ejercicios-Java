/*
 * Ejercicio 18
 * 
 * Programa que elige tres colores diferentes para pintar un cuarto
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio18 {
  public static void main(String[] args){
    int cuarto1 = (int)(Math.random() * 6);
    int cuarto2 = (int)(Math.random() * 6);
    int cuarto3 = (int)(Math.random() * 6);
    while (cuarto1 == cuarto2) {
      cuarto2 = (int)(Math.random() * 6);
    }
    while ((cuarto1 == cuarto3) || (cuarto2 == cuarto3)) {
      cuarto3 = (int)(Math.random() * 6);
    }
    System.out.printf("Dormitorio 1 ");
    switch (cuarto1) {
      case 0:
        System.out.printf("Rojo\n");
        break;
      case 1:
        System.out.printf("Azul\n");
        break;
      case 2:
        System.out.printf("Verde\n");
        break;
      case 3:
        System.out.printf("Amarillo\n");
        break;
      case 4:
        System.out.printf("Violeta\n");
        break;
      case 5:
        System.out.printf("Naranja\n");
        break;
    }
    System.out.printf("Dormitorio 2 ");
    switch (cuarto2) {
      case 0:
        System.out.printf("Rojo\n");
        break;
      case 1:
        System.out.printf("Azul\n");
        break;
      case 2:
        System.out.printf("Verde\n");
        break;
      case 3:
        System.out.printf("Amarillo\n");
        break;
      case 4:
        System.out.printf("Violeta\n");
        break;
      case 5:
        System.out.printf("Naranja\n");
        break;
    }
    System.out.printf("Dormitorio 3 ");
    switch (cuarto3) {
      case 0:
        System.out.printf("Rojo\n");
        break;
      case 1:
        System.out.printf("Azul\n");
        break;
      case 2:
        System.out.printf("Verde\n");
        break;
      case 3:
        System.out.printf("Amarillo\n");
        break;
      case 4:
        System.out.printf("Violeta\n");
        break;
      case 5:
        System.out.printf("Naranja\n");
        break;
    }
  }
}

