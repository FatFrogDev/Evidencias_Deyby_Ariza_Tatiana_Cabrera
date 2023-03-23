import java.util.Scanner;
public class Reto4{
    public static void main (String args[]){
        int precio=0, contador=0;
        String producto="";
        Scanner get = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de máquina");
        String[][] maquina = new String[4][4];
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
            System.out.format("%5s %13s %10s","Codigo", "Producto","Precio");
            System.out.println();
            contador=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {       
            System.out.format("%1s", "0"+ contador);
            System.out.format("%30s", maquina[i][j]);
            System.out.println();
            contador++;      
            }  
        }
        get.close();
    }
}
