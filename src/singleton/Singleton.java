/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author angie
 */
public class Singleton {
    private static Singleton instance = new Singleton(); 
    private Singleton() {
    } 
    public static Singleton getInstance() {
        return instance;
    }
}
