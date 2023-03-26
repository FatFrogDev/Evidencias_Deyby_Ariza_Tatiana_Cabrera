import java.util.Scanner;
public class ejercicio23 {
public static void main(String[] args) {
// // Se crea un objeto String de dos formas
// // Forma 1
//     String [] frutas = new String[3];
//     frutas[0]="papaya";
//     frutas[1]="Manzana";
//     frutas[2]="uva";
// // Forma 2
//     String[] frutas2={"pera", "banano"};
//     System.out.println(frutas[0]);
//     System.out.println(frutas2[0]);

// Creamos objeto y vector tipo frutas
Scanner scan = new Scanner(System.in);
String[] frutas = new String[6];
int frutasLenght=frutas.length;

for(int i=0;i<frutasLenght;i++)
{
    System.out.println("Digita el valor de la fruta " + (i+1));
    String valor = scan.next();
    frutas [i]=valor;
}
for(int i=0;i<frutasLenght;i++)
{
    System.out.println("El valor de la fruta en posición " + i + " del arreglo es igual a: " + frutas[i]);
}
    System.out.println();
scan.close();
}
}
