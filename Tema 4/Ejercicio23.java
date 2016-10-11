/*
* Ejercicio 23
*
* 
* 
* 
* @author Ismael Maldonado González
*/

public class Ejercicio23 {
  public static void main(String[] args){
    
    double base;
    String iva;
    double iva_val = 0;
    String promo;
    double desc = 0;
    
    
    System.out.println("Introduzca la base imponible:");
    base = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
    iva = System.console().readLine();
    System.out.println("Introduzca el código promocional (nopromo, mitad, meno5 o 5porc):");
    promo = System.console().readLine();


    switch (iva.toLowerCase()) {
      case "general":
        iva_val = 21;
        break;
      case "reducido":
        iva_val = 10;
        break;
      case "superreducido":
        iva_val = 4;
        break;
    }
    switch (promo.toLowerCase()) {
      case "nopromo":
        desc = base;
        break;
      case "mitad":
        desc = base / 2;
        break;
      case "menos5":
        desc = 5;
        break;
      case "5porc":
        desc = base * 0.05;
        break;
    }
    
    
    System.out.printf("Base imponible\t\t%.2f\n", base);
    System.out.printf("IVA (%2.0f%%)\t\t%.2f\n", iva_val, (base * (iva_val / 100)));
    System.out.printf("Precio con IVA\t\t%.2f\n", (base * ((iva_val / 100) + 1)));
    System.out.printf("Cód. promo (%s)\t-%.2f\n", promo, desc);
    System.out.printf("Total\t\t%8.2f\n", ((base * ((iva_val / 100) + 1)) - desc));
    
    
  }
}
