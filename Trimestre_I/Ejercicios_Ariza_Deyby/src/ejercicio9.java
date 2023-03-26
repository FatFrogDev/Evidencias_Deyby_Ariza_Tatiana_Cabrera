import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        int edad;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al sistema que calcula si tienes RC, TI o CC");
        System.out.println("Ingresa tu edad");
        edad = scan.nextInt();
        if(edad<9)
        {
            System.out.println("Tiene registro civil (RC)");
        }
        else if (edad<18)
        {
            System.out.println("Tienes tarjeta de identidad (TI)");
        }
        else if (edad>18)
        {
            System.out.println("Tienes cédula de ciudadania (CC)");
        }
        else
        {
            System.out.println("error");
        }
        scan.close();
    }
}