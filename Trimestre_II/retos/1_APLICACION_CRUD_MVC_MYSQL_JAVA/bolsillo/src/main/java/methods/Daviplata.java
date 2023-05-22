package methods;

public class Daviplata extends BolsilloDigital
{
    // Establecemos el atributo dinero
    private double saldo=1290;
    // Creamos constructor vacío y con argumento.
    public Daviplata(){}
    public Daviplata(double saldo)
    {this.saldo = saldo;}
    //Getters y setters
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // Métodos propios.
    public double mosrarSaldo()
    {
      return getSaldo();
    }
    // Método recargar 
    public void recargar(double cantidadRecarga)
    {
      setSaldo(getSaldo()+cantidadRecarga);
    }
  
    // Éste método permite validar un retiro o no, siendo implementado en el método retirarSaldo.
    public boolean verificarRetiro(double cantidadRetiro)
    {
      boolean verificarRetiro=false;
      if (cantidadRetiro>=getSaldo())
      {
        verificarRetiro=false;
      }
          else if(cantidadRetiro<=getSaldo())
          {
            verificarRetiro=true;
          }
            else
            {
              System.out.println("Error veificando retiro.");
            }
      return verificarRetiro;
    }
  
    // Éste método permite retirar saldo del bolsillo.
    public void retirar(double cantidadRetiro)
  {
    boolean verificacionRetiro=verificarRetiro(cantidadRetiro);
    if (verificacionRetiro==false)
    {
      System.out.println("No puedes retirar más dinero del que tienes. Método(recargarSaldo)");
      setSaldo(getSaldo());
    }
        else if (verificacionRetiro==true)
        {
          setSaldo(getSaldo()-cantidadRetiro);
          System.out.println("Retiro exitoso. Método (recargarSaldo)");
        }
            else
            {
              System.out.println("Error retirando saldo, método retirarSaldo. Método(recargarSaldo)");
            }
  }
  
  }
  
