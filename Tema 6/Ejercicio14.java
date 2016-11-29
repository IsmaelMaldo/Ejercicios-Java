/*
 * Ejercicio 14
 * 
 * Intenta adivinar un número pensado por el usuario
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio14 {
  public static void main(String[] args){
    System.out.println("Voy a intentar adivinar el número que estás pensando.");
    boolean acierto = false;
    boolean error = false;
    int intentos = 1;
    int menor = 0;
    int mayor  = 101;
    while ((intentos <= 5) && (!acierto) && (!error)) {
      System.out.printf("Intento %d\n", intentos);
      int prediccion = (int)(Math.random() * (mayor - menor) + menor);
      System.out.printf("El número que estas pensando es %d? ", prediccion);
      String respuesta = System.console().readLine();
      switch (respuesta) {
        case "si":
          acierto = true;
          break;
        case "menor":
          mayor = prediccion;
          break;
        case "mayor":
          menor = prediccion;
          break;
        default:
          error = true;
      }
      intentos++;
    }
    if (error) {
      System.out.println("Ha habido un error");
    } else if (acierto) {
      System.out.println("Acerté :D");
    } else {
      System.out.println("Se me han acado los intentos T.T");
    }
  }
}
