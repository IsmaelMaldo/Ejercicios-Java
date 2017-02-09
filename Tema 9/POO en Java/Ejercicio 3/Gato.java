public class Gato extends Mamifero {
  private String raza;
  private String nombre;

  
  public Gato() {
    super();
    this.raza = "Siamés";
    this.nombre = "Sin nombre";
  }

  public Gato(Sexo sexo, String raza, String nombre){
    super(sexo);
    this.raza = raza;
    this.nombre = nombre;
  }

  public Gato(Sexo sexo){
    super(sexo);
    this.raza = "Siamés";
    this.nombre = "Sin nombre";
  }

  public Gato(String nombre){
    super();
    this.raza = "Siamés";
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

  public void peleaCon(Gato rival) {
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("Nyaa nya nya nyaaaaa (Yo no peleo)");
    } else if (rival.getSexo() == Sexo.HEMBRA) {
      System.out.println("Nya nyyyaaaa nya (No puedo pelear con alguién tan mono (^-^=)/ )");
    } else {
      System.out.println("Nyaa nyaaaa nyyyyaaaa (Agarradme que me pega (·-·||) )");
    }
  }
}
