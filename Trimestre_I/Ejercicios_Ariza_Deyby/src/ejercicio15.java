import java.util.Scanner;
public class ejercicio15{
    public static void main(String[] args) {
        double promedio=0, nota=0;
        int i=2, cont=1, cantNotas=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al sistema que calcula tu promedio");
        while (i>cont) {
            System.out.println("Escribe la nota " + cantNotas);
            nota = scan.nextDouble();
            promedio=promedio+nota;
            System.out.println("Deseas escribir otra nota? 1. Si 2.No");
            cont = scan.nextInt();
            if(cont==1)
            {
                i=2;
                cantNotas++;
            }
            else if(cont==2)
            {
                i=cont-1;
            }
            else
            {
                System.out.println("error");
            }
        }
        promedio=promedio/cantNotas;
        if (promedio<=100 && promedio>0){
            if(promedio<=20)
            {
                System.out.println("Tu promedio es: " + promedio + " y tienes una estrella.");
            }
                else if(promedio<=40)
                {
                    System.out.println("Tu promedio es: " + promedio + " y tienes dos estrellas.");
                }
                    else if(promedio<=60)
                    {
                        System.out.println("Tu promedio es: " + promedio + " y tienes tres estrellas.");
                    }
                        else if(promedio<=80)
                        {
                        System.out.println("Tu promedio es: " + promedio + " y tienes cuatro estrellas.");
                        }
                            else if(promedio>=81)
                            {
                                System.out.println("Tu promedio es: " + promedio + " y tienes cicno estrellas.");
                            }
        }
        else
        {
            System.out.println("error");
        }
        scan.close();
    }
}