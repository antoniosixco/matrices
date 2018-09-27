package pruebas;

import clases.Operaciones;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Prueba {
    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int opcion;
        do{
            System.out.println("BIEN VENIDO AL SISTEMA");
            System.out.println("1-Asignar Valres");
            System.out.println("2-Sumar");
            System.out.println("3-Restar");
            System.out.println("4-Multiplicar");
            System.out.println("5-Dividir");
            System.out.println("6-Mostrar Valores");
            System.out.println("7-salir");
            System.out.println("ingrese una opcion");
            opcion=leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("ingrse el pimer valor: ");
                    operaciones.setvalorA(leer.nextInt());
                    System.out.println("ingrese el segundo valor");
                    operaciones.setvalorB(leer.nextInt());
                    System.out.println("valores ingresados correctamente\n");
                break;
                case 2:
                    System.out.println("la sumatoria es: " +operaciones.sumar());
                    System.out.println(" ");
                break;
                case 3:
                    System.out.println("la resta es: " +operaciones.restar());
                    System.out.println(" ");
                break;
                case 4:
                    System.out.println("la multiplicacion es: " +operaciones.multiplicar());
                    System.out.println(" ");
                break;
                case 5:
                    System.out.println("el divicion es: " +operaciones.dividir());
                    System.out.println(" ");
                break;
                case 6:
                    System.out.println(operaciones);
                    System.out.println(" ");
                break;
                case 7:
                    System.out.println("gracias por utilizar la APP");
                    System.out.println(" ");
                break;
                default:
                    System.out.println("OPCION INVALIDA, INTENTE DE NUEVO");
                                    
            }
        }while(opcion !=7);
    }
}
