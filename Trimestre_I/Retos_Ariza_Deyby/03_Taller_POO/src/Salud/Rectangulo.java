package Salud;
import java.util.Scanner;
public class Rectangulo extends Figura
{   
    // Variables
    float base, altura, area;
    public Rectangulo(float base, float altura)
    {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo()
    {

    }
        public void calcularArea()
        {
           Scanner get = new Scanner(System.in);
            System.out.print("Digite la base del rectángulo \n");
            base = get.nextFloat();
            System.out.print("Digite el altura del rectángulo \n");
            altura = get.nextFloat();
            area = base*altura;
            System.out.print("La base del rectángulo es: " + base + ", la altura es:" + altura + ", y el área es: " + area + "\n");
        }
// GETTERS && SETTERS o métodos accesores.
public float getBase() 
{
    return base;
}
public void setBase(float base) 
{
    this.base = base;
}
public float getAltura()
{
    return altura;
}
public void setAltura(float altura) 
{
    this.altura = altura;
}
public float getArea() {
    return area;
}
public void setArea(float area) 
{
    this.area = area;
}
}
