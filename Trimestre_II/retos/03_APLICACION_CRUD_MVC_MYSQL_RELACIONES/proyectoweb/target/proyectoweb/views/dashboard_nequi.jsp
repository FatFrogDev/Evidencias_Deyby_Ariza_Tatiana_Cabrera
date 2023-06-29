<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
        <link rel="stylesheet" href= "assets/css/index.css">
    <title>Bolsillo digital</title>
</head> 
<body onload="AvisoInicio()">
    <nav class="navbar navbar-expand-md bg-light" id="nav"  style="background-color: #131240 !important;">
        <div class="container-fluid">
            <button class="navbar-toggler" id="collapse-btn" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-menu">Menú</span>
            </button>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                <a class="nav-link nav nav-title disabled" href="usuario?petition=index">Billetera digital</a>
                <ul class="navbar-nav d-flex justify-content-center align items-center">
                <li class="nav-item ">
                    <a class="nav-link active" aria-current="page" href="usuario?petition=index" >Inicio</a>
                </li>
            <!-- OPCIONAL -->
                <li class="nav-item ">
                    <a class="nav-link active" aria-current="page" href="usuario?petition=listar_usu_nequi" >Ver/editar usuarios</a>
                </li>
                <li class="nav-item ">
                    <a class="nav-link active" aria-current="page" href="bolsillo?petition=listar_bol_nequi">Ver/editar bolsillos</a>
                </li>
            <!--  -->
                </ul>
            </div>
        </div>
    </nav>



<div class="container container-cards">
            <div class="row">
                <div class="col-lg card-col">
                    <div class="card align-items-center justify-content-center align-items-center">
                        <h5 class="card-title" style="color: #F23078 !important;">Consulta tu saldo</h5>
                        <div class="card-body">
                        <p class="card-text">Dando clic en el botón de abajo podrás consultar cuánto dinero tienes en tu bolsillo ahora mismo.</p>
                        <div class="row">
                    <!-- VENTANA MODAL CONSULTA SALDO -->
                            <button type="button" class="btn  card-btn-nequi" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                Consultar
                            </button>
                            
                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Consulta dinero</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <p>Tu saldo actual es: 
                                            <%=request.getAttribute("saldoVista")%> 
                                        </p>
                                    </div>
                                    <div class="modal-footer">
        
                                    <!-- <input type="text" style="color:#000000;"hidden name="consulta"/> -->     
                                    <button class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>

                                    </div>
                                </div>
                                </div>
                            </div>
                        <!-- VENTANA MODAL CONSULTA SALDO -->        
                    </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg card-col">
                    <div class="card align-items-center justify-content-center align-items-center">
                        <h5 class="card-title" style="color: #F23078 !important;">Retira dinero</h5>
                        <div class="card-body">
                        <p class="card-text">Retira dinero de tu bolsillo, podrás recibir el dinero en cualquiera de nuestos puntos físicos</p>
                        <div class="row">
                    <!-- VENTANA MODAL RETIRO SALDO -->
                            <button type="button" class="btn  card-btn-nequi" data-bs-toggle="modal" data-bs-target="#exampleModal-2">
                                Retira
                            </button>
                            
                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal-2" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Retira dinero</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form action="bolsillo" method="POST">
                                                <p>Ingresa la cantidad que deseas retirar aquí.</p>
                                                <p>Tienes 
                                                    <%=request.getAttribute("saldoVista")%> 
                                                    dinero
                                                </p>
                                                <input type="number" name="idUsuario" hidden value="<%=(String)session.getAttribute("IdUsuarioNequi")%>">
                                                
                                                <input type="number" name="saldo" hidden value="<%=request.getAttribute("saldoVista")%>">
                                                
                                                <input type="number" name="retiro" style="color:#000000 !important;"/>
                                            </div>
                                            <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                            <div class="row">
                                                <button type="submit" name="petition" value="retiroNequi">Aceptar</button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                                </div>
                            </div>
                        <!-- VENTANA MODAL RETIRO SALDO -->        
                    </div>
                </div>
            </div>
            
            
        </div>
        <div class="container container-cards">
            <div class="row">
                <div class="col-lg card-col">
                    <div class="card align-items-center justify-content-center align-items-center" style="margin-top: 2%;">
                        <h5 class="card-title" style="color: #F23078 !important;">Recarga tu bolsillo</h5>
                        <div class="card-body">
                        <p class="card-text">Acá puedes meterle plata a tu bolsillo desde otros bancos, sus apps y medios, o por medios de pago en línea, tales como pse, claro pay, rappi pay entre otros</p>
                        <div class="row">
                            <!-- VENTANA MODAL RETIRO SALDO -->
                                    <button type="button" class="btn card-btn-nequi" data-bs-toggle="modal" data-bs-target="#exampleModal-3">
                                        Recarga
                                    </button>
                                    
                                    <!-- Modal -->
                                    <div class="modal fade" id="exampleModal-3" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                        <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Recarga bolsillo</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                            </div>
                                            <div class="modal-body">
                                                <form action="bolsillo" method="POST">
                                                    <p>Ingresa la cantidad que deseas recargar aquí.</p>
                                                    <p>Tienes 
                                                        <%=request.getAttribute("saldoVista")%> 
                                                        dinero
                                                    </p>
                                                    <input type="number" name="idUsuario" hidden value="<%=(String)session.getAttribute("IdUsuarioNequi")%>">
                                                    
                                                    <input type="number" name="saldo" hidden value="<%=request.getAttribute("saldoVista")%>">
                                                    
                                                    <input type="number" name="recarga" style="color:#000000 !important;"/>
                                            </div>
                                            <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                            <div class="row">
                                                <button type="submit" name="petition" value="recargaNequi">Aceptar</button>
                                                </form>
                                            </div>
                                            </div>
                                        </div>
                                        </div>
                                    </div>
                                <!-- VENTANA MODAL RETIRO SALDO -->        
                            </div>
                        </div>
                    </div>
</div>
  
<script>
    function AvisoInicio()
    {
        var myModal = new bootstrap.Modal(document.getElementById('staticBackdrop'))
        myModal.show()
    };
    
</script>

    <!-- Button trigger modal -->
    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
        Launch static backdrop modal
    </button>
        
        <!-- Modal -->
        <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
            <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="staticBackdropLabel">¡Aviso!</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    Para ver aplicada cada transacción, deberás iniciar sesión nuevamente, lamentamos las molestias
                </div>
                <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                <button type="button" class="btn btn-primary">Entendido</button>
                </div>
            </div>
            </div>
        </div>

</body>
</html> 