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

        Cliente temp = null;

        try {

            PreparedStatement stmt
                    = conn.prepareStatement("SELECT * FROM clientes "
                            + "WHERE cliente_id = ? ");// yo sería el responsable de parsear o tratar ese parametro

            //enviar los parametros a la consulta
            stmt.setInt(1, id);// se asegura de escapar cualquier inyección no deseada

            ResultSet respuesta = stmt.executeQuery();

            while (respuesta.next()) {

                temp = new Cliente(
                        respuesta.getInt("cliente_id"),
                        respuesta.getString("nombre"),
                        respuesta.getString("correo"),
                        respuesta.getString("rtn"),
                        respuesta.getString("estado"),
                        respuesta.getString("fecha_creacion")
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

        return temp;

    }

    //TODO: deben crear, el metodo para crear, actualizar y eliminar un cliente
}
