import java.util.Scanner;
public class Reto8{
    public static void main(String[] args) {
        int continuar=0, victorias1=0, victorias2=0, vidas1=3, vidas2=3;
        String nombre1="", nombre2="";
        Scanner get = new Scanner(System.in);
        System.out.println("Bienvenido al juego de dados para dos usuarios");
        System.out.println("Ingresa el nombre del usuario 1");
        nombre1 = get.next();
        System.out.println("Ingresa el nombre del usuario 2");
        nombre2 = get.next();
        do
        {
            System.out.println("Para jugar, tira los dados");
            System.out.println("Es tu turno " + nombre1);
            System.out.println();
            System.out.println("Es tu turno " + nombre2);
            System.out.println();
            int dado1=(int)(Math.random() * 6) + 1, dado2=(int)(Math.random() * 6) + 1;
            if(dado1>dado2)
            {
                System.out.println(nombre1 + " ha ganado, " + " sacó " + dado1 + " ," + nombre2 + " pierde una vida");
                vidas2--;
                victorias1++;
            }
                else if(dado2>dado1)
                {
                    System.out.println(nombre2 + " ha ganado, " +  " sacó " + dado1 + " ,"+  nombre1 +  " pierde una vida");
                    vidas1--;
                    victorias2++;
                }
                    else
                    {
                    System.out.println("error");
                    }
            System.out.println();
            System.out.println("¿Desean seguir jugando? 1.Si 2.No");
            continuar = get.nextInt();
        }
        while(continuar==1 && vidas1>0 && vidas2>0);
        System.out.println(nombre1 + " ganó " + victorias1 + " ronda/s y quedó con " + vidas1 + " vida/s");
        System.out.println(nombre2 + " ganó " + victorias2 + " ronda/s y quedó con " + vidas2 + " vida/s");
        get.close();
    }
}
