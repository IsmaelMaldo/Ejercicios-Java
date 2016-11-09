/*
 * Ejercicio 37
 * 
 * Conversor de decimal a sistema de palotes
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio37 {
  public static void main(String[] args){
    System.out.printf("Introduce un número entero positivo: ");
    long num_usuario = Long.parseLong(System.console().readLine());
    long conservar = num_usuario;
    String palotes = "";
    long divisor = 1;
    while (num_usuario > divisor) {       //aveirguamos cuanto mide el primer número introducido
      divisor = divisor * 10;
    }
    divisor = divisor / 10;
    while (num_usuario > 0)  {
      long aux = num_usuario / divisor;
      for (int i = 0; i < aux; i++) {
        palotes = palotes + "| ";
      }
      palotes = palotes + "- ";
      num_usuario = num_usuario % divisor;
      divisor = divisor / 10;
    }
    System.out.printf("El %d en decimal equivale al %s en el sistema de palotes.", conservar, palotes);
  }
}
