import java.util.Scanner;
public class Reto6{
    public static void main(String[] args) {
        int i=1,contador=1;
        String  frutaParaAdivinar="";
        Scanner get = new Scanner(System.in);
        System.out.println("bienvenido, ¿Cuántas palabras deseas descubrir?");
        contador = get.nextInt();
        while(i<=contador){
            System.out.println("Las opciones de palabras son: ");
            System.out.println("1. Fresa, 2. Manzana, 3.Pera, 4. Uva, 5. Patilla 6. Fresa");
            System.out.println("7. Mora, 2. 8. Piña, 9.Kiwi");
            System.out.println("Ingresa la palabra a adivinar");
            frutaParaAdivinar = get.next();
            if(frutaParaAdivinar.equalsIgnoreCase("Kiwi"))
            {
                System.out.println("Ganaste, la fruta a adivinar era: " + "Kiwi");
                i=contador+1;
            }
                else
                {
                    System.out.println("Perdiste");
                }
        i++;
        }
        get.close();
    }
}
