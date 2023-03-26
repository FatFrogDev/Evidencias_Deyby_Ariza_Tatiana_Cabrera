import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int filas,columnas;
        System.out.println("Digite la cantidad de filas: ");
        filas = get.nextInt();
        System.out.println("Digite la cantidad de columnas: ");
        columnas = get.nextInt();
        String [][] vocal = new String [filas][columnas];
        for(int i=0;i<filas;i++)
        {
        for(int j=0;j<columnas;j++)
        {
        System.out.println("Digita la vocal a: "+ j);
        vocal[i][j] = get.next();         
        }
        }
        for(int i=0;i<filas;i++)
        {
        for(int j=0;j<columnas;j++)
        {
            System.out.print(vocal[i][j]+"\t");
        }
        System.out.println(" ");
       
    }
    get.close();
}
}