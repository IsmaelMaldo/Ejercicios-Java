/*
 * Ejercicio 3
 * 
 * Muestra una carta al azar de la baraja española
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio03 {
  public static void main(String[] args){
    int numero = (int)(Math.random() * 10 + 1);
    String numero_letras = "";
    int palo = (int)(Math.random() * 4);
    String palo_letras = "";
    switch (numero) {
      case 1:
        numero_letras = "As";
        break;
      case 8:
        numero_letras = "Sota";
        break;
      case 9:
        numero_letras = "Caballo";
        break;
      case 10:
        numero_letras = "Rey";
        break;
      default:
        numero_letras = String.valueOf(numero);
    }
    switch (palo) {
      case 0:
        palo_letras = " de Bastos";
        break;
      case 1:
        palo_letras = " de Oros";
        break;
      case 2:
        palo_letras = " de Espadas";
        break;
      case 3:
        palo_letras = " de Copas";
        break;
    }
    System.out.println(numero_letras + palo_letras);
  }
}
