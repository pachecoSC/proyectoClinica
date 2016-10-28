/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author christian
 */
public class BaseDatos {
    
    static Connection conexion;
    
    //realiza la conexion a la base de datos de nombre Sistema Clinica
    public static void conectar() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/Cliente","root","");
        }catch(ClassNotFoundException | SQLException e){
            throw new Exception("Imposible realizar conexion con la DB"+ e.getMessage());
        }
    }
    
    //realiza la accion que recive en lenguaje transc y devuelve un resultado ocurrido de la base de datos 
    // se usa para listar 
    public static ResultSet consultar(String sql) throws Exception{
        try{
           Statement st=conexion.createStatement();
           ResultSet resultado= st.executeQuery(sql);
           return resultado;
        }catch(Exception e){
            throw new Exception("Error al consultar la DB"+ e.getMessage());
        }
    }
    
    //Ejecuta las sentencias enviadas en lenguaje transac y se utiliza para modificar y registrar 
    
    public static int ejecutar(String sql) throws Exception{
        try{
            Statement st= conexion.createStatement();
            int resultado =st.executeUpdate(sql);
            return resultado;
        }catch (Exception e){
            throw new Exception("Error al actualizar la DB"+e.getMessage());
        }
    }
    
    //cierra sesion para que no se acumulen instancias
    public static void desconectar () throws Exception{
        try{
            conexion.close();
            
        }catch(Exception e){
            throw new Exception ("Error al desconectar la base de datos"+e.getMessage());
        }
    }
    
    public static boolean autenticar(String sql)throws Exception{
        try{
            PreparedStatement pst=conexion.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        }catch(Exception e){
            throw new Exception("Error"+e.getMessage());
        }
        
        return false;
    }
    
}