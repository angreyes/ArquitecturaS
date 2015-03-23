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
public class AprobarSolicitud implements Task{

    private Task next;

    @Override
    public Task getnext() {
        return next;
    }

    @Override
    public void EstadoSolicitud(int solicitud) {
        if (solicitud > 100 && solicitud<1000)
            System.out.println("La solicitud N°" + solicitud + " no fue aprobada");
        else{
            this.next.EstadoSolicitud(solicitud);            
            System.out.println("La solicitud N° "+ solicitud +" ha sido aprobada");
        }
    }
        
    @Override
    public void setnext(Task tarea) {
        this.next = tarea;
    }
}
