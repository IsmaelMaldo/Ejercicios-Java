import java.util.ArrayList;
import java.util.Collections;

public class GeneraCartas {
  public static void main(String[] args) {
    ArrayList<Carta> baraja = new ArrayList<Carta>();
    ArrayList<Carta> mano = new ArrayList<Carta>();
    for (int i = 0; i < 4; i++){
      for (int j = 1; j < 13; j++){
        baraja.add(new Carta(j, i));
      }
    }
    for (int i = 0; i < 10; i++){
      int carta = (int)(Math.random() * (48 - i));
      mano.add(baraja.get(carta));
      baraja.remove(carta);
    }
    Collections.sort(mano);
    for (Carta x : mano){
      System.out.println(x);
    }
  }
}
