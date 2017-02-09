public abstract class Mamifero extends Animal {

  public Mamifero() {
    super();
  }

  public Mamifero(Sexo sexo) {
    super(sexo);
  }

  public void amamanta() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("No puedo amamantar :'(");
    } else {
      System.out.println("Eso está hecho");
    }
  }

  public void cuidaCrias() {
    System.out.println("Estoy cuidando mis crías");
  }

  public void anda() {
    System.out.println("Estoy andando");
  }
}
