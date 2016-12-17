/* Ejercicio 1
 *
 * @author Ismael Maldonado González
 * date 15/11/2016
 * modelo B
*/

public class Ex22img1 {
  public static void main(String[] args){
    // Realizando el cuestionario para la tarta
    System.out.printf("Elija un sabor (manzana, fresa o chocolate): ");
    String tarta = System.console().readLine().toLowerCase();
    String choco = "";
    if (tarta.equals("chocolate")) {
      System.out.printf("¿Qué tipo de chocolate quiere? (negro o blanco): ");
      choco = System.console().readLine().toLowerCase();
    }
    System.out.printf("¿Quiere nata? (si o no): ");
    String nata = System.console().readLine().toLowerCase();
    System.out.printf("¿Quiere ponerle un nombre? (si o no): ");
    String nombre = System.console().readLine().toLowerCase();

    //Procesando las opciones
    double precio_tarta = 0;
    double nata_precio = -1;
    double nombre_precio = -1;
    switch (tarta) {
      case "chocolate":
        if (choco.equals("negro")) {
          precio_tarta = 14;
        } else if (choco.equals("blanco")) {
          precio_tarta = 15;
        }
        break;
      case "manzana":
        precio_tarta = 18;
        break;
      case "fresa":
        precio_tarta = 16;
        break;
      default:
        precio_tarta = 0;
    }
    if (nata.equals("si")) {
      nata_precio = 2.50;
    } else if (nata.equals("no")) {
      nata_precio = 0;
    }
    if (nombre.equals("si")) {
      nombre_precio = 2.75;
    } else if (nombre.equals("no")) {
      nombre_precio = 0;
    }

    // Realizando la impresión de las opciones elegidas

    System.out.println(precio_tarta);
    System.out.println(nata_precio);
    System.out.println(nombre_precio);
    // Según los condicionales que hemos puesto anteriormente, si el
    // precio de la tarta es menor de 10, el precio de la nata menor que
    // 0 y el precio del nombre menor que 0, cosa que según los
    // los requisitos del ejercicio es imposible, significa que algunas
    // de las opciones introducidas están mal
    if ((precio_tarta < 10) || (nata_precio < 0) || (nombre_precio < 0)) {
      System.out.printf("Error, alguna de las opciones introducidas no son correctas.");
    } else {
      System.out.printf("Tarta de %s: %.2f\n", tarta, precio_tarta);
      if (nata_precio > 1) {
        System.out.println("Con nata: 2'50");
        precio_tarta = precio_tarta + nata_precio;
      }
      if (nombre_precio > 1) {
        System.out.println("Con nombre: 2'75");
        precio_tarta = precio_tarta + nombre_precio;
      }
      System.out.printf("Total: %.2f\n", precio_tarta);
    }
  }
}
