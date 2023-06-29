package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion 
{
    // Declare atributtes
    private static final String bd="jdbc:mysql://localhost:3306/bolsillo";
    private static final String user= "root";
    private static final String pass="0000"; // 0000
    private static Connection con;

    
    public static Connection conectar() {

        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(bd,user,pass);
        System.out.println("Conexión Exitosa");
        System.out.println(con);
        
        }
        catch(Exception e)
        {
        
        System.out.println("Error de conexión a la base de datos "+e.getMessage().toString());
        }
        return con;
        }

        public static void main(String[] args) throws SQLException
        {
            Conexion.conectar();
        }
}
