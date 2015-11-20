/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario="root";
        String clave="";
        Scanner in=new Scanner(System.in);
        
       
       
        try{
        
            Class.forName("org.gjt.mm.mysql.Driver");
            String url="jdbc:mysql://localhost:3306/Prueba";
           Connection con =DriverManager.getConnection(url,usuario,clave);
           //System.out.println("CONEXION ESTABLECIDA!!");
           Statement stmt=con.createStatement();
           System.out.println("INGRESAR NOMBRE:");
           String nom=in.nextLine();
           System.out.println("INGRESAR EDAD:");
           int ape=Integer.parseInt(in.nextLine());
           System.out.println("INGRESAR PESO");
           int kg=Integer.parseInt(in.nextLine());
           
           stmt.executeUpdate("insert into mascotas(nombre,edad,peso) values('"+nom+"','"+ape+"','"+kg+"')");
           //insertar datos en una tabla
           System.out.println("USUARIO AGREGADO!!");
        
        }catch(Exception ex){
            System.out.println("ERROR:"+ex.getMessage());
        }
    }
    
}
