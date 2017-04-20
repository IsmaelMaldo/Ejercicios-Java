import java.util.ArrayList;
import java.util.Collections;

public class CreaDiscos {
  public static void main(String[] args) {
    ArrayList<Discos> coleccion = new ArrayList<Discos>();

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
              for (Discos disco : coleccion){
                System.out.println(disco);
              }
              break;
            case 2:
              System.out.printf("Escribe el autor a buscar: ");
              String autor = System.console().readLine();
              for (int i = 0; i < coleccion.size(); i++) {
                if (coleccion.get(i).getAutor().equals(autor)) {
                  System.out.println(coleccion.get(i));
                }
              }
              break;
            case 3:
              System.out.printf("Escribe el género a buscar: ");
              String genero = System.console().readLine();
              for (int i = 0; i < coleccion.size(); i++) {
                if (coleccion.get(i).getGenero().equals(genero)) {
                  System.out.println(coleccion.get(i));
                }
              }
              break;
            case 4:
              System.out.printf("Escribe el intervalo de tiempo que quieres que se muestre separados por intro: ");
              int tiempo1 = Integer.parseInt(System.console().readLine());
              int tiempo2 = Integer.parseInt(System.console().readLine());
              for (int i = 0; i < coleccion.size(); i++) {
                if ((coleccion.get(i).getDuracion() > tiempo1) && (coleccion.get(i).getDuracion() < tiempo2)) {
                  System.out.println(coleccion.get(i));
                }
              }
              break;
          }
          break;
        case 2:
          System.out.println("\n\nNuevo disco");
          System.out.println("=================");
          System.out.printf("Introduce el código del disco: ");
          String codigo = System.console().readLine();
          if (!(coleccion.contains(codigo))){
            System.out.printf("Introduce el autor del disco: ");
            String autor = System.console().readLine();
            System.out.printf("Introduce el título del disco: ");
            String titulo = System.console().readLine();
            System.out.printf("Introduce el genero del disco: ");
            String genero = System.console().readLine();
            System.out.printf("Introduce la duración del disco: ");
            int duracion = Integer.parseInt(System.console().readLine());
            coleccion.add(new Discos (codigo, autor, titulo, genero, duracion));
          } else {
            System.out.printf("Lo sentimos, el código ya existe");
          }
          break;
        case 3:
          System.out.println("\n\nModificar");
          System.out.println("===============");
          System.out.printf("Introduce el código del disco que quieres modificar: ");
          buscar = System.console().readLine();
          seleccionado = 0;
          while (seleccionado < coleccion.size() && existe) {
            if (!(coleccion.get(seleccionado).getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (seleccionado > coleccion.size()) {
            System.out.println("El código introducido no existe.");
          } else {
            System.out.printf("Introduce el nuevo código: ");
            codigo = System.console().readLine();
            System.out.println("Autor atiguo: " + coleccion.get(seleccionado).getAutor());
            System.out.printf("Introduce el nuevo autor: ");
            String autor = System.console().readLine();
            System.out.println("Título antiguo: " + coleccion.get(seleccionado).getTitulo());
            System.out.printf("Introduce el nuevo título: ");
            String titulo = System.console().readLine();
            System.out.println("Genero antiguo: " + coleccion.get(seleccionado).getGenero());
            System.out.printf("Introduce el nuevo genero: ");
            String genero = System.console().readLine();
            System.out.println("Duracion antigua: " + coleccion.get(seleccionado).getDuracion());
            System.out.printf("Introduce la nueva duracion: ");
            int duracion = Integer.parseInt(System.console().readLine());
            coleccion.remove(seleccionado);
            coleccion.add(new Discos (codigo, autor, titulo, genero, duracion));
          }
          break;
        case 4:
          System.out.println("\n\nBorrar");
          System.out.println("===============");
          System.out.printf("Introduce el código del disco que quieres borrar: ");
          buscar = System.console().readLine();
          while (seleccionado < coleccion.size() && existe) {
            if (!(coleccion.get(seleccionado).getCodigo().equals(buscar))) {
              seleccionado++;
            } else {
              existe = false;
            }
          }
          if (!(seleccionado < coleccion.size())) {
            System.out.println("El código introducido no existe.");
          } else {
            coleccion.remove(seleccionado);
          }
          break;
      }
    } while (opcion != 5);
  }
}
