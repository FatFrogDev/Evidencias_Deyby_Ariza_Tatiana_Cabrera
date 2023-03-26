package Principal;
import java.util.Scanner;
import Salud.Persona_2;
public class Inicio_2
{   

    public static void main(String[] args)
    {
        double resultado;
        Scanner get = new Scanner(System.in);
        Persona_2 perso = new Persona_2();
        perso.pedirDatos();
        perso.mostrarPersona();
        perso.mayorEdad();
        resultado=perso.calcularImc();
        if (resultado < 20)
        {
            System.out.println("El peso esta por debajo de lo ideal, su imc es: " + resultado);
        }
            else if (resultado >= 20 && resultado <= 25) 
            {
            System.out.println("El peso es ideal, su imc es: " + resultado);
            } 
                else if (resultado > 25)
                {
                    System.out.println("Tienes sobre peso, tu imc es: " + resultado);
                }
        get.close();
    }
}
