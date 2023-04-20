package BolsilloDigital;
import java.util.Scanner;
public class Nequi extends Bolsillo
{
    private double dinero = 0;  
    public Nequi(double dinero)
    {
        this.dinero = dinero;
    }
    public Nequi()
    {
        
    }
    public double getDinero()
    {
        return dinero;
    }
    public void setDinero(double dinero)
    {
        this.dinero = dinero;
    }      
    public void consultarDineroBolsillo()
    {
        System.out.print("Este es tu bolsillo: \n");
        System.out.print("Tu dinero: \n");
        System.out.print(getDinero() + "\n");
    }

    public void recargarDineroBolsillo()
    {
        Scanner get = new Scanner(System.in);
        double recaga=0;
        System.out.print("Este es tu bolsillo: \n");
        System.out.print("Tu dinero: \n");
        getDinero();
        System.out.print("¿Cuánto dinerod deseas recargar? \n");
        recaga = get.nextDouble();
        setDinero(dinero+recaga);
        System.out.print("Tu dinero ahora: \n");
        System.out.print(getDinero() + "\n");
    }

    public void retirarDineroBolsillo()
    {
        Scanner get = new Scanner(System.in);
        double retiro, total;
        System.out.print("Este es tu bolsillo: \n");
        System.out.print("Tu dinero: \n");
        System.out.print(getDinero() + "\n");
        System.out.print("¿Cuánto dinero deseas retirar? \n");
        retiro = get.nextDouble();
        if(retiro>dinero)
        {
            System.out.print(" No te alcanza :c , intenta de nuevo\n");
        }
        else
        {
            total = dinero-retiro;
            setDinero(total);
        }   
        System.out.print("Tu dinero ahora: \n");
        System.out.print(getDinero() + "\n");
    }
}
