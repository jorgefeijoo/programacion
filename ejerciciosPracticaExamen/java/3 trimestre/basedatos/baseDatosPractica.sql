-- 1. Creamos la base de datos
CREATE DATABASE PracticaJDBC;
GO

-- 2. Le decimos a SQL Server que vamos a usar esa base de datos
USE PracticaJDBC;
GO

-- 3. Creamos la tabla Alumnos
CREATE TABLE Alumnos (
    id INT IDENTITY(1,1) PRIMARY KEY, -- IDENTITY hace que el ID sea automático (como AUTO_INCREMENT en MySQL)
    nombre VARCHAR(100) NOT NULL,
    curso VARCHAR(50) NOT NULL,
    nota DECIMAL(4,2)
);


select * from Alumnos

delete from Alumnos 
where id = 1 