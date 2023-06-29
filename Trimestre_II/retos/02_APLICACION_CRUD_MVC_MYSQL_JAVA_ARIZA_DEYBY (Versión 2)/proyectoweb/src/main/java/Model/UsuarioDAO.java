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
    // Atributes for making operations into the db
    Connection con; //Conecction object
    PreparedStatement ps; //Prepare sentences
    ResultSet rs; // stores sentences
    String sql=null;
    int TotalRows; //Total rows returned by a sentense
    public int addUsuarioNequi(UsuarioVo usuario) throws SQLException
    {
        sql="insert into usuario (nombre, apellido, tipoDoc,numDoc,email, password, activo) values (?, ?,?,?,?,?,?);";
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
        System.out.println(TotalRows);
        return TotalRows;
    }  
    public int addUsuarioDavip(UsuarioVo usuario) throws SQLException
    {
        sql=" insert into usuario (nombre, apellido, tipoDoc,numDoc,email, password, activo)  values (?, ?,?,?,?,?,?);";
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
        System.out.println(TotalRows);
        return TotalRows;
    }  
    public List<UsuarioVo> listarUsuNequi() throws SQLException
    {   
        // Query definition
        sql="SELECT u.idUsuario, u.nombre, u.apellido, u.tipoDoc, u.numDoc, u.email, u.password, u.activo FROM usuario as u inner join bolsillo as b on u.`idUsuario`=b.`idUsuario` WHERE b.nombre='Nequi'  group by b.idUsuario;";
        List<UsuarioVo> usuarios = new ArrayList<>();
        try {
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            rs=ps.executeQuery(sql); // Execute the sentence
                while(rs.next())
                {
                    UsuarioVo UserList=new UsuarioVo();
                    UserList.setId(rs.getInt("idUsuario"));
                    UserList.setNombre(rs.getString("nombre"));
                    UserList.setApellido(rs.getString("apellido"));
                    UserList.setTipoDoc(rs.getString("tipoDoc"));
                    UserList.setNumDoc(rs.getString("numDoc"));
                    UserList.setCorreo(rs.getString("email"));
                    UserList.setPassword(rs.getString("password"));
                    UserList.setEstado(rs.getBoolean("activo"));   
                    usuarios.add(UserList);                  
                }
                ps.close(); // Close the sentence
        // Verifies the query with a console message
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
    public List<UsuarioVo> listarUsuDavip() throws SQLException
    {   
        // Query definition
        sql="SELECT u.idUsuario, u.nombre, u.apellido, u.tipoDoc, u.numDoc, u.email, u.password, u.activo FROM usuario as u inner join bolsillo as b on u.`idUsuario`=b.`idUsuario` WHERE b.nombre='Daviplata'  group by b.idUsuario;";
        List<UsuarioVo> usuarios = new ArrayList<>();
        try {
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            rs=ps.executeQuery(sql); // Execute the sentence
                while(rs.next())
                {
                    UsuarioVo UserList=new UsuarioVo();
                    UserList.setId(rs.getInt("idUsuario"));
                    UserList.setNombre(rs.getString("nombre"));
                    UserList.setApellido(rs.getString("apellido"));
                    UserList.setTipoDoc(rs.getString("tipoDoc"));
                    UserList.setNumDoc(rs.getString("numDoc"));
                    UserList.setCorreo(rs.getString("email"));
                    UserList.setPassword(rs.getString("password"));
                    UserList.setEstado(rs.getBoolean("activo"));   
                    usuarios.add(UserList);                  
                }
                ps.close(); // Close the sentence
        // Verifies the query with a console message
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

        sql = "update usuario set nombreUsuario='" + usuario.getNombre() + "', apellidoUsuario='" + usuario.getApellido() +"', tipoDoc='" + usuario.getTipoDoc() + "', numDoc='" + usuario.getNumDoc() + "', email='" + usuario.getCorreo()+ "', password='" + usuario.getPassword() + "', activo="+ usuario.isEstado() +" where idUsuario=" + usuario.getId();
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
    public boolean login(UsuarioVo usuario) throws SQLException
    {
        String email= usuario.getCorreo();
        String password
 = usuario.getPassword();
        boolean sesion=false;
        sql = "select * from usuario where email='" + email + "' and password='" + password
 + "';";
        try
        {
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            System.out.println(sql);
            rs=ps.executeQuery(sql); // Execute the sentence
            if (rs.next()) {
                // Las credenciales son válidas, redirigir a la página de inicio
                sesion=true;

            } else {
                // Las credenciales son inválidas, mostrar mensaje de error
                sesion=false;
            }
            System.out.println(sesion);
        } 
        catch(Exception e)
        {
            System.out.println("Error en login " + e.getMessage().toString());
        }
            finally
            {
            con.close(); //  connection closing
                }
    return sesion;
    }
    public int getIdUsuario(UsuarioVo usuario) throws SQLException
    {
        String email = usuario.getCorreo();
        String password= usuario.getPassword();
        int id=0;
        sql = "select * from usuario where email='" + email+ "' and password='" + password+ "';";
        try
        {
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            System.out.println(sql);
            rs=ps.executeQuery(sql); // Execute the sentence
            if (rs.next()) {
                // Las credenciales son válidas, redirigir a la página de inicio
                id=rs.getInt("idUsuario");
            } else {
                // Las credenciales son inválidas, mostrar mensaje de error
                System.out.println("Error en el login");
                id=0;
            }
            System.out.println(id);
        } 
        catch(Exception e)
        {
            System.out.println("Error en login " + e.getMessage().toString());
        }
            finally
            {
            con.close(); //  connection closing
                }
    return id;
    }
}