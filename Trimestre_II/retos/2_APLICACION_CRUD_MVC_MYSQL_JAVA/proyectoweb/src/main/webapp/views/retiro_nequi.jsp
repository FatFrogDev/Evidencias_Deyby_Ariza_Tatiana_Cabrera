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
  <nav class="navbar navbar-expand-md bg-light" id="nav" style="background-color: #131240 !important;">
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

<div class="container container-cards justify-content-center align-items-center">
  <div class="col-lg card-col">
      <div class="card align-items-center justify-content-center align-items-center" style="margin-top: 2%;">
              <h5 class="card-title" >Tu saldo actual es:</h5>
              <div class="card-body">
                <p> Tu saldo previo era de: <%=request.getAttribute("saldoPrevio")%></p>
                <p>El saldo final es: <%=request.getAttribute("saldoFinal")%><p>
            </div>
      </div>
  </div>
</div>

</body>
</html>



