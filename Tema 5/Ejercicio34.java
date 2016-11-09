/*
 * Ejercicio 34
 * 
 * Mezcla dos números en otros dos números, uno sólo con los dígitos
 * pares u otro sólo con los dígitos impares
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio34 {
  public static void main(String[] args){
    long divisor1 = 1;
    long divisor2 = 1;
    String numero_par = "";
    String numero_impar = "";
    System.out.printf("Introduce un número: ");
    long num_usuario1 = Integer.parseInt(System.console().readLine());
    System.out.printf("Introduce otro número: ");
    long num_usuario2 = Integer.parseInt(System.console().readLine());
    while (num_usuario1 > divisor1) {       //aveirguamos cuanto mide el primer número introducido
      divisor1 = divisor1 * 10;
    }
    while (num_usuario2 > divisor2) {       //aveirguamos cuanto mide el segundo número introducido
      divisor2 = divisor2 * 10;
    }
    divisor1 = divisor1 / 10;
    divisor2 = divisor2 / 10;
    while ((num_usuario1 > 0) || (num_usuario2 > 0))  {
      if (num_usuario1 > 0) {
        long aux = num_usuario1 / divisor1;
        if ((aux % 2) == 0) {
          numero_par = numero_par + aux;
        } else {
          numero_impar = numero_impar + aux;
        }
        num_usuario1 = num_usuario1 % divisor1;
        divisor1 = divisor1 / 10;
      }
      if (num_usuario2 > 0) {
        long aux = num_usuario2 / divisor2;
        if ((aux % 2) == 0) {
          numero_par = numero_par + aux;
        } else {
          numero_impar = numero_impar + aux;
        }
        num_usuario2 = num_usuario2 % divisor2;
        divisor2 = divisor2 / 10;

      }
    }
    System.out.println("El número formado por dígitos pares es " + numero_par);
    System.out.println("El número formado por dígitos impares es " + numero_impar);
  }
}
