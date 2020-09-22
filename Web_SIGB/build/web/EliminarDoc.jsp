<%-- 
    Document   : EliminarDoc
    Created on : 21/09/2020, 09:50:54 PM
    Author     : Marvin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div id="ventana_Info">
                    <form id="formulario" action="EliminarDocumento" method="POST">

                        <table class="tablaFormulario">
                            <caption>
                                <h2 style="color: black">ELIMINACION DE DOCUMENTO</h2>

                            </caption>
                            <tbody>

                                <tr>
                                    <td class="etiqueta">
                                        <label for="cedula"><strong>Introduzca Numero del Documento:</strong></label>
                                    </td>
                                    <td class="campo">
                                        <input type="text" id="dato" name="dato" size="25" required/>
                                    </td>
                                </tr>

                                <tr>
                                    <td colspan="2" class="controles">
                                        <button class= "button" type="submit">Elminar</button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>

                    </form>

                </div>
    </body>
</html>
