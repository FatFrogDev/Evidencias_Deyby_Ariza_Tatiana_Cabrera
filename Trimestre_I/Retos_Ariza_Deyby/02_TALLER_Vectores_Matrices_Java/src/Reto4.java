// Importamos librerias a usar.
// mport libraries to use.
import java.util.Scanner;
public class Reto4{
    public static void main (String args[]){
        int precio=0, contador=0;
        String producto="";
    //  Declarar variables - Declare variables.
        Scanner get = new Scanner(System.in);
    //  Instancia de objetos - Instantiate objects.
        System.out.println("Bienvenido al sistema de máquina");
        String[][] maquina = new String[4][4];
    // Se define el tamaño del array con el valor establecido en el ejercicio.
    // The lenght its defined with the value previously stablished.
        for(int i=0;i<4;i++)
        { 
            for(int j=0;j<4;j++)
            {       
            System.out.println("Digita el nombre del producto: " + contador);
            producto = get.next();
            System.out.println("Digita el valor del producto " + contador);
            precio = get.nextInt();
            maquina[i][j]= producto+ "           " + precio;        
            contador++;
            }
        }
        // Establece el nombre de cada producto y su valor.
        // Stablishes name and cost of each product.
            System.out.format("%5s %13s %10s","Codigo", "Producto","Precio");
            System.out.println();
        // Crea un formato para intentar organizar la matriz.
        // Create a format to try to make a bit organized the array.
        contador=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
            System.out.println();       
            System.out.format("%1s", "0"+ contador);
            System.out.format("%30s", maquina[i][j]);
            contador++;      
            }  
        }
        // Imprime los valores de cada producto: posición, nombre y costo.
        // Prints the values of each product: position, name and cost.
        get.close();
    }
}
