// Importamos librerias a usar.
// mport libraries to use.
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
    // Declarar variables - Declare variables.
        int cantNumeros=0, i=0, valorNumero=0,contadorMultiplos=0, contadorNoMultiplos=0,  contadorFinal=0, mult=0;
    // Instancia de objetos - Instantiate objects.
        Scanner get = new Scanner(System.in);
        System.out.println("Bienvenido, digita cuantos números deseas examinar");
        cantNumeros = get.nextInt();
    // Se define el tamaño del array con la variable  cantNumeros.
    //Define the lenght of the array with the variable cantNumeros.
        int num[] =  new int[cantNumeros];
            while(i<cantNumeros)
            {
                System.out.println("Ingresa el valor " + (i+1));
                valorNumero = get.nextInt();
                num[i]=valorNumero;
                i++;
            }
    // El ciclo asigna los valores del array en la variable valorNumero, luego se introduce al array con el número de iteración del ciclo.
    // The cicle asigns values of the array in the variable valorNumero, then introduces it to the array with the number of iteration of the cicle.
            System.out.println("Los números ingresados fueron: ");        
                while (contadorNoMultiplos<cantNumeros) 
                {
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
    // Este ciclo imprime en pantalla los valores introducidos anteriormente en el array
    //This cicle prints on screen the values introduced before in the array.
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
    // Este ciclo verifica si un valor en la matriz es múltiplo de 2, si es cierto, se imprime en la pantalla.
    // This cicle check if a value in the array its a multiple of 2, if it's true, it's printed on screen.
            get.close();
}
}