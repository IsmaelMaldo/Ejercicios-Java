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
          System.out.println("\n\nTipos de listado");
          System.out.println("=====================");
          System.out.println("Elige una de las siguientes opciones:");
          System.out.println("1) Listado completo.");
          System.out.println("2) Listado por autor.");
          System.out.println("3) Listado por género.");
          System.out.println("4) Listado por rango de duración.");
          int opcion2 = Integer.parseInt(System.console().readLine());
          switch (opcion2){
            case 1:
              for (int i = 0; i < N; i++) {
                if (!(coleccion[i].getCodigo().equals("LIBRE"))) {
                  System.out.println(coleccion[i]);
                }
              }
              break;
            case 2:
              System.out.printf("Escribe el autor a buscar: ");
              String autor = System.console().readLine();
              for (int i = 0; i < N; i++) {
                if (coleccion[i].getAutor().equals(autor)) {
                  System.out.println(coleccion[i]);
                }
              }
              break;
            case 3:
              System.out.printf("Escribe el género a buscar: ");
              String genero = System.console().readLine();
              for (int i = 0; i < N; i++) {
                if (coleccion[i].getGenero().equals(genero)) {
                  System.out.println(coleccion[i]);
                }
              }
              break;
            case 4:
              System.out.printf("Escribe el intervalo de tiempo que quieres que se muestre separados por intro: ");
              int tiempo1 = Integer.parseInt(System.console().readLine());
              int tiempo2 = Integer.parseInt(System.console().readLine());
              for (int i = 0; i < N; i++) {
                if ((coleccion[i].getDuracion() > tiempo1) && (coleccion[i].getDuracion() < tiempo2)) {
                  System.out.println(coleccion[i]);
                }
              }
              break;
          }
          break;
        case 2:
          int hueco = 0;
          while (!(coleccion[hueco].getCodigo().equals("LIBRE")) && (hueco < 100)) {
            hueco++;
          }
          if (hueco > 99) {
            System.out.println("\nLo siento, no caben más dicos en la biblioteca, borra alguno para introducir uno nuevo");
          } else {
            System.out.println("\n\nNuevo disco");
            System.out.println("=================");
            System.out.printf("Introduce el código del disco: ");
            String codigo = System.console().readLine();
            int contador = 0;
            while (codigo.equals(coleccion[contador]) && contador < 100){
              contador++;
            }
            if (contador < 100){
            coleccion[hueco].setCodigo(codigo);
            System.out.printf("Introduce el autor del disco: ");
            coleccion[hueco].setAutor(System.console().readLine());
            System.out.printf("Introduce el título del disco: ");
            coleccion[hueco].setTitulo(System.console().readLine());
            System.out.printf("Introduce el genero del disco: ");
            coleccion[hueco].setGenero(System.console().readLine());
            System.out.printf("Introduce la duración del disco: ");
            coleccion[hueco].setDuracion(Integer.parseInt(System.console().readLine()));
            } else {
              System.out.printf("Lo sentimos, el código ya existe");
            }
          }
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
            coleccion[seleccionado].setCodigo("LIBRE");
          }
          break;
      }
    } while (opcion != 5);
  }
}
