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
<body>
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
                                <li class="nav-item ">
                                        <a class="nav-link active" aria-current="page" href="bolsillo?petition=add_bol_nequi" >Crear bolsillo</a>
                                </li>
                        </ul>
                </div>
                </div>
        </nav>

<center><h1 style="margin-top: 2%; margin-bottom: 2%;">Listado de bolsillos Nequi</h1></center>
<center>
        <div class="container-md margin-top-5">
                <table class="table table-dark table-nequi">
                        <thead class="thead-usu ">
                                <tr class="bg-dark">
                                        <th scope="col">Id</th>
                                        <th scope="col">Saldo</th>
                                        <th scope="col">Nombre</th>
                                        <th scope="col">Estado</th>
                                        <th colspan="4" scope="col">opciones</th>
                                </tr>
                        </thead>
        </thead>    
        <tbody>
        <c:forEach var="bolsillos" items="${bolsillos}">         
        <form method="POST" action="bolsillo">
                <tr>
                                <th scope="row"><input type="number" name="id" value="${bolsillos.getId()}" hidden required>${bolsillos.getId()}</th>
                                <td><input type="number" name="saldo" value="${bolsillos.getSaldo()}" required></td>
                                
                                <td><input type="text" name="nombre" value="${bolsillos.getNombre()}" required/></td>
                        <c:if test="${bolsillos.isActivo() != true}">
                        </center>
                                <td>
                                        <select name="estado" id="estado"  class="select-nequi-edit" required>
                                        <option value="activo">activo</option>
                                        <option value="inactivo" selected>inactivo</option>
                                        </select>
                                </td> 
                        </center>
                        </c:if>
                        <c:if test="${bolsillos.isActivo() == true}">
                        </center>        
                                <td>
                                        <select name="estado" id="estado"  class="select-nequi-edit" required>
                                        <option value="activo"selected>activo</option>
                                        <option value="inactivo" >inactivo</option>
                                        </select>
                                </td>
                        </center>
                        </c:if>
                        <td >
                                <button type="submit" name="petition" value="editarBolNequi" style="
                                        background-color:#F23078;
                                        border: color #f2f2f2;;
                                        border-radius:0.3rem;
                                        color:white;
                                        ">editar
                                </button>
                        </td>
                </tr> 
        </form>
        </c:forEach>    
</tbody>
</table>
</div>
</center>
</body>
</html>
