public class Gato {
  private String nombre;
  private String color;
  private String sexo;

  public Gato(String nombre, String color, String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.sexo = sexo;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setColor(String color){
    this.color = color;
  }

  public void setSexo(String sexo){
    this.sexo = sexo;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public String getColor() {
    return this.color;
  }

  public void maulla() {
    System.out.println("Nyaaaaaaa");
  }

  public void araña() {
    System.out.println("Ras ras ras");
  }

  @Override
  public String toString() {
    return "Nombre: " + this.nombre + "\nColor: " + this.color + "\nSexo: " + this.sexo + "\n";
  }

}
