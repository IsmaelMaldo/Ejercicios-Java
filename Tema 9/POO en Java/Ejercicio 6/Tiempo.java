public class Tiempo {
  private int horas;
  private int minutos;
  private int segundos;

  public Tiempo(int h, int m, int s) {
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }

  public int getHoras() {
    return this.horas;
  }

  public int getMinutos() {
    return this.minutos;
  }

  public int getSegundos() {
    return this.segundos;
  }

  public void suma(Tiempo hora2) {
    int aux = 0;
    int segundos = this.getSegundos() + hora2.getSegundos();
    if (segundos > 60){
      aux = 1;
      segundos = segundos - 60;
    }
    int minutos = this.getMinutos() + hora2.getMinutos() + aux;
    if (minutos > 60) {
      minutos = minutos - 60;
    } else {
      aux = 0;
    }
    int horas = this.getHoras() + hora2.getHoras() + aux;

    System.out.println(horas + "h " + minutos + "m " + segundos + "s");
  }

  public void resta(Tiempo hora2) {
    int numhora1 = Integer.parseInt("" + this.getHoras() + "" + this.getMinutos() + "" + this.getSegundos());
    int numhora2 = Integer.parseInt("" + hora2.getHoras() + "" + hora2.getMinutos() + "" + hora2.getSegundos());
    if (numhora1 < numhora2) {
      System.out.println("Ésta operación no se puede realizar");
    } else {
      int segundos = this.getSegundos();
      int minutos = this.getMinutos();
      int horas = this.getHoras();
      if (segundos < hora2.getSegundos()) {
        segundos += 60;
        minutos--;
      }
      segundos -= hora2.getSegundos();
      if (minutos < hora2.getMinutos()) {
        minutos += 60;
        horas--;
      }
      minutos -= hora2.getMinutos();
      horas -= hora2.getHoras(); 
      System.out.println(horas + "h " + minutos + "m " + segundos + "s");
    }
  }

  @Override
  public String toString() {
    return "" + this.horas + "h " + this.minutos + "m " + this.segundos + "s";
  }
}
