/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatoscrud;

import java.util.Vector;

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

    public static final String[] columnas = {"Cliente ID", "Nombre", "Correo", "RTN", "Estado"};

    public Cliente(int cliente_id, String nombre, String correo, String rtn, String estado, String fecha_creacion) {
        this.cliente_id = cliente_id;
        this.nombre = nombre;
        this.correo = correo;
        this.rtn = rtn;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return nombre + "-" + rtn;
    }

    public Vector toVector() {

        Vector temp = new Vector();

        temp.add(cliente_id);
        temp.add(nombre);
        temp.add(correo);
        temp.add(rtn);
        temp.add(estado);
        temp.add(fecha_creacion);// se descarta, porque no se encuentra en el array de columnas

        return temp;

    }

}
