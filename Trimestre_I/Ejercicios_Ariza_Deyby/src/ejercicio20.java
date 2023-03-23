import java.util.Scanner;
public class ejercicio20{
    public static void main(String[] args) {
        double saldo=20000, saldoPrevio=saldo, pasajeCosto=2950;        
        int viajes=0, saldof=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienveindo al sistema réplica de transmilenio");
        System.out.println("Tu saldo es: " + saldo);
        System.out.println("¿Cuantos viajes deseas realizar?");
        viajes = scan.nextInt();
        for(int i=1;i<=viajes;i++)
        {  
            
                if(saldo>pasajeCosto)
            {
                saldo=saldo-pasajeCosto;
                saldof=1;
                System.out.println("Registra pasaje " + i);
            }
                else if(saldo<=(pasajeCosto*2))
            {
                System.out.println("No te alcanza para más viajes, hiciste " + i + " viajes, tenías " + saldoPrevio + ", tu saldo restante es: " + (saldo-pasajeCosto));
                i=viajes+viajes;
                saldof=2;
            }
            }
        if(saldof==1)
        {
            System.out.println("Tu saldo final es de: " + saldo);
            System.out.println("Gracias por usar nuestro sistema");
        }
        else
        {
            System.out.println("Gracias por usar nuestro sistema");
        }
            scan.close();

    }
}


