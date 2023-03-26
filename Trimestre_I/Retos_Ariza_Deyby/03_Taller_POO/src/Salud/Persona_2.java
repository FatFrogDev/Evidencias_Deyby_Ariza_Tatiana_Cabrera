package Salud;
import java.util.Scanner;
public class Persona_2 
{
    private String nombres, apellidos, numDoc, tipoDoc, sexo;
    private int edad, peso;
    private double pesoActual, estatura;
    public void pedirDatos()
    {
        Scanner get = new Scanner(System.in);
        System.out.print("Ingresa los nombres\n");
        nombres = get.next();
        System.out.print("Ingresa los apellidos\n");
        apellidos = get.next();
        System.out.print("Ingresa el tipo de documento\n");
        tipoDoc = get.next();
        System.out.print("Ingresa el número de documento\n");
        numDoc = get.next();
        System.out.print("Ingresa el sexo\n");
        sexo = get.next();
        System.out.print("Ingresa la estatura (separados por una coma) \n");
        estatura = get.nextDouble();
        System.out.print("Ingresa el peso\n");
        peso = get.nextInt();
        System.out.print("Ingresa la edad\n");
        edad = get.nextInt();
        get.close();
    }
    public void mostrarPersona()
    {
        System.out.print("Los datos ingresados fueron: \n");    
        System.out.print("Nombres: " + nombres + "\n");
        System.out.print("Apellidos: " + apellidos + "\n");
        System.out.print("Tipo doc: " + tipoDoc + "\n");
        System.out.print("Número doc : " + numDoc + "\n");
        System.out.print("Sexo: " + sexo + "\n");
        System.out.print("Estatura: " + estatura + "\n");
        System.out.print("Peso: " + peso + "\n");
        System.out.print("Edad: " + edad + "\n");
    }
    public double calcularImc()
    {    
        pesoActual = ((peso)/(Math.pow((estatura), 2)));
        return pesoActual;
    }
    public void mayorEdad()
    {
        if(edad>=18)
        {
            System.out.print("Eres mayor de edad \n");
        }
        else if(edad<18)
        {
            System.out.print("Eres menor de edad \n");
        }
        else
        {
            System.out.print("Error \n");
        }
    }
}
