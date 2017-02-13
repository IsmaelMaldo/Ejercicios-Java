public class CreaDiscos {
  static int N = 100;
  public static void main(String[] args) {
    Discos[] coleccion = new Discos[N];

    for (int i = 0; i < N; i ++){
      coleccion[i] = new Discos();
    }

    int opcion = 0;

    do {
      System.out.println("\n\nColección de Discos");
      System.out.println("======================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.printf("Introduzca una opción: ");
      opcion = Integer.parseInt(System.console().readLine());
      String buscar;
      int seleccionado = 0;
      boolean existe = true;
      switch (opcion) {
        case 1:
          System.out.println("\n\nListado");
          System.out.println("============");
          for (int i = 0; i < N; i++) {
            if (!(coleccion[i].getCodigo().equals("LIBRE"))) {
              System.out.println(coleccion[i]);
            }
          }
          break;
        case 2:
          int hueco = 0;
          while (!(coleccion[hueco].getCodigo().equals("LIBRE"))) {
            hueco++;
          }
          System.out.println("\n\nNuevo disco");
          System.out.println("=================");
          System.out.printf("Introduce el código del disco: ");
          coleccion[hueco].setCodigo(System.console().readLine());
          System.out.printf("Introduce el autor del disco: ");
          coleccion[hueco].setAutor(System.console().readLine());
          System.out.printf("Introduce el título del disco: ");
          coleccion[hueco].setTitulo(System.console().readLine());
          System.out.printf("Introduce el genero del disco: ");
          coleccion[hueco].setGenero(System.console().readLine());
          System.out.printf("Introduce la duración del disco: ");
          coleccion[hueco].setDuracion(Integer.parseInt(System.console().readLine()));
          break;
        case 3:
          System.out.println("\n\nModificar");
          System.out.println("===============");
          System.out.printf("Introduce el código del disco que quieres modificar: ");
          buscar = System.console().readLine();
          seleccionado = 0;
          while (seleccionado < N && existe) {
            if (!(coleccion[seleccionado].getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (seleccionado > N) {
            System.out.println("El código introducido no existe.");
          } else {
            System.out.printf("Introduce el nuevo código: ");
            coleccion[seleccionado].setCodigo(System.console().readLine());
            System.out.println("Autor atiguo: " + coleccion[seleccionado].getAutor());
            System.out.printf("Introduce el nuevo autor: ");
            coleccion[seleccionado].setAutor(System.console().readLine());
            System.out.println("Título antiguo: " + coleccion[seleccionado].getTitulo());
            System.out.printf("Introduce el nuevo título: ");
            coleccion[seleccionado].setTitulo(System.console().readLine());
            System.out.println("Genero antiguo: " + coleccion[seleccionado].getGenero());
            System.out.printf("Introduce el nuevo genero: ");
            coleccion[seleccionado].setGenero(System.console().readLine());
            System.out.println("Duracion antigua: " + coleccion[seleccionado].getDuracion());
            System.out.printf("Introduce la nueva duracion: ");
            coleccion[seleccionado].setDuracion(Integer.parseInt(System.console().readLine()));
          }
          break;
        case 4:
          System.out.println("\n\nBorrar");
          System.out.println("===============");
          System.out.printf("Introduce el código del disco que quieres borrar: ");
          buscar = System.console().readLine();
          while (seleccionado < N && existe) {
            if (!(coleccion[seleccionado].getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (!(seleccionado < N)) {
            System.out.println("El código introducido no existe.");
          } else {
              System.out.println("HI");
            coleccion[seleccionado].setCodigo("LIBRE");
          }
          break;
      }
    } while (opcion != 5);
  }
}
