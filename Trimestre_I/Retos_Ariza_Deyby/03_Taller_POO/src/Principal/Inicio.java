package Principal;
import Salud.Persona;
public class Inicio
{
    public static void main(String[] args)
    {
        Persona perso = new Persona();
        perso.pedirDatos();
        perso.mostrarPersona();
        perso.mayorEdad();
        perso.calcularImc();
    }
}
