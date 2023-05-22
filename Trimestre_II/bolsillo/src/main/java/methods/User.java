package methods;
public class User
{
        // Atributos de User.
    private String nombre;
    private String email;
    private String pass;
    private String banco;
    //Constructores.
    // Constrctor con parámetros
    public User(){}
    // Constructor con argumentos
    public User(String email, String pass) {
        this.email = email;
        this.pass = pass;

    }
    // Getters y setters.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() 
    {
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
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    // Métodos propios de la clase Usuario.
    // Método con un retorno de tipo boolano que verifica el inicio de sesión
    public boolean validarLogin(String email, String pass)
    {
        boolean verificacion=false;
        if((email.equals("user@nequi.com")) && (pass.equals("nequi")))
        {
            setNombre("Usuario Nequi");
            setBanco("Nequi");
            verificacion=true;
        }
        else if ((email.equals("user@davi.com")) && (pass.equals("davi")))
        {
            setNombre("Usuario Daviplata");
            setBanco("Davi plata");
            verificacion=true;
        }
        else
        {
            verificacion=false;
            System.out.println("Incapaz de validar login. ");
        }
        return verificacion;
    }
}
