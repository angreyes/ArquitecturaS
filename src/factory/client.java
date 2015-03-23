/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author BigDataSolutions
 */
public class client {
    
    
  public static void main (String Args []){
        int tipo = 1;      
       product product1 = new product() {
            @Override
            public void imprimir() {//To change body of generated methods, choose Tools | Templates.
            }            
        };
       
        factory factory1 = new factory ();    
        factory1.createProducto(tipo);
       // System.out.println(factory1.toString());
        
    }
    
}