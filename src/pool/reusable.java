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
public class reusable {
    //Obtenemos el Reusable del pool
    reusable reusable = reusablePool.getInstance().acquiereReusable();
 
    //Se libera
    reusable reusable1 = reusablePool.getInstance().releaseReusable(reusable);
    
    
}
