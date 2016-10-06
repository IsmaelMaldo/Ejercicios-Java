/*
* Ejercicio 2
* 
* Muesta la clase que toca a primera hora según el día de la semana
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
