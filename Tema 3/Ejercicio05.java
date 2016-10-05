/*
* Ejercicio 5
* Calcula el area de un rectángulo
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe cuánto mide uno de los lados del rectágulo");
    double x = s.nextDouble();
    System.out.println("Escribe cuánto mide el otro lado del rectágulo");
    double y = s.nextDouble();
    System.out.println("El área del rectángulo cuyos tamaño es de " + x + "X" + y + " es de " + (x * y));
  }
}
