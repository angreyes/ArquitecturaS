/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author angie
 */
abstract class Factory {
    // se define el método 
    public abstract Productable factoryMethod();
    public abstract Productable createProduct(int tipo);

    Productable createProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
 