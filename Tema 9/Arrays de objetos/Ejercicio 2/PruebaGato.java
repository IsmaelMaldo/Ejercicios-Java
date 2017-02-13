public class PruebaGato {
  public static void main(String[] args){
    Gato[] kitty = new Gato[4];

    kitty[0] = new Gato("Garfield", "Naranja", "Macho");
    kitty[1] = new Gato("Tom", "Gris", "Macho");
    kitty[2] = new Gato("Neko", "Blanco", "Hembra");
    kitty[3] = new Gato("Shamisen", "Tricolor", "Macho");
    
    for (int i = 0; i < 4; i++) {
      System.out.println(kitty[i]);
    }
    
  }
}
