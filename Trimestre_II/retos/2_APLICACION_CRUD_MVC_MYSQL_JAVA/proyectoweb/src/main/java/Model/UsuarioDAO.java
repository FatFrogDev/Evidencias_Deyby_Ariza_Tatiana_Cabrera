package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// import Controller.*;
// import Model.*;
public class UsuarioDAO 
{
    /* Atrubutes for making operations into the db */
    Connection con; //Conecction object
    PreparedStatement ps; //Prepare sentences
    ResultSet rs; // stores sentences
    String sql=null;
    int TotalRows; //Total rows returned by a sentense

    public int addUsuario(UsuarioVo usuario) throws SQLException
    {
        sql="insert into usuario (nombreUsuario, apellidoUsuario, tipoDoc,numDoc,correoUsuario, passwordUsuario, activo) values (?, ?,?,?,?,?,?);";
        try
        {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql); //preparar sentencia
        ps.setString(1,  usuario.getNombre());
        ps.setString(2,  usuario.getApellido());
        ps.setString(3,  usuario.getTipoDoc());
        ps.setString(4,  usuario.getNumDoc());
        ps.setString(5,  usuario.getCorreo());
        ps.setString(6,  usuario.getPassword());
        ps.setBoolean(7, usuario.isEstado());
        System.out.println(ps);
        ps.executeUpdate();
        ps.close();
        System.out.println("User DAO");
        }
        catch(Exception e)
        {
            System.out.println("Error en el regisro " + e.getMessage().toString());
        }
        finally
        {
            con.close();//connection closing
        }
        return TotalRows;
    }
    
    public List<UsuarioVo> listar() throws SQLException
    {   
        // Query definition
        sql="SELECT * from usuario";
        List<UsuarioVo> usuarios=new ArrayList<>();
        try {
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            rs=ps.executeQuery(sql); // Execute the sentence
                while(rs.next())
                {
                    UsuarioVo UserList=new UsuarioVo();
                    UserList.setId(rs.getInt("idUsuario"));
                    UserList.setNombre(rs.getString("nombreUsuario"));
                    UserList.setApellido(rs.getString("apellidoUsuario"));
                    UserList.setTipoDoc(rs.getString("tipoDoc"));
                    UserList.setNumDoc(rs.getString("numDoc"));
                    UserList.setCorreo(rs.getString("correoUsuario"));
                    UserList.setPassword(rs.getString("passwordUsuario"));
                    UserList.setEstado(rs.getBoolean("activo"));       
                    usuarios.add(UserList);                  
                }
                ps.close(); // Close the sentence
        // Verifies the query with a console message
        System.out.println("consulta exitosa");
        }
            catch (Exception e)
            {
                System.out.println("La consulta no pudo ser ejecutado " + e.getMessage().toString());
            }
                finally{
                    con.close(); // Closes the connection to the db
                }
        return usuarios;
    }

    public int editarUsuario(UsuarioVo usuario) throws SQLException
    {

        sql = "update usuario set nombreUsuario='" + usuario.getNombre() + "', apellidoUsuario='" + usuario.getApellido() +"', tipoDoc='" + usuario.getTipoDoc() + "', numDoc='" + usuario.getNumDoc() + "', correoUsuario='" + usuario.getCorreo()+ "', passwordUsuario='" + usuario.getPassword() + "', activo="+ usuario.isEstado() +" where idUsuario=" + usuario.getId();
        try
        {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql); 
        ps.executeUpdate(sql);
        System.out.println(ps);
        ps.close();
        }
        catch(Exception e)
        {
            System.out.println("Error en el regisro " + e.getMessage().toString());
        }
        finally
        {
            con.close();    //  connection closing
        }
        System.out.println("Total rows" + TotalRows);
        return TotalRows;
    }
    // public int verificarUsuario(UsuarioVo usuario) throws SQLException
    // {
    //     String usu = usuario.getCorreo();
    //     String password = usuario.getPassword();
    //     sql = "select * from usuario where correoUsuario='" + usu +"' and passwordUsuario='"+ password +"'";
    //     int sesion=1;
    //     try
    //     {
    //         con=Conexion.conectar(); // Opens connection 
    //         ps=con.prepareStatement(sql);  // Prepare sentence or query
    //         rs=ps.executeQuery(sql); 
    //         System.out.println(rs);
    //         System.out.println(rs.next());
    //         while(rs.next())
    //         {
    //             sesion=1;
    //         }
    //         ps.close();
    //     }
    //     catch(Exception e)
    //     {
    //         System.out.println("Error en login " + e.getMessage().toString());
    //     }
    //         finally
    //         {
    //                 con.close();    //  connection closing
    //             }
    // return sesion;
    // }
}