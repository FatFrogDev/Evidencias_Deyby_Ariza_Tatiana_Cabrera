import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import methods.*;

public class Route extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
    {
        // Agarramos la solitud get y acorde a ella, realizamos el redireccionamiento.
        String vista = req.getParameter("vista");
        // Imprimimos la solicitud en consola.
        System.out.println(vista);
        switch(vista)
        {
                // Gestionador de rutas
            case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "login_davip":
                req.getRequestDispatcher("login_davip.jsp").forward(req, resp);
            break;
            case "login_nequi":
                req.getRequestDispatcher("login_nequi.jsp").forward(req, resp);
            break;
            case "signup_davip":
                req.getRequestDispatcher("signup_davip.jsp").forward(req, resp);
            break;
            case "signup_nequi":
                req.getRequestDispatcher("signup_nequi.jsp").forward(req, resp);
            break;
            case "dashboard_davip":
                req.getRequestDispatcher("dashboard_davip.jsp").forward(req, resp);
            break;
            case "dashboard_nequi":
                req.getRequestDispatcher("dashboard_nequi.jsp").forward(req, resp);
            break;
            default:
                System.out.println();
            break;
        }  
    }
    // Atributo "saldito" creado para el ejercicio en clase "2023/18/05"
    // double saldito=0;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String accion=req.getParameter("accion");
        System.out.println(accion);
            switch(accion)
            {
                // ejecución validar login.
        case"validar_login_nequi":
            // Establecemos atributos
            // Establecemos verificarNequi para evaluarlo con el operador lógico if.
            boolean verificarNequi;
            String emailNequi=req.getParameter("email");
            String passNequi=req.getParameter("pass");
            // Creamos el objeto para validar nequi
            User usuarioNequi = new User(emailNequi, passNequi);
            verificarNequi = usuarioNequi.validarLogin(emailNequi, passNequi);
            if(verificarNequi==true)
            {
                System.out.println("Login nequi exitoso.");
                req.setAttribute("nombre", usuarioNequi.getNombre());
                req.setAttribute("banco", usuarioNequi.getBanco());
                req.getRequestDispatcher("dashboard_nequi.jsp").forward(req, resp);
            }
            else
            {
                System.out.println("Error verificando login intenta nuevamente");
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        break; 
        case"validar_login_davip":
            // Establecemos atributos
            // Establecemos verificarNequi para evaluarlo con if.
            boolean verificarDavi;
            String emailDavi=req.getParameter("email");
            String passDavi=req.getParameter("pass");
            // Creamos el objeto para validar nequi
            User usuarioDavi = new User(emailDavi, passDavi);
            verificarDavi = usuarioDavi.validarLogin(emailDavi, passDavi);
            if(verificarDavi==true)
            {
                System.out.println("Login nequi exitoso.");
                req.setAttribute("nombre", usuarioDavi.getNombre());
                req.setAttribute("banco", usuarioDavi.getBanco());
                req.getRequestDispatcher("dashboard_davip.jsp").forward(req, resp);
            }
            else
            {
                System.out.println("Error verificando login davi intenta nuevamente");
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        break; 
                // ejecución consulta
        case"consulta_nequi":
                // Creqamos el objeto nequi para la consulta
            Nequi nequiConsulta=new Nequi();
                // Establecemos los atributos para acceder a ellos en la vista consulta . 
            req.setAttribute("saldo", nequiConsulta.getSaldo());
                // Despachamos la vista al resultado.
            req.getRequestDispatcher("consulta_nequi.jsp").forward(req, resp);
                // Imprimimos resultados en consola.
            System.out.println("Tu saldo es de:" + nequiConsulta.getSaldo());
            break;    
            case"consulta_davip":
                // Creqamos el objeto nequi para la consulta
            Daviplata daviplataConsulta=new Daviplata();
                // Establecemos los atributos para acceder a ellos en la vista consulta . 
            req.setAttribute("saldo_davip", daviplataConsulta.getSaldo());
                // Despachamos la vista al resultado.
            req.getRequestDispatcher("consulta_davip.jsp").forward(req, resp);
                // Imprimimos resultados en consola.
            System.out.println("Tu saldo es de:" + daviplataConsulta.getSaldo());
        break;          
        case "recarga_nequi":

        //Ejercicio clase sin objerto para recarga
            //    double recarga=Double.parseDouble(req.getParameter("saldo"));
            //    saldito+=recarga;
            //    req.setAttribute("saldoPrevioRecarga", recarga);
            //    req.setAttribute("saldo", saldito);
            //    req.getRequestDispatcher("recarga_nequi.jsp").forward(req, resp);
        // Método implementando instancia de clase (objeto).
                // Creqamos el objeto nequi para la recarga
            Nequi nequiRecarga=new Nequi();
                // Definimos variables para establecer en la vista recarga.
            double saldoRecargaNequi=Double.parseDouble(req.getParameter("saldo"));
                // Establecemos los atributos para acceder a ellos en la vista recarga. 
            req.setAttribute("saldoPrevioRecarga", nequiRecarga.getSaldo());
            System.out.println("Tu saldo previo era: " + nequiRecarga.getSaldo());
                // Usamos los métodos.
            nequiRecarga.recargar(saldoRecargaNequi);
                // Despachamos la vista al resultado y establecemos el atributo saldo a la vista. 
            req.setAttribute("saldo", nequiRecarga.getSaldo());
            req.getRequestDispatcher("recarga_nequi.jsp").forward(req, resp);
                // Imprimimos resultados en consola.
            System.out.println("Tu actual es:" + nequiRecarga.getSaldo());
        break;
                //  
        case "recarga_davip":
                // Creqamos el objeto nequi para la recarga
            Daviplata daviplataRecarga=new Daviplata();
                // Definimos variables para establecer en la vista recarga.
            double saldoRecargaDaviplata=Double.parseDouble(req.getParameter("saldo"));
                // Establecemos los atributos para acceder a ellos en la vista recarga. 
            req.setAttribute("saldoPrevioRecarga", daviplataRecarga.getSaldo());
            System.out.println("Tu saldo previo era: " + daviplataRecarga.getSaldo());
                // Usamos los métodos.
            daviplataRecarga.recargar(saldoRecargaDaviplata);
                // Despachamos la vista al resultado y establecemos el atributo saldo a la vista. 
            req.setAttribute("saldo", daviplataRecarga.getSaldo());
            req.getRequestDispatcher("recarga_davip.jsp").forward(req, resp);
                // Imprimimos resultados en consola.
            System.out.println("Tu actual es:" + daviplataRecarga.getSaldo());
        break; 
        case "retiro_nequi":
                // Creqamos el objeto nequi el retiro.
            Nequi nequiRetiro=new Nequi();
                // Definimos variables para establecer en la vista recarga.
            double saldoRetiroNequi=Double.parseDouble(req.getParameter("retiro"));
            double saldoPrevioRetiro=nequiRetiro.getSaldo();
            req.setAttribute("saldoPrevio", saldoPrevioRetiro);
                // Comprobamos la validación del retiro, ejecutamos sentencias para cada caso.
            if(nequiRetiro.verificarRetiro(saldoRetiroNequi)==true)
            {
                nequiRetiro.retirar(saldoRetiroNequi);
                    // Establecemos saldo final, para un resultado previo y final.
                req.setAttribute("saldoFinal", nequiRetiro.getSaldo());
                    // Despachamos la vista al resultado.
                req.getRequestDispatcher("retiro_nequi.jsp").forward(req, resp);
                    // Imprimimos resultados en consola.
                System.out.println("Saldo previo "+ saldoPrevioRetiro);
                System.out.println("Saldo final " + nequiRetiro.getSaldo());
            }
                else if(nequiRetiro.verificarRetiro(saldoRetiroNequi)==false)
                {
                    System.out.println("Transacción inválida (route).");
                    req.setAttribute("saldoFinal", "oops, no puedes retirar más de lo que tienes, o todo lo que tienes, intenta nuevamente.");
                    req.getRequestDispatcher("retiro_nequi.jsp").forward(req, resp);
                }
                    else
                    {
                        System.out.println("Error (route).");
                    }
        break;
        case "retiro_davip":
                // Creqamos el objeto nequi para el retiro.
            Daviplata daviplataRetiro=new Daviplata();
                // Definimos variables para establecer en la vista recarga.
            double saldoRetiroDaviplata=Double.parseDouble(req.getParameter("retiro"));
            System.out.println("Saldo previo "+ daviplataRetiro.getSaldo());
            req.setAttribute("saldoPrevio", daviplataRetiro.getSaldo());
                // Comprobamos la validación del retiro, ejecutamos sentencias para cada caso.
            if(daviplataRetiro.verificarRetiro(saldoRetiroDaviplata)==true)
            {
                daviplataRetiro.retirar(saldoRetiroDaviplata);
                    // Establecemos saldo final, para un resultado previo y final.
                req.setAttribute("saldoFinal", daviplataRetiro.getSaldo());
                    // Despachamos la vista al resultado.
                req.getRequestDispatcher("retiro_davip.jsp").forward(req, resp);
                    // Imprimimos resultados en consola.
                System.out.println("Saldo final " + daviplataRetiro.getSaldo());
            }
                // En caso de invalidar el retiro, informamos mediante la vista.
                else if(daviplataRetiro.verificarRetiro(saldoRetiroDaviplata)==false)
                {
                    System.out.println("Transacción inválida (route).");
                    req.setAttribute("saldoFinal", "oops, no puedes retirar más de lo que tienes, o todo lo que tienes, intenta nuevamente.");
                    req.getRequestDispatcher("retiro_davip.jsp").forward(req, resp);
                }
                    else
                    {
                        System.out.println("Error (route)");
                    }
            break;
            // Excepción
            default:
            System.out.println("Error accion (route)");
            break;  
            }
        }
        
    }