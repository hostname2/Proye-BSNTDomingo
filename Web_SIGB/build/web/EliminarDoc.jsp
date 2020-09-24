<%-- 
    Document   : EliminarDoc
    Created on : 21/09/2020, 09:50:54 PM
    Author     : Marvin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/EliminacionDoc_interfaz.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div id="wrapper">

            <header>
                <h1>BIBLIOTECA SANTO DOMINGO</h1>
                <h2>Módulo de Elminación</h2>
            </header>
            <div id="contents">
                

                <div id="ventana_Info">
                    <form id="formulario" action="EliminarDocumento" method="POST">

                        <table class="tablaFormulario">
                            <caption>
                                <h2 style="color: black">ELIMINAR DOCUMENTO</h2>

                            </caption>
                            <tbody>

                                <tr>
                                    <td class="etiqueta">
                                        <label for="cedula"><strong>Introduzca Codigo:</strong></label>
                                    </td>
                                    <td class="campo">
                                        <input type="text" id="codigo" name="codigo" size="25" required/>
                                    </td>
                                </tr>

                                <tr>
                                    <td colspan="2" class="controles">
                                        <button class= "button" type="reset">Borrar</button>&nbsp;
                                        <button class= "button" type="submit">Enviar</button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>

                    </form>

                </div>





            </div>
            <footer>
                <h2>DERECHOS RESEVARDOS 2020</h2>
            </footer>
        </div>
    </body>
</html>
