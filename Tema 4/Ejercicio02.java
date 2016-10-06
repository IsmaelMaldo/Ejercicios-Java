/*
* Ejercicio 2
* 
* Saluda según la hora que se introduzca en consola
* 
* @author Ismael Maldonado González
*/

public class Ejercicio02 {
  public static void main(String[] args){
    System.out.println("¿Qué hora es?");
    int hora = Integer.parseInt(System.console().readLine())7;
    if (hora >= 6 && hora <= 12) {
      System.out.println("Buenos Días");
    } else if (hora >= 12 && hora <= 20) {
      System.out.println("Buenas Tardes");
    } else {
      System.out.println("Buenas Noches");
    }
  }
}
