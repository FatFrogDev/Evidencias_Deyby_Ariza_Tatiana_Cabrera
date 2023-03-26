import java.util.Scanner;
public class ejercicio8{
    public static void main(String[] args){
        Scanner mesScanner = new Scanner(System.in);
        int mesNacimiento;
        System.out.println("Bienvenido al sistema para conocer tu signo zodiacal");
        System.out.println("Escribe el número del mes en el que has nacido (ej: 1. Enero, 12. Diciembre)");
        mesNacimiento = mesScanner.nextInt();
        switch(mesNacimiento){
            case 1:{
                System.out.println("Puedes ser Sagitario (17 diciembre - 20 enero)");
                System.out.println("O Capricornio (20 enero - 16 febrero)");
                System.out.println("Estos signos se caracterizan por ser felices e independientes");
            }
                break;
            case 2:{
                System.out.println("Puedes ser Capricornio (20 enero - 16 febrero)");
                System.out.println("O Acuario (16 febrero - 11 marzo)");
                System.out.println("Estos signos se caracterizan por ser analíticos, pero risueños");
            }
                break;
            case 3:{
                System.out.println("Puedes ser  Acuario (16 febrero - 11 marzo)");
                System.out.println("O Piscis (11 marzo - 18 abril)");
                System.out.println("Estos signos se caracterizan por ser tímidos y reservado");
            }
                break;
            case 4:{
                System.out.println("Puedes ser Piscis (11 marzo - 18 abril)");
                System.out.println("O Aries (18 abril - 13 mayo)");
                System.out.println("Estos signos se caracterizan por ser extrovertidos y comunicativos");
            }
                break;
            case 5:{
                System.out.println("Puedes ser Aries (18 abril - 13 mayo)");
                System.out.println("O Tauro (13 mayo - 21 junio)");
                System.out.println("Estos signos se caracterizan por ser amables y comprensivos");
            }
                break;
            case 6:{
                System.out.println("Puedes ser Tauro (13 mayo - 21 junio)");
                System.out.println("O Géminis (21 junio - 20 julio)");
                System.out.println("Estos signos se caracterizan por ser buenos oradores y ser afectivos");
            }
            break;
            case 7:{
                System.out.println("Puedes ser Géminis (21 junio - 20 julio)");
                System.out.println("O Cáncer (20 julio - 10 agosto)");
                System.out.println("Estos signos se caracterizan por ser maduros y lógicos");
            }
            break;
            case 8:{
                System.out.println("Puedes ser Cáncer (20 julio - 10 agosto)");
                System.out.println("O Leo (10 agosto - 16 septiembre)");
                System.out.println("Estos signos se caracterizan por ser muy amoroso y expresivos");
            }
            break;
            case 9:{
                System.out.println("Puedes ser leo (10 agosto - 16 septiembre)");
                System.out.println("O Virgo (16 septiembre - 30 octubre)");
                System.out.println("Estos signos se caracterizan por ser arriesgados y aventureros");
            }
            break;
            case 10:{
                System.out.println("Puedes ser Virgo (16 septiembre - 30 octubre)");
                System.out.println("o Libra (30 octubre - 23 noviembre)");
                System.out.println("Estos signos se caracterizan por enojarse fácilmente");
            }
            break;
            case 11:{
                System.out.println("Puedes ser Libra (30 octubre - 23 noviembre)");
                System.out.println("O Escorpión (23 noviembre - 29  noviembre )");
                System.out.println("Estos signos se caracterizan por ser bailarines y divetidos");
            }
            break;
            case 12:{
                System.out.println("Puedes ser Ofiuco (29 noviembre - 17 diciembre)");
                System.out.println("O Sagitario (17 diciembre - 20 enero)");
                System.out.println("Estos signos se caracterizan por ser muy calmados y amables");
            }
            break;
        default: {
            System.out.println("Eres Sagitario");
        }
        }
        mesScanner.close();
    }
}