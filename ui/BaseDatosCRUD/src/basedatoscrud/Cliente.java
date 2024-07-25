/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatoscrud;

/**
 *
 * @author juanalvarenga
 */
public class Cliente {
    
    private int cliente_id;
    private String nombre;
    private String correo;
    private String rtn;
    private String estado;
    private String fecha_creacion;

    public Cliente(int cliente_id, String nombre, String correo, String rtn, String estado, String fecha_creacion) {
        this.cliente_id = cliente_id;
        this.nombre = nombre;
        this.correo = correo;
        this.rtn = rtn;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
    }
    
    
    
    
}
