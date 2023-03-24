import java.util.Scanner;
public class Reto3{
    public static void main(String[] args) {

        int numero = (int)(Math.random() * 2) + 1, eleccion=0; 
        Scanner scan = new Scanner(System.in);    
        System.out.println("Bienvenido al juego del carisellazo, para elegir cara o sello digita");
        System.out.println("1. Cara");
        System.out.println("2. Sello");
        eleccion = scan.nextInt();
        if(eleccion!=1 && eleccion!=2)
        {
            System.out.println("Has digitado un valor incorrecto, intenta nuevamente");
        }   
        else
        {
        // cara = 1
        // sello = 2
            if (eleccion==1 && numero ==1)
        {
            System.out.println("Has elegido cara, y ha salido cara. ¡Ganaste!");
        }
        else if (eleccion==1 && numero == 2)
        {
            System.out.println("Has elegido cara, y ha salido sello. Perdiste:(");
        }
        else if (eleccion==2 && numero ==1) 
        {
            System.out.println("Has elegido sello, y ha salido cara. Perdiste:(");
        }
        else if(eleccion==2 && numero==2)
        {
            System.out.println("Has elegido sello y ha salido sello. ¡Ganaste!");
        }
        else
        {
            System.out.println("error");
        }
        }
        scan.close();
    }
}
