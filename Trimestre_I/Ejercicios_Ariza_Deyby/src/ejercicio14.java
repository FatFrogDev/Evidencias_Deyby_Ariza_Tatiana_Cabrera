import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        double promedio=0, nota=0;
        int cantNotas=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al sistema que calcula tu promedio");
        System.out.println("¿Cuantas notas deseas registar?");
        cantNotas = scan.nextInt();
        for(int i=1;i<=cantNotas;i++)
        {
            System.out.println("Escribe la nota " + i);
            nota = scan.nextDouble();
            promedio=promedio+nota;
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



