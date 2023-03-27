package Salud;
import java.util.Scanner;
public class PPT implements Juego
{  
    private int numero = (int)(Math.random() * 3) + 1, eleccion=0; 
    private Scanner scan = new Scanner(System.in);
    public void inicio()
    {

        System.out.println("Bienvenido al juego de piedra papel o tijera, para jugar elige:");

    }
        public void jugar()
        {
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");
            eleccion = scan.nextInt();
        }
            public void finalizar()
            {
                if (eleccion!=1 && eleccion!=2 && eleccion!=3)
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
                }
                else if (eleccion==3 && numero == 1)
                {
                    System.out.println("Elegiste tijera y la máquina piedra, pierdes");
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
                scan.close();
            }
    public int getNumero()
    {
        return numero;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    public int getEleccion()
    {
        return eleccion;
    }
    public void setEleccion(int eleccion)
    {
        this.eleccion = eleccion;
    }
      
}
