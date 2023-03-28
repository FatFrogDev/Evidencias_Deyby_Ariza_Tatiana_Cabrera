package Principal;
import Salud.*;
import java.util.Scanner;
public class Inicio_4
{
    public static void main(String[] args)
    {
        int opcion, op;
        Boolean seguir;
        Scanner get = new Scanner(System.in);
        System.out.print("Bienvenido al sistema para calcular el área geométrica de distintas figuras \n");
        do
    {
        System.out.print("Selecciona: 1. Triángulo 2.Rectángulo 3.Círculo \n");
        opcion = get.nextInt();  
        switch (opcion)
        {
            case 1:
                Triangulo triangulo = new Triangulo();
                triangulo.calcularArea();
            break;
            case 2:
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.calcularArea();
            break;
            case 3:
                Circulo circulo = new Circulo();
                circulo.calcularArea();
            break;
            default:
                System.out.print("Digita una opción válida \n");
            break;
        }
        System.out.print("¿Deseas seguir usando el programa?, 1. Si 2.  No \n");
        op = get.nextInt();
        if(op==1)
        {
            seguir=true;
        }
        else
        {
            seguir=false;
        }
    }   
    while(seguir==true);
        get.close();
    }       
}

