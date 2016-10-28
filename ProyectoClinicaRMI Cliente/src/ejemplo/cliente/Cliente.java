/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.cliente;

import ejemplo.servidor.InterfazRemota;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.*;

/**
 *
 * @author christian
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            //mensaje para confirmar que el servidor este encendido
            JOptionPane.showMessageDialog(null,"Encender el servidor");
            Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1", 4567);
            InterfazRemota obj = (InterfazRemota)myRegistry.lookup("abc");// identificador  dentro del lookup
            
            
            new vPrincipalAdmin().setVisible(true);
            
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }
    }

}
