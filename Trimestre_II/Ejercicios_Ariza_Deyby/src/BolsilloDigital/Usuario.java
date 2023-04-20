package BolsilloDigital;
import java.util.Scanner;
public class Usuario
{
    private String nombre;
    private String email;
    private String pass;
    private int banco;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public int getBanco() {
        return banco;
    }
    public void setBanco(int banco) {
        this.banco = banco;
    }
    public int iniciarSesion()
    {
        int banco;
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
        else
        {
            System.out.print("Error, verifica tus credenciales.");
            setBanco(0);
        }
        return getBanco();
    }
    public boolean verificarSesion()
    {
        boolean verificacion=false;
        if (banco==1)
        {
            verificacion=true;
        }
        else if(banco==2)
        {
            verificacion=true;
        }
        else
        {
            verificacion=false;
        }
        return verificacion;
    }
}
