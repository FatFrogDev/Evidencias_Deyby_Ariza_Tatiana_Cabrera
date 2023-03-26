import java.util.Scanner;
public class ejercicio1 {
    //atributos

    //metodos
    public static void main(String []args){
        //declarar variables
        String nombreAnimal, especie;
        int edad, peso;
        //Crear objetos
        Scanner leer = new Scanner(System.in);
        //Solicitar datos
        System.out.println("Digite le nombre de su animal");
        //capturar datos
        nombreAnimal = leer.nextLine();
        //Solicitar datos               
        System.out.println("Digita la especie");
         //capturar datos
        especie = leer.nextLine();
        //Solicitar datos
        System.out.println("Por favor digite la edad");
        //capturar datos
        edad = leer.nextInt();
        // Operaciones o procesos
        peso = edad*50;
        //imprimir resultados 
        System.out.println("El animal " + nombreAnimal + ", de especie: " + especie + ", tiene por peso " + peso + ".");
        leer.close();
    }
}
