package javaapplication7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Mostrar {
    public static void main(String[] args) {
        String usuario="root";
        String clave="";
        Scanner in=new Scanner(System.in);
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            String url="jdbc:mysql://localhost:3306/Prueba";
            Connection con =DriverManager.getConnection(url,usuario,clave);
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from mascotas");
             while(rs.next()){
                System.out.println("nombre:"+rs.getString("nombre"));
                System.out.println("edad:"+rs.getString("edad"));
                System.out.println("Peso:"+rs.getString("Peso"));
            }
             }catch(Exception ex){
            System.out.println("ERROR:"+ex.getMessage());
        }
    }
}
            
    

