import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        int cantNumeros=0, i=0, valorNumero=0,contadorMultiplos=0, contadorNoMultiplos=0,  contadorFinal=0, mult=0;;
        Scanner get = new Scanner(System.in);
        System.out.println("Bienvenido, digita cuantos números deseas examinar");
        cantNumeros = get.nextInt();
        int num[] =  new int[cantNumeros];
         while(i<cantNumeros)
         {
              System.out.println("Ingresa el valor " + (i+1));
              valorNumero = get.nextInt();
              num[i]=valorNumero;
             i++;
         }
         System.out.println("Los números ingresados fueron: ");
         while (contadorNoMultiplos<cantNumeros) {
            System.out.println(num[contadorNoMultiplos]);
            contadorNoMultiplos++;
         }
     
         while (contadorMultiplos < cantNumeros) 
         {
            if (num[contadorMultiplos] % 2 == 0)
            {
                mult++;
            } 
            contadorMultiplos++;
         }
        System.out.println("En los números ingresados, hay " + mult + " múltiplos de dos");
        if(contadorMultiplos>0)
        {
        System.out.println("Múltiplos de dos: ");
        }
         while (contadorFinal < cantNumeros) 
         {
            if (num[contadorFinal] % 2 == 0)
            {
                System.out.println(num[contadorFinal]);
            } 
            contadorFinal++;
         }
            get.close();
}
}