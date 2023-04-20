package Ejecucion;
import BolsilloDigital.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        int opcion, inicio;
        double saldoInicial;
        Usuario usu = new Usuario();
        usu.iniciarSesion();
        inicio=usu.getBanco();
    if (inicio==1)
    {
        int i=1;
        System.out.print("Bienvenido, "+ usu.getNombre() + " ¿cuál es tu saldo inicial? \n");
        saldoInicial = get.nextDouble();
        Nequi bolsillo = new Nequi();
        bolsillo.setDinero(saldoInicial);
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
        System.out.print("Bienvenido, "+ usu.getNombre() + " ¿cuál es tu saldo inicial? \n");
        saldoInicial = get.nextDouble();
        Daviplata bolsillo = new Daviplata(); 
        bolsillo.setDinero(saldoInicial);
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
