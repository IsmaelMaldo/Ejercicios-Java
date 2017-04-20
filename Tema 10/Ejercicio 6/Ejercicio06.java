import java.util.HashMap;

public class Ejercicio06 {
  public static void main(String[] args) {

    HashMap<String, String> usuariosRegistrados = new HashMap<String, String>();

    usuariosRegistrados.put("ismael", "ismael");
    usuariosRegistrados.put("manu", "manu");
    usuariosRegistrados.put("cristina", "cristina");
    usuariosRegistrados.put("mei", "mei");
    usuariosRegistrados.put("alejandro", "alejandro");
    boolean acierto = false;
    for (int i = 0; i < 3 && !acierto; i++){
      System.out.println("Intento " + (i + 1));
      System.out.printf("Introduce el nombre de usuario: ");
      String usuario = System.console().readLine();
      System.out.printf("Introduce la contraseña: ");
      String pass = System.console().readLine();
      if (usuariosRegistrados.containsKey(usuario)){
        if (usuariosRegistrados.get(usuario).equals(pass)){
          acierto = true;
        }
      }
      if (!acierto){
        System.out.println("Los datos introducidos no son correctos");
      }
    }
    if (acierto){
      System.out.println("Ha accedido al área restringida :D");
      System.out.println("Aunque no hay nada por aquí (^-^U)");
    } else {
      System.out.println("Lo siento, no ha accedido al área restringida");
      System.out.println("Aunque tampoco se pierde gran cosa (-.-U)");
    }
  }
}
