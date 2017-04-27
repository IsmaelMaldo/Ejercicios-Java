import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Gestimal {
  static int N = 100;
  public static void main(String[] args) {
    ArrayList<Mercancia> almacen = new ArrayList<Mercancia>();

    int opcion = 0;

    do {
      System.out.println("\n\nGESTISIMAL");
      System.out.println("===============");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.printf("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      String buscar = "";
      int seleccionado = 0;
      boolean existe = true;
      switch (opcion) {
        case 1:
          System.out.println("\n\nListado");
          System.out.println("============");
          System.out.println(almacen.toArray());
          break;
        case 2:
          System.out.println("\n\nAlta");
          System.out.println("=================");
          System.out.printf("Introduce el código del artículo: ");
          String codigo = System.console().readLine();
          existe = false;
          for (Mercancia x: almacen){
            if (codigo.equals(x.getCodigo())){
              existe = true;
            }
          }
          if (existe){
            System.out.printf("Lo sentimos, el código ya existe");
          } else {
            System.out.println("Introduce la descripción del artículo");
            String descripcion = System.console().readLine();
            System.out.printf("Introduce el precio de compra");
            int precio_compra = Integer.parseInt(System.console().readLine());
            System.out.printf("Introduce el precio de venta");
            int precio_venta = Integer.parseInt(System.console().readLine());
            almacen.add(new Mercancia(codigo, descripcion, precio_compra, precio_venta));
          }
          break;
        case 3:
          System.out.println("\n\nBaja");
          System.out.println("===============");
          System.out.printf("Introduce el código del artículo que quieres borrar: ");
          buscar = System.console().readLine();
          while (seleccionado < N && existe) {
            if (!(almacen.get(seleccionado).getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (!(seleccionado < N)) {
            System.out.println("El código introducido no existe.");
          } else {
            almacen.remove(seleccionado);
          }
          break;
        case 4:
          System.out.println("\n\nModificar");
          System.out.println("===============");
          System.out.printf("Introduce el código de la mercancía que quieres modificar: ");
          buscar = System.console().readLine();
          seleccionado = 0;
          while (seleccionado < N - 1 && existe) {
            if (!(almacen.get(seleccionado).getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (seleccionado > N) {
            System.out.println("El código introducido no existe.");
          } else {
            System.out.printf("Introduce el nuevo código: ");
            almacen.get(seleccionado).modificar(System.console().readLine());
          }
          break;
        case 5:
          System.out.println("\n\nEntrada de mercancías");
          System.out.println("===============");
          System.out.println("Introduce el código del artículo para el que ha entrado mercancía");
          buscar = System.console().readLine();
          seleccionado = 0;
          while (seleccionado < N - 1 && existe) {
            if (!(almacen.get(seleccionado).getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (seleccionado > N) {
            System.out.println("El código introducido no existe.");
          } else {
            System.out.printf("Introduce la cantidad de mercancía que ha entrado: ");
            almacen.get(seleccionado).entrada(Integer.parseInt(System.console().readLine()));
          }
          break;
        case 6:
          System.out.println("\n\nSalida de mercancías");
          System.out.println("===============");
          HashMap<String, Integer> listaCompra = new HashMap<String, Integer>();
          HashMap<String, Integer> precios = new HashMap<String, Integer>();
          while (!(buscar.equals("salir"))){
            System.out.println("Introduce el código del artículo a vender (Escribe \"salir\" para terminar la compra)");
            buscar = System.console().readLine();
            seleccionado = 0;
            while (seleccionado < N - 1 && existe) {
              if (!(almacen.get(seleccionado).getCodigo().equals(buscar))) {
                seleccionado++;
              } else {
                existe = false;
              }
            }
            if (seleccionado > N) {
              System.out.println("El código introducido no existe.");
            } else {
              System.out.printf("Introduce las unidades que se han vendido: ");
              int unidades = Integer.parseInt(System.console().readLine());
              almacen.get(seleccionado).salida(unidades);
              listaCompra.put(buscar, unidades);
              precios.put(buscar, almacen.get(seleccionado).getPrecioVenta());
            }
          }
          int total = 0;
          System.out.println("Producto     Cantidad      Precio total");
          System.out.println("========     ========      ============");
          for (Map.Entry producto: listaCompra.entrySet()){
            int cantidad = listaCompra.get(producto.getKey());
            int precio = precios.get(producto.getKey());
            int suma =  cantidad * precio;
            System.out.println(producto.getKey() + "     " + producto.getValue() + "     " + suma);
            total += suma;
          }
          System.out.println("Importe base: " + total);
          System.out.println("Importe con IVA: " + (total * 1.21));
          break;
      }
    } while (opcion != 7);
  }
}
