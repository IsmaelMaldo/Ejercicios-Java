public class Pinguino extends Ave {
  private String color;
  private String nombre;

  
  public Pinguino() {
    super();
    this.color = "Negro";
    this.nombre = "Sin nombre";
  }

  public Pinguino(Sexo sexo, String raza, String nombre){
    super(sexo);
    this.color = raza;
    this.nombre = nombre;
  }

  public Pinguino(Sexo sexo){
    super(sexo);
    this.color = "Negro";
    this.nombre = "Sin nombre";
  }

  public Pinguino(String nombre){
    super();
    this.color = "Negro";
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

  public void nada() {
    System.out.println("Swiiiiiiimmmmmmmm");
  }
  
  @Override
  public void vuela() {
    System.out.println("No puedo volar :'(");
  }
}
