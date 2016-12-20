/* Ejercicio 3
 *
 * @author Ismael Maldonado González
 * date 15/12/2016
 * modelo B
*/

public class Ex22img3 {
  public static void main(String[] args){
    //Generamos el número aleatorio
    int num = (int)(Math.random() * 100001);
    //Imprimimos el número aleatorio
    System.out.printf("Numero generado: %d\n", num);
    //Comprobamos la longitud del número y lo guardamos
    int mult = 1;
    int contador = 0;
    while (mult < num) {
      mult = mult * 10;
      contador++;
    }
    mult = mult / 10;
    //Declaramos un array en el que vamos a meter los diferentes dígitos
    int[] digitos = new int[contador];
    contador = 0;
    while (num != 0) {
      digitos[contador] = num / mult;
      contador++;
      num = num % mult;
      mult = mult / 10;
    }
    // Imprimimos la dichosa figurita
    // Establecemos el margen
    int espacios = 20;
    //Establecemos la dirección en función de la bandera (true =
    // izquierda y false = derecha)
    boolean direcion = false;
    for (int i = 0; i < contador; i++) {
      //Si el dígito es 0 no tenermos que cambiar de dirección la zigzag
      if (digitos[i] != 0) {
        //Cambiamos la dirección del zigzag
        if (direcion) {
          direcion = false;
        } else {
          direcion = true;
        }
      }
      //Imprimimos el zigzag
      for (int j = 0; j < digitos[i]; j++) {
        if (direcion) {
          espacios++;
        } else {
          espacios--;
        }
        //Imprimimos los espacios
        for (int k = 0; k < espacios; k++) {
          System.out.printf(" ");
        }
        //Imprimimos el asterisco
        System.out.printf("*\n");
      }
    }
  }
}
