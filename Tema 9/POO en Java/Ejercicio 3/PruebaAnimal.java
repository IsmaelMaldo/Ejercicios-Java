public class PruebaAnimal {
  public static void main(String[] args) {
    Gato neko = new Gato();
    Gato kitty = new Gato(Sexo.HEMBRA);
    Gato shamisen = new Gato();
    neko.maulla();
    neko.araña();
    kitty.peleaCon(neko);
    neko.peleaCon(kitty);
    neko.peleaCon(shamisen);
    neko.amamanta();
    kitty.amamanta();
    neko.cuidaCrias();
    neko.anda();
    neko.duerme();
    neko.come();

    Perro inu = new Perro();
    inu.ladra();
    inu.arana();

    Canario kotori = new Canario();
    kotori.pia();
    kotori.pica();
    kotori.vuela();

    Pinguino penguin = new Pinguino();
    penguin.vuela();
    penguin.nada();

    Lagarto geko = new Lagarto();
    geko.anda();
    geko.ponHuevo();
  }
}
