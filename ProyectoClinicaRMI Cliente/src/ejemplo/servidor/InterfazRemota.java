/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo.servidor;

/**
 *
 * @author christian
 */
public interface InterfazRemota extends java.rmi.Remote{
    public String metodoRemoto() throws java.rmi.RemoteException;
    
    //public ArrayList LIstarUsuarios() throws java.rmi.RemoteException; ejemplo de metodo
}
