package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BolsilloDAO;
import Model.BolsilloVo;

public class Bolsillo extends HttpServlet 
{
    BolsilloVo BVO=new BolsilloVo();
    BolsilloDAO BDAO=new BolsilloDAO();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        System.out.println("petition DoGet");
        String petition=req.getParameter("petition");
        switch(petition)
        {
                // Gestionador de rutas
            case "index":
                //index(req,resp);
            break;
            case "listar_bol_nequi":
                listarBolsilloNequi(req,resp);
            break;
            case "listar_bol_davip":
                listarBolsilloDavip(req,resp);
            break;
            case "add_bol_nequi":
                AddBolNequiForm(req,resp);
            break;
            case "add_bol_davip":
                AddBolDavipForm(req,resp);
            break;
            default:
                System.out.println("Error en doPost");
                //index(req,resp);
            break;
        }
    }
    // Post petitions manager
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        System.out.println("petition DoPost");
        String petition=req.getParameter("petition");
        switch(petition)
        {
            case "addBolNequi":
                addBolNequi(req,resp);
            break;
            case "addBolDavip":
                addBolDavip(req,resp);
            break;
            case "editarBolNequi":
                editarBolsilloNequi(req,resp);
            break;
            case "editarBolDavip":
                editarBolsilloDavip(req,resp);
            break;
            default:
            
                System.out.println("Error ");
            break;
        }
    }
    
    private void addBolNequi(HttpServletRequest req, HttpServletResponse resp) 
    {
        try{
        // Traemos todos los datos desde la vista a variables
            double saldo =(Double.parseDouble(req.getParameter("saldo")));
            String nombre=(req.getParameter("nombre"));
            String estadoVista=(req.getParameter("estado"));
            boolean estado=false;
            if(estadoVista.equalsIgnoreCase("activo"))
            {estado=true;}
            if(estadoVista.equalsIgnoreCase("inactivo"))
            {estado=false;}
            if( saldo<0 || nombre=="" || estadoVista=="" )
            {   
                BVO.setNombre(null);
                BVO.setSaldo(0);
                BVO.setActivo(false);
                System.out.println("Datos nulos");
                dashboardNequi(req, resp);
            }
                else
                {
                    BVO.setNombre(nombre);
                    BVO.setSaldo(saldo);
                    BVO.setActivo(estado);
                    System.out.println("Datos nulos");
                    dashboardNequi(req, resp);
                }
                    try 
                    {
                        BDAO.addBolsilloNequi(BVO);
                        dashboardNequi(req, resp);
                        System.out.println("Registro insertado correctamente");
                    } 
                        catch (Exception e) 
                        {
                            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
                        }
        }
            catch(Exception e)
            {
                System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
            }
    }
    private void addBolDavip(HttpServletRequest req, HttpServletResponse resp) 
    {
        try{
        // Traemos todos los datos desde la vista a variables
            double saldo =(Double.parseDouble(req.getParameter("saldo")));
            String nombre=(req.getParameter("nombre"));
            String estadoVista=(req.getParameter("estado"));
            boolean estado=false;
            if(estadoVista.equalsIgnoreCase("activo"))
            {estado=true;}
            if(estadoVista.equalsIgnoreCase("inactivo"))
            {estado=false;}
            if( saldo<0 || nombre=="" || estadoVista=="" )
            {   
                BVO.setNombre(null);
                BVO.setSaldo(0);
                BVO.setActivo(false);
                System.out.println("Datos nulos");
                dashboardDavip(req, resp);
            }
                else
                {
                    BVO.setNombre(nombre);
                    BVO.setSaldo(saldo);
                    BVO.setActivo(estado);
                    System.out.println("Datos nulos");
                    dashboardDavip(req, resp);
                }
                    try 
                    {
                        BDAO.addBolsilloNequi(BVO);
                        dashboardDavip(req, resp);
                        System.out.println("Registro insertado correctamente");
                    } 
                        catch (Exception e) 
                        {
                            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
                        }
        }
            catch(Exception e)
            {
                System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
            }
    }
    
    private void listarBolsilloNequi(HttpServletRequest req, HttpServletResponse resp) 
    {
    try{
        List bolsillo = BDAO.listarBolsillo();
        req.setAttribute("bolsillos", bolsillo);
        System.out.println("Datos listados correctamente");
        req.getRequestDispatcher("views/bolsillos_nequi.jsp").forward(req, resp);
        System.out.println("El formulario ha sido abierto");
    }
        catch(Exception e)
    {
        System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
    }   
    }
    private void listarBolsilloDavip(HttpServletRequest req, HttpServletResponse resp) 
    {
        try{
            List bolsillo = BDAO.listarBolsillo();
            req.setAttribute("bolsillos", bolsillo);
            System.out.println("Datos listados correctamente");
            req.getRequestDispatcher("views/bolsillos_davip.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
                catch(Exception e)
            {
                System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
            }
    }   
    private void editarBolsilloNequi(HttpServletRequest req, HttpServletResponse resp)
    {
        int id = (Integer.parseInt(req.getParameter("id")));
        String nombre=(req.getParameter("nombre"));
        double saldo=(Double.parseDouble(req.getParameter("saldo")));
        String estadoVista=(req.getParameter("estado"));
        boolean estado=false;
        if(estadoVista.equalsIgnoreCase("activo"))
        {estado=true;}
        if(estadoVista.equalsIgnoreCase("inactivo"))
        {estado=false;}
        if( id<1 || saldo<0  || nombre=="" || estadoVista=="")
        {         
            BVO.setId(id);           
            BVO.setSaldo(0);
            BVO.setNombre(null);
            BVO.setActivo(false);
            System.out.println("Datos nulos");
            listarBolsilloNequi(req, resp);
        }
            else if (nombre==BVO.getNombre() && saldo==BVO.getSaldo())
        {
            listarBolsilloNequi(req, resp);
            System.out.println("No puedes actualizar datos con los mismos valores, primero modifica algo");
        }
        else
            {   
                BVO.setId(id);
                BVO.setNombre(nombre);
                BVO.setSaldo(saldo);
                BVO.setActivo(estado);
                listarBolsilloNequi(req, resp);
            }
                try 
                {
                    BDAO.editarBolsilloNequi(BVO);
                    listarBolsilloNequi(req, resp);
                    System.out.println("Registro actualizado correctamente");
                } 
                    catch (Exception e) 
                    {
                        System.out.println("Error en la inserción del registro " + e.getMessage().toString());
                    }
    }

    private void editarBolsilloDavip(HttpServletRequest req, HttpServletResponse resp)
    {
        int id = (Integer.parseInt(req.getParameter("id")));
        String nombre=(req.getParameter("nombre"));
        double saldo=(Double.parseDouble(req.getParameter("saldo")));
        String estadoVista=(req.getParameter("estado"));
        boolean estado=false;
        if(estadoVista.equalsIgnoreCase("activo"))
        {estado=true;}
        if(estadoVista.equalsIgnoreCase("inactivo"))
        {estado=false;}
        if( id<1 || saldo<0  || nombre=="" || estadoVista=="")
        {         
            BVO.setId(id);           
            BVO.setSaldo(0);
            BVO.setNombre(null);
            BVO.setActivo(false);
            System.out.println("Datos nulos");
            listarBolsilloDavip(req, resp);
        }
            else if (nombre==BVO.getNombre() && saldo==BVO.getSaldo())
        {
            listarBolsilloDavip(req, resp);
            System.out.println("No puedes actualizar datos con los mismos valores, primero modifica algo");
        }
        else
            {   
                BVO.setId(id);
                BVO.setNombre(nombre);
                BVO.setSaldo(saldo);
                BVO.setActivo(estado);
                listarBolsilloDavip(req, resp);
            }
                try 
                {
                    BDAO.editarBolsilloNequi(BVO);
                    listarBolsilloDavip(req, resp);
                    System.out.println("Registro actualizado correctamente");
                } 
                    catch (Exception e) 
                    {
                        System.out.println("Error en la inserción del registro " + e.getMessage().toString());
                    }
    }
    private void AddBolNequiForm(HttpServletRequest req, HttpServletResponse resp)
    {
        try{
            req.getRequestDispatcher("views/crear_bolsillo_nequi.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
            catch(Exception e)
        {
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }
    private void AddBolDavipForm(HttpServletRequest req, HttpServletResponse resp)
    {
        try{
            req.getRequestDispatcher("views/crear_bolsillo_davip.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
            catch(Exception e)
        {
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }
    private void dashboardDavip(HttpServletRequest req, HttpServletResponse resp) 
    {
        try{
            req.getRequestDispatcher("views/dashboard_davip.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
            catch(Exception e)
        {
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }
    private void dashboardNequi(HttpServletRequest req, HttpServletResponse resp) 
{
    try{
        req.getRequestDispatcher("views/dashboard_nequi.jsp").forward(req, resp);
        System.out.println("El formulario ha sido abierto");
    }
        catch(Exception e)
    {
        System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
    }
}
}