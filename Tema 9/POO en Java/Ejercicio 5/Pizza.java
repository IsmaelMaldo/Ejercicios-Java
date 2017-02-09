public class Pizza {
  private String tamano;
  private String tipo;
  private boolean servida;
  private static int numPedidas = 0;
  private static int numServidas = 0;

  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.servida = false;
    Pizza.numPedidas++;
  }

  public String getTamano() {
    return this.tamano;
  }

  public String getTipo() {
    return this.tipo;
  }

  public static int getTotalPedidas() {
    return Pizza.numPedidas;
  }

  public static int getTotalServidas() {
    return Pizza.numServidas;
  }

  public void sirve() {
    if (!this.servida){
      this.servida = true;
      Pizza.numServidas++;
    } else {
      System.out.println("Esa pizza ya se ha servido");
    }
  }

  @Override
  public String toString(){
    if (!servida){
      return "Pizza " + this.getTipo() + " " + this.getTamano() + ", pedida";
    } else {
      return "Pizza " + this.getTipo() + " " + this.getTamano() + ", servida";
    }
  }
}
