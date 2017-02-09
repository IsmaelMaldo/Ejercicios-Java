public class Vehiculo {
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  private int kilometrosRecorridos;

  Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  public void recorre(int k) {
    this.kilometrosRecorridos = this.kilometrosRecorridos + k;
    Vehiculo.kilometrosTotales = Vehiculo.kilometrosTotales + k;
  }
}
