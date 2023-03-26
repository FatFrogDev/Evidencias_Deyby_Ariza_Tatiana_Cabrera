import java.util.Scanner;
public class ejercicio5
{
  public static void main (String[]args)
  {
    String elemento1, elemento2, elemento3, elemento4;
    Scanner listScanner = new Scanner (System.in);
      System.out.println ("Escribe el nombre del primer item");
      elemento1=listScanner.nextLine();
      System.out.println ("Escribe el nombre del segundo item");
      elemento2=listScanner.nextLine();
      System.out.println ("Escribe el nombre del tercer item");
      elemento3=listScanner.nextLine();
      System.out.println ("Escribe el nombre del cuarto item");
      elemento4=listScanner.nextLine();
      System.out.println("El inventario es: ");
      System.out.println(elemento1);
      System.out.println(elemento2);
      System.out.println(elemento3);
      System.out.println(elemento4);
      listScanner.close();
  }
}
