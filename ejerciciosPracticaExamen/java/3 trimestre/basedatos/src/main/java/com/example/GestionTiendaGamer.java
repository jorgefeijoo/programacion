package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GestionTiendaGamer {

    public void mostrarJuegos() {
        Conexion2 conexion = new Conexion2();
        try (Connection conn = conexion.realizarConexion();) {

            String selectSql = "Select * from Videojuegos where precio < ? and multijugador = ?  ";

            try (PreparedStatement preparedStatement = conn.prepareStatement(selectSql)) {
                preparedStatement.setInt(1, 50);
                preparedStatement.setInt(2, 1);

                try (ResultSet resultados = preparedStatement.executeQuery()) {

                    while (resultados.next()) {
                        String nombre = resultados.getString("titulo");
                        int precio = resultados.getInt("precio");

                        System.out.println("El nombre del juego que tiene multijugador es : " + nombre + " y su precio es : " + precio);
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("No se pudo realizar la conexion " + e.getMessage());
        }

    }

    public void insertarJuegos() {
        Conexion2 conexion2 = new Conexion2();
        try (Connection conn2 = conexion2.realizarConexion()) {
            String insertarSql = "Insert into videojuegos (titulo,genero,precio,stock,multijugador) values (?,?,?,?,?)";
            try (PreparedStatement preparedStatement2 = conn2.prepareStatement(insertarSql)) {
                preparedStatement2.setString(1, "Fortnite");
                preparedStatement2.setString(2, "Battle Royale");
                preparedStatement2.setDouble(3, 0.00);
                preparedStatement2.setInt(4, 100000);
                preparedStatement2.setInt(5, 1);

                preparedStatement2.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("No es posible hacer la conexion " + e.getMessage());
        }
    }

    public void eliminarJuego() {
        Scanner sc = new Scanner(System.in);
        Conexion2 conexion3 = new Conexion2();
        try (Connection conn3 = conexion3.realizarConexion()) {
            String eliminarSql = "delete from Videojuegos where id = ?";
            try (PreparedStatement preparedStatement3 = conn3.prepareStatement(eliminarSql)) {
                System.out.println("Introduce el id del juego que quieres eliminar : ");
                int id = sc.nextInt();
                preparedStatement3.setInt(1, id);

                preparedStatement3.executeUpdate();

            }

        } catch (SQLException e) {
            System.out.println("No se pudo hacer la conexion: " + e.getMessage());

        }

    }

    public void actualizarPrecio(){
        try (Scanner sc = new Scanner(System.in)) {
            Conexion2 conexion = new Conexion2();
            try (Connection conn = conexion.realizarConexion()) {
                String actualizarSql = "Update videojuegos set precio = ?  where id = ? ";
                try (PreparedStatement preparedStatement = conn.prepareStatement(actualizarSql)) {
                    System.out.println("Introduce el id del juego que quieres cambiar : ");
                    int idJuego = sc.nextInt();
                    System.out.println("Introduce el precio del nuevo juego : ");
                    double precioJuego = sc.nextDouble();

                    preparedStatement.setDouble(1, precioJuego);
                    preparedStatement.setInt(2, idJuego);

                   int filasAfectadas =  preparedStatement.executeUpdate();

                    System.out.println("Las filas que han sido afectadas son : " + filasAfectadas);
                } 
                
            } catch (SQLException e) {
               System.out.println("La conexion no se pudo realizar " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        GestionTiendaGamer gtg = new GestionTiendaGamer();

        gtg.mostrarJuegos();
        gtg.insertarJuegos();
        gtg.eliminarJuego();
        gtg.actualizarPrecio();
    }

}
