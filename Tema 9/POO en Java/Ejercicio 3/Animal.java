public abstract class Animal {
  private Sexo sexo;

  public Animal() {
    this.sexo = Sexo.MACHO;
  }

  public Animal(Sexo sexo) {
    this.sexo = sexo;
  }

  public Sexo getSexo() {
    return this.sexo;
  }

  public void duerme() {
    System.out.println("Zzzzzz");
  }

  public void come() {
    System.out.println("Ñam ñam ñam");
  }
}
