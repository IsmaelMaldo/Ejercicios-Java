public class PruebaTiempo {
  public static void main(String[] args) {
    Tiempo time1 = new Tiempo(2, 20, 30);
    Tiempo time2 = new Tiempo(1, 50, 50);
    System.out.println(time1);
    System.out.println(time2);
    System.out.println("Suma1");
    time1.suma(time2);
    System.out.println("Suma2");
    time2.suma(time1);
    System.out.println("Resta1");
    time1.resta(time2);
    System.out.println("Resta2");
    time2.resta(time1);
    
  }
}
