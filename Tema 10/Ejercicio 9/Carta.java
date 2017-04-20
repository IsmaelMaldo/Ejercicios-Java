public class Carta implements Comparable<Carta> {
  private int valor;
  private String palo;

  public Carta(int v, int p) {
    this.valor = v;
    switch (p) {
      case 0:
        this.palo = "bastos";
        break;
      case 1:
        this.palo = "oros";
        break;
      case 2:
        this.palo = "espadas";
        break;
      default:
        this.palo = "copas";
    }
  }

  public String getPalo() {
    return this.palo;
  }
  public int getValor() {
    return this.valor;
  }

  public int compareTo(Carta c){
    return (this.palo).compareTo(c.getPalo());
  }
  public boolean equals(Carta c){
    if (this.valor < c.getValor()){
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString (){
    String val;
    switch (this.valor) {
      case 1:
        val = "As";
        break;
      case 10:
        val = "J";
        break;
      case 11:
        val = "Q";
        break;
      case 12:
        val = "K";
        break;
      default:
        val = "" + this.valor;
    }
    return val + " de " + palo;
  }
}
