public class PruebaVehiculos {
  public static void main(String[] args) {
    int opcion = 0;
    int km;
    Bicicleta bh = new Bicicleta(9);
    Coche bmw = new Coche(3000);

    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicilceta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opcion (1-8): ");

      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion){
        case 1:
          System.out.println("¿Cuántos kilometros quieres recorrer?");
          km = Integer.parseInt(System.console().readLine());
          bh.recorre(km);
          break;
        case 2:
          bh.hazCaballito();
          break;
        case 3:
          System.out.println("¿Cuántos kilometros quieres recorrer?");
          km = Integer.parseInt(System.console().readLine());
          bmw.recorre(km);
          break;
        case 4:
          bmw.quemaRueda();
          break;
        case 5:
          System.out.println(bh.getKilometrosRecorridos());
          break;
        case 6:
          System.out.println(bmw.getKilometrosRecorridos());
          break;
        case 7:
          km = Vehiculo.getKilometrosTotales();
          System.out.println(km);
          break;
      }
    }
  }
}
