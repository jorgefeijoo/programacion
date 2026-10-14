package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
   public static void main(String[] args) {
       String url = "jdbc:sqlserver://localhost:1433;databaseName=PracticaJDBC;encrypt=true;trustServerCertificate=true;";
       String name= "sa";
       String password="Jorgemarc856";
      
       try {
           try (Connection conexion = DriverManager.getConnection(url,name,password)) {
               System.out.println("Conexion exitosa");
               String sql = "INSERT INTO Alumnos (nombre,curso,nota) VALUES (?,?,?)";

               String sql2 = "Select * from Alumnos where curso = ?";

               try (PreparedStatement preparedStatement = conexion.prepareStatement(sql);) {
                  preparedStatement.setString(1, "Jorge");
                  preparedStatement.setString(2, "2 DAW");
                  preparedStatement.setDouble(3,8.7);

                  preparedStatement.setString(1, "Elisa");
                  preparedStatement.setString(2, "2 DAW");
                  preparedStatement.setDouble(3,5);

                
                   preparedStatement.executeUpdate();

                   System.out.println("Update realizado con exito");

               }
               try (PreparedStatement preparedStatement = conexion.prepareStatement(sql2);) {

                  preparedStatement.setString(1, "2 DAW");
                  try (ResultSet resultados = preparedStatement.executeQuery();) {
                     
                     while (resultados.next()) {
                        String nombre= resultados.getString("nombre");
                        String curso = resultados.getString("curso");
                        Double nota = resultados.getDouble("nota");


                        System.out.println("EL nombre es: " + nombre + " el curso que esta cursando es: " + curso + " y su nota es : " +nota);
                     }
                  
                  }
                 
              
               }
               
              
           }
       } catch (SQLException e) {
        System.out.println("No se pudo realizar la conexion con la base de datos " + e.getMessage());
       }
   }
  
}
