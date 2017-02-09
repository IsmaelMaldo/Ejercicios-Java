/*
 * Ejercicio 1
 *
 * Implementa la clase Caballo
 *
 * @author Ismael Maldonado González
*/
public class Caballo {
  private String nombre;
  private String color;
  private int edad;
  private int carrerasGanadas;

  Caballo (String nombre, String color, int edad, int carrerasGanadas){
    this.nombre = nombre;
    this.color = color;
    this.edad = edad;
    this.carrerasGanadas = carrerasGanadas;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void cabalga() {
    System.out.println("Tocotoc tocotoc tocotoc");
  }

  public void relincha() {
    System.out.println("Hiiiiiiiieeeeeeeee");
  }

  public void rumia() {
    System.out.println("Ñam ñam ñam");
  }

}
