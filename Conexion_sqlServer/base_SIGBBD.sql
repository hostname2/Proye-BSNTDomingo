USE [master]
GO

/****** Object:  Database [SIGBBD]    Script Date: 20/9/2020 6:07:04 p. m. ******/
DROP DATABASE [SIGBBD]
GO

/****** Object:  Database [SIGBBD]    Script Date: 20/9/2020 6:07:04 p. m. ******/
CREATE DATABASE [SIGBBD]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SIGBBD', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\SIGBBD.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'SIGBBD_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\SIGBBD_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO

IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SIGBBD].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO

ALTER DATABASE [SIGBBD] SET ANSI_NULL_DEFAULT OFF 
GO

ALTER DATABASE [SIGBBD] SET ANSI_NULLS OFF 
GO

ALTER DATABASE [SIGBBD] SET ANSI_PADDING OFF 
GO

ALTER DATABASE [SIGBBD] SET ANSI_WARNINGS OFF 
GO

ALTER DATABASE [SIGBBD] SET ARITHABORT OFF 
GO

ALTER DATABASE [SIGBBD] SET AUTO_CLOSE OFF 
GO

ALTER DATABASE [SIGBBD] SET AUTO_SHRINK OFF 
GO

ALTER DATABASE [SIGBBD] SET AUTO_UPDATE_STATISTICS ON 
GO

ALTER DATABASE [SIGBBD] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO

ALTER DATABASE [SIGBBD] SET CURSOR_DEFAULT  GLOBAL 
GO

ALTER DATABASE [SIGBBD] SET CONCAT_NULL_YIELDS_NULL OFF 
GO

ALTER DATABASE [SIGBBD] SET NUMERIC_ROUNDABORT OFF 
GO

ALTER DATABASE [SIGBBD] SET QUOTED_IDENTIFIER OFF 
GO

ALTER DATABASE [SIGBBD] SET RECURSIVE_TRIGGERS OFF 
GO

ALTER DATABASE [SIGBBD] SET  DISABLE_BROKER 
GO

ALTER DATABASE [SIGBBD] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO

ALTER DATABASE [SIGBBD] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO

ALTER DATABASE [SIGBBD] SET TRUSTWORTHY OFF 
GO

ALTER DATABASE [SIGBBD] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO

ALTER DATABASE [SIGBBD] SET PARAMETERIZATION SIMPLE 
GO

ALTER DATABASE [SIGBBD] SET READ_COMMITTED_SNAPSHOT OFF 
GO

ALTER DATABASE [SIGBBD] SET HONOR_BROKER_PRIORITY OFF 
GO

ALTER DATABASE [SIGBBD] SET RECOVERY FULL 
GO

ALTER DATABASE [SIGBBD] SET  MULTI_USER 
GO

ALTER DATABASE [SIGBBD] SET PAGE_VERIFY CHECKSUM  
GO

ALTER DATABASE [SIGBBD] SET DB_CHAINING OFF 
GO

ALTER DATABASE [SIGBBD] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO

ALTER DATABASE [SIGBBD] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO

ALTER DATABASE [SIGBBD] SET DELAYED_DURABILITY = DISABLED 
GO

ALTER DATABASE [SIGBBD] SET QUERY_STORE = OFF
GO

ALTER DATABASE [SIGBBD] SET  READ_WRITE 
GO


USE [SIGBBD]
GO

