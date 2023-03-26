import java.util.Scanner;
import java.lang.Math;
public class ejercicio11
{
    public static void main(String[] args)
    {
        int num1=0, num2=0, num3=0, opcion=0, suma=0, resta=0, mult=0, div=0, pot=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora, por favor elige que operación deseas hacer");
        System.out.println("1. Suma 2.Resta 3.Multiplicación 4.División 5.Potencia");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingresa el primer número");
                num1 = leer.nextInt();
                System.out.println("Ingresa el segundo número");
                num2 = leer.nextInt();
                System.out.println("Ingresa el tercer número");
                num3 = leer.nextInt();
                suma = num1+num2+num3;
                System.out.println("El resultado es: " + suma);
            break;
            case 2:
                System.out.println("Ingresa el primer número");
                num1 = leer.nextInt();
                System.out.println("Ingresa el segundo número");
                num2 = leer.nextInt();
                System.out.println("Ingresa el tercer número");
                num3 = leer.nextInt();
                resta = num1-num2-num3;
                System.out.println("El resultado es: " + resta);
            break;
            case 3:
                System.out.println("Ingresa el primer número");
                num1 = leer.nextInt();
                System.out.println("Ingresa el segundo número");
                num2 = leer.nextInt();
                System.out.println("Ingresa el tercer número");
                num3 = leer.nextInt();
                mult=num1*num2*num3;
                System.out.println("El resultado es: " + mult);
            break;
            case 4:
                System.out.println("Ingresa el primer número");
                num1 = leer.nextInt();
                System.out.println("Ingresa el segundo número");
                num2 = leer.nextInt();
                System.out.println("Ingresa el tercer número");
                num3 = leer.nextInt();
                div = num1/num2/num3; 
                System.out.println("El resultado es: " + div);
            break;
            case 5:
                System.out.println("Ingresa el número a potenciar al cubo");
                num1 = leer.nextInt();
                pot = (int)(Math.pow(num1,3));
                System.out.println("El resultado es: " + pot);
            break;
            default:
            System.out.println("Error");
                break;
                
        }
        leer.close();
    }    
}
