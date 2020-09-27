INSERT INTO Tipo (Tipo_Nombre)
VALUES ('Pdf');

INSERT INTO Tipo (Tipo_Nombre)
VALUES ('Libro');

INSERT INTO Tipo (Tipo_Nombre)
VALUES ('Articulo');

Select*from Tipo;

INSERT INTO Documento (Clasificacion, Idioma, Fec_edicion, Titulo, Autor, Materia, Lugar_Editorial, Des_Fisica, ISBN, Ejemplares, Nota, ISN, Formato_Doc, Tipo_Nombre)
VALUES('Drama', 'espaniol', '2012', 'casas', 'pepe gonzales', 'ciencias', 'editorial', 'muchas paginas', '12345', 3, 'bueno', '7410', 'fisico', 'Pdf');

INSERT INTO Documento (Clasificacion, Idioma, Fec_edicion, Titulo, Autor, Materia, Lugar_Editorial, Des_Fisica, ISBN, Ejemplares, Nota, ISN, Formato_Doc, Tipo_Nombre)
VALUES('Accion', 'Ingles', '2000', 'casas', 'pepe camacho', 'ciencias', 'editorial', 'muchas paginas', '12345', 3, 'bueno', '7410', 'fisico',  'Articulo');


INSERT INTO Persona  (idPersona, Nombre, Apellido1, Apellido2, Email, Fec_Nacimiento, Telefono, Direccion)
VALUES('123456', 'Marvin', 'Chavarría', 'Bonilla', 'march@gmail.com', '2015-12-30', 12322, 'heredia centro');

INSERT INTO Persona  (idPersona, Nombre, Apellido1, Apellido2, Email, Fec_Nacimiento, Telefono, Direccion)
VALUES('1122', 'Luis', 'Loria', 'Bonilla', 'lordch@gmail.com', '2000-01-15', 151515, 'Alajuela centro');

INSERT INTO USUARIO (contrasenia, Tipo, Persona_idPersona) VALUES ('123', 1, 1122);

INSERT INTO USUARIO (contrasenia, Tipo, Persona_idPersona) VALUES ('321', 1, 123456);