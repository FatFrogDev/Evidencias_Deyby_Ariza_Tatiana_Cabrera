package Salud;

import java.util.Scanner;

public class Persona {
    private String tipodoc, documento, nombre, apellidos, sexo;
    private int peso, estatura, edad;
    
        public void pedirDatos()
        {
            Scanner get = new Scanner(System.in);
            System.out.print("Ingresa el/los nombre/s \n");
            nombre= get.next();
            System.out.print("Ingresa el/1los apellido/s \n");
            apellidos = get.next();
            System.out.print("Ingresa el sexo \n");
            sexo = get.next();
            System.out.print("Ingresa el tipo de documento (1. RC 2.TI  3. CC 4. P) \n");
            tipodoc = get.next();
            System.out.print("Ingrese el número del documento: \n");
            documento = get.next();
            System.out.print("Ingresa el peso \n");
            peso = get.nextInt();
            System.out.print("Ingresa la estatura \n");
            estatura= get.nextInt();
            System.out.print("Ingresa la edad \n");
            edad = get.nextInt();
            get.close();
        }
            public void mostrarPersona() 
            {
            System.out.print("Nombres : " + nombre + "\n");
            System.out.print("Apellidos:" + apellidos +  "\n");
            System.out.print("Sexo :" + sexo +"\n");
            System.out.print("Tipo doc: " + tipodoc + "\n");
            System.out.print("Documento: " + documento + "\n");
            System.out.print("Peso: " + peso + "\n");
            System.out.print("Estatura: " + estatura + "\n");
            System.out.print("Edad: " + edad + "\n");
            }
                public void calcularImc() {
                    int pesoActual=peso/estatura*2;
                    if(pesoActual<20)
                    {
                        System.out.print("El peso está por debajo de lo ideal \n");
                    }
                    else if (pesoActual>20 && pesoActual<=25) 
                    {
                        System.out.print("El peso es ideal \n");
                    }
                    else if (pesoActual>20 && pesoActual<=25) 
                    {
                        System.out.print("Tienes sobrepeso \n");
                    }
                }
                    public void mayorEdad() {
                        if (edad>=18)
                        {
                            System.out.print("Eres mayor de edad \n");
                        }
                        else
                        {
                            System.out.print("No eres mayor de edad \n");
                        }
                    }

}
