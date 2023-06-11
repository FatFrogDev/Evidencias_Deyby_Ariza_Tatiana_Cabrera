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
  <nav class="navbar navbar-expand-md bg-light" id="nav">
    <div class="container-fluid">
      <button class="navbar-toggler" id="collapse-btn" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-menu">Menú</span>
      </button>
      <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <a class="nav-link nav nav-title disabled" href="usuario?petition=index">Billetera digital</a>
        <ul class="navbar-nav d-flex justify-content-center align items-center">
          <li class="nav-item ">
            <a class="nav-link active" aria-current="page" href="usuario?petition=index" >Inicio</a>
        </ul>
      </div>
    </div>
  </nav>
        <center><h1 style="margin-top: 2%; margin-bottom: 2%;">Listado de usuarios Davi plata</h1></center>
<center>
        <div class="container-md margin-top-5">
                <table class="table table-davip">
                        <thead class="thead-usu ">
                                <tr class="bg-dark">
                                        <th scope="col">Id</th>
                                        <th scope="col">Nombre/s</th>
                                        <th scope="col">Apellido/s</th>
                                        <th scope="col">tipoDoc</th>
                                        <th scope="col">numDoc</th>
                                        <th scope="col">Correo</th>
                                        <th scope="col">Contraseña</th>
                                        <th scope="col">Estado</th>
                                        <th colspan="4" scope="col">opciones</th>
                                </tr>
                        </thead>
        </thead>    
        <tbody>
        <c:forEach var="usuarios" items="${usuarios}">         
        <form method="POST" action="usuario">
                <tr>
                                <th scope="row"><input type="number" name="id" value="${usuarios.getId()}" style="color:#000000;" hidden>${usuarios.getId()}</th>
                                <td><input type="text" name="name" value="${usuarios.getNombre()}" style="color:#000000;" required/></td>
                                
                                <td><input type="text" name="apellido" value="${usuarios.getApellido()}" style="color:#000000;" required/></td>
                                <display:column>
                                <td>
                                        <select name="tipoDoc" id="tipoDoc" class="select-davip-edit" required >
                                                <c:choose>
                                                        <c:when test="${usuarios.getTipoDoc().equals('TI')}">
                                                                <option value="TI" selected>Tarjeta de identidad</option>
                                                                <option value="CC">Cédula de ciudadanía</option>
                                                                <option value="P">Pasaporte</option>
                                                                <option value="C">Contraseña</option>
                                                                <option value="CE">Cédula de extranjería</option>
                                                        </c:when>
                                                        <c:when test="${usuarios.getTipoDoc().equals('CC')}">
                                                                <option value="TI">Tarjeta de identidad</option>
                                                                <option value="CC" selected>Cédula de ciudadanía</option>
                                                                <option value="P">Pasaporte</option>
                                                                <option value="C">Contraseña</option>
                                                                <option value="CE">Cédula de extranjería</option>
                                                        </c:when>
                                                        <c:when test="${usuarios.getTipoDoc().equals('P')}">
                                                                <option value="TI">Tarjeta de identidad</option>
                                                                <option value="CC">Cédula de ciudadanía</option>
                                                                <option value="P" selected>Pasaporte</option>
                                                                <option value="C">Contraseña</option>
                                                                <option value="CE">Cédula de extranjería</option>
                                                        </c:when>
                                                        <c:when test="${usuarios.getTipoDoc().equals('C')}">
                                                                <option value="TI">Tarjeta de identidad</option>
                                                                <option value="CC">Cédula de ciudadanía</option>
                                                                <option value="P">Pasaporte</option>
                                                                <option value="C" selected>Contraseña</option>
                                                                <option value="CE">Cédula de extranjería</option>
                                                        </c:when>
                                                        <c:when test="${usuarios.getTipoDoc().equals('CE')}">
                                                                <option value="TI">Tarjeta de identidad</option>
                                                                <option value="CC">Cédula de ciudadanía</option>
                                                                <option value="P">Pasaporte</option>
                                                                <option value="C">Contraseña</option>
                                                                <option value="CE" selected>Cédula de extranjería</option>
                                                        </c:when>
                                                        <c:otherwise>Error</c:otherwise>
                                                </c:choose>
                                        </select>    
                                </td>
                        </display:column>
                                <td><input type="text" name="numDoc" value="${usuarios.getNumDoc()}" style="color:#000000" required/></td>

                                <td><input type="email" class="email-table-davip" name="email" value="${usuarios.getCorreo()}" style="color:#000000" required/></td>
                                
                                <td><input type="text" name="password" value="${usuarios.getPassword()}" style="color:#000000;" required/></td>
                        <c:if test="${usuarios.isEstado() != true}">
                                <td>
                                        <select name="estado" id="estado" class="select-davip-edit" required>
                                        <option value="activo">activo</option>
                                        <option value="inactivo" selected>inactivo</option>
                                        </select>
                                </td> 
                        </c:if>
                        <c:if test="${usuarios.isEstado() == true}">
                                <td>
                                        <select name="estado" id="estado" class="select-davip-edit" required>
                                        <option value="activo"selected>activo</option>
                                        <option value="inactivo" >inactivo</option>
                                        </select>
                                </td> 
                        </c:if>
                        <td >
                                <button type="submit" name="petition" value="editUsuarioDavip " style="
                                background: color #f2f2f2;;
                                text-align: center;
                                border: color #ffffff;
                                border-radius:0.3rem;
                                color: #000000;;
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
