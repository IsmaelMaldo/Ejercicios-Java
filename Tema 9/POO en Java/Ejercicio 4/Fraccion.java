public class Fraccion {
  private int numerador;
  private int denominador;

  public Fraccion(int num, int den){
    this.numerador = num;
    this.denominador = den;
  }

  public int getNumerador() {
    return this.numerador;
  }

  public int getDenominador() {
    return this.denominador;
  }

  public void invierte() {
    int aux = this.denominador;
    this.denominador = this.numerador;
    this.numerador = aux;
  }

  public void simplifica() {
    int divisor = this.mcd();
    this.denominador = this.denominador / divisor;
    this.numerador = this.numerador / divisor;
  }

  public int multiplica() {
    return this.getNumerador() * this.getDenominador();
  }

  public int divide() {
    return this.getNumerador() / this.getDenominador();
  }

  private int mcd(){
     int u=Math.abs(this.getNumerador());
     int v=Math.abs(this.getDenominador());
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
  }
}
