package semanadiez;

import java.util.Scanner;

/**
 *
 * @author Administrador
 * @version 1.0
 */
public class EjertiendaMatriz {
    public static void main(String[]ags){
        final int dias=3;
        final int sucursales=2;
        
        float[][] ventas= new float[dias][sucursales];
        float suma=0;
        float miercoles=0;
        float promedio1=0;
        float promedio3=0;
        float promedio2=0;
        float promedio4=0;
        
        Scanner leer= new Scanner(System.in);
        
        for(int i=0; i<dias; i++)
        {
            for(int j=0; j<sucursales; j++)
            {//recibiend  valores
                System.out.println("ingrese la venta total para el dia"+ (i+1)+ "de la sucursal"+(j+1));
                ventas[i][j]=leer.nextFloat();//guardando el valor de ventas
                suma +=ventas[i][j];//incrementando el total
                
                if(i == 2)
                {//ventas del dia mircoles
                    miercoles= miercoles + ventas[i][j];
                    promedio3=suma/ventas[i][j];
                }
                
                if(i==0){
                    promedio1=suma/ventas[i][j];
                }
                
                if(i==1){
                    promedio2=suma/ventas[i][j];
                }
                
                if(i==3){
                    promedio4=suma/ventas[i][j];
                }
                
            }
        }
        //imprimiendo el total de ventas
            System.out.println("el total de la venta es: "+suma);
            //recorriendo dias
            for(int i=0; i<dias; i++)
            {//recorriendo sucursales
                for(int j=0; j<sucursales; j++)
                {
                    //imprimiendo valor por valor d la matiz
                 System.out.println("el avlor de venta en el dia " + (i+1) + "para la sucursal " + (j+1)+  " es: \n "+ventas[i][j]);
                }
            }
            System.out.println("las ventas para el dia miercoles son de: $" +miercoles);
            System.out.println("el promedio del dia lunes es de : $" +promedio1);
            System.out.println("el promedio del dia martes es de : $" +promedio2);
            System.out.println("el promedio del dia miercoles es de : $" +promedio3);
            System.out.println("el promedio del dia jueves es de : $" +promedio4);
            
    }
}
