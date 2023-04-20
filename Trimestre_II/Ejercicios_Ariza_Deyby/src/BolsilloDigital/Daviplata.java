package BolsilloDigital;
import java.util.Scanner;
public class Daviplata extends Bolsillo
{
    private double dinero=0;  
    public Daviplata(double dinero)
    {
        this.dinero = dinero;
    }
    public Daviplata()
    {

    }
    public double getDinero() {
        return dinero;
    }
    public void setDinero(double dinero) {
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
        System.out.print(getDinero() + "\n");
        System.out.print("¿Cuánto dinerod deseas recargar? \n");
        recaga = get.nextDouble();
        setDinero(dinero+recaga);
        System.out.print("Tu dinero ahora: \n");
        System.out.print(getDinero() + "\n");
    }

    public void retirarDineroBolsillo()
    {
        Scanner get = new Scanner(System.in);
        double retiro;
        System.out.print("Este es tu bolsillo: \n");
        System.out.print("Tu dinero: \n");
        System.out.print(getDinero() + "\n");
        System.out.print("¿Cuánto dinerod deseas retirar? \n");
        retiro = get.nextDouble();
        dinero = dinero-retiro;
        System.out.print("Tu dinero ahora: \n");
        System.out.print(getDinero() + "\n");
    }
}
