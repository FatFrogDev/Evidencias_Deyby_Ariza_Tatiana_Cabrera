import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args)
    {
        int numero = (int)(Math.random() * 3) + 1, eleccion=0, vidas=3, continuar=0, i=1; 
        Scanner scan = new Scanner(System.in);
        while(vidas>0){    
        System.out.println("Bienvenido al juego de piedra papel o tijera, para jugar elige:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        eleccion = scan.nextInt();
        if(eleccion!=1 && eleccion!=2 && eleccion!=3)
        {
            System.out.println("Has digitado un valor incorrecto, intenta nuevamente");
        }
        else
        {
            if (eleccion==1 && numero ==1 )
        {
            System.out.println("Empate, intenta nuevamente");
            
        }
        else if (eleccion==1 && numero == 2)
        {
            System.out.println("Elegiste piedra y la máquina papel, pierdes");
            vidas=vidas-1;
        }
        else if (eleccion==1 && numero ==3)
        {
            System.out.println("Elegiste piedra y la máquina tijeras, ¡Ganaste!");
            
        }
        else if (eleccion==2 && numero ==1) 
        {
            System.out.println("Elegiste papel y la máquina tijera, ¡Ganaste!");
            
        }
        else if(eleccion==2 && numero==2)
        {
            System.out.println("Empate, intenta nuevamente");
            
        }
        else if (eleccion==2 && numero == 3)
        {
            System.out.println("Elegiste papel y la máquina tijera, pierdes");
            vidas=vidas-1;
        }
        else if (eleccion==3 && numero == 1)
        {
            System.out.println("Elegiste tijera y la máquina piedra, pierdes");
            vidas=vidas-1;
        }
        else if (eleccion==3 && numero == 2)
        {
            System.out.println("Elegiste tijera y la máquina papel, ¡Ganaste!");
           
        }
        else if (eleccion==3 && numero == 3)
        {
            System.out.println("Empate, intenta nuevamente");
    
        }
        else
        {
            System.out.println("error");
        }
        }
        System.out.println("¿Deseas jugar nuevamente? 1.Si 2.No");
        continuar = scan.nextInt();
        if(continuar==1)
        {
            continuar=1;
        }
        else if (continuar==2)
        {
            System.out.println("Terminaste de jugar, jugaste " + i + " turno/s, y te quedaron " + vidas + " vida/s");
            vidas = 0;
        }
        i++;
    }
        scan.close();
    }
}
