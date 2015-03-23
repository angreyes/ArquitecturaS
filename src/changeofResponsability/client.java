/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changeofResponsability;

/**
 *
 * @author angie
 */
public class client{
    
    // si la solicitud es < 100 no se registra la solicitud 
    // si es > 100 pero < 1000 no se aprueba
    // si es > 1000 se despacha
    
    private Task t1;
    
    public client (){
        this.t1 = new RegistrarSolicitud();
        Task t2 = new AprobarSolicitud ();
        Task t3 = new DespacharSolicitud();
        
        t1.setnext(t2);
        t2.setnext(t3);
    }
    
    public static void main (String Args []){    
               
        client c1 = new client(); 
        c1.t1.EstadoSolicitud(100);
        System.out.println(" ");
        c1.t1.EstadoSolicitud(900);
        System.out.println(" ");
        c1.t1.EstadoSolicitud(10000);
    }
}