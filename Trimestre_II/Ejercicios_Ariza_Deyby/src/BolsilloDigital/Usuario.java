package BolsilloDigital;
import java.util.Scanner;
public class Usuario
{
    // Creamos los atributos para la clase usuario
    private String nombre;
    private String email;
    private String pass;
    private int banco;
    // Método constructor vacío para generar el objeto en ejecución.
    public Usuario()
    {

    }
    // Getters & Setters
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPass()
    {
        return pass;
    }
    public void setPass(String pass)
    {
        this.pass = pass;
    }
    public int getBanco() {
        return banco;
    }
    public void setBanco(int banco)
    {
        this.banco = banco;
    }
    // Con este método verificamos el inicio de sesión.
    public int iniciarSesion()
    { 
        // Definimos email y pass, variables usadas para asignar con un set a la clase.
        String email, pass;
        String email1 = "email@example.com";
        String pass1 = "1234";
        String nombre1 = "Carlos";
        String email2 = "example@email.com";
        String pass2 = "4321";
        String nombre2 = "Luis";
        Scanner get = new Scanner(System.in);
        System.out.print("Ingresa tu correo\n");
        email = get.next();
        System.out.print("Ingresa tu contraseña\n");
        pass = get.next();
        // Definimos según la cuenta
        if(email.equals(email1) && pass.equals(pass1))
        {
            setEmail(email1);
            setNombre(nombre1);
            setPass(pass1);
            setBanco(1);
        }
        else if(email.equals(email2) && pass.equals(pass2))
        {
            setEmail(email2);
            setNombre(nombre2);
            setPass(pass2);
            setBanco(2);
        }
        // Arrojamos exepción para el inicio de sesión.
        else
        {
            System.out.print("Error, verifica tus credenciales.");
            setBanco(0);
        }
        // Valor de retorno. Servirá para identificar cual bolsillo digital usaremos.
        return getBanco();
    }
}
