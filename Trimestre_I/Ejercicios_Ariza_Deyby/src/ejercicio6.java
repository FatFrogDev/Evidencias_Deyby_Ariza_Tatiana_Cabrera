import java.util.Scanner;
public class ejercicio6 {
    public static void main(String [] args){
    String color;
    String resultado;
    Scanner colorScanner = new Scanner(System.in);
    System.out.println("Bienvenido, en ese sistema determiaremos si el color que escribas es o no primario.");
    System.out.println("Recuerda escribir en minúsculas.");
    color = colorScanner.nextLine();
    if (color.equals("amarillo") || color.equals("azul") || color.equals("rojo"))
{   
    resultado ="El color es primario";
}
    else
{
    resultado ="El color no es primario";
}
System.out.println(resultado);
    colorScanner.close();
}
}