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
public interface Task {
    public void setnext (Task tarea); // variaable que va de paso a paso
    public Task getnext ();
    public void EstadoSolicitud (int solicitud);
}
