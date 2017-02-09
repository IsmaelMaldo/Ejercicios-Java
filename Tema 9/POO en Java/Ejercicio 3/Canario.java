public class Canario extends Ave {
  private String color;
  private String nombre;

  
  public Canario() {
    super();
    this.color = "Verde";
    this.nombre = "Sin nombre";
  }

  public Canario(Sexo sexo, String raza, String nombre){
    super(sexo);
    this.color = raza;
    this.nombre = nombre;
  }

  public Canario(Sexo sexo){
    super(sexo);
    this.color = "Verde";
    this.nombre = "Sin nombre";
  }

  public Canario(String nombre){
    super();
    this.color = "Verde";
    this.nombre = nombre;
  }

  public String getColor() {
    return this.color;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void pia() {
    System.out.println("Pío pío");
  }

  public void pica() {
    System.out.println("Toc toc toc");
  }
}
