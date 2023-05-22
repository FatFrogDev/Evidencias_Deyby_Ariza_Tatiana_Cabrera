package methods;

public abstract class BolsilloDigital
{
    double saldo;
    // Constructores
    public BolsilloDigital() {}
    public BolsilloDigital(double saldo)
    {
        this.saldo = saldo;
    }
    // Getters & Setters
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    };
    // Métodos de la clase padre.
    public double mostrarSaldo()
    {return saldo;}
    public void recargar(double cantRecarga){};
    public void retirar(double cantRetiro){};
}