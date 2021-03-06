import java.util.HashMap;

public class Diccionario {
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();

    diccionario.put("barco", "boat");
    diccionario.put("ordenador", "computer");
    diccionario.put("silla", "chair");
    diccionario.put("luz", "light");
    diccionario.put("oscuridad", "dark");
    diccionario.put("cable", "wire");
    diccionario.put("ratón", "mouse");
    diccionario.put("monitor", "screen");
    diccionario.put("escritorio", "desktop");
    diccionario.put("mesa", "table");
    diccionario.put("teclado", "keyboard");
    diccionario.put("cámara", "camera");
    diccionario.put("mochila", "bag");
    diccionario.put("mano", "hand");
    diccionario.put("clase", "class");
    diccionario.put("caballero", "knight");
    diccionario.put("oso", "bear");
    diccionario.put("monstruo", "monster");
    diccionario.put("juego", "game");
    diccionario.put("torre", "tower");

    System.out.println("Introduzca una palabras en\nespañol separadas por intro para obtener su traducción");
    while (true){
      System.out.println(diccionario.get(System.console().readLine()));
    }
  }
}
