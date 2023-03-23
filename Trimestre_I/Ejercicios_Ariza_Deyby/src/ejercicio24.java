// Programa con vector de edad y promedio de edades que digite
import java.util.Scanner;
// Crear una clase
public class ejercicio24
 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantEdades=0, edad=0, suma=0, promedio=0;
        System.out.println("Ingresa la cantidad de edades de las que deseas sacar el promedio");
        cantEdades = scan.nextInt();
        int[] edades = new int[cantEdades];
        for(int i=0;i<cantEdades;i++)
        {
            System.out.println("Ingresa el valor de la edad " + (i+1));
            edad = scan.nextInt();
            edades[i]=edad;
            suma=promedio+edades[i];
        }
        promedio=suma/cantEdades;
        System.out.println("El valor promedio de las edades digitadas es de: " + promedio);
        scan.close();
    }
}
