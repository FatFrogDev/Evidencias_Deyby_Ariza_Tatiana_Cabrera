// Importamos librerias a usar.
// mport libraries to use.
import java.util.Scanner;
public class Reto2{
    public static void main(String[] args)
    {
        int cantNadadores, segundosNadador, ultimoSegundos=0, primerSegundos=0;
        String nombreNadador, primerCompetidor="";
    //  Declarar variables - Declare variables.
        Scanner get = new Scanner(System.in);
    //  Instancia de objetos - Instantiate objects.
        System.out.println("Bienvenido, ¿cuántos competidores nadarán esta vez?");
        cantNadadores = get.nextInt();
        String[] nadadores = new String[cantNadadores];
        int[] segundos = new int[cantNadadores];
    // Se define el tamaño del array nadadores (nombres) y segundos con la variable  cantNadadores.
    //Define the lenght of the array nadadores (names) y segundos (seconds) with the variable cantNadadores. 
        for(int i=0;i<cantNadadores;i++)
        {
            System.out.println("Ingrese el nombre del nadador " + (i+1));
            nombreNadador = get.next();
            nadadores[i] =  nombreNadador;
            System.out.println("Digita el tiempo en segundos que tardó el competidor");
            segundosNadador = get.nextInt();
            segundos[i] = segundosNadador;
            
        }
    // Captura los valores internos de cada matriz, nadadores (nombres) y segundo.
    // Catch the inner values of each array, nadadores (names) and seconds.
        for(int j=0;j<cantNadadores;j++)
        {
            if(ultimoSegundos<segundos[j])
            {
                ultimoSegundos=segundos[j];
            }
        }
        primerSegundos=ultimoSegundos;
            for(int j= 0; j<cantNadadores;j++)
            {
                if(primerSegundos>segundos[j])
                {
                    primerSegundos = segundos[j];
                    primerCompetidor = nadadores[j];
                }    
            }
    // El ciclo anidado hace dos cosas; Primero, toma el mayor valor de segundos (segundos) a una variable, luego se compara en el segundo ciclo con el operador de comparación menos
    // Por lo tanto, obtenemos el valor del tiempo más bajo en la matriz y el nombre (Ganador).
    // The cicle anidated do two things; First, it takes the higher value of segundos (seconds) to a variable, then itself its compared in the second cicle with minus comparation operator
    // Therefore we get the value of the lowest time on the array and the name(Winner).
        for (int i = 0; i < cantNadadores; i++) 
        {
            System.out.println("Competidor " + (i+1));
            System.out.println("Nombre: " + nadadores[i] + ", segundos: " + segundos[i]);    
        }
            System.out.println("El primer competidor fue " + primerCompetidor + " y tardó " + primerSegundos + " segundos.");
        // // El ciclo captura a cada participante y lo muestra en pantalla con su tiempo y muestra quien es el ganador y su tiempo.
        // The cicle gets each participant and shows it on screen with his time and show who is the winner and his time.
        get.close();
    }
}
