INSERT INTO Tipo (Tipo_Nombre)
VALUES ('Libro');
INSERT INTO Tipo (Tipo_Nombre)
VALUES ('Articulo');
INSERT INTO Tipo (Tipo_Nombre)
VALUES ('PDF');
INSERT INTO Tipo (Tipo_Nombre)
VALUES ('Revista');

Select*from Tipo;

INSERT INTO Documento(Clasificacion, Idioma, Fec_edicion, Titulo, Autor, Materia, Lugar_Editorial, Des_Fisica, ISBN, Ejemplares, Nota, ISN, Formato_Doc, Tipo_Nombre)
VALUES('324.8 I59r', 'Español', '2008', 'Resultados electorales Ajustados: experiencias y lecciones aprendidas', 'Insttituto Interamericano de Derechos Humanos', 'Eleciones-Participación Politica-América Latina', 'San José, Costa Rica: IIDH, 2008', '116 p.', '978-9958-611-16-9', 1, 'NA', 'NA', 'Físico', 'Libro');

INSERT INTO Documento (Clasificacion, Idioma, Fec_edicion, Titulo, Autor, Materia, Lugar_Editorial, Des_Fisica, ISBN, Ejemplares, Nota, ISN, Formato_Doc, Tipo_Nombre)
VALUES('CR801.93 B224a', 'Español', '1982', 'Apuntes para una historia de las ideas esteticas de Costa Rica', 'Barahona Jímenez, Luis, 1914-1987', 'Estetica literaria-literatura costarrisence', 'San José, CR: Ministerio de Cultura, Juventud y Deporte, Dirreción General de Publicaciones, 1982', '151 p.', '9,78997E+12', 1, 'NA', 'NA', 'Físico', 'Libro');

INSERT INTO Documento (Clasificacion, Idioma, Fec_edicion, Titulo, Autor, Materia, Lugar_Editorial, Des_Fisica, ISBN, Ejemplares, Nota, ISN, Formato_Doc, Tipo_Nombre)
VALUES('305.8I59ca', 'NA', '2008', 'Campaña educativa sobre derechos humanos de las personas afrodecendientes- MODULO II- el derecho a conocer', 'Instituto Interamericano de derechos humanos', 'Discriminación etnica-protección internacional de los derechos humanos', 'San José, Costa Rica IIDH, 2008', '71 p.', '978-9968-611-17-6', 1, 'NA', 'NA', 'Físico', 'Libro');

INSERT INTO Persona  (idPersona, Nombre, Apellido1, Apellido2, Email, Fec_Nacimiento, Telefono, Direccion)
VALUES('000000000', 'Biblioteca', 'Santo', 'Domingo', 'biblioteca@munisantodomingo.go.cr', '2000-01-01', 22447401, 'Santo Domingo');
INSERT INTO Persona  (idPersona, Nombre, Apellido1, Apellido2, Email, Fec_Nacimiento, Telefono, Direccion)
VALUES('114450585', 'Marvin', 'Chavarría', 'Bonilla', 'march@gmail.com', '1990-10-31', 86302985, 'Heredia centro');
INSERT INTO Persona  (idPersona, Nombre, Apellido1, Apellido2, Email, Fec_Nacimiento, Telefono, Direccion)
VALUES('207810491', 'Jose Robnerto', 'Rojas', 'Rojas', 'roberto.2rojas@gmail.com', '1998-07-11', 86013581, 'Grecia centro');
INSERT INTO Persona  (idPersona, Nombre, Apellido1, Apellido2, Email, Fec_Nacimiento, Telefono, Direccion)
VALUES('402380848', 'Grelvin', 'Morales', 'Gonzalez', 'grelvin.mg14@gmail.com', '1998-05-14', 89883928, 'San Pablo, Heredia');


INSERT INTO USUARIO (contrasenia, Tipo, Persona_idPersona) VALUES ('Administrador1',1,'000000000');
INSERT INTO USUARIO (contrasenia, Tipo, Persona_idPersona) VALUES ('Jrrojasrojas98',0,'207810491');
INSERT INTO USUARIO (contrasenia, Tipo, Persona_idPersona) VALUES ('MarvinCB90',0,'114450585');
INSERT INTO USUARIO (contrasenia, Tipo, Persona_idPersona) VALUES ('GreenbeanGolo98',0,'402380848');

select * from Documento;

select * from Persona;
select * from Usuario;