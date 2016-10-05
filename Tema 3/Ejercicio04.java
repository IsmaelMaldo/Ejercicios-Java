/*
* Ejercicio 4
* Muestra la suma, resta, multiplicacion y división de dos número dados
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio04 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe un número");
    double x = s.nextDouble();
    System.out.println("Escribe otro número");
    double y = s.nextDouble();
    System.out.println("La variable x vale " + x);
    System.out.println("La variable y vale " + y);
    System.out.println("La suma es igual a " + (x + y));
    System.out.println("La resta es igual a  " + (x - y));
    System.out.println("La división es igual a  " + (y / x));
    System.out.println("La multiplicación es igual a  " + (x * y));
  }
}
