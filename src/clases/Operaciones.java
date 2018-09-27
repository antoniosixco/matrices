package clases;

/**
 *
 * @ANTONIO SIXCO
 * @version 1.0
 */
public class Operaciones {
/*ATRIBUTOS DE LA CLASE*/
 private int valorA;
 private int valorB;
 
 public void setvalorA(int valorA){
     this.valorA=valorA;
 }
 /**
  * getter para atributo
  * @return valor del atibuto
  */
 public int getvalorA(){
     return this.valorA;
 }
 
  /**
 *setter para el atributo
     * @param valorB
 *@para valorB
 */
 public void setvalorB(int valorB){
     this.valorB=valorB;
 }
 /**
  * getter para atributo
  * @return valor del atibuto
  */
 public int getvalorB(){
     return this.valorB;
 }
 
 
 
 public Operaciones(){
     
 }
 
 public Operaciones(int valorA, int valorB){
     this.valorA =valorA;
     this.valorB=valorB;
 }
 /**
  * funcion que suma ls atributos de la clase
     * @return 
  */
 public int sumar(){
     return this.valorA+this.valorB;
 }
 /**
  * funcion qu eresta los taributos de la clase
  * @return 
  */
 public int restar(){
     return this.valorA-this.valorB;
 }
 /**
  * funcion que multiplica los atributos de la clase
  * @return 
  */
 public int multiplicar(){
     return this.valorA* this.valorB;
 }
 /**
  * funcion que divide los atributos de la lase
  * @return 
  */
 public float dividir(){
     return this.valorA / this.valorB;
 }
 
 @Override
 public String toString(){
     return "valo del atributo A "+this.valorA +"\nvalo del atributo B " +this.valorB;
 }
}
