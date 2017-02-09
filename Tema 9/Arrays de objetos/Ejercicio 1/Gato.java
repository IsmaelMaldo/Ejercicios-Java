public class Gato {
  private String raza;
  private String nombre;

  public void setRaza(String raza){
    this.raza = raza;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public String getRaza() {
    return this.raza;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void maulla() {
    System.out.println("Nyaaaaaaa");
  }

  public void araña() {
    System.out.println("Ras ras ras");
  }

  @Override
  public String toString() {
    return "Nombre: " + this.nombre + "\nRaza: " + this.raza + "\n";
  }

}
