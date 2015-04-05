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
public class Client {    
    
  public static void main (String Args []){
      Factory factory1;
      factory1 = new ConcreteFactory();
      Productable producto1 = factory1.createProduct(5);
      producto1.imprimir();
      
      Factory factory2;
      factory2 = new ConcreteFactory();
      Productable producto2 = factory2.createProduct(20);
      producto2.imprimir();

      
  }
    
}