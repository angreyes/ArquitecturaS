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
public class ConcreteFactory extends Factory{

    public Productable factoryMethod() {
        return new ConcreteProduct();
    }

    @Override
    public Productable createProduct(int tipo) {
         if (tipo <10){
            return new ConcreteProduct();
         }
         else{
            return new ConcreteProducts();
         }  
    }
    
}

