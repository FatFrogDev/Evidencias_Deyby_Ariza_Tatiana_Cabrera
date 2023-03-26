import java.util.Scanner;
public class ejercicio17 {
    
    public static void main(String[] args) {
        String mes1="Eres Sagitario", mes2="Eres capricornio", mes3="Eres acuario", mes4="Eres piscis", mes5="Eres tauro", mes6="Eres géminis", mes7="Eres cáncer", mes8="Eres leo", mes9="Eres virgo", mes10="Eres libra", mes11="Eres escorpión", mes12="Eres ofícuo";
        int n, mesNacimiento;    
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuántas vecees quieres calcular un signo?");
        n = scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Escribe tu mes de nacimiento");
            mesNacimiento=scan.nextInt();
            switch(mesNacimiento){
                case 1:{
                    System.out.println(mes1);
                }
                    break;
                case 2:{
                    System.out.println(mes2);
                }
                    break;
                case 3:{
                    System.out.println(mes3);
                }
                    break;
                case 4:{
                    System.out.println(mes4);
                }
                    break;
                case 5:{
                    System.out.println(mes5);
                }
                    break;
                case 6:{
                    System.out.println(mes6);
                }
                break;
                case 7:{
                    System.out.println(mes7);
                }
                break;
                case 8:{
                    System.out.println(mes8);
                }
                 break;
                case 9:{
                }
                    System.out.println(mes9);             
                break;
                case 10:{
                }
                    System.out.println(mes10);
                break;
                case 11:{
                    System.out.println(mes11);
                }
                break;
                case 12:{
                    System.out.println(mes12);
                }
                break;
            default: {
                System.out.println("Eres Sagitario");
            }
            }
        }
    scan.close();
    }
}
