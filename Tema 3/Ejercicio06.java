/*
* Ejercicio 6
* Calcula el area de un triángulo
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe cuánto mide la altura del triángulo");
    double x = s.nextDouble();
    System.out.println("Escribe cuánto mide la base del triángulo");
    double y = s.nextDouble();
    System.out.println("El área del triangulo de base " + y + " y altura " + x + " es de " + (x * y)/2);
  }
}
