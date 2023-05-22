<!DOCTYPE html>
<html lang="es">
<head>
  <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="assets/index.css">
    <title>Bolsillo digital</title>
</head> 
<body>
<nav class="navbar navbar-expand-md bg-light" id="nav">
  <div class="container-fluid">
    <button class="navbar-toggler" id="collapse-btn" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-menu">Menú</span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
      <a class="nav-link nav nav-title disabled" href="route?vista=index">Billetera digital</a>
      <ul class="navbar-nav d-flex justify-content-center align items-center">
        <li class="nav-item ">
          <a class="nav-link active" aria-current="page" href="route?vista=index" >Inicio</a>
        </li>
        <li class="nav-item ">
            <a class="nav-link active" aria-current="page" href="route?vista=login_davip" >Inicia sesión</a>
          </li>
      </ul>
    </div>
  </div>
</nav>

      <div class="container-sm d-flex container-login">
          <div class=" container-fluid container-login-title">Registro</div>
              <div class="container-login-content">

                <label for="" class="label-login-form">Nombre/s</label>
                <input type="text" class="davi-input" syle="color:#0000" name="" id=""/>
                <label for="" class="label-login-form">Apellido/s</label>
                <input type="text" syle="color:#0000" class="davi-input" name="" id=""/>
                <label for="" class="label-login-form">Tipo de documento</label>
                <select name="" id="">
                    <option value="">Tarjeta de identidad</option>
                    <option value="">Cédula de ciudadanía</option>
                    <option value="">Pasaporte</option>
                    <option value="">Contraseña</option>
                    <option value="">Cédula de extranjería  </option>
                </select>
                <label for="" class="label-login-form">Número de documento</label>
                <input type="number"class="davi-input" name="" id=""/>
              <label for="" class="label-login-form">Correo</label>
              <input type="email"class="davi-input" name="" id="" placeholder="email@example.com" />
              <label for="" class="label-login-form">Contraseña</label>
              <input type="password" id="pass">
              <button class="button-login">Ingresa</button>
              <p class="container-login-p">¿Ya tienes cuenta?</p>
              <a href="route?vista=login_davip" class="a">Inicia sesión</a>
          </div>
        </div>

<footer class="footer">
        <div class="container">
                <div class="footer-header">
                            <div class="container-logo">
                            <p class="p" style="color:#F2F2F2;">Bolsillo digital</p>
                            </div>
                                <div class="options">
                                <a href="route?vista=index"class="a">Inicio</a>
                                <a href="route?vista=signup_davip"class="a">Registro</a>
                </div>
                    </div>
            <div class="content">
                <div class="contact">
                    <p class="title">¡Contáctanos!</p>
                    <b class="p-content">Teléfono</b>
                    <p class="p-content">1234567890</p>
                    <p class="p-content">Email de contacto</p>
                   <p class="p-content">bolsillo@digital.com</p>
                   <p class="title">Redes Sociales:</p>
                   <a href="https://www.facebook.com/" class="link">Facebook</a>
                   <a href="https://www.instagram.com/" class="link">Instagram</a>
                   <a href="https://www.twitter.com/" class="link">Twitter</a>
                   <a href="https://www.youtube.com/" class="link">YouTube</a>
                   <p class="copy">Todos los derechos reservados Bolsillo digital &copy; 2023</p>
                </div>
            </div>
            </footer>
</body>
</html>