package Salud;

public class Ejecucion {
public static void main(String[] args) {
    Persona persona = new Persona();
    persona.pedirDatos();
    persona.mostrarPersona();
    persona.calcularImc();
    persona.mayorEdad();
}
}
