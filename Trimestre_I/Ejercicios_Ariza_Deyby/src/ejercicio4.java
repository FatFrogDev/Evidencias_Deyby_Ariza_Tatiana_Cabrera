import java.util.Scanner;
public class ejercicio4{
    public static void main(String []args){
    Scanner mercaScanner = new Scanner(System.in);
    String nombreProducto1, nombreProducto2;
    int valorProducto1, valorProducto2, valorTotal;
    System.out.println("Escribe el nombre del producto 1");
    nombreProducto1= mercaScanner.nextLine();
    System.out.println("Escribe el valor del producto 1");    
    valorProducto1 = mercaScanner.nextInt();
    mercaScanner.nextLine();
    System.out.println("Escribe el nombre del producto 2");
    nombreProducto2 = mercaScanner.nextLine();
    System.out.println("Escribe el valor del producto 2");    
    valorProducto2 = mercaScanner.nextInt();
    valorTotal=valorProducto1+valorProducto2;
    System.out.println("El mercado de: " + nombreProducto1 + " y " + nombreProducto2 + " es de: " + valorTotal);
    mercaScanner.close();
    }
}