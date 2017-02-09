public class PruebaGato {
  public static void main(String[] args){
    Gato[] kitty = new Gato[4];

    for (int i = 0; i < 4; i++) {
      kitty[i] = new Gato();
      System.out.println("Introduce el nombre del gato");
      kitty[i].setNombre(System.console().readLine());
      System.out.println("Introduce la raza del gato");
      kitty[i].setRaza(System.console().readLine());
    }

    for (int i = 0; i < 4; i++) {
      System.out.println(kitty[i]);
    }
    
  }
}
