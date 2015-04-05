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
public class Client{
    
    // si la solicitud es < 100 no se registra la solicitud 
    // si es > 100 pero < 1000 no se aprueba
    // si es > 1000 se despacha
    
    private Task tarea1;
    private Task tarea2;
    private Task tarea3;
    
    public Client (){
        this.tarea1 = new RegistrarSolicitud();
        this.tarea2 = new AprobarSolicitud ();
        this.tarea3 = new DespacharSolicitud();
        
        tarea1.setnext(tarea2);
        tarea2.setnext(tarea3);
    }
    
    public static void main (String Args []){    
               
        Client c1 = new Client(); 
        c1.tarea1.estadoSolicitud(100);
        System.out.println(" ");
        c1.tarea1.estadoSolicitud(900);
        System.out.println(" ");
        c1.tarea1.estadoSolicitud(14000);
    }
}