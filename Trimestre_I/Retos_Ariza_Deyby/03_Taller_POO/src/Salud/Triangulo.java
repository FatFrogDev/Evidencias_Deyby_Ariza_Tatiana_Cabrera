package Salud;
import java.util.Scanner;
public class Triangulo extends Figura
{
    // Creamos atriutos
    private float base, altura,area=0;
    public Triangulo(float  base, float altura)
    {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo()
    {

    }    
        public void calcularArea()
        {
            try (Scanner get = new Scanner(System.in))
            {
                System.out.print("Ingresa la base \n");
                base = get.nextFloat();
                System.out.print("Ingresa la altura \n");
                altura = get.nextFloat();
            }
            area=(base*altura)/2;
            System.out.print("La base del triángulo es: " + base + ", su altura es: " + altura + " y su área es: " + area + "\n");
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
public float getAltura() {
    return altura;
}
    public void setAltura(float altura) 
{
    this.altura = altura;
}
public float getArea() 
{
    return area;
}
public void setArea(float area) 
{
    this.area = area;
}
}
