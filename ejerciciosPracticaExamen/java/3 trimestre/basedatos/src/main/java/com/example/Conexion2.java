package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion2 {

    public Connection realizarConexion() throws SQLException {
       
            String url = "jdbc:sqlserver://localhost:1433;databaseName=TiendaGamer;encrypt=true;trustServerCertificate=true;";
            String name = "sa";
            String password = "Jorgemarc856";
            Connection conexion = DriverManager.getConnection(url, name, password);
            System.out.println("Conexion exitosa");
            return conexion;   
    }
}
