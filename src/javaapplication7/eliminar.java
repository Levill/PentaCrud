package javaapplication7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;


public class eliminar {
    public static void main(String[] args) {
        String usuario="root";
        String clave="";
        Scanner in=new Scanner(System.in);
        
       
       
        try{
        
            Class.forName("org.gjt.mm.mysql.Driver");
            String url="jdbc:mysql://localhost:3306/Prueba";
           Connection con =DriverManager.getConnection(url,usuario,clave);
           Statement stmt=con.createStatement();
           System.out.println("Ingrese id a eliminar:");
           int id=Integer.parseInt(in.next());
           
           stmt.executeUpdate("delete from mascota where mascota_id='"+id+"'");
           //insertar datos en una tabla
           System.out.println("USUARIO DEL!!");
        
        }catch(Exception ex){
            System.out.println("ERROR:"+ex.getMessage());
        }
    }
    
}
    

