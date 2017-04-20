public class Moneda {
  String valor;
  String lado;
  public Moneda() {
    switch ((int)(Math.random() * 8)){
      case 0:
        valor = "1 céntimo";
        break;
      case 1:
        valor = "2 céntimos";
        break;
      case 2:
        valor = "5 céntimos";
        break;
      case 3:
        valor = "10 céntimos";
        break;
      case 4:
        valor = "20 céntimos";
        break;
      case 5:
        valor = "50 céntimos";
        break;
      case 6:
        valor = "1 euro";
        break;
      default:
        valor = "2 euros";
    }
    switch ((int)(Math.random() * 2)){
      case 0:
        lado = "cara";
        break;
      default:
        lado = "cruz";
    }
  }

  @Override
  public String toString() {
    return valor + " - " + lado;
  }
}
