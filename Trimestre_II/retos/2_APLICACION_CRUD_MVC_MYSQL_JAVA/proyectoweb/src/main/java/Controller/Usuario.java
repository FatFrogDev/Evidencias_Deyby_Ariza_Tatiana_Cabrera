package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.UsuarioDAO;
import Model.UsuarioVo;

public class Usuario extends HttpServlet
    {
    UsuarioVo UVO=new UsuarioVo();
    UsuarioDAO UDAO=new UsuarioDAO();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        System.out.println("petition DoGet");
        String petition=req.getParameter("petition");
        switch(petition)
        {
                // Gestionador de rutas
            case "index":
                index(req,resp);
            break;
            case "login_davip":
                loginDaviP(req,resp);
            break;
            case "login_nequi":
                loginNequi(req, resp);
            break;
            case "signup_davip":
                signUpDavi(req,resp);
            break;
            case "signup_nequi":
                signUpNequi(req,resp);
            break;  
            case "dashboard_davip":
                dashboardDavip(req, resp);
            break;
            case "dashboard_nequi":
                dashboardNequi(req, resp);
            break;
            case "listar_usu_nequi":
                listarUsuNequi(req, resp);
            break;
            case "listar_usu_davip":
                listarUsuDavip(req, resp);
            break;
            default:
                System.out.println("Error en doPost");
                index(req,resp);
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
            case "addUsuarioNequi":
                addUsuarioNequi(req,resp);
            break;
            case "addUsuarioDavip":
                addUsuarioDavip(req,resp);
            break;
            case "editUsuarioNequi":
                editUsuarioNequi(req, resp);
            break;
            case "editUsuarioDavip":
                editUsuarioDavip(req, resp);
            break;
            // case "verificarUsuario":
            //     verificarUsuario(req,resp);
            // break;
            default:
            System.out.println("Error ");
            break;
        }
    }
        private void addUsuarioNequi(HttpServletRequest req, HttpServletResponse resp) 
        {
            try{
            // Traemos todos los datos desde la vista a variables
                String nombre=(req.getParameter("name"));
                String apellido=(req.getParameter("apellido"));
                String tipoDoc=(req.getParameter("tipoDoc")); 
                String numDoc=(req.getParameter("numDoc"));
                String email=(req.getParameter("email"));
                String password=(req.getParameter("password"));
                boolean activo=false;     
                if( nombre=="" || apellido=="" || tipoDoc=="" || numDoc=="" || email=="" || password=="" )
                {   
                    UVO.setNombre(null);
                    UVO.setApellido(null);
                    UVO.setTipoDoc(null);
                    UVO.setNumDoc(null);
                    UVO.setCorreo(null);
                    UVO.setPassword(null);
                    UVO.setEstado(activo);
                    System.out.println("Datos nulos");
                    listarUsuNequi(req, resp);
                }
                    else
                    {
                        UVO.setNombre(nombre);
                        UVO.setApellido(apellido);
                        UVO.setTipoDoc(tipoDoc);
                        UVO.setNumDoc(numDoc);
                        UVO.setCorreo(email);
                        UVO.setPassword(password);
                        UVO.setEstado(true);
                        listarUsuNequi(req, resp);
                    }
                        try 
                        {
                            UDAO.addUsuario(UVO);
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
        private void addUsuarioDavip(HttpServletRequest req, HttpServletResponse resp) 
        {
            try{
            // Traemos todos los datos desde la vista a variables
                String nombre=(req.getParameter("name"));
                String apellido=(req.getParameter("apellido"));
                String tipoDoc=(req.getParameter("tipoDoc")); 
                String numDoc=(req.getParameter("numDoc"));
                String email=(req.getParameter("email"));
                String password=(req.getParameter("password"));
                boolean activo=false;     
                if( nombre=="" || apellido=="" || tipoDoc=="" || numDoc=="" || email=="" || password=="" )
                {   
                    UVO.setNombre(null);
                    UVO.setApellido(null);
                    UVO.setTipoDoc(null);
                    UVO.setNumDoc(null);
                    UVO.setCorreo(null);
                    UVO.setPassword(null);
                    UVO.setEstado(activo);
                    System.out.println("Datos nulos");
                    listarUsuDavip(req, resp);
                }
                    else
                    {
                        UVO.setNombre(nombre);
                        UVO.setApellido(apellido);
                        UVO.setTipoDoc(tipoDoc);
                        UVO.setNumDoc(numDoc);
                        UVO.setCorreo(email);
                        UVO.setPassword(password);
                        UVO.setEstado(true);
                        listarUsuDavip(req, resp);
                    }
                        try 
                        {
                            UDAO.addUsuario(UVO);
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
        private void editUsuarioNequi(HttpServletRequest req, HttpServletResponse resp)
        {
            //String id2 =(req.getParameter("id"));
            int id = (Integer.parseInt(req.getParameter("id")));
            String nombre=(req.getParameter("name"));
            String apellido=(req.getParameter("apellido"));
            String tipoDoc=(req.getParameter("tipoDoc")); 
            String numDoc=(req.getParameter("numDoc"));
            String email=(req.getParameter("email"));
            String password=(req.getParameter("password"));
            String estadoVista=(req.getParameter("estado"));
            boolean estado=false;
            if(estadoVista.equalsIgnoreCase("activo"))
            {estado=true;}
            if(estadoVista.equalsIgnoreCase("inactivo"))
            {estado=false;}
            if( id<1 || nombre=="" || apellido=="" || tipoDoc=="" || numDoc=="" || email=="" || password=="")
            {                    
                UVO.setNombre(null);
                UVO.setApellido(null);
                UVO.setTipoDoc(null);
                UVO.setNumDoc(null);
                UVO.setCorreo(null);
                UVO.setPassword(null);
                UVO.setEstado(false);
                System.out.println("Datos nulos");
                listarUsuNequi(req, resp);
            }
                else if ( id==UVO.getId() && nombre==UVO.getNombre() && apellido==UVO.getApellido() && tipoDoc==UVO.getTipoDoc() && numDoc==UVO.getNumDoc() && email==UVO.getCorreo() && password==UVO.getPassword())
            {
                dashboardNequi(req, resp);
                System.out.println("No puedes actualizar datos con los mismos valores, primero modifica algo");
            }
            else
                {   
                    UVO.setId(id);
                    UVO.setNombre(nombre);
                    UVO.setApellido(apellido);
                    UVO.setTipoDoc(tipoDoc);
                    UVO.setNumDoc(numDoc);
                    UVO.setCorreo(email);
                    UVO.setPassword(password);
                    UVO.setEstado(estado);
                }
                    try 
                    {
                        UDAO.editarUsuario(UVO);
                        listarUsuNequi(req, resp);
                        System.out.println("Registro actualizado correctamente");
                    } 
                        catch (Exception e) 
                        {
                            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
                        }
        }
        private void editUsuarioDavip(HttpServletRequest req, HttpServletResponse resp)
        {
            int id = (Integer.parseInt(req.getParameter("id")));
            String nombre=(req.getParameter("name"));
            String apellido=(req.getParameter("apellido"));
            String tipoDoc=(req.getParameter("tipoDoc")); 
            String numDoc=(req.getParameter("numDoc"));
            String email=(req.getParameter("email"));
            String password=(req.getParameter("password"));
            String estadoVista=(req.getParameter("estado"));
            boolean estado=false;
            if(estadoVista.equalsIgnoreCase("activo"))
            {estado=true;}
            if(estadoVista.equalsIgnoreCase("inactivo"))
            {estado=false;}
            if( id<1 || nombre=="" || apellido=="" || tipoDoc=="" || numDoc=="" || email=="" || password=="")
            {                    
                UVO.setNombre(null);
                UVO.setApellido(null);
                UVO.setTipoDoc(null);
                UVO.setNumDoc(null);
                UVO.setCorreo(null);
                UVO.setPassword(null);
                UVO.setEstado(false);
                System.out.println("Datos nulos");
                listarUsuDavip(req, resp);
            }
                else if ( id==UVO.getId() && nombre==UVO.getNombre() && apellido==UVO.getApellido() && tipoDoc==UVO.getTipoDoc() && numDoc==UVO.getNumDoc() && email==UVO.getCorreo() && password==UVO.getPassword())
            {
                dashboardNequi(req, resp);
                System.out.println("No puedes actualizar datos con los mismos valores, primero modifica algo");
            }
            else
                {   
                    UVO.setId(id);
                    UVO.setNombre(nombre);
                    UVO.setApellido(apellido);
                    UVO.setTipoDoc(tipoDoc);
                    UVO.setNumDoc(numDoc);
                    UVO.setCorreo(email);
                    UVO.setPassword(password);
                    UVO.setEstado(estado);
                    listarUsuDavip(req, resp);
                }
                    try 
                    {
                        UDAO.editarUsuario(UVO);
                        listarUsuDavip(req, resp);
                        System.out.println("Registro actualizado correctamente");
                    } 
                        catch (Exception e) 
                        {
                            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
                        }
        }
        // Redirectors methods
        private void signUpNequi(HttpServletRequest req, HttpServletResponse resp) 
        {
            try{
                req.getRequestDispatcher("views/signup_nequi.jsp").forward(req, resp);
                System.out.println("El formulario ha sido abierto");
            }
                catch(Exception e)
            {
                System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
            }
        }
        private void signUpDavi(HttpServletRequest req, HttpServletResponse resp) 
        {
            try{
                req.getRequestDispatcher("views/signup_davip.jsp").forward(req, resp);
                System.out.println("El formulario ha sido abierto");
            }
                catch(Exception e)
            {
                System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
            }
        }
        private void index(HttpServletRequest req, HttpServletResponse resp) 
        {
            try{
                req.getRequestDispatcher("index.jsp").forward(req, resp);
                System.out.println("El formulario ha sido abierto");
            }
                catch(Exception e)
            {
                System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
            }
        }
        private void loginDaviP(HttpServletRequest req, HttpServletResponse resp) 
        
        {
            try{
                req.getRequestDispatcher("views/login_davip.jsp").forward(req, resp);
                System.out.println("El formulario ha sido abierto");
            }
                catch(Exception e)
            {
                System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
            }
        }
        private void loginNequi(HttpServletRequest req, HttpServletResponse resp) 
        {
            try{
                req.getRequestDispatcher("views/login_nequi.jsp").forward(req, resp);
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
        private void listarUsuNequi(HttpServletRequest req, HttpServletResponse resp) 
        {
        try{
            List usuario = UDAO.listar();
            req.setAttribute("usuarios", usuario);
            System.out.println("Datos listados correctamente");
            req.getRequestDispatcher("views/usuarios_nequi.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
            catch(Exception e)
        {
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }
        private void listarUsuDavip(HttpServletRequest req, HttpServletResponse resp) 
        {
        try{
            List usuario = UDAO.listar();
            req.setAttribute("usuarios", usuario);
            System.out.println("Datos listados correctamente");
            req.getRequestDispatcher("views/usuarios_davip.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }
            catch(Exception e)
        {
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }
  // private void verificarUsuario(HttpServletRequest req, HttpServletResponse resp)
        // {
        //     String email=(req.getParameter("email"));
        //     String password=(req.getParameter("password"));
        //     System.out.println("email vista " + email);
        //     System.out.println("password vista " + password);
        //     if(email=="" && password=="")
        //     {
        //         UVO.setCorreo(null);
        //         UVO.setPassword(null);  
        //     }
        //         else
        //         {
        //             UVO.setCorreo(email);
        //             UVO.setPassword(password);
        //         }
        //             try 
        //             {
        //                 int sesion = UDAO.verificarUsuario(UVO);
        //                 if (sesion==1)
        //                 {
        //                     dashboardNequi(req, resp);
        //                     System.out.println("Inicio de sesión exitoso");
        //                 }
        //                     else if (sesion==0)
        //                     {
        //                         index(req, resp);
        //                         System.out.println("Correo y/o password inválido");
        //                     }
        //                         else
        //                         {
        //                             System.out.println("error");
        //                         }
        //             } 
        //                 catch (Exception e) 
        //                 {
        //                     System.out.println("Error en el login " + e.getMessage().toString());
        //                 }
        // }
}