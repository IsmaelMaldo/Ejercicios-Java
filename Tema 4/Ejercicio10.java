/*
* Ejercicio 10
*
* Dice el horoscopo a partir de un día y un mes dado
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args){
    boolean flag;
    Scanner s = new Scanner(System.in);
    System.out.println("¿Que día naciste?");
    int dia = s.nextInt();
    System.out.println("¿De qué més?");
    int mes = s.nextInt();
    //Comprobando la validez de la fecha
    if ((mes > 0) && (mes <= 13)) {
      if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
        if ((dia > 0) && (dia <=31)) {
          flag = true;
        } else {
          flag = false;
        }
      } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
        if ((dia > 0) && (dia <=30)) {
          flag = true;
        } else {
          flag = false;
        }
      } else if (mes == 2) {
        if ((dia > 0) && (dia <=29)) {
          flag = true;
        } else {
          flag = false;
        }
      } else {
        flag = false;
      }
    } else {
      flag = false;
    }
    //Fin de comprobación de la fecha
    
    if (flag) {
      String dia2 = String.format("%02d", dia);
      String mes2 = String.format("%02d", mes);
      int fecha = Integer.parseInt(mes2 + dia2);
      if ((fecha >= 1221) && (fecha <= 119)) {
        System.out.println("Eres capricornio");
      } else if ((fecha >= 219) && (fecha <= 320)){
        System.out.println("Eres acuario");
      } else if ((fecha >= 219) && (fecha <= 320)){
        System.out.println("Eres piscis");
      } else if ((fecha >= 321) && (fecha <= 420)){
        System.out.println("Eres aries");
      } else if ((fecha >= 421) && (fecha <= 520)){
        System.out.println("Eres tauro");
      } else if ((fecha >= 521) && (fecha <= 620)){
        System.out.println("Eres géminis");
      } else if ((fecha >= 621) && (fecha <= 720)){
        System.out.println("Eres cáncer");
      } else if ((fecha >= 721) && (fecha <= 821)){
        System.out.println("Eres leo");
      } else if ((fecha >= 822) && (fecha <= 922)){
        System.out.println("Eres virgo");
      } else if ((fecha >= 923) && (fecha <= 1022)){
        System.out.println("Eres libra");
      } else if ((fecha >= 1023) && (fecha <= 1122)){
        System.out.println("Eres escorpio");
      } else if ((fecha >= 1123) && (fecha <= 1220)){
        System.out.println("Eres sagitario");
      } else {
        System.out.println("Algo ha ido mal");
      }
      
    } else {
      System.out.println("La fecha no es válida");
    }
  }
}
