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
public class reusablePool {
    
     private static reusablePool instance = new reusablePool(); // intanciar 
     
    private reusablePool(){ // constructor 
        System.out.println("Iniciando pool");
    }    
    public static reusablePool getInstance(){ //al retornar la isntancia retorna el objeto RP
        return instance;
    }
    
    public  reusable acquiereReusable(){ 
        reusable r = null;
        return r;
    }
    
     public  reusable releaseReusable(reusable r){ 
        return r;
    }

 
}
