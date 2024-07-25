/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatoscrud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author juanalvarenga
 */
public class ClientesDB {

    private Connection conn;

    ClientesDB(Connection conn) {
        this.conn = conn;
    }

    void getClientes() {

        try {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clientes");

            ResultSet resultados = stmt.executeQuery();
            
            while( resultados.next() ){
            
                System.out.println( resultados.getString( "nombre" ) );
            
            }

        } catch (SQLException error) {
        }

    }

}
