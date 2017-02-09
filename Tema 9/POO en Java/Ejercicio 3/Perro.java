public class Perro extends Mamifero {
  private String raza;
  private String nombre;

  
  public Perro() {
    super();
    this.raza = "Labrador";
    this.nombre = "Sin nombre";
  }

  public Perro(Sexo sexo, String raza, String nombre){
    super(sexo);
    this.raza = raza;
    this.nombre = nombre;
  }

  public Perro(Sexo sexo){
    super(sexo);
    this.raza = "Labrador";
    this.nombre = "Sin nombre";
  }

  public Perro(String nombre){
    super();
    this.raza = "Labrador";
    this.nombre = nombre;
  }
  
  public String getRaza() {
    return this.raza;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void ladra() {
    System.out.println("Wan");
  }

  public void arana() {
    System.out.println("Ras ras ras");
  }

  public void peleaCon(Gato rival) {
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("Wan wan waan (Yo no peleo)");
    } else if (rival.getSexo() == Sexo.HEMBRA) {
      System.out.println("Wan wan(No puedo pelear con alguién tan mono (^-^=)/ )");
    } else {
      System.out.println("Wan wan wan wan (Agarradme que me pega (·-·||) )");
    }
  }
}
