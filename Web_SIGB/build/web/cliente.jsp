<%-- 
    Document   : cliente
    Created on : 24-sep-2020, 8:32:48
    Author     : Grelvin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!--CSS-->
        <link rel="stylesheet" href="style.css">

        <link href="https://fonts.googleapis.com/css2?family=Secular+One&display=swap" rel="stylesheet"> 

        <title>Biblioteca Municipal Isaac Felipe Azofeifa</title>
    </head>
    <body>
        <div class="box-area">
            <header>
                <div class="wrapper">
                    <div class="logo">
                        <a href="#">Biblioteca Municipal Isaac Felipe Azofeifa</a>
                    </div>
                    <nav>
                        <a href="index.html">Salir</a>
                        <a href="#">Búsqueda</a>
                        <a href="#">Servicios</a>
                        <a href="#">Préstamos</a>
                        <a href="http://www.santodomingo.go.cr/">Municipalidad</a>
                        <a href="#">Contacto</a>
                    </nav>
                </div>
            </header>
            <div class="content-area">
                <div class="wrapper">
                    <p>Aquí va el contenido</p>
                </div>
            </div>
        </div>

        <div class="login-form">
            <div class="form">
                <div class="close" onclick="LoginToggle()">&times;</div>
                <div class="text">
                    <h1>Inicio de Sesión</h1>
                </div>
                <form action="#">
                    <input type="text" placeholder="Cédula">
                    <input type="password" placeholder="Contraseña">
                    <input type="submit" value="Iniciar" class="iniciar">
                    <a href="formulario-registro.html">Regístrese aquí</a>
                </form>
            </div>
        </div>
        <script>
            function LoginToggle() {
                var container = document.querySelector('.box-area');
                container.classList.toggle('active');
                var popup = document.querySelector('.login-form');
                popup.classList.toggle('active');
            }
        </script>
    </body>
</html>
