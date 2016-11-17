/*
 * Ejercicio 2
 * 
 * Muestra un carta al azar de la baraja francesa
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio02 {
  public static void main(String[] args){
    int numero = (int)(Math.random() * 13 + 1);
    String numero_letras = "";
    int palo = (int)(Math.random() * 4);
    String palo_letras = "";
    switch (numero) {
      case 1:
        numero_letras = "As";
        break;
      case 11:
        numero_letras = "J";
        break;
      case 12:
        numero_letras = "Q";
        break;
      case 13:
        numero_letras = "K";
        break;
      default:
        numero_letras = String.valueOf(numero);
    }
    switch (palo) {
      case 0:
        palo_letras = " de Corazones";
        break;
      case 1:
        palo_letras = " de Picas";
        break;
      case 2:
        palo_letras = " de Tréboles";
        break;
      case 3:
        palo_letras = " de Diamantes";
        break;
    }
    System.out.println(numero_letras + palo_letras);
  }
}
