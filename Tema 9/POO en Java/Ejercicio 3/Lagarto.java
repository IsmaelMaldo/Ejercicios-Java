public class Lagarto extends Animal {
  private String color;
  private String nombre;

  
  public Lagarto() {
    super();
    this.color = "Marron";
    this.nombre = "Sin nombre";
  }

  public Lagarto(Sexo sexo, String raza, String nombre){
    super(sexo);
    this.color = raza;
    this.nombre = nombre;
  }

  public Lagarto(Sexo sexo){
    super(sexo);
    this.color = "Marron";
    this.nombre = "Sin nombre";
  }

  public Lagarto(String nombre){
    super();
    this.color = "Marron";
    this.nombre = nombre;
  }

  public String getColor() {
    return this.color;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void anda() {
    System.out.println("Estoy andando");
  }

  public void ponHuevo() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Me temo que no puedo poner huevos");
    } else {
      
    }
  }
}