/****** Object:  Table [dbo].[Tipo]    Script Date: 20/9/2020 6:12:55 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Tipo]') AND type in (N'U'))
DROP TABLE [dbo].[Tipo]
GO

/****** Object:  Table [dbo].[Tipo]    Script Date: 20/9/2020 6:12:55 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Tipo](
	[Tipo_Nombre] [nchar](25) NOT NULL,
 CONSTRAINT [PK_Tipo] PRIMARY KEY CLUSTERED 
(
	[Tipo_Nombre] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

USE [SIGBBD]
GO

/****** Object:  Table [dbo].[Computadora]    Script Date: 20/9/2020 6:13:36 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Computadora]') AND type in (N'U'))
DROP TABLE [dbo].[Computadora]
GO

/****** Object:  Table [dbo].[Computadora]    Script Date: 20/9/2020 6:13:36 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Computadora](
	[idComputadora] [int] NOT NULL,
	[Estado] [tinyint] NOT NULL,
 CONSTRAINT [PK_Computadora] PRIMARY KEY CLUSTERED 
(
	[idComputadora] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


USE [SIGBBD]
GO

/****** Object:  Table [dbo].[Devolucion]    Script Date: 20/9/2020 6:14:29 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Devolucion]') AND type in (N'U'))
DROP TABLE [dbo].[Devolucion]
GO

/****** Object:  Table [dbo].[Devolucion]    Script Date: 20/9/2020 6:14:29 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Devolucion](
	[idDevolucion] [int] NOT NULL,
	[Prestamo_idPrestamo] [int] NOT NULL,
	[Fec_Devolucion] [date] NOT NULL,
	[noEjemplares] [int] NOT NULL,
 CONSTRAINT [PK_Devolucion] PRIMARY KEY CLUSTERED 
(
	[idDevolucion] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


USE [SIGBBD]
GO

/****** Object:  Table [dbo].[Persona]    Script Date: 20/9/2020 6:14:53 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Persona]') AND type in (N'U'))
DROP TABLE [dbo].[Persona]
GO

/****** Object:  Table [dbo].[Persona]    Script Date: 20/9/2020 6:14:53 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Persona](
	[idPersona] [nchar](20) NOT NULL,
	[Nombre] [nchar](20) NOT NULL,
	[Apellido1] [nchar](25) NOT NULL,
	[Apellido2] [nchar](25) NOT NULL,
	[Email] [nchar](45) NOT NULL,
	[Fec_Nacimiento] [date] NOT NULL,
	[Telefono] [int] NOT NULL,
	[Direccion] [nchar](45) NOT NULL,
 CONSTRAINT [PK_Persona] PRIMARY KEY CLUSTERED 
(
	[idPersona] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO





USE [SIGBBD]
GO

ALTER TABLE [dbo].[Documento] DROP CONSTRAINT [FK_Documento_Tipo]
GO

/****** Object:  Table [dbo].[Documento]    Script Date: 20/9/2020 6:12:09 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Documento]') AND type in (N'U'))
DROP TABLE [dbo].[Documento]
GO

/****** Object:  Table [dbo].[Documento]    Script Date: 20/9/2020 6:12:09 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Documento](
	[idDocumento] [int] IDENTITY(1,1) NOT NULL,
	[Clasificacion] [nchar](45) NOT NULL,
	[Idioma] [nchar](45) NOT NULL,
	[Fec_edicion] [nchar](45) NOT NULL,
	[Titulo] [nchar](45) NOT NULL,
	[Autor] [nchar](45) NOT NULL,
	[Materia] [nchar](45) NOT NULL,
	[Lugar_Editorial] [nchar](45) NOT NULL,
	[Des_Fisica] [nchar](45) NOT NULL,
	[ISBN] [nchar](45) NOT NULL,
	[Ejemplares] [int] NOT NULL,
	[Nota] [nchar](45) NOT NULL,
	[ISN] [nchar](45) NOT NULL,
	[Formato_Doc] [nchar](45) NOT NULL,
	[Tipo_Nombre] [nchar](25) NOT NULL,
 CONSTRAINT [PK_Documento] PRIMARY KEY CLUSTERED 
(
	[idDocumento] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Documento]  WITH CHECK ADD  CONSTRAINT [FK_Documento_Tipo] FOREIGN KEY([Tipo_Nombre])
REFERENCES [dbo].[Tipo] ([Tipo_Nombre])
GO

ALTER TABLE [dbo].[Documento] CHECK CONSTRAINT [FK_Documento_Tipo]
GO



USE [SIGBBD]
GO

ALTER TABLE [dbo].[Usuario] DROP CONSTRAINT [FK_Usuario_Persona1]
GO

/****** Object:  Table [dbo].[Usuario]    Script Date: 20/9/2020 6:19:49 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Usuario]') AND type in (N'U'))
DROP TABLE [dbo].[Usuario]
GO

/****** Object:  Table [dbo].[Usuario]    Script Date: 20/9/2020 6:19:49 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Usuario](
	[contrasenia] [nchar](25) NOT NULL,
	[Tipo] [tinyint] NOT NULL,
	[Persona_idPersona] [nchar](20) NOT NULL,
 CONSTRAINT [PK_Usuario] PRIMARY KEY CLUSTERED 
(
	[Persona_idPersona] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Usuario]  WITH CHECK ADD  CONSTRAINT [FK_Usuario_Persona1] FOREIGN KEY([Persona_idPersona])
REFERENCES [dbo].[Persona] ([idPersona])
GO

ALTER TABLE [dbo].[Usuario] CHECK CONSTRAINT [FK_Usuario_Persona1]
GO



USE [SIGBBD]
GO

ALTER TABLE [dbo].[Prestamo] DROP CONSTRAINT [FK_Prestamo_Usuario]
GO

ALTER TABLE [dbo].[Prestamo] DROP CONSTRAINT [FK_Prestamo_Documento]
GO

ALTER TABLE [dbo].[Prestamo] DROP CONSTRAINT [FK_Prestamo_Devolucion]
GO

ALTER TABLE [dbo].[Prestamo] DROP CONSTRAINT [FK_Prestamo_Computadora]
GO

/****** Object:  Table [dbo].[Prestamo]    Script Date: 20/9/2020 6:20:36 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Prestamo]') AND type in (N'U'))
DROP TABLE [dbo].[Prestamo]
GO

/****** Object:  Table [dbo].[Prestamo]    Script Date: 20/9/2020 6:20:36 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Prestamo](
	[idPrestamo] [int] NOT NULL,
	[Usuario_Persona_idPersona] [nchar](20) NOT NULL,
	[Documento_idDocumento] [int] NOT NULL,
	[Computadora_idComputadora] [int] NOT NULL,
	[Fec_Inicial] [date] NULL,
	[Fec_Final] [date] NULL,
	[Devolucion_idDevolucion] [int] NOT NULL,
 CONSTRAINT [PK_Prestamo] PRIMARY KEY CLUSTERED 
(
	[idPrestamo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Prestamo]  WITH CHECK ADD  CONSTRAINT [FK_Prestamo_Computadora] FOREIGN KEY([Computadora_idComputadora])
REFERENCES [dbo].[Computadora] ([idComputadora])
GO

ALTER TABLE [dbo].[Prestamo] CHECK CONSTRAINT [FK_Prestamo_Computadora]
GO

ALTER TABLE [dbo].[Prestamo]  WITH CHECK ADD  CONSTRAINT [FK_Prestamo_Devolucion] FOREIGN KEY([Devolucion_idDevolucion])
REFERENCES [dbo].[Devolucion] ([idDevolucion])
GO

ALTER TABLE [dbo].[Prestamo] CHECK CONSTRAINT [FK_Prestamo_Devolucion]
GO

ALTER TABLE [dbo].[Prestamo]  WITH CHECK ADD  CONSTRAINT [FK_Prestamo_Documento] FOREIGN KEY([Documento_idDocumento])
REFERENCES [dbo].[Documento] ([idDocumento])
GO

ALTER TABLE [dbo].[Prestamo] CHECK CONSTRAINT [FK_Prestamo_Documento]
GO

ALTER TABLE [dbo].[Prestamo]  WITH CHECK ADD  CONSTRAINT [FK_Prestamo_Usuario] FOREIGN KEY([Usuario_Persona_idPersona])
REFERENCES [dbo].[Usuario] ([Persona_idPersona])
GO

ALTER TABLE [dbo].[Prestamo] CHECK CONSTRAINT [FK_Prestamo_Usuario]
GO


USE [SIGBBD]
GO

ALTER TABLE [dbo].[Capacitaciones] DROP CONSTRAINT [FK_Capacitaciones_Usuario]
GO

/****** Object:  Table [dbo].[Capacitaciones]    Script Date: 20/9/2020 6:21:04 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Capacitaciones]') AND type in (N'U'))
DROP TABLE [dbo].[Capacitaciones]
GO

/****** Object:  Table [dbo].[Capacitaciones]    Script Date: 20/9/2020 6:21:04 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Capacitaciones](
	[idCapacitaciones] [int] NOT NULL,
	[Nombre] [nchar](45) NOT NULL,
	[Descripcion] [nchar](45) NOT NULL,
	[Capacidad] [int] NOT NULL,
	[Instructor] [nchar](20) NOT NULL,
 CONSTRAINT [PK_Capacitaciones] PRIMARY KEY CLUSTERED 
(
	[idCapacitaciones] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Capacitaciones]  WITH CHECK ADD  CONSTRAINT [FK_Capacitaciones_Usuario] FOREIGN KEY([Instructor])
REFERENCES [dbo].[Usuario] ([Persona_idPersona])
GO

ALTER TABLE [dbo].[Capacitaciones] CHECK CONSTRAINT [FK_Capacitaciones_Usuario]
GO


USE [SIGBBD]
GO

ALTER TABLE [dbo].[Listado] DROP CONSTRAINT [FK_Listado_Usuario]
GO

ALTER TABLE [dbo].[Listado] DROP CONSTRAINT [FK_Listado_Capacitaciones]
GO

/****** Object:  Table [dbo].[Listado]    Script Date: 20/9/2020 6:21:21 p. m. ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[Listado]') AND type in (N'U'))
DROP TABLE [dbo].[Listado]
GO

/****** Object:  Table [dbo].[Listado]    Script Date: 20/9/2020 6:21:21 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Listado](
	[Usuario_Persona_idPersona] [nchar](20) NOT NULL,
	[Capacitaciones_idCapacitaciones] [int] NOT NULL
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Listado]  WITH CHECK ADD  CONSTRAINT [FK_Listado_Capacitaciones] FOREIGN KEY([Capacitaciones_idCapacitaciones])
REFERENCES [dbo].[Capacitaciones] ([idCapacitaciones])
GO

ALTER TABLE [dbo].[Listado] CHECK CONSTRAINT [FK_Listado_Capacitaciones]
GO

ALTER TABLE [dbo].[Listado]  WITH CHECK ADD  CONSTRAINT [FK_Listado_Usuario] FOREIGN KEY([Usuario_Persona_idPersona])
REFERENCES [dbo].[Usuario] ([Persona_idPersona])
GO

ALTER TABLE [dbo].[Listado] CHECK CONSTRAINT [FK_Listado_Usuario]
GO






