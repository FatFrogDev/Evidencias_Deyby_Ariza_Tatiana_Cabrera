package Salud;
//import java.util.Scanner;
public class Empleado extends Persona
{
        private String nombres, apellidos, tipoDoc, numDoc, cargo, departamento;
        private int valorHora, horasTrabajadas;
        private double honorarios; 
        private final double reteica=0.966; 
                public Empleado(String _tipoDoc, String _numDoc, String _nombres, String _apellidos, String nombres,
                String apellidos, String tipoDoc, String numDoc, String cargo, String departamento, int valorHora,
                int horasTrabajadas, double honorarios){
        super(_tipoDoc, _numDoc, _nombres, _apellidos);
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.tipoDoc = tipoDoc;
            this.numDoc = numDoc;
            this.cargo = cargo;
            this.departamento = departamento;
            this.valorHora = valorHora;
            this.horasTrabajadas = horasTrabajadas;
            this.honorarios = honorarios;
        }
            public Empleado()
            {

            }

                public void mostrarEmpleado()
                {
                    System.out.print("El tipo de doc es: " + getTipoDoc() + "\n");
                    System.out.print("El num de doc es: " + getNumDoc() + "\n");
                    System.out.print("Los nombres son: " + getNombres() + "\n");
                    System.out.print("Los apellidos son: " + getApellidos() + "\n");
                    System.out.print("El cargo es: " + cargo + "\n");
                    System.out.print("El departamento es: " + departamento + "\n");
                    System.out.print("Las horas trabajadas son: " + horasTrabajadas + "\n");
                    System.out.print("El valor a pagar es de: " + calcularHonorarios() + "\n");
                }
                    public double calcularHonorarios()
                    {
                        honorarios=horasTrabajadas*valorHora;
                        honorarios=honorarios-(honorarios*reteica/100);
                        return honorarios;
                    }
//GETTERS && SETTERS
public String getNombres() {
    return nombres;
}
public void setNombres(String nombres)
{
    this.nombres = nombres;
}
    public String getApellidos()
{
    return apellidos;
}
public void setApellidos(String apellidos)
{
    this.apellidos = apellidos;
}
    public String getTipoDoc()
{
    return tipoDoc;
}
public void setTipoDoc(String tipoDoc)
{
    this.tipoDoc = tipoDoc;
}
public String getNumDoc()
{
    return numDoc;
}
public void setNumDoc(String numDoc)
{
    this.numDoc = numDoc;
}
public String getCargo()
{
    return cargo;
}
public void setCargo(String cargo)
{
    this.cargo = cargo;
}
public String getDepartamento()
{
    return departamento;
}
public void setDepartamento(String departamento)
{
    this.departamento = departamento;
}
public double getValorHora()
{
    return valorHora;
}
public void setValorHora(int valorHora)
{
    this.valorHora = valorHora;
}
public double getHorasTrabajadas()
{
    return horasTrabajadas;
}
public void setHorasTrabajadas(int horasTrabajadas) 
{
    this.horasTrabajadas = horasTrabajadas;
}
public double getHonorarios() 
{
    return honorarios;
}
public void setHonorarios(double honorarios)
{
    this.honorarios = honorarios;
}
public double getReteica() {
    return reteica;
}
                    
}
