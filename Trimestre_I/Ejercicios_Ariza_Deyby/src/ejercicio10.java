import java.util.Scanner;
public class ejercicio10{
    public static void main(String[] args) {
        int cant=0, bola1=1000, bola2=2000, bola3=3000, precio=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido, ¿cuántas bolas de helado deseas comprar?");
        cant = leer.nextInt();
        if (cant==1)
        {
            precio=bola1;
        }
        else if (cant==2)
        {
            precio=bola2;
        }
        else if (cant==3)
        {
            precio=bola3;
        }
        else
        {
            System.out.println("error");
        }
        System.out.println("Apreciado usuario, el total es de : " + precio);
        leer.close();
    }
}
