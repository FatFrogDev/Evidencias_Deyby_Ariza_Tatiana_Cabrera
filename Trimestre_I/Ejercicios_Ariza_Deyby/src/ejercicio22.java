import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        double saldo=20000, saldoPrevio=saldo, pasajeCosto=2950;         
        int i=1, cont=1, saldof=0;;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienveindo al sistema réplica de transmilenio");   
        System.out.println("Tu saldo es de: " +  saldo);
        do
{
            if(saldo>pasajeCosto)
            {
                saldo=saldo-pasajeCosto;
                System.out.println("Registra pasaje " + cont);
                saldof=1;
                cont++;
                System.out.println("¿Deseas registrar otro viaje? 1.Si 2.No");
                i = scan.nextInt();
            }
                else if(saldo<=pasajeCosto)
                {
                System.out.println("No te alcanza para más viajes, hiciste " + cont + " viajes, tenías " + saldoPrevio + ", tu saldo restante es: " + (saldo-pasajeCosto));
                i=2;
                saldof=2;
                }
            else
            {
                System.out.println("Error");
            }

} 
while (i==1);
    if (saldof==1)
    {
        System.out.println("Tu saldo total es de: " + saldo);
        System.out.println("Gracias por usar nuestro sistema");
    }
    else
    {
        System.out.println("Gracias por usar nuestro sistema");
    }
   
        scan.close();
        
    }
    }
