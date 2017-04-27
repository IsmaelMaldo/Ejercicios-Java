import java.util.HashMap;
import java.util.Map;

public class Diccionario {
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();
    String[] palabras = new String[20];
    int i = 0;
    int aciertos = 0;
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

    for(Map.Entry palabra : diccionario.entrySet()){
      palabras[i] = palabra.getKey() + "";
      i++;
    }

    for (i = 0; i < 5; i++){
      int alea = (int)(Math.random() * 20);
      System.out.println("Introduce la traducción de " + palabras[alea] + " en inglés");
      String palabraUsuario = System.console().readLine();
      if (diccionario.get(palabras[alea]).equals(palabraUsuario)){
        aciertos++;
        System.out.println("¡Correcto! :D");
      } else {
        System.out.println("Fallaste :'(");
      }
    }
    System.out.println("Respuestas correctas: " + aciertos);
    System.out.println("Respuestas incorrectas: " + (5 - aciertos));
  }
}
