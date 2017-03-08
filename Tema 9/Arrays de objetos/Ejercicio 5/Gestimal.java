public class Gestimal {
  static int N = 100;
  public static void main(String[] args) {
    Mercancia[] almacen = new Mercancia[N];

    for (int i = 0; i < N; i ++){
      almacen[i] = new Mercancia();
    }

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
          for (int i = 0; i < N; i++) {
            if (!(almacen[i].getCodigo().equals("LIBRE"))) {
              System.out.println(almacen[i]);
            }
          }
          break;
        case 2:
          int hueco = 0;
          while (!(almacen[hueco].getCodigo().equals("LIBRE")) && (hueco < N)) {
            hueco++;
          }
          if (!(hueco < N)) {
            System.out.println("\nLo siento, no caben más articulos en el almacen, borra alguno para introducir uno nuevo");
          } else {
            System.out.println("\n\nAlta");
            System.out.println("=================");
            System.out.printf("Introduce el código del artículo: ");
            String codigo = System.console().readLine();
            int contador = 0;
            while (!(codigo.equals(almacen[contador].getCodigo())) && (contador < N - 1)){
              contador++;
            }
            if (contador < 100){
              almacen[hueco].alta(codigo);
            } else {
              System.out.printf("Lo sentimos, el código ya existe");
            }
          }
          break;
        case 3:
          System.out.println("\n\nBaja");
          System.out.println("===============");
          System.out.printf("Introduce el código del artículo que quieres borrar: ");
          buscar = System.console().readLine();
          while (seleccionado < N && existe) {
            if (!(almacen[seleccionado].getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (!(seleccionado < N)) {
            System.out.println("El código introducido no existe.");
          } else {
            almacen[seleccionado].baja();
          }
          break;
        case 4:
          System.out.println("\n\nModificar");
          System.out.println("===============");
          System.out.printf("Introduce el código de la mercancía que quieres modificar: ");
          buscar = System.console().readLine();
          seleccionado = 0;
          while (seleccionado < N - 1 && existe) {
            if (!(almacen[seleccionado].getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (seleccionado > N) {
            System.out.println("El código introducido no existe.");
          } else {
            System.out.printf("Introduce el nuevo código: ");
            almacen[seleccionado].modificar(System.console().readLine());
          }
          break;
        case 5:
          System.out.println("\n\nEntrada de mercancías");
          System.out.println("===============");
          System.out.println("Introduce el código del artículo para el que ha entrado mercancía");
          buscar = System.console().readLine();
          seleccionado = 0;
          while (seleccionado < N - 1 && existe) {
            if (!(almacen[seleccionado].getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (seleccionado > N) {
            System.out.println("El código introducido no existe.");
          } else {
            System.out.printf("Introduce la cantidad de mercancía que ha entrado: ");
            almacen[seleccionado].entrada(Integer.parseInt(System.console().readLine()));
          }
          break;
        case 6:
          System.out.println("\n\nSalida de mercancías");
          System.out.println("===============");
          System.out.println("Introduce el código del artículo para el que ha salido mercancía");
          buscar = System.console().readLine();
          seleccionado = 0;
          while (seleccionado < N - 1 && existe) {
            if (!(almacen[seleccionado].getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (seleccionado > N) {
            System.out.println("El código introducido no existe.");
          } else {
            System.out.printf("Introduce la cantidad de mercancía que ha salido: ");
            almacen[seleccionado].salida(Integer.parseInt(System.console().readLine()));
          }
          break;
      }
    } while (opcion != 7);
  }
}
