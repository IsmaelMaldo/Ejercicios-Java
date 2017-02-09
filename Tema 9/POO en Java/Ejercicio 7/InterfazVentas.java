public class InterfazVentas {
  public static void main(String[] args){
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    int opcion = 0;
    while (opcion != 3) {
      System.out.println("Elija una de las siguientes opciones");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
          System.out.println("En la zona principal quedan " + principal.getEntradasPorVender() + " entradas");
          System.out.println("En la zona de compra-venta quedan " + compraVenta.getEntradasPorVender() + " entradas");
          System.out.println("En la zona VIP quedan " + vip.getEntradasPorVender() + " entradas");
          break;
        case 2:
          System.out.println("Elija la zona en la que quiere las entradas:");
          System.out.println("1. Zona principal");
          System.out.println("2. Zona de compra-venta");
          System.out.println("3. Zona VIP");
          int lugar = Integer.parseInt(System.console().readLine());
          System.out.printf("Cuántas entradas desea: ");
          int numEntradas = Integer.parseInt(System.console().readLine());
          switch (lugar){
            case 1:
              principal.vender(numEntradas);
              break;
            case 2:
              compraVenta.vender(numEntradas);
              break;
            case 3:
              vip.vender(numEntradas);
              break;
          }
          break;
      }
      
    }
  }
}
