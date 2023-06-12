package Model;

public class BolsilloVo
{
    // Atriuttes for BolsilloVo
    private int id;
    //private int idBanco;
    private double saldo;
    private String nombre;
    private boolean activo;
    // Constructor methods
    public BolsilloVo() {}
    public BolsilloVo(int id, double saldo, String nombre, boolean activo) 
    {
        this.id = id;
        this.saldo = saldo;
        this.nombre = nombre;
        this.activo = activo;
    }
    // Getters && setters
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public double getSaldo() 
    {
        return saldo;
    }
    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public boolean isActivo() 
    {
        return activo;
    }
    public void setActivo(boolean activo) 
    {
        this.activo = activo;
    }    
}
