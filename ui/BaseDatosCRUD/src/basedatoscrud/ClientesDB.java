/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatoscrud;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanalvarenga
 */
public class ClientesDB {

    private Connection conn;

    List<Cliente> getClientes() {
        Connection conn = DatabaseConnection.getConnection();

        List<Cliente> clientes = new ArrayList();

        try {

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clientes");

            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {

                clientes.add(
                        new Cliente(
                                resultados.getInt("cliente_id"),
                                resultados.getString("nombre"),
                                resultados.getString("correo"),
                                resultados.getString("rtn"),
                                resultados.getString("estado"),
                                resultados.getString("fecha_creacion")
                        )
                );

            }

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        } finally {
            //se ejecuta siempre, una vez haya finalizado todo lo del try

            try {
                conn.close();
            } catch (SQLException error) {
                System.out.println(error.getMessage());
            }
        }

        return clientes;

    }

    Cliente getClienteById(int id) {
        Connection conn = DatabaseConnection.getConnection();

        try {

            PreparedStatement stmt
                    = conn.prepareStatement("SELECT * FROM clientes WHERE cliente_id = ?");

            //enviar los parametros a la consulta
            stmt.setInt(1, id);

            ResultSet respuesta = stmt.executeQuery();

            while (respuesta.next()) {

                System.out.println(respuesta.getString("nombre"));
            }

        } catch (SQLException error) {
            System.out.println(error.getMessage());
        } finally {
            //se ejecuta siempre, una vez haya finalizado todo lo del try

            try {
                conn.close();
            } catch (SQLException error) {
                System.out.println(error.getMessage());
            }
        }
        
        return null;

    }
    
    //TODO: deben crear, el metodo para crear, actualizar y eliminar un cliente
    

}
