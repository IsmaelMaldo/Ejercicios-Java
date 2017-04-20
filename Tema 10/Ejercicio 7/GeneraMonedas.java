import java.util.ArrayList;

public class GeneraMonedas {
  public static void main(String[] args) {
    ArrayList<Moneda> monedero = new ArrayList<Moneda>();
    System.out.println("Pulse intro para generar monedas");
    while (true){
      System.console().readLine();
      monedero.add(new Moneda());
      for (Moneda x : monedero){
        System.out.println(x);
      }
    }
  }
}
