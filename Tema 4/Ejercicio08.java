/*
* Ejercicio 8
*
* Dada 3 notas calcula la nota media
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe la nota del primer examen");
    double examen1 = s.nextDouble();
    System.out.println("Escribe la nota del segundo examen");
    double examen2 = s.nextDouble();
    System.out.println("Escribe la nota del tercer examen");
    double examen3 = s.nextDouble();
    double nota_media = ((examen1 + examen2 + examen3) / 3);
    System.out.printf("Tu nota media es de %.2f.\n", nota_media);
    if (nota_media < 5) {
      System.out.println("Lo siento, tienes un insuficiente :(");
    } else if ((nota_media >= 5) && (nota_media < 6)) {
      System.out.println("¡Por los pelos!, tienes un suficiente (-.-U)");
    } else if ((nota_media >= 6) && (nota_media < 7)) {
      System.out.println("¡Guay!, tienes un bien :D");
    } else if ((nota_media >= 7) && (nota_media < 9)) {
      System.out.println("¡Genial!, tienes un notable ('w'=)/");
    } else if ((nota_media >= 9) && (nota_media <= 10)) {
      System.out.println("¡Enhorabuena!, tienes un sobresaliente \\(^o^)/");
    } else {
      System.out.println("Esa nota no es posible en el sistema español, habrás metido la pata introduciendo alguna.");
    }
    
  }
}
