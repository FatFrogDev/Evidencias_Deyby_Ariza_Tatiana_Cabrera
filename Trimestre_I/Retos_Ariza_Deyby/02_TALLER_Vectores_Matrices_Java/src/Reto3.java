import java.util.Scanner;
public class Reto3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantNotas=0, nota=0;
        double promedio=0, suma=0;;
        System.out.println("Ingresa la cantidad de notas de las que deseas sacar el promedio");
        cantNotas = scan.nextInt();
        double[] notas = new double[cantNotas];
        System.out.println("Recuerda que debes digitar valores de 1 a 5");
        for(int i=0;i<cantNotas;i++)
        {
            System.out.println("Ingresa el valor de la nota " + (i+1) );
            nota = scan.nextInt();
            if(nota>5 || nota<0)
            {
                System.out.println("Ingresa valores válidos");
            }
                else{
                    notas[i]=nota;
                }
        }
            for (int i = 0; i < notas.length; i++)
            {
                suma=suma+notas[i];
            }
            promedio=suma/cantNotas;
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
        scan.close();
    }
}