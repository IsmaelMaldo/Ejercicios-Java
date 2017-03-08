public class Mercancia {
  private String codigo;
  private String descripcion;
  private int precio_compra;
  private int precio_venta;
  private int stock;

  public Mercancia() {
    this.codigo = "LIBRE";
  }

  public String getCodigo() {
    return this.codigo;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public int getPrecioCompra() {
    return this.precio_compra;
  }

  public int getPrecioVenta() {
    return this.precio_venta;
  }

  public int getStock() {
    return this.stock;
  }

  public void entrada(int x) {
    this.stock += x;
  }

  public void salida(int x) {
    if (this.stock >= x){
      this.stock -= x;
    } else {
      System.out.println("No hay mercancía suficiente para sacar " + x + " unidades.");
    }
  }

  public void alta(String x) {
    this.codigo = x;
    System.out.println("Introduce la descrición de la mercancía");
    this.descripcion = System.console().readLine();
    System.out.println("Introduce el precio de compra");
    this.precio_compra = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el precio de venta");
    this.precio_venta = Integer.parseInt(System.console().readLine());
    this.stock = 0;
  }

  public void baja() {
    this.codigo = "LIBRE";
  }

  public void modificar(String x) {
    this.codigo = x;
    System.out.println("Descripción antigua: " + this.descripcion);
    System.out.println("Introduce la nueva descrición de la mercancía");
    this.descripcion = System.console().readLine();
    System.out.println("Precio de compra antiguo: " + this.precio_compra);
    System.out.println("Introduce el nuevo precio de compra");
    this.precio_compra = Integer.parseInt(System.console().readLine());
    System.out.println("Precio de compra antiguo: " + this.precio_venta);
    System.out.println("Introduce el nuevo precio de venta");
    this.precio_venta = Integer.parseInt(System.console().readLine());
  }

  @Override
  public String toString() {
    return "\nCódigo: " + this.codigo + "\nDescripción: " + this.descripcion + "\nPrecio de compra: " + this.precio_compra + "\nPrecio de venta: " + this.precio_venta + "\nStock: " + this.stock + "\n";
  }
}
