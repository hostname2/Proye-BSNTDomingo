<%-- 
    Document   : administracion
    Created on : 23-sep-2020, 23:20:57
    Author     : Grelvin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/administracion.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>Administración</title>

        <script type="text/javascript">
            $(document).ready(function () {
                // Activate tooltip
                $('[data-toggle="tooltip"]').tooltip();

                // Select/Deselect checkboxes
                var checkbox = $('table tbody input[type="checkbox"]');
                $("#selectAll").click(function () {
                    if (this.checked) {
                        checkbox.each(function () {
                            this.checked = true;
                        });
                    } else {
                        checkbox.each(function () {
                            this.checked = false;
                        });
                    }
                });
                checkbox.click(function () {
                    if (!this.checked) {
                        $("#selectAll").prop("checked", false);
                    }
                });
            });
        </script>

    </head>
    <body>
        <!-----------------INICIO NAVBAR---------------->
        <div class="navbar-container">
            <div class="nav-contenido">
                <!--logo
                <div class="logo">
                    <a href="index.jsp"><img src="imagenes/logo.png"></a>
                </div>
                -->
                <!--menu-->
                <div class="menu">
                    <ul>
                        <li><a href="administracion.html">&nbsp;Administrar Libros</a></li>
                        <li><a href="#">Préstamos</a></li>
                        <li><a href="#">Usuarios</a></li>
                        <li><a href="EliminarDoc.jsp">Eliminar Docuemto</a></li>
                    </ul>
                </div>
                <!--Carrito-->
                <div class="carro">

                    <a href="#"> <i class="fas fa-sign-out-alt"></i> Logout</a>
                </div>
            </div>
        </div>
        <!-----------------FIN NAVBAR---------------->

        <!-----------------COMIENZA LA PARTE DEL CONTENIDO---------------->

        <!-----------------INICIO CONTENIDO---------------->
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Administrar <b>Libros</b></h2>
                        </div>
                        <div class="col-sm-6">
                            <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i
                                    class="material-icons">&#xE147;</i> <span>Añadir nuevo documento</span></a>
                            <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i
                                    class="material-icons">&#xE15C;</i> <span>Eliminar</span></a>
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            <th>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="selectAll">
                                    <label for="selectAll"></label>
                                </span>
                            </th>
                            <th>Clasificación</th>
                            <th>Idioma</th>
                            <th>Fecha de Edición</th>
                            <th>Título</th>
                            <th>Autor</th>
                            <th>Materia</th>
                            <th>Lugar Editorial</th>
                            <th>Descripción física</th>
                            <th>ISBN</th>
                            <th>Ejemplares</th>
                            <th>Nota</th>
                            <th>Tipo</th>
                            <th>ISN</th>
                            <th>Formato de Documento</th>
                            <th>Acción</th>
                        </tr>
                    </thead>
                    <!--Aqui comienza el cuerpo de la tabla-->
                    <tbody>
                        <tr>
                            <td>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                    <label for="checkbox1"></label>
                                </span>
                            </td>
                            <td>R-12</td>
                            <td>Español</td>
                            <td>12/7/2020</td>
                            <td>NO SE CUALQUIERA</td>
                            <td>Grelvin Morales</td>
                            <td>Ciencias</td>
                            <td>TA BONITO</td>
                            <td>124543</td>
                            <td>12</td>
                            <td>QUE COMPREN MAS</td>
                            <td>LIBRO</td>
                            <td>AUN NO SE</td>
                            <td>5342</td>
                            <td>FISICO</td>
                            <td>
                                <a href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons"
                                                                                                 data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons"
                                                                                                     data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                            </td>
                        </tr>
                    </tbody>
                    <!--Termina el cuerpo de la tabla-->
                </table>
                <div class="clearfix">
                    <div class="hint-text">Showing <b>5</b> out of <b>100</b> entries</div>
                    <ul class="pagination">
                        <li class="page-item disabled"><a href="#">Previous</a></li>
                        <li class="page-item"><a href="#" class="page-link">1</a></li>
                        <li class="page-item"><a href="#" class="page-link">2</a></li>
                        <li class="page-item active"><a href="#" class="page-link">3</a></li>
                        <li class="page-item"><a href="#" class="page-link">4</a></li>
                        <li class="page-item"><a href="#" class="page-link">5</a></li>
                        <li class="page-item"><a href="#" class="page-link">Next</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- Edit Modal HTML -->
        <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">
                            <h4 class="modal-title">Añadir Documento</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>Clasificación</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Idioma</label>
                                <input type="email" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Nota</label>
                                <textarea class="form-control" required></textarea>
                            </div>
                            <div class="form-group">
                                <label>Fecha de Edición</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Título</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Autor</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Materia</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Lugar Editorial</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Descripción Física</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>ISBN</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Ejemplares</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tipo</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>ISN</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Formato Documento</label>
                                <input type="text" class="form-control" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
                            <input type="submit" class="btn btn-success" value="Añadir">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Edit Modal HTML -->
        <div id="editEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">
                            <h4 class="modal-title">Editar Documento</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>Clasificación</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Idioma</label>
                                <input type="email" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Nota</label>
                                <textarea class="form-control" required></textarea>
                            </div>
                            <div class="form-group">
                                <label>Fecha de Edición</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Título</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Autor</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Materia</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Lugar Editorial</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Descripción Física</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Ejemplares</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tipo</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>ISN</label>
                                <input type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Formato Documento</label>
                                <input type="text" class="form-control" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
                            <input type="submit" class="btn btn-info" value="Guardar">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Delete Modal HTML -->
        <div id="deleteEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">
                            <h4 class="modal-title">Eliminar Libro</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <p>¿Está seguro de eliminar el libro?</p>
                            <p class="text-warning"><small>Esta acción no se puede deshacer.</small></p>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
                            <input type="submit" class="btn btn-danger" value="Eliminar">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
