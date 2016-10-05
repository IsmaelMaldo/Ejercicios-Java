/*
* Ejercicio 12
* 
* Dice la nota que tienes que sacar en el segundo examen para 
* obtener la nota deseada
* 
* @author Ismael Maldonado González
*/
import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe la nota del primer examen");
    double examen_1 = s.nextDouble();
    System.out.println("Escribe la nota final deseada");
    double nota_final = s.nextDouble();
    System.out.println("En el segundo examen tienes que sacar una nota de " + ((nota_final - (examen_1 * 0.4)) / 0.6) + " para obtener como nota final un " + nota_final);
  }
}
