package Main;
import Salud.Persona;
public class Main {
    public static void main(String[] args) {
        
        Persona Personita = new Persona();

        //Invocar metodos
        Personita.pedirDatos();
        Personita.mostrarPersona();
        Personita.mayorEdad();
        Personita.calcularImc();
}
}