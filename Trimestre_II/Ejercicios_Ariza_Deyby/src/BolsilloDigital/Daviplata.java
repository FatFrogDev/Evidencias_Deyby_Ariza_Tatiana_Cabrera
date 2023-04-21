package BolsilloDigital;
import java.util.Scanner;
public class Daviplata extends Bolsillo
{
    // Definimos el atributo dinero e inicializamos en 0.
    private double dinero=0;  
    // Método Constructor con y sin parámetros.
    public Daviplata(double dinero)
    {
        this.dinero = dinero;
    }
    public Daviplata()
    {

    }
    // Getters & Setters
    public double getDinero() {
        return dinero;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }    
    // Creamos los distintos métodos.
    //
    public void principal(){
        Scanner get = new Scanner(System.in);
        double saldoInicial;
        System.out.print("¿Cuál es tu saldo inicial? \n");
        saldoInicial = get.nextDouble();
        setDinero(saldoInicial);
        }
    // El siguiente método permite mostrar cuanto dinero poseemos en nuestro bolsillo digital.
    public void consultarDineroBolsillo()
    {
        System.out.print("Este es tu bolsillo: \n");
        System.out.print("Tu dinero: \n");
        System.out.print(getDinero() + "\n");
    }
    // El siguiente método permite recargar el dinero del bolsillo Digital. 
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
    // Por último, este método sustrae dinero del global tras verificar que es posible la transacción (retiro<dinero).
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
