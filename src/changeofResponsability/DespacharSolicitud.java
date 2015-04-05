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
public class DespacharSolicitud implements Task {

    private Task next;

    @Override
    public Task getnext() {
        return next;
    }

    @Override
    public void estadoSolicitud(int solicitud) { // despachar soliictud
        if (solicitud >=1000)
            System.out.println("La solicitud N° " + solicitud + " fue aprobada, Felicitaciones!");
    }
    
    @Override
    public void setnext(Task tarea) {
        this.next = tarea;
    }
    
}
