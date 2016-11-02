/*
 * Ejercicio 21
 * 
 * Pide una serie de números hasta que se introduzca uno positivo y dice
 * cuantos números se han introducido, la media de los números impares y
 * el mayor de los números pares introducidos sin utilizar el número 
 * para ninguna de las operaciones
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio21 {
  public static void main(String[] args){
    System.out.println("Introduce los números correspondientes para realizar los cálculos (se dejarán de pedir números al primer número negativo que se introduzca): ");
    double num_usuario = Double.parseDouble(System.console().readLine());
    int contador = 0;
    int contador_impar = 0;
    int contador_par = 0;
    double sum_impar = 0;
    double max_par = 0;
    while (num_usuario >= 0) {
      contador++;
      if ((num_usuario % 2) == 0) {
        if (num_usuario > max_par) {
          max_par = num_usuario;
          contador_par++;
        }
      } else {
        sum_impar = sum_impar + num_usuario;
        contador_impar++;
      }
      num_usuario = Double.parseDouble(System.console().readLine());
    }
    System.out.println("Se han introducido " + contador + " números");
    if (contador_impar > 0) {
      System.out.println("La media de los números impares es " + (sum_impar / contador_impar));
    } else {
      System.out.println("No se han introducido números impares");
    }
    if (contador_par > 0) {
      System.out.println("El máximo número par que se ha introducido es " + max_par);
    } else {
      System.out.println("No se han introducido números pares");
    }
  }
}
