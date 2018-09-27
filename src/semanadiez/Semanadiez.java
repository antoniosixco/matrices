package semanadiez;
/**
 *
 * @author Administrador
 * version 1.0 clase que dibujaun  arbol mediate matriz
 */
public class Semanadiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int dimension =5;
        char[][] figura= new char[dimension][dimension];
        
        for(int i=0; i<dimension; i++){
            
            //coloca espacios en lanco
            for(int j=0; j<i; j++){
                figura[i][j]=' ';
            }
            //coloca asteriscos
            for(int j=i; j<dimension; j++){
                figura[i][j]='/';
            }
        }
        //imprimiendo la matriz de la dimension
        //recorre las filas
        for(int i=0; i<dimension; i++){
            //recorre las columnas
            for(int j=0;  j<dimension; j++){
                System.out.print(figura[i][j]);
            }
            System.out.println();
        }
    }
    
}
