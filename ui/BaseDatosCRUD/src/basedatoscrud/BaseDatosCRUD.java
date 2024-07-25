/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basedatoscrud;

import java.sql.Connection;

/**
 *
 * @author juanalvarenga
 */
public class BaseDatosCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection conn = DatabaseConnection.getConnection();
        
        ClientesDB clientes = new ClientesDB(conn);
        
        clientes.getClientes();
        
    }
    
}
