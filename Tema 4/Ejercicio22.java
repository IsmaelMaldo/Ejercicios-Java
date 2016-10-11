/*
* Ejercicio 22
*
* Calcula los minutos que faltan para el fin de semana
* 
* 
* @author Ismael Maldonado González
*/

public class Ejercicio22 {
  public static void main(String[] args){
    System.out.println("¿En qué día de la semana estámos?");
    String dia = System.console().readLine();
    System.out.println("¿Qué hora es?");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.println("¿Y cuántos minutos?");
    int minutos = Integer.parseInt(System.console().readLine());
    int dia_num = 0;
    
    switch (dia.toLowerCase()){
      case "lunes":
        dia_num = 0;
        break;
      case "martes":
        dia_num = 1;
        break;
      case "miercoles":
        dia_num = 2;
        break;
      case "jueves":
        dia_num = 3;
        break;
      case "viernes":
        dia_num = 4;
        break;
    }
    System.out.printf("Quedan %d minutos para el fin de semana. ¡Ánimo!\n", + (6660 - ((dia_num * 24 * 60) + (hora * 60) + minutos)));
  }
}
