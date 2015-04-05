/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pool;


/**
 *
 * @author angie
 */
public class ReusablePool {
    
    private static ReusablePool instance = new ReusablePool(); // intanciar 
     
    private ReusablePool(){ // constructor 
        System.out.println("Iniciando pool");
    } 
    
    public static ReusablePool getInstance(){ //al retornar la isntancia retorna el objeto RP
        return instance;
    }
    
    public  Reusable acquiereReusable(){ 
        Reusable r = null;
        return r;
    }
    
     public  Reusable releaseReusable(Reusable r){ 
        return r;
    }

 
}
