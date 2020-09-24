<%-- 
    Document   : formulario-registro
    Created on : 24-sep-2020, 2:41:26
    Author     : Grelvin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <link rel="stylesheet" href="formulario-registro.css">

    <script src="https://kit.fontawesome.com/e4e707e655.js" crossorigin="anonymous"></script>

    <script src="formulario-registro.js" type="text/javascript"></script>

    <title>Registro</title>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>Crear Cuenta</h2>
        </div>

        <form class="form" id="form">
            <div class="form-control">
                <label for="nombre">Nombre</label>
                <input type="text" placeholder="Ej. Juan" id="nombre">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="apellido">Apellido</label>
                <input type="text" placeholder="Ej. Alvarado" id="apellido">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="cedula">Cédula</label>
                <input type="text" placeholder="Ej. 402318930" id="cedula">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="correo">Correo</label>
                <input type="email" placeholder="Ej. ana@gmail.com" id="correo">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="fecha-naci">Fecha de Nacimiento</label>
                <input type="date" id="fecha-naci">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="telefono">Telefono</label>
                <input type="text" placeholder="Ej. 88888888" id="telefono">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="direccion">Dirección</label>
                <input type="text" placeholder="Ej. Santo Domingo, 100 metros sur del parque central" id="direccion">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="contraseña">Contraseña</label>
                <input type="password" placeholder="Contraseña" id="contraseña">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>        

            <div class="form-control">
                <label for="contraseña-2">Confirmar Contraseña</label>
                <input type="password" placeholder="Confirmar contraseña" id="contraseña-2">
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div> 

            <button>Registrar</button>
        </form>
    </div>
</body>
</html>
