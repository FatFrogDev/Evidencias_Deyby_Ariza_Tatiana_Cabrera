import java.util.Scanner;
public class Reto7{
    public static void main(String[] args) {
        int contador=0;
        String nombres="", apellidos="", edad="", tipoDocumento="", numDocumento="", genero="";
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Bienveido al formulario de registro, por favor, llena los siguientes datos:");
            System.out.println("Ingresa tu nombre");
            nombres = scan.next();
            System.out.println("Ingresa tu apellido o apellidos");
            apellidos = scan.next();
            System.out.println("Ingresa tu edad");
            edad = scan.next();
            System.out.println("Tipo de documento (CC, TI, P, RC)");
            tipoDocumento = scan.next();
            System.out.println("Ingresa el número de documento");
            numDocumento = scan.next();
            System.out.println("Ingresa tu género");
            genero = scan.next();
            System.out.println("Tus datos fueron:");
            System.out.println("Nombres: " + nombres);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Edad: " + edad);
            System.out.println("Tipo de documento: " + tipoDocumento);
            System.out.println("Número de documento: " + numDocumento);
            System.out.println("Género: " + genero);
            System.out.println();
            System.out.println("¿Deseas registrar otro formulario? (1.Si 2.No)");
            contador = scan.nextInt();
        }
        while(contador==1);
        scan.close();
    }
}
