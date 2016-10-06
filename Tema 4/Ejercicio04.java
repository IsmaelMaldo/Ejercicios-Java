/*
* Ejercicio 4
* 
* Calcula el salario de un trabajador en función de las horas que ha
* trabajado
* 
* @author Ismael Maldonado González
*/

public class Ejercicio04 {
  public static void main(String[] args){
    System.out.println("¿Cuántas horas ha trabajado?");
    int horas = Integer.parseInt(System.console().readLine());
    if (horas <= 40) {
      System.out.println("El salario del trabajador es de " + (horas * 12) + "€");
    } else {
      horas = horas - 40;
      System.out.println("El salario del trabajador es de " + ((40 * 12) + (horas * 16)) + "€");
    }
  }
}
