import java.util.Scanner;
public class Reto3{
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String palabra;
        int auxiliar=0;
        System.out.println("Bienvenido a concéntrese");
        String palabras[][] = new String[2][2];
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras.length; j++) {
                System.out.println("Ingresa la palabra");
                palabras[i][j]=get.next();
            }
        }
        palabra=palabras[0][0];
        if(palabra.equalsIgnoreCase(palabras[0][1]))
        {
            auxiliar++;
        }
            if(palabra.equalsIgnoreCase(palabras[1][0]))
            {
                auxiliar++;
            }
            if(palabra.equalsIgnoreCase(palabras[1][1]))
            {
                auxiliar++;
            }
            if(auxiliar>0)
            {
                System.out.println();
                System.out.println("La palabra " + palabra + " se repitió " + (auxiliar+1) + " veces");
                System.out.println();
            }
        palabra=palabras[0][1];
        auxiliar=0;
        if(palabra.equalsIgnoreCase(palabras[0][0]))
        {
            auxiliar++;
        }
            if(palabra.equalsIgnoreCase(palabras[1][0]))
            {
                auxiliar++;
            }
            if(palabra.equalsIgnoreCase(palabras[1][1]))
            {
                auxiliar++;
            }
            if(auxiliar>0)
            {
            System.out.println();
            System.out.println("La palabra " + palabra + " se repitió " + (auxiliar+1) + " veces");
            System.out.println();
            }
        palabra=palabras[1][0];
        auxiliar=0;
        if(palabra.equalsIgnoreCase(palabras[0][0]))
        {
            auxiliar++;
        }
            if(palabra.equalsIgnoreCase(palabras[0][1]))
            {
                auxiliar++;
            }
            if(palabra.equalsIgnoreCase(palabras[1][1]))
            {
                auxiliar++;
            }
        if(auxiliar>0)
        {
            System.out.println();
            System.out.println("La palabra " + palabra + " se repitió " + (auxiliar+1) + " veces");
            System.out.println();
        }
        palabra=palabras[1][1];
        auxiliar=0;
        if(palabra.equalsIgnoreCase(palabras[0][0]))
        {
            auxiliar++;
        }
            if(palabra.equalsIgnoreCase(palabras[0][1]))
            {
                auxiliar++;
            }
            if(palabra.equalsIgnoreCase(palabras[1][0]))
            {
                auxiliar++;
            }
        if(auxiliar>0)
        {
            System.out.println();
            System.out.println("La palabra " + palabra + " se repitió " + (auxiliar+1) + " veces");
            System.out.println();
        }
        if (auxiliar<1)
        {
            System.out.println("Ninguna palabra se repite");
        }
        get.close();
    }
}