/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo.servidor;


import base.datos.BaseDatos.*;
import ejemplo.servidor.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christian
 */
public  class ClaseRemota extends java.rmi.server.UnicastRemoteObject implements InterfazRemota{
    
    public ClaseRemota() throws java.rmi.RemoteException{
    }

    @Override
    public String metodoRemoto() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
