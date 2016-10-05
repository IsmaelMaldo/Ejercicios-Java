/*
* Ejercicio 9
* Calcula el area de un cono
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe cuánto mide la altura del cono en centímetros");
    double h = s.nextDouble();
    System.out.println("Escribe cuánto mide el radio de la base en centímetros");
    double r = s.nextDouble();
    System.out.println("El volumen del triángulo es de " + ((Math.PI * Math.pow(r, 2) * h) / 3) + "cm²");
  }
}
