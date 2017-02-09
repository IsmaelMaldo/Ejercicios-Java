public abstract class Ave extends Animal {
  public Ave() {
    super();
  }

  public Ave(Sexo sexo) {
    super(sexo);
  }

  public void ponHuevo() {
    if (this.getSexo() == Sexo.MACHO){
      System.out.println("No puedo poner huevos");
    } else {
      System.out.println("Aquí tiene su huevo");
    }
  }

  public void vuela() {
      System.out.println("Estoy volandoooooooo!!!!");
  }
}
