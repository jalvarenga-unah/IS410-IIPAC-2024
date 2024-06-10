/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerapp;

/**
 *
 * @author juanalvarenga
 */
public class Producto {
    
    //propiedades publicas
    public String descripcion;
    public double precio;
    public boolean en_stock;
    
    //propiedades privadas
    private double tipo_isv;
    
    
    //Constructor
    Producto(String descripcion, double precio, boolean en_stock){
        this.descripcion = descripcion;
        this.precio = precio;
        this.en_stock = en_stock;
        this.tipo_isv = 0.15;
    }
    
    //getters y setters
    public double getTipoImpuesto(){
        return this.tipo_isv;
    }
    
    /*
        @Exception: puede generar un error
    */
    public void setTipoImpuesto(double isv) throws Exception{
        
        //SOLO PERMITA 0.15 O 0.18
        //Generer una excepción
        if ( isv == 0.15 || isv == 0.18 ){
            // es válido (permitido) 
            tipo_isv = isv;
        }
        else {
            //generar un error
            throw new Exception(" Valor no permitido en el impuesto ");
//            System.out.println();
        }
       
        
       
    }
    
    
}
