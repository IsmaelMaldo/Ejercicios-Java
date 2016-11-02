/*
 * Ejercicio 27
 * 
 * Pide un número, luego pide otro y averigua en que posición se
 * encuentra ese número
 * 
 * @author Ismael Maldonado González
*/

public class Ejercicio27 {
  public static void main(String[] args){
    System.out.printf("Introduce un número: ");
    int num_usuario = Integer.parseInt(System.console().readLine());
    int contador = 0;
    int suma = 0;
    while ((num_usuario % 3) != 0) {
      num_usuario--;
    }
    for (num_usuario = num_usuario; num_usuario >= 3; num_usuario = num_usuario - 3) {
      System.out.printf("%d, ", num_usuario);
      contador++;
      suma = suma + num_usuario;
    }
    System.out.printf("\nSe han encontrado %d números multiplos de 3 entre el 1 y el número dado.\n", contador);
    System.out.println("La suma de todos esos números es de " + suma);
  }
}
