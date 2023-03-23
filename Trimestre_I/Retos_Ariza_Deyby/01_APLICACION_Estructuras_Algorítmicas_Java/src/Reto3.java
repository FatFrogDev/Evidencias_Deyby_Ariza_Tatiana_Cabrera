import java.util.*;
public class Reto3{
    public static void main(String[] args) {
        // cara = 1
        // sello = 2
        // El código es el juego del carisellazo, donde usuario asigna eleccion (1.Cara,2-.Sello)
        // y numero cumple el rol de la moneda en vida real, genera aletoriamente un resultado
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
