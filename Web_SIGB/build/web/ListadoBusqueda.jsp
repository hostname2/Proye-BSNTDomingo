<%-- 
    Document   : ListadoBusqueda
    Created on : 26 sep. 2020, 09:13:03
    Author     : sebas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/getJSON.js" type="text/javascript"></script>
        <script src="js/listadobusqueda.js" type="text/javascript"></script>
        <title>All Docs</title>
    </head>

    <body onload="cargarListado()">
        <!-----------------FIN NAVBAR---------------->

        <!-----------------COMIENZA LA PARTE DEL CONTENIDO---------------->
        <div class="contenido-container">
            <!-----------------INICIO CONTENIDO---------------->
            <div class="documentos">
                <!--<form id="formulario">-->
                <table class="tablaFormulario">
                    <caption>
                        <h2 style="color: black">Listado</h2>
                    </caption>
                    <tbody>
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
                            <th style="width: 60px">Titulo</th>
                            <th style="width: 60px">Autor</th>
                            <th style="width: 60px">Idioma</th>
                            <th style="width: 60px">FechaEdicion</th>
                            <th style="width: 60px">Materia</th>
                            <th style="width: 60px">ISBN</th>
                            <th style="width: 60px">Ejemplares</th>
                            <th style="width: 60px">Nota</th>
                            <th style="width: 60px">Tipo</th>
                            <th style="width: 60px">ISN</th>
                            <th style="width: 60px">FormatoDoc</th>
                            </thead>
                            <tbody  id="cuerpoTabla">

                            </tbody>
                        </table>
                    </div>
                    <!----------------------------------------->                   
                </div>
            </div>
        </div>
</body>
</html>
