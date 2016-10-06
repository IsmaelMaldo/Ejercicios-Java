/*
* Ejercicio 1
* 
* Muesta la clase que toca a primera hora según el día de la semana
* 
* @author Ismael Maldonado González
*/

public class Ejercicio01 {
  public static void main(String[] args){
    System.out.println("Escribe un día de la semana");
    String dia = System.console().readLine();
    if (dia.toLowerCase().equals("lunes")) {
      System.out.println("A primera toca Sistemas Infromáticos");
    } else if (dia.toLowerCase().equals("martes") || dia.toLowerCase().equals("miercoles")) {
      System.out.println("A primera toca Programación");
    } else if (dia.toLowerCase().equals("jueves")) {
      System.out.println("A primera toca Base de Datos");
    } else if (dia.toLowerCase().equals("viernes")) {
      System.out.println("A primera toca Lenguaje de Marcas y Sistemas de Gestión de información");
    } else {
      System.out.println("Ese día no hay clases :D");
    }
  }
}
