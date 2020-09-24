<%-- 
    Document   : Busqueda
    Created on : 23 sep. 2020, 20:41:58
    Author     : sebas
--%>

<%@page import="Servicios.ServletBusquedaDocumentos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/BusquedaStyle.css" rel="stylesheet" type="text/css"/>
        <script src="js/getJSON.js" type="text/javascript"></script>
        <script src="js/BuscarScript.js" type="text/javascript"></script>
        <title>Busqueda de Dcoumentos</title>
    </head>
    <body onload="">
        <!-----------------FIN NAVBAR---------------->

        <!-----------------COMIENZA LA PARTE DEL CONTENIDO---------------->
        <div class="contenido-container">
            <!-----------------INICIO CONTENIDO---------------->
            <div class="documentos">
                <!--<form id="formulario">-->
                <table class="tablaFormulario">
                    <caption>
                        <h2 style="color: black">Administracion de busqueda</h2>
                    </caption>
                    <tbody>
                        <tr>
                            <td class="etiqueta">
                                <label for="cedula"><strong>Digite el id:</strong></label>
                            </td>
                            <td class="campo">
                                <input type="text" id="dato" name="dato" size="25" required/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" class="controles">
                                <button onclick="obtenerLista();">Bsucar</button>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <!--</form>-->
            </div>
            <div class="contenido">
                <!-------------------FILA 1-------------------->
                <div class="first-row">
                    <div class="new">
                        <table class="tablaCuentas" id="tablaCuentas">
                            <thead>
                            <th style="width: 60px">pn_sIdDocumento</th>
                            <th style="width: 120px">pn_sClasicación</th>
                            <th style="width: 60px">pn_sIdioma</th>
                            <th style="width: 60px">pn_sFechaEdicion</th>
                            <th style="width: 60px">pn_sTitulo</th>
                            <th style="width: 60px">pn_sAutor</th>
                            <th style="width: 60px">pn_sMateria</th>
                            <th style="width: 60px">pn_sLugEditorial</th>
                            <th style="width: 60px">pn_sDesFisica</th>
                            <th style="width: 60px">pn_sISBN</th>
                            <th style="width: 60px">pn_sEjemplares</th>
                            <th style="width: 60px">pn_sNota</th>
                            <th style="width: 60px">pn_sTipo</th>
                            <th style="width: 60px">pn_sISN</th>
                            <th style="width: 60px">pn_sFormatoDoc</th>
                            </thead>
                            <tbody  id="cuerpoTabla">

                            </tbody>
                        </table>
                    </div>
                    <!----------------------------------------->                   
                </div>
            </div>
        </div>
    </div>
</body>
</html>
