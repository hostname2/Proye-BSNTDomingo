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
    <link href="css/formulario-registro.css" rel="stylesheet" type="text/css"/>

    <link rel="stylesheet" href="formulario-registro.css">

    <script src="js/verificacionCampos.js" type="text/javascript"></script>
    <script src="https://kit.fontawesome.com/e4e707e655.js" crossorigin="anonymous"></script>

    

    <title>Registro</title>
</head>
<body>
    <div class="container">
        <div class="header">
            <h2>Crear Cuenta</h2>
        </div>

        <form class="form" id="form" action="ServletRegistroUser" method="POST" onSubmit="return validarPasswd('contrasena', 'contrasena2', 'form')">
            <div class="form-control">
                <label for="nombre">Nombre</label>
                <input type="text" placeholder="Ej. Juan" id="nombre" name="nombre" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="apellido">Primer Apellido</label>
                <input type="text" placeholder="Ej. Alvarado" id="apellido" name="apellido1" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>
            <div class="form-control">
                <label for="apellido2">Segundo Apellido</label>
                <input type="text" placeholder="Ej. Flores" id="apellido2" name="apellido2"required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="cedula">Cédula</label>
                <input type="text" placeholder="Ej. 402318930" id="cedula" name="cedula" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="correo">Correo</label>
                <input type="email" placeholder="Ej. ana@gmail.com" id="correo" name="correo" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="fechanaci">Fecha de Nacimiento</label >
                <input type="date" id="fechanaci" name="fechanaci" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="telefono">Telefono</label>
                <input type="text" placeholder="Ej. 88888888" id="telefono"  name="telefono" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="direccion">Dirección</label>
                <input type="text" placeholder="Ej. Santo Domingo, 100 metros sur del parque central" id="direccion" name="direccion" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>

            <div class="form-control">
                <label for="contrasena">Contraseña</label>
                <input type="password" maxlength="16" placeholder="Contraseña" id="contrasena" name="contrasena" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" title=" La contraseña debe contener al menos un número, una letra mayuscula y una letra en minuscula, y con una longitud mínima de 8 simbolos y maxima de 16" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div>        

            <div class="form-control">
                <label for="contrasena2">Confirmar Contraseña</label>
                <input type="password" maxlength="16" placeholder="Confirmar contraseña" id="contrasena2" name="contrasena2" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" title=" La contraseña debe contener al menos un número o un simbolo, una letra mayuscula y una letra en minuscula, y con una longitud mínima de 8 simbolos y maxima de 16" required>
                <i class="fas fa-check-circle"></i>
                <i class="fas fa-exclamation-circle"></i>
                <small>Mensaje de error</small>
            </div> 

            <button type="submit"> Registrarse </button><br>
            
        </form>
    </div>
</body>
</html>
