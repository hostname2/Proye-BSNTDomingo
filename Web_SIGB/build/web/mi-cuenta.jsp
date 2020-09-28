<%-- 
    Document   : mi-cuenta
    Created on : 27/09/2020, 07:14:21 PM
    Author     : Roberto
--%>

<%@page import="SIGB.Modelo.Entidades.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
              integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">

        <link href="https://fonts.googleapis.com/css2?family=Epilogue:wght@300;500;600&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="style.css">

        <link href="https://fonts.googleapis.com/css2?family=Secular+One&display=swap" rel="stylesheet">


        <title>Mi cuenta</title>
        
        <%
            Usuario e1 = (Usuario) request.getSession(true).getAttribute("usuario");
            if (e1 == null || e1.isPn_sTipo()) {
                response.sendRedirect("index.jsp");
            }
        %>
        
    </head>

    <body>
        
        <% HttpSession se = request.getSession(true);
            Usuario e = (Usuario) se.getAttribute("usuario");

            if (e == null) {
                e = new Usuario();
            }

        %>
        
        <div class="box-area">
            <header>
                <div class="wrapper">
                    <div class="logo">
                        <a href="index.html">Biblioteca Municipal Isaac Felipe Azofeifa</a>
                    </div>
                    <nav>
                        <a href="mi-cuenta.jsp">Mi cuenta</a>
                        <a href="index.jsp">Cerrar Sesión</a>
                    </nav>
                </div>
            </header>


            <div id="content">
                <div class="content-area-2">
                    <div class="row py-3">
                        <h1>Actualización de Datos</h1>
                    </div>
                    <form action="ActualizarUsuario" method="POST">
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <label for="inputNombre">Nombre</label>
                                <input type="text" class="form-control" id="nombre" name="nombre" value="<%=e1.getPn_pPersona().getPn_sNombre()%> ">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="inputApellido1">Primer Apellido</label>
                                <input type="text" class="form-control" id="apellido1" name="apellido1" value="<%=e1.getPn_pPersona().getPn_sApellido1()%> ">
                            </div>
                            <div class="form-group col-md-3">
                                <label for="inputApellido2">Segundo Apellido</label>
                                <input type="text" class="form-control" id="apellido2" name="apellido2" value="<%=e1.getPn_pPersona().getPn_sApellido2()%> ">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-3">
                                <label for="inputTelefono">Teléfono</label>
                                <input type="text" class="form-control" id="telefono" name="telefono" value="<%=e1.getPn_pPersona().getPn_sTelefono()%> ">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-9">
                                <label for="inputAddress">E-mail</label>
                                <input type="text" class="form-control" id="correo" name="correo"
                                       placeholder="ana@gmail.com" value="<%=e1.getPn_pPersona().getPn_sEmail()%> ">
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-9">
                                <label for="inputAddress">Dirección</label>
                                <input type="text" class="form-control" id="direccion" name="direccion"
                                       placeholder="Santo Domingo, 100 mts Sur de la Municipalidad" value="<%=e1.getPn_pPersona().getPn_sDireccion()%> ">
                            </div>
                        </div>
                        <!-- <div class="form-row">
                          <div class="form-group col-md-4">
                            <label for="inputContraseña">Contraseña</label>
                            <input type="password" class="form-control" id="contraseña">
                          </div>
                          <div class="form-group col-md-4">
                            <label for="inputContraseña">Confirmar Contraseña</label>
                            <input type="password" class="form-control" id="contraseña2">
                          </div>
                        </div> -->
                        <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>
                </div>
            </div>
        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
                integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
                integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js@2.9.3/dist/Chart.min.js"
        integrity="sha256-R4pqcOYV8lt7snxMQO/HSbVCFRPMdrhAFMH+vr9giYI=" crossorigin="anonymous"></script>
    </body>

</html>
