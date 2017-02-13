public class Discos {
  private String codigo;
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;

  public Discos() {
    this.codigo = "LIBRE";
  }

  public String getCodigo() {
    return this.codigo;
  }

  public String getAutor() {
    return this.autor;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getGenero() {
    return this.genero;
  }

  public int getDuracion() {
    return this.duracion;
  }

  public void setCodigo(String x) {
    this.codigo = x;
  }

  public void setAutor(String x) {
    this.autor = x;
  }

  public void setTitulo(String x) {
    this.titulo = x;
  }

  public void setGenero(String x) {
    this.genero = x;
  }

  public void setDuracion(int x) {
    this.duracion = x;
  }

  @Override
  public String toString() {
    return "\nCódigo: " + this.codigo + "\nAutor: " + this.autor + "\nTítulo: " + this.titulo + "\nGénero: " + genero + "\nDuracion: " + this.duracion + "\n";
  }
}
