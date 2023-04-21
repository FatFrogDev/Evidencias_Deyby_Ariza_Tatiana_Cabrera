// Importamos las dependencias
package Ejecucion;
import BolsilloDigital.*;
import java.util.Scanner;
public class Main
{
    // Creamos el método de ejecución
    public static void main(String[] args)
    {
        // Creamos el obejet get para leer los datos que necesitemos
        Scanner get = new Scanner(System.in);
        // Creamos las variables controladoras de nuestro ciclo do while
        int opcion, inicio;
        // Creamos el objeto usu e invcamos sus métodos
        Usuario usu = new Usuario();
        usu.iniciarSesion();
        inicio=usu.getBanco();
    if (inicio==1)
    {
        int i=1; 
        Nequi bolsillo = new Nequi();
        System.out.print("Hola " + usu.getNombre() + "\n");
        bolsillo.principal();
        System.out.print("Bienveido a tu bolsillo digital Nequi, ¿qué deseas hacer? \n");
        do
        {
            System.out.print("1. Consultar tu dinero\n");
            System.out.print("2. Recargar tu cuenta \n");
            System.out.print("3. Retirar dinero \n");
            opcion = get.nextInt();
            switch (opcion) 
                {
                    case 1:
                        bolsillo.consultarDineroBolsillo();
                        System.out.print("¿Deseas hacer otra transacción? 1. Si 2.No\n");
                        i = get.nextInt(); 
                        break;
                    case 2:
                        bolsillo.recargarDineroBolsillo();
                        System.out.print("¿Deseas hacer otra transacción? 1. Si 2.No\n");
                        i = get.nextInt(); 
                        break;
                    case 3:
                        bolsillo.retirarDineroBolsillo();
                        System.out.print("¿Deseas hacer otra transacción? 1. Si 2. No \n");
                        i = get.nextInt(); 
                        break;
                    default:
                        System.out.println("error");
                        i=2;
                        break;
               }
        }
        while (i==1);
    }
            else if(inicio==2)
            {
                int j=1;
                Daviplata bolsillo = new Daviplata(); 
                System.out.print("Hola " + usu.getNombre() + "\n");
                bolsillo.principal();
                System.out.print("Bienveido a tu bolsillo digital Davi Plata, ¿qué deseas hacer? \n");
                do
                {
                    System.out.print("1. Consultar tu dinero\n");
                    System.out.print("2. Recargar tu cuenta \n");
                    System.out.print("3. Retirar dinero \n");
                    opcion = get.nextInt();
                    switch (opcion) 
                        {
                            case 1:
                                bolsillo.consultarDineroBolsillo();
                                System.out.print("¿Deseas hacer otra transacción? 1. Si 2.No\n");
                                j = get.nextInt(); 
                                break;
                            case 2:
                                bolsillo.recargarDineroBolsillo();
                                System.out.print("¿Deseas hacer otra transacción? 1. Si 2.No\n");
                                j = get.nextInt(); 
                                break;
                            case 3:
                                bolsillo.retirarDineroBolsillo();
                                System.out.print("¿Deseas hacer otra transacción? 1. Si 2. No \n");
                                j = get.nextInt(); 
                                break;
                            default:
                                System.out.println("error");
                                j=2;
                                break;
                    }
                }
                while (j==1);
            }
                else
                {
                    System.out.println("Intenta nuevamente");
                }
            get.close();
    }
}
