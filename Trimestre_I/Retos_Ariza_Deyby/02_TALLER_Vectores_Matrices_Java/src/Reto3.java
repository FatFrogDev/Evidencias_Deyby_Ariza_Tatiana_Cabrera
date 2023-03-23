// Importamos librerias a usar.
// mport libraries to use.
import java.util.Scanner;
public class Reto3{
    public static void main(String[] args) {
        int cantNotas=0, nota=0;
        double promedio=0, suma=0;
    //  Declarar variables - Declare variables.
        Scanner scan = new Scanner(System.in);
    //  Instancia de objetos - Instantiate objects.
        System.out.println("Ingresa la cantidad de notas de las que deseas sacar el promedio");
        cantNotas = scan.nextInt();
        double[] notas = new double[cantNotas];
    // Se define el tamaño del array notas con la variable cantNotas.
    //Define the lenght of the array with the variable cantNotas.
        System.out.println("Recuerda que debes digitar valores de 1 a 5");
        for(int i=0;i<cantNotas;i++)
        {
            System.out.println("Ingresa el valor de la nota " + (i+1) );
            nota = scan.nextInt();
                if(nota>5 || nota<0)
                {
                System.out.println("Ingresa valores válidos");
                }
                    else
                    {
                    notas[i]=nota;
                    }
        }
            for (int i = 0; i < notas.length; i++)
            {
                suma=suma+notas[i];
            }
                promedio=suma/cantNotas;
    // El ciclo obtiene cada posible valor de la matriz, verifica que no sea inválido y luego lo introduce en la matriz, luego, fuera del ciclo, definimos promedio como suma / cantNotas.
    // Cicle's get each posible value of the array, checks that isn't invalid and then introduces it into the array, then, out of cicle we define promedio (average) as suma / cantNotas.
        if(promedio<3)
        {
        System.out.println("El valor promedio de las nota digitadas es de: " + promedio + ", reprobaste.");
        }
            else if(promedio>3 && promedio<4)
            {
            System.out.println("El valor promedio de las nota digitadas es de: " + promedio + ", Pasaste Raspando.");
            }
                else if(promedio>4)
                {
                System.out.println("El valor promedio de las nota digitadas es de: " + promedio + ", Aprobaste con buenos resultado.");
                }
    // Comprueba la cantidad de promedio (promedio) y muestra cómo fue su rendimiento.
    // Checks the amount of promedio (average) and show how his performance was.
        scan.close();
    }
}