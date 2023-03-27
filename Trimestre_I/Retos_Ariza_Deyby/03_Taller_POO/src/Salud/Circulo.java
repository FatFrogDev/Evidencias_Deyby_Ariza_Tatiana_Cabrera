package Salud;
import java.util.Scanner;
public class Circulo extends Figura
{
    // Atributos
    final double pi= 3.14;
    double radio, area;
    public Circulo(double radio)
    {
        this.radio = radio;
    }
    public Circulo()
    {

    }
    public void calcularArea()
    {
        try (Scanner get = new Scanner(System.in))
        {
            System.out.print("Ingresa el radio del círculo \n");
            radio = get.nextDouble();
        }
        // El área del círculo es igual a Pi por Radio al cuadrado:
        area = pi*(Math.pow(radio, 2));
        System.out.print("El radio del círculo es: " + radio + ", y su área es: " + area + "\n");
    }
//GETTERS && SETTERS o métodos accesores
public double getPi()
{
    return pi;
}
public double getRadio()
{
    return radio;
}
public void setRadio(double radio)
{
    this.radio = radio;
}
public double getArea()
{
    return area;
}
public void setArea(double area)
{
    this.area = area;
}
}
