import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        int numDoc1=123, numDoc2=321, numDoc3=321, numDoc4=456, doc=0;
        String pass1="Luisa2", pass2="Car0s1", pass3="123LuiS", pass4="Milloz12", pass="", rh="", edad="";
        String form="Por favor llena los datos para la siguiente dosis", formE="Ingresa edad", formB="Ingresa rh";
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al esquema de vacunas, ingresa tu documento");
        doc = scan.nextInt();
        System.out.println("Ingresa tu contraseña, por favor");
        pass =  scan.nextLine();
        // Caso 1 
        if(doc == numDoc1 && pass==pass1)
        {
            System.out.println("Solo tienes una dosis, registra la siguiente");
            System.out.println(formE);
            edad = scan.nextLine();
            System.out.println(formB);
            rh = scan.nextLine();
            System.out.println("Perfecto, vuelve en 10 días");
            System.out.println("Tu vacuna JJ para rh " + rh + " y edad " + edad + " estará lista");
        }
        // Caso 2
        else if(doc == numDoc2 && pass==pass2)
        {
            System.out.println("No tienes ninguna dósis, registra la primera");
            System.out.println(form);
            System.out.println(formE);
            edad = scan.nextLine();
            System.out.println(formB);
            rh = scan.nextLine();
            System.out.println("Perfecto, vuelve en 15 días");
            System.out.println("Tu vacuba HH para rh " + rh + " y edad " + edad + " estará lista");
        }
        // Caso 3
        else if(doc==numDoc3 && pass==pass3)
        {
            System.out.println("¡Bien!, ya tienes 3 de 4, registra la 4ta");
            System.out.println(formE);
            edad = scan.nextLine();
            System.out.println(formB);
            rh = scan.nextLine();
            System.out.println("Vuelve a yu 4ta dosis en 5 días");
            System.out.println("Tu vacuna para rh " + rh + " y edad " + edad + " estará lista");
        }
        // Caso 4
        else if (doc==numDoc4 && pass==pass4)
        {
            System.out.println("Ya tienes todas las vacunas, ¡Bien!");
        }
        else
        {
            System.out.println("Tu usuario o contraseña están mal");
        }
        scan.close();
    }
}
