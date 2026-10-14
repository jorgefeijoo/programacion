-- 1. Creamos la base de datos
CREATE DATABASE TiendaGamer;
GO

-- 2. Usamos la base de datos
USE TiendaGamer;
GO

-- 3. Creamos la tabla
CREATE TABLE Videojuegos (
    id INT IDENTITY(1,1) PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    genero VARCHAR(50) NOT NULL,
    precio DECIMAL(5,2) NOT NULL,
    stock INT NOT NULL,
    multijugador BIT NOT NULL -- En SQL Server, BIT es 1 (True) o 0 (False)
);
GO

-- 4. Insertamos los datos de prueba
INSERT INTO Videojuegos (titulo, genero, precio, stock, multijugador) VALUES
('The Legend of Zelda', 'Aventura', 59.99, 15, 0),
('FIFA 24', 'Deportes', 69.99, 50, 1),
('Minecraft', 'Supervivencia', 19.99, 100, 1),
('Elden Ring', 'Rol', 49.99, 8, 1),
('Super Mario Odyssey', 'Plataformas', 45.00, 20, 0),
('Call of Duty', 'Shooter', 79.99, 30, 1),
('Stardew Valley', 'Simulacion', 14.99, 5, 1),
('God of War', 'Accion', 39.99, 0, 0);
GO


select * from Videojuegos