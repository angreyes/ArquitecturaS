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
public class factory {
    
    public void createProducto(int tipo){
        
        if (tipo == 1){
            product productA;
            productA = new concreteProduct();
            productA.imprimir();
        }
        else if (tipo == 2){
            product productA;
            productA = new concreteProducts();
            productA.imprimir();
        }
        else{
            System.out.println("No existe el producto");
        }
    }
    
}
