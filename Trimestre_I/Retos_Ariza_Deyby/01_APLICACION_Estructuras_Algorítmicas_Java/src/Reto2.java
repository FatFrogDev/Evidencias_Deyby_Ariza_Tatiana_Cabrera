import java.util.Scanner;
public class Reto2{
	public static void main(String[] args) {
	    Scanner scan =  new Scanner(System.in);
		double pesoBebe=0, resultado=0;
		String nBebe ="", nMedico="" , nVacuna="", nEps="";
		System.out.println("Ingresa el nombre de la eps");
		nEps = scan.nextLine();
		System.out.println("Ingrese el nombre del médico");
		nMedico = scan.nextLine();
		System.out.println("Ingrese el nombre del bebé");
		nBebe = scan.nextLine();
		System.out.println("Imgrese el peso del bebé");
		pesoBebe = scan.nextInt();
        scan.nextLine();
    	System.out.println("Imgrese el nombre de la vacuna");
		nVacuna = scan.nextLine();
		resultado = (pesoBebe+10)/(pesoBebe*15)*10;
		System.out.println("Bienvenido, la dosis de la vacuna " + nVacuna + " de la eps " + nEps + ", a cargo del médico " + nMedico + " al bebé " + nBebe + " fue de: " + resultado);
        scan.close();
	}
}
