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
    
    public List<BolsilloVo> listarBolsillo() throws SQLException
    {   
        // Query definition
        sql="SELECT * from bolsillo";
        List<BolsilloVo> bolsillos=new ArrayList<>();
        try {
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            rs=ps.executeQuery(sql); // Execute the sentence
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
    public int addBolsilloNequi(BolsilloVo bolsillo) throws SQLException
    {
    sql="insert into bolsillo (saldo, nombreBolsillo, activo) values (?,?,?);";
        try
        {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql); //preparar sentencia
        ps.setDouble(1,  bolsillo.getSaldo());
        ps.setString(2,  bolsillo.getNombre());
        ps.setBoolean(3, bolsillo.isActivo());
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
   // Métodos Davip
    public List<BolsilloVo> listarBolsilloDavip() throws SQLException
    {   
        // Query definition
        sql="SELECT * from bolsillo";
        List<BolsilloVo> bolsillos=new ArrayList<>();
        try {
            con=Conexion.conectar(); // Opens connection 
            ps=con.prepareStatement(sql);  // Prepare sentence or query
            rs=ps.executeQuery(sql); // Execute the sentence
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
    public int addBolsilloDavip(BolsilloVo bolsillo) throws SQLException
    {
    sql="insert into bolsillo (saldo, nombreBolsillo, activo) values (?,?,?);";
        try
        {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql); //preparar sentencia
        ps.setDouble(1,  bolsillo.getSaldo());
        ps.setString(2,  bolsillo.getNombre());
        ps.setBoolean(3, bolsillo.isActivo());
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