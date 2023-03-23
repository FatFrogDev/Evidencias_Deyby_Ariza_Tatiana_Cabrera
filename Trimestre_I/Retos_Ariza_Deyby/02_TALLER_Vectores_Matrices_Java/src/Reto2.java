import java.util.Scanner;
public class Reto2{
    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        int cantNadadores, segundosNadador, ultimoSegundos=0, primerSegundos=0;
        String nombreNadador, primerCompetidor="";
        System.out.println("Bienvenido, ¿cuántos competidores nadarán esta vez?");
        cantNadadores = get.nextInt();
        String[] nadadores = new String[cantNadadores];
        int[] segundos = new int[cantNadadores];
        for(int i=0;i<cantNadadores;i++)
        {
            System.out.println("Ingrese el nombre del nadador " + (i+1));
            nombreNadador = get.next();
            nadadores[i] =  nombreNadador;
            System.out.println("Digita el tiempo en segundos que tardó el competidor");
            segundosNadador = get.nextInt();
            segundos[i] = segundosNadador;
            
        }
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
        System.out.println("El primer competidor fue " + primerCompetidor + " y tardó " + primerSegundos + " segundos.");
        get.close();
    }
}
