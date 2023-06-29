package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BolsilloDAO 
{
        /* Atrubutes for making operations into the db */
        Connection con; //Conecction object
        PreparedStatement ps; //Prepare sentences
        ResultSet rs; // stores sentences
        String sql=null;
        int TotalRows; //Total rows returned by a sentense
        // Métodos Nequi
    public List<BolsilloVo> listarBolsilloNequi() throws SQLException
    {   
        // Query definition
        sql="SELECT * from bolsillo as b  inner JOIN usuario as u on b.idUsuario=u.idUsuario WHERE b.nombre='Nequi' ;";
        List<BolsilloVo> bolsillosNequi=new ArrayList<>();
        try {
            System.out.println(sql);
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            rs=ps.executeQuery(sql); // Execute the sentence
            System.out.println(sql);
                while(rs.next())
                {
                    BolsilloVo BolsilloList = new BolsilloVo();
                    BolsilloList.setId(rs.getInt("idBolsillo"));
                    BolsilloList.setSaldo(rs.getDouble("saldo"));
                    BolsilloList.setNombre(rs.getString("nombreBolsillo"));
                    BolsilloList.setActivo(rs.getBoolean("activo"));
                    bolsillosNequi.add(BolsilloList);                  
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
        return bolsillosNequi;
    }

    
    public int addBolsilloNequi(BolsilloVo bolsillo, int id ) throws SQLException
    {
    sql="insert into bolsillo (saldo, nombre, activo,  idUsuario) values (?,?,?, ?);";
        try
        {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql); //preparar sentencia
        ps.setDouble(1,  bolsillo.getSaldo());
        ps.setString(2,  bolsillo.getNombre());
        ps.setBoolean(3, bolsillo.isActivo());
        ps.setInt(4, id);
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
    public int editarBolsilloNequi(BolsilloVo bolsillo) throws SQLException
    {
    sql ="update bolsillo set saldo=" + bolsillo.getSaldo() + ", nombreBolsillo='" + bolsillo.getNombre()+ "', activo=" + bolsillo.isActivo() + " where idBolsillo=" + bolsillo.getId();
        try
        {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql); 
            ps.executeUpdate(sql);
            System.out.println(sql);
            ps.close();
            System.out.println("Bol DAO");
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
    public int retirarNequi(BolsilloVo bolsillo, double retiro, int id) throws SQLException
    {
        System.out.println(bolsillo.getSaldo());
        System.out.println();
        System.out.println(retiro);
        sql ="update bolsillo set saldo=" + ((bolsillo.getSaldo())-(retiro)) + " where idUsuario=" + id;
            try
            {
                con=Conexion.conectar();
                ps=con.prepareStatement(sql); 
                ps.executeUpdate(sql);
                System.out.println(sql);
                ps.close();
                System.out.println("Bol DAO");
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
    public double consultarDinero(int id) throws SQLException
        {
            double dinero=0;
            sql = "select saldo from bolsillo where idUsuario="+ id + ";";
            try
            {
                con=Conexion.conectar(); // Opens connection 
                ps=con.prepareStatement(sql);  // Prepare sentence or query
                System.out.println(sql);
                rs=ps.executeQuery(sql); // Execute the sentence
                if (rs.next()) {
                    // Las credenciales son válidas, redirigir a la página de inicio
                    dinero=rs.getDouble("saldo");
                } else {
                    // Las credenciales son inválidas, mostrar mensaje de error
                        System.out.println("Error en la consulta de dinero para el usuario/bolsillo");
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
        return dinero;
        }
    public int recargaNequi(BolsilloVo bolsillo, int id,double recarga) throws SQLException
    {
        sql = "update  bolsillo set saldo=" + ((bolsillo.getSaldo())+(recarga)) + "  where idUsuario="+ id + ";";
        try
        {
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            System.out.println(sql);
            ps.executeUpdate(sql); // Execute the sentence
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
    return TotalRows;
    }
        // Métodos Davip
        public List<BolsilloVo> listarBolsilloDavip() throws SQLException
        {   
            // Query definition
            sql="SELECT * from bolsillo as b  inner JOIN usuario as u on b.idUsuario=u.idUsuario WHERE b.nombre='Daviplata';";
            List<BolsilloVo> bolsillos=new ArrayList<>();
            try {
                System.out.println(sql);
                con=Conexion.conectar(); // Opens connection 
                ps=con.prepareStatement(sql);  // Prepare sentence or query
                rs=ps.executeQuery(sql); // Execute the sentence
                System.out.println(sql);
                    while(rs.next())
                    {
                        BolsilloVo BolsilloList = new BolsilloVo();
                        BolsilloList.setId(rs.getInt("idBolsillo"));
                        BolsilloList.setSaldo(rs.getDouble("saldo"));
                        BolsilloList.setNombre(rs.getString("nombreBolsillo"));
                        BolsilloList.setActivo(rs.getBoolean("activo"));
                        bolsillos.add(BolsilloList);                  
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
            return bolsillos;
        }
    public int addBolsilloDavip(BolsilloVo bolsillo, int id ) throws SQLException
    {
    sql="insert into bolsillo (saldo, nombre, activo,  idUsuario)  values (?,?,?, ?);";
        try
        {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql); //preparar sentencia
        ps.setDouble(1,  bolsillo.getSaldo());
        ps.setString(2,  bolsillo.getNombre());
        ps.setBoolean(3, bolsillo.isActivo());
        ps.setInt(4, id);
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
    public int editarBolsilloDavip(BolsilloVo bolsillo) throws SQLException
    {
    sql ="update bolsillo set saldo=" + bolsillo.getSaldo() + ", nombreBolsillo='" + bolsillo.getNombre()+ "', activo=" + bolsillo.isActivo() + " where idBolsillo=" + bolsillo.getId();
        try
        {
            con=Conexion.conectar();
            ps=con.prepareStatement(sql); 
            ps.executeUpdate(sql);
            System.out.println(sql);
            ps.close();
            System.out.println("Bol DAO");
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
    
}   