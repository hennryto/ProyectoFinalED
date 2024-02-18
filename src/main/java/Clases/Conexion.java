/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Conexion {
    private static Connection connection;
    public static Connection getConexion() {
        String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=Proyecto2;"
                + "encrypt=true;trustServerCertificate=true";
        String USER = "henry";
        String PASS = "12345";
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            JOptionPane.showMessageDialog(null, "Conectado " );
            return connection;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a SQL Server: " + e.getMessage());
            return null;
        }
    }  
    public static void getDisconnected() {
        if (connection != null) {
            try {
                connection.close();
                JOptionPane.showMessageDialog(null, "Desconexión exitosa de SQL Server");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al desconectar de SQL Server: " + e.getMessage());
            } finally {
                connection = null; // Para asegurar que la conexión se marque como cerrada incluso si hay una excepción.
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay conexión activa para desconectar.");
        }
    }
}
