package semanadiez;

import java.util.Scanner;

/**
 *
 * @author Administrador
 * @version 1.0
 */
public class EjertiendaMatriz {
    public static void main(String[]ags){
        final int dias=7;
        final int sucursales=7;
        float[][] ventas= new float[dias][sucursales];
        float suma=0;
        Scanner leer= new Scanner(System.in);
        
        for(int i=0; i<dias; i++)
        {
            for(int j=0; j<sucursales; j++)
            {//recibiend  valores
                System.out.println("ingrese la venta total para el dia"+ (i+1)+ "de la sucursal"+(j+1));
                ventas[i][j]=leer.nextFloat();//guardando el valor de ventas
                suma +=ventas[i][j];//incrementando el total
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
                 System.out.println("el avlor de venta en el dia"+(i+1)+"para la sucursal"+(j+1)+"es:"+ventas[i][j]);
                }
            }
    }
}
