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
public class RegistrarSolicitud implements Task{
    
    private Task next;

    @Override
    public Task getnext() {
        return next;
    }

    @Override
    public void estadoSolicitud(int solicitud) {
        if (solicitud<=100)
            System.out.println("La solicitud N° "+ solicitud +" no pudo ser registrada");
        else{
            System.out.println("La solicitud N° "+ solicitud +" ha sido registrada");
            this.next.estadoSolicitud(solicitud);
        }
    }
        
    @Override
    public void setnext(Task tarea) {
        this.next = tarea;
    }
    
}
