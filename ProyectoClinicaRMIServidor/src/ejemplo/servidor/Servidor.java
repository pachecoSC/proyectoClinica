/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo.servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author christian
 */
public class Servidor {
    
    public static void iniciar(){
        try {
            System.out.println("Intentando iniciar el servidor en el puerto 4567");
            Registry registry = LocateRegistry.createRegistry(4567);
            InterfazRemota obj = new ClaseRemota();
            registry.rebind("abc", obj);//registra un objeto en el metodo rebind
            System.out.println("Servidor iniciado");
        } catch (Exception e) {
            System.out.println("No se pudo iniciar el servidor");
            e.printStackTrace();
        }     
        
    }
    
    public static void main(String[] args) {
        Servidor.iniciar();
    }
    
}
