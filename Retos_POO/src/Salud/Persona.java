package Salud;
import java.util.Scanner;

public class Persona {
    private String nombres, apellidos, tipoDoc, numDoc, sexo;
    private int edad, estatura, peso;
        public void pedirDatos()
        {
        Scanner get = new Scanner(System.in);
        System.out.print("Ingresa los nombres \n");
        nombres = get.next();
        System.out.print("Ingresa los apellidos \n");
        apellidos = get.next();
        System.out.print("Ingresa el sexo \n");
        sexo = get.next();
        System.out.print("Ingresa el tipo de doc \n");
        tipoDoc = get.next();
        System.out.print("Ingresa el número de doc \n");
        numDoc = get.next();
        System.out.print("Ingresa la edad \n");
        edad = get.nextInt();
        System.out.print("Ingresa el peso \n");
        peso = get.nextInt();
        System.out.print("Ingresa la estatura \n");
        estatura = get.nextInt();
        get.close();
        }

            public void mostrarPersona()
            {
                System.out.print("Nombres : " + nombres +" \n");
                System.out.print("Apellido : " + apellidos +" \n");
                System.out.print("Sexo : " + sexo +" \n");
                System.out.print("Tipo de documento : " + tipoDoc +" \n");
                System.out.print("Número de documento : " + numDoc +" \n");
                System.out.print("Edad : " + edad +" \n");
                System.out.print("Peso : " + peso +" \n");
                System.out.print("Estatura : " + estatura +" \n");
            }
                public void calcularImc() 
                {
                    double pesoActual=peso/(estatura*estatura);
                    System.out.print(pesoActual);
                    if(pesoActual<20)
                    {
                        System.out.print("peso bajo \n");
                    }
                    else if(pesoActual>20 && pesoActual<=25)
                    {
                        System.out.print("peso bajo \n");
                    }
                    else if(pesoActual>25)
                    {
                        System.out.print("Sobrepeso \n");
                    }
                    /*Si resultado menor que 20, retorne PESOBAJO
Si devuelve un número entre 20 y 25 (incluidos), PESOIDEAL
Si devuelve un valor mayor que 25 SOBREPESO
 */
                }
             public void mayorEdad() {
                if(edad<18)
                {
                    System.out.println("Eres menor de edad");
                }
                else if(edad>=18)
                {
                    System.out.println("Eres mayor de edad");
                }
                else
                {
                    System.out.println("Error");
                }
             }       
} 
