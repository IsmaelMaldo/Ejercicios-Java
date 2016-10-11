/*
* Ejercicio 3
*
* A partir de un número dado muestra el día de la semana 
* 
* @author Ismael Maldonado González
*/

public class Ejercicio03 {
  public static void main(String[] args){
    System.out.println("Escribe un número del 1 al 7");
    int dia = Integer.parseInt(System.console().readLine());
    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miercoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("El número introducido no está entre el 1 y el 7");
    }
  }
}
