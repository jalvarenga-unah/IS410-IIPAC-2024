/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatoscrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juanalvarenga
 */
public class DatabaseConnection {

    //credenciales de la conexión
    private static final String HOST = "localhost"; // esshn.com
    private static final String PORT = "8889"; //3306
    private static final String USER = "root"; // esshnnet_poo
    private static final String PASSWORD = "root"; // l=FW4SwyUKHg
    private static final String BD = "facturacion_poo"; //esshnnet_poo
    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + BD;

    public static Connection getConnection() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión realizada correctamente");
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

        return conn;

    }

}
