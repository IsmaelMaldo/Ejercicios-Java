
public class PruebaCaballo {
  public static void main(String[] args) {
    Caballo rocinante = new Caballo("Rocinante", "negro", 10, 3);

    System.out.println("Este caballo se llama: " + rocinante.getNombre());

    rocinante.relincha();
    rocinante.cabalga();
    rocinante.rumia();
  }
}
