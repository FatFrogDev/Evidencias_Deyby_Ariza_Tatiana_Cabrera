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
    <!-- <%= new String("Hola mundo").toUpperCase() %> -->
</head> 
    <body>
    <nav class="navbar navbar-expand-md bg-light" id="nav">
        <div class="container-fluid">
            <button class="navbar-toggler" id="collapse-btn" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-menu">Menú</span>
            </button>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                <a class="nav-link nav nav-title disabled" href="index.jsp">Billetera digital</a>
                <ul class="navbar-nav d-flex justify-content-center align items-center">
                    <li class="nav-item ">
                        <a class="nav-link active" aria-current="page" href="#nosotros" >Nosotros</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link  " href="#benefits" tabindex="-1" aria-disabled="true">Beneficios</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link  " href="#signup" tabindex="-1" aria-disabled="true">¡Únete!</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <!-- <p>
        <%
        for(int i=0;i<4;i++){
        out.println("<BR>Iteración "+i);
        }
        %>
    </p>
    <%!
    private int res;

    public int sumar(int n1,int n2){
    res=n1+n2;
    return res;
    }
    %>
    <p> el resultado de la suma es: <%= sumar(15,25) %></p> -->
        </div>
                <main class="container justify-content-start align-items-center" style="margin-top: 5%;" id="nosotros">
                    <h3 class="main-title">Nosotros</h3>
                    <p>Tu bolsillo digital es es una herramienta virtual que te ofrecen algunos bancos para que puedas ahorrar siguiendo tu propia periodicidad y disponer del dinero en el momento deseado. Además, no te cobramos por utilizarla. Aquí podrás recargar, consultar y retirar el dinero que tengas en tu bolsillo digital, ¡anímate a probarla!</p>
            </main>
        <section>
        </div>
            <div class="container container-cards">
                <div class="row">
                    <div class="col-lg card-col">
                        <div class="card align-items-center justify-content-center align-items-center">
                            <img src="assets/img/daviplata-logo.png" class="card-img-top" alt="Logo daviplata">
                            <div class="card-body">
                            <h5 class="card-title" >Davi plata</h5>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore laborum minus aperiam aliquid eius! Quaerat, fuga? Itaque reprehenderit animi molestiae, voluptate fuga illo quidem veritatis tenetur perferendis id sit, quis consectetur deleniti laudantium atque libero laboriosam quos aperiam ex blanditiis consequuntur cupiditate dolor? Provident, dignissimos dicta officiis tempora iste similique!</p>
                        <div class="row">
                            <a href="#benefits" class="btn card-btn">Conoce más</a>
                        </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg card-col">

                        <div class="card align-items-center justify-content-center">
                            <img src="assets/img/nequi-logo.png" class="card-img-top" alt="Logo nequi">
                            <div class="card-body">
                            <h5 class="card-title" >Nequi</h5>
                            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore laborum minus aperiam aliquid eius! Quaerat, fuga? Itaque reprehenderit animi molestiae, voluptate fuga illo quidem veritatis tenetur perferendis id sit, quis consectetur deleniti laudantium atque libero laboriosam quos aperiam ex blanditiis consequuntur cupiditate dolor? Provident, dignissimos dicta officiis tempora iste similique!</p>
                            <div class="row">
                                <a href="#benefits" class="btn card-btn">Conoce más</a>
                            </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="container justify-content-start align-items-center" id="benefits">
            <h3 id="benefits" style="color: #ff0000;">Beneficios</h3>
            <p>Hasta 50% de descuento en temporadas especiales</p>
            <p>Hasta 25% de cashback en tiendas afiliadas</p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ratione, aliquid.</p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ratione, aliquid.</p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ratione, aliquid.</p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ratione, aliquid.</p>
        </section>

        <section class="container justify-content-start align-items-center" id="signup">
            <div class="col-lg card-col">
                <div class="card align-items-center justify-content-center align-items-center">
                    <div class="card-body">
                        <h5 class="card-title">Regístrate</h5>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore laborum minus aperiam aliquid eius! Quaerat, fuga? Itaque reprehenderit animi molestiae, voluptate fuga illo quidem veritatis tenetur perferendis id sit, quis consectetur deleniti laudantium atque libero laboriosam quos aperiam ex blanditiis consequuntur cupiditate dolor? Provident, dignissimos dicta officiis tempora iste similique!</p>
                <div class="row">
                    <a href="route?vista=signup_nequi" class="btn card-btn">Registro Nequi</a>
                    <a href="route?vista=signup_davip" class="btn card-btn">Registro Davi plata</a>
                </div>
        </section>
        <section class="container justify-content-start align-items-center" id="login">
            <div class="col-lg card-col">
                <div class="card align-items-center justify-content-center align-items-center">
                    <div class="card-body">
                    <h5 class="card-title">¿Ya tienes cuenta?</h5>
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore laborum minus aperiam aliquid eius! Quaerat, fuga? Itaque reprehenderit animi molestiae, voluptate fuga illo quidem veritatis tenetur perferendis id sit, quis consectetur deleniti laudantium atque libero laboriosam quos aperiam ex blanditiis consequuntur cupiditate dolor? Provident, dignissimos dicta officiis tempora iste similique!</p>
                <div class="row">
                    <a href="route?vista=login_nequi" class="btn card-btn">Inicia sesión Nequi</a>
                    <a href="route?vista=login_davip" class="btn card-btn">Inicia sesión Davi plata</a>
                </div>
        </section>
        <footer class="footer">
            <div class="container">
                    <div class="footer-header">
                        <div class="container-logo">
                        <p class="p" style="color:#F2F2F2;">Bolsillo digital</p>
                    </div>
                        <div class="options">
                        <a href="#nosotros"class="a">Inicio</a>
                        <a href="route?vista=login"class="a">Registro</a>
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