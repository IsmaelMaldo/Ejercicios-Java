/*
* Ejercicio 11
*
* Dice el horoscopo a partir de un día y un mes dado
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe que hora que es en formato de 24h (Sólo la hora)");
    int hora = s.nextInt();
    System.out.println("Escribe los minutos");
    int minutos = s.nextInt();
    if (((hora >= 0) && (hora <= 24)) && ((minutos >= 0) && (minutos <= 60))){
    int momento = (hora * 3600) + (minutos * 60);
    System.out.printf("Faltan %d segundos para la medianoche", (86400 - ((hora * 3600) + (minutos * 60))));
    }
  }
}
