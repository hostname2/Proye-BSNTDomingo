

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>MENSAJE</title>
        
        <link rel="shortcut icon" href="css/imagenes/favicon.png" type="image/x-icon">
        <% response.setHeader("cache-control", "no-cache, no-store, must-revalidate");

        %>
        <%            if (request.getSession(true).getAttribute("Mensaje") == null) {
                response.sendRedirect("index.jsp");
            }

        %>

    </head>
    <body>
        <div id="wrapper">
            <%  HttpSession error = request.getSession(true);
                String mensaje = (String) error.getAttribute("Mensaje");

                String part1 = "";
                String part2 = "";
                String[] parts = null;
                try {
                    parts = mensaje.split("_");
                    part1 = parts[0];
                    part2 = parts[1];
                } catch (Exception x) {

                }

                error.removeAttribute("Mensaje");


            %>

            <div class="login-box">
                <div id="box_1">
                    <h1>Mensaje</h1>
                </div>
                <div id="box_2"> 
                    <h2><%=part1%></h2>
                </div>
                <div id="goHome">
                    <a href="<%=part2%>">VOLVER</a>
                </div>
            </div>


        </div>

    </body>
</html>

