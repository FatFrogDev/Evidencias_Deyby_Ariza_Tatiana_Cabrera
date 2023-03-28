package Principal;
import Salud.*;
import java.util.Scanner;
public class Inicio_3
{       public static void main(String[] args)
        { 
            String nombres, apellidos, tipoDoc, numDoc, cargo, departamento;
            int valorHora, horasTrabajadas;         
            Scanner get = new Scanner(System.in);
            System.out.print("Ingresa los nombres\n");
            nombres = get.next(); 
            System.out.print("Ingresa los apellidos\n");
            apellidos = get.next();  
            System.out.print("Ingresa el tipo de documento\n");
            tipoDoc = get.next();
            System.out.print("Ingresa el número de documento\n");
            numDoc = get.next();
            System.out.print("Ingresa el cargo \n");
            cargo = get.next();
            System.out.print("Ingresa el departamento \n");
            departamento = get.next();
            System.out.print("Ingresa las horas trabajadas \n");
            horasTrabajadas=get.nextInt();
            System.out.print("Ingresa el valor por hora trabajada \n");
            valorHora=get.nextInt();
            Empleado emp = new Empleado(tipoDoc, numDoc, nombres, apellidos, nombres, apellidos, tipoDoc, numDoc, cargo, departamento, valorHora, horasTrabajadas, horasTrabajadas);
            emp.mostrarEmpleado();
            emp.calcularHonorarios();
            get.close();
        }
}
