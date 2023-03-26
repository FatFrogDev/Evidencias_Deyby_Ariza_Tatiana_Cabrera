import java.util.Scanner;
public class ejercicio3 {
    //Diseñar un programa que me permita saber si el número digitado por el usuario es múltiplo de 3 
    public static void main(String[] args){
    int num, result;
    Scanner multiScanner= new Scanner(System.in);
    System.out.println("Digite el número para verificar si es o no, un múltiplo de 3");
    num = multiScanner.nextInt();
    result = num%3;
    System.out.println(result);
    System.out.println("Si el número de arriba es diferente a 0, el número digitado no es un múltiplo de 3");
    System.out.println("Si es igual a 0, es múltiplo de 3");
    multiScanner.close();
}
}