import java.util.ArrayList;

public class Ejercicio1 {
  public static void main(String[] args) {
    ArrayList<String> alumnos =  new ArrayList<String>();
    alumnos.add("Iván");
    alumnos.add("José");
    alumnos.add("Margarita");
    alumnos.add("Lucía");
    alumnos.add("Jesús");
    alumnos.add("Myriam");
    for (String nombre : alumnos){
      System.out.println(nombre);
    }
  }
}
