/*
* Ejercicio 12
*
* Minicuestionario tipo test
* 
* 
* @author Ismael Maldonado González
*/

import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int nota = 0;
    int res;
    System.out.println("¿Cuál de los sigientes comandos en linux se usa para copiar un archivo?");
    System.out.println(" 1. ls");
    System.out.println(" 2. cp");
    System.out.println(" 3. mv");
    System.out.println(" 4. apt");
    res = s.nextInt();
    if (res == 2) {
      nota++;
    }
    System.out.println("¿Cuál de las siguientes afirmaciones sobre el estándar de Google es correcta?");
    System.out.println(" 1. Para indentar se usan 2 espacios");
    System.out.println(" 2. Para indentar se tabula el espacio equivalente a 2 espacios");
    System.out.println(" 3. En las operaciones lógicas no se usan espacios entre los operadores y las variables");
    System.out.println(" 4. No existe tal estándar");
    res = s.nextInt();
    if (res == 1) {
      nota++;
    }
    System.out.println("¿Cuál de estos hechos define el comienzo de la segunda generación de la informática?");
    System.out.println(" 1. La invención de la válvula de vacío");
    System.out.println(" 2. La aparición de los circuitos integrados");
    System.out.println(" 3. La aparición del microprocesador");
    System.out.println(" 4. La aparición del transistor");
    res = s.nextInt();
    if (res == 4) {
      nota++;
    }
    System.out.println("¿Cuál de los siguientes comandos en linux te muestra una lista con los permisos de cada archivo incluyendo los ocultos?");
    System.out.println(" 1. ls -la");
    System.out.println(" 2. ls -l");
    System.out.println(" 3. ls -h");
    System.out.println(" 4. ls -R");
    res = s.nextInt();
    if (res == 1) {
      nota++;
    }
    System.out.println("¿Cuál de las siguientes líneas de JAVA imprime texto en la terminal y salta de línea?");
    System.out.println(" 1. System.out.println(\"Hola Mundo\");");
    System.out.println(" 2. double x = 7.32;");
    System.out.println(" 3. System.out.printf(\"Hola Mundo\")");
    System.out.println(" 4. String texto = s.nextLine();");
    res = s.nextInt();
    if (res == 1) {
      nota++;
    }
    System.out.println("¿Cuál de los siguientes procesadores se usan principalmente en móviles?");
    System.out.println(" 1. Intel");
    System.out.println(" 2. AMD");
    System.out.println(" 3. SnapDragon");
    res = s.nextInt();
    if (res == 3) {
      nota++;
    }
    System.out.println("¿Quién es el padre de Linux?");
    System.out.println(" 1. Linus Torvalds");
    System.out.println(" 2. Steve Jobs");
    System.out.println(" 3. Bill Gates");
    System.out.println(" 4. Dennis Ritchie");
    res = s.nextInt();
    if (res == 1) {
      nota++;
    }
    System.out.println("¿Cuál de las siguientes memorias es volátil?");
    System.out.println(" 1. HDD");
    System.out.println(" 2. SSD");
    System.out.println(" 3. RAM");
    System.out.println(" 4. Cinta magnética");
    res = s.nextInt();
    if (res == 3) {
      nota++;
    }
    System.out.println("¿Cuál de los siguientes programas no es un gestor de base de datos?");
    System.out.println(" 1. MySQL");
    System.out.println(" 2. SachiDB");
    System.out.println(" 3. MongoDB");
    System.out.println(" 4. MariaDB");
    res = s.nextInt();
    if (res == 2) {
      nota++;
    }
    System.out.println("¿Cuál de los siguientes sistemas operativos para móviles usa como base un linux?");
    System.out.println(" 1. iOS");
    System.out.println(" 2. Windows Phone");
    System.out.println(" 3. Android");
    System.out.println(" 4. Symbian");
    res = s.nextInt();
    if (res == 3) {
      nota++;
    }
    System.out.println("Has sacado un " + nota);
  }
}
