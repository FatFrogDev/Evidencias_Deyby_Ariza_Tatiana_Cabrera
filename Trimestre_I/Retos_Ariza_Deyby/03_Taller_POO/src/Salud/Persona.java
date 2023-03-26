package Salud;

import java.util.Scanner;
public class Persona {
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
    public void calcularImc()
    {    
        pesoActual = ((peso)/(Math.pow((estatura), 2)));
        if (pesoActual < 20) {

            System.out.println("El peso esta por debajo de lo ideal, su imc es: " + pesoActual);
            
        } else if (pesoActual >= 20 && pesoActual <= 25) {

            System.out.println("El peso es ideal, su imc es: " + pesoActual);

        } else if (pesoActual > 25){
            System.out.println("Tienes sobre peso, tu imc es: " + pesoActual);
        }
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
