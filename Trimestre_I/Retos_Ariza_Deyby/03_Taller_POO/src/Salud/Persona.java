package Salud;
import java.util.Scanner;
public class Persona
{
    private String nombres, apellidos, numDoc, tipoDoc, sexo;
    private int edad, peso;
    private double pesoActual, estatura;
    public Persona(String _tipoDoc, String _numDoc, String _nombres, String _apellidos)
    {
        _tipoDoc=this.tipoDoc;
        _numDoc=this.numDoc;
        _nombres=this.nombres;
        _apellidos=this.apellidos;
    }
    public Persona()
    {

    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNumDoc() {
        return numDoc;
    }
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public double getPesoActual() {
        return pesoActual;
    }
    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public void pedirDatos()
    {
        Scanner get = new Scanner(System.in);
        System.out.print("Ingresa los nombres\n");
        nombres = get.next();
        System.out.print("Ingresa los apellidos\n");
        apellidos = get.next();
        System.out.print("Ingresa el tipo de documento\n");
        tipoDoc = get.next();
        System.out.print("Ingresa el número de documento\n");
        numDoc = get.next();
        System.out.print("Ingresa el sexo\n");
        sexo = get.next();
        System.out.print("Ingresa la estatura (separados por una coma) \n");
        estatura = get.nextDouble();
        System.out.print("Ingresa el peso\n");
        peso = get.nextInt();
        System.out.print("Ingresa la edad\n");
        edad = get.nextInt();
        get.close();
    }
    public void mostrarPersona()
    {
        System.out.print("Los datos ingresados fueron: \n");    
        System.out.print("Nombres: " + nombres + "\n");
        System.out.print("Apellidos: " + apellidos + "\n");
        System.out.print("Tipo doc: " + tipoDoc + "\n");
        System.out.print("Número doc : " + numDoc + "\n");
        System.out.print("Sexo: " + sexo + "\n");
        System.out.print("Estatura: " + estatura + "\n");
        System.out.print("Peso: " + peso + "\n");
        System.out.print("Edad: " + edad + "\n");
    }
    public double calcularImc()
    {    
        pesoActual = ((peso)/(Math.pow((estatura), 2)));
        return pesoActual;
    }
    public void mayorEdad()
    {
        if(edad>=18)
        {
            System.out.print("Eres mayor de edad \n");
        }
        else if(edad<18)
        {
            System.out.print("Eres menor de edad \n");
        }
        else
        {
            System.out.print("Error \n");
        }
    }
}
