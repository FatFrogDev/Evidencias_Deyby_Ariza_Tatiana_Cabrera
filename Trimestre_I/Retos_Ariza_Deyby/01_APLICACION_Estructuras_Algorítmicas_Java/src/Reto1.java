import java.util.Scanner;
public class Reto1{
	public static void main(String[] args) {
		int tempIn;
		double farToC=0;
		Scanner tempScan = new Scanner(System.in);
		System.out.println("Hola, la temperatura en grados es 350°");
		    System.out.println("Hola, digita la temp en grados f");
		    tempIn = tempScan.nextInt();
			farToC=(tempIn-32)/1.8;
		    System.out.println("La temperatura en C° es: " + farToC);
	tempScan.close();
	}
}
