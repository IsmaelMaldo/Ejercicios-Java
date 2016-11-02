/*
 * Ejercicio 30
 * 
 * Muestra todos los números positivos menores a uno dado y divisible
 * entre otro dado.
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio30 {
  public static void main(String[] args){
    String dia1;
    int dia1_num;
    int hora1;
    String dia2;
    int dia2_num;
    int hora2;
    boolean comprobador = false;
    do {
      System.out.println("Por favor, introduce la primera hora: ");
      System.out.printf("Día: ");
      dia1 = System.console().readLine().toLowerCase();
      System.out.printf("Hora: ");
      hora1 = Integer.parseInt(System.console().readLine());
      System.out.println("Por favor, introduce la segunda hora: ");
      System.out.printf("Día: ");
      dia2 = System.console().readLine().toLowerCase();
      System.out.printf("Hora: ");
      hora2 = Integer.parseInt(System.console().readLine());
      switch (dia1) {
        case "lunes":
          dia1_num = 1;
          break;
        case "martes":
          dia1_num = 2;
          break;
        case "miercoles":
          dia1_num = 3;
          break;
        case "jueves":
          dia1_num = 4;
          break;
        case "viernes":
          dia1_num = 5;
          break;
        case "sábado":
          dia1_num = 6;
          break;
        case "domingo":
          dia1_num = 7;
          break;
        default:
          dia1_num = 0;
      }
      switch (dia2) {
        case "lunes":
          dia2_num = 1;
          break;
        case "martes":
          dia2_num = 2;
          break;
        case "miercoles":
          dia2_num = 3;
          break;
        case "jueves":
          dia2_num = 4;
          break;
        case "viernes":
          dia2_num = 5;
          break;
        case "sábado":
          dia2_num = 6;
          break;
        case "domingo":
          dia2_num = 7;
          break;
        default:
          dia2_num = 0;
      }
      if ((hora1 > 24) || (hora2 > 24)) {       //Comprobando los datos
        comprobador = false;
      } else {
        if ((dia1_num != 0) && (dia2_num != 0) && (dia1_num >= dia2_num)) {
          if ((dia1_num == dia2_num) && (hora1 >= hora2)) {
            comprobador = false;
          } else {
            comprobador = true;
          }
        } else {
          comprobador = true;
        }
      }
    } while (!comprobador);
    int res = (dia2_num - dia1_num) * 24;      //Haciendo las sumas correspondientes
    if (hora1 > hora2) {
      res = res + (((24 - hora1) + hora2) - 24);
    } else {
      res = res + (hora2 - hora1);
    }
    System.out.printf("Entre las %d:00h del %s y las %d:00h del %s hay %d horas", hora1, dia1, hora2, dia2, res);
  }
}
