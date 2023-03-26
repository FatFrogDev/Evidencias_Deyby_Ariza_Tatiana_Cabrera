import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4, nota5;
        double promedio=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al sistema que calcula tu promedio, ingresa tus 5 notas (0-100)");
        System.out.println("Ingresa la nota 1");
        nota1 = scan.nextInt();
        System.out.println("Ingresa la nota 2");
        nota2 = scan.nextInt();
        System.out.println("Ingresa la nota 3");
        nota3 = scan.nextInt();
        System.out.println("Ingresa la nota 4");
        nota4 = scan.nextInt();
        System.out.println("Ingresa la nota 5");
        nota5 = scan.nextInt();
        promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        if (promedio>0 && promedio<101){
        if(promedio>0 && promedio<=20)
        {
            System.out.println("Tu promedio es de: " + promedio + " y tienes una estrella.");
        }
        else if(promedio>20 && promedio<=40)
        {
            System.out.println("Tu promedio es de: " + promedio + " y tienes dos estrellas.");
        }
        else if(promedio>40 && promedio<=60)
        { 
            System.out.println("Tu promedio es de: " + promedio + " y tienes tres estrellas.");
        }
        else if(promedio>60 && promedio<=80)
        {
            System.out.println("Tu promedio es de: " + promedio + " y tienes cuatro estrellas.");
        }
        else if(promedio>80 && promedio<101)
        {
            System.out.println("Tu promedio es de: " + promedio + " y tienes cinco estrellas.");
           }
        else 
        {   
            System.out.println("error");
        } 
    }
    else 
    {   
        System.out.println("error, elige valores entre 0 y 100");
    } 
        scan.close();
    }
}
