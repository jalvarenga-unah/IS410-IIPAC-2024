/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaapp;

/**
 *
 * @author juanalvarenga
 */
public class Persona { // "padre"
    
    //1. las propiedades y metodos que estén como "public"
    // pueden ser utilizadas, dentro y fuera de su clase
    
    //2. las propiedades y metodos que estén como "private"
    // solo pueden ser utilizadas dentro de la clase que las contiene
    
    public String nombre;
    public int edad;
    
    // Constructor
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;       
    }
    
    
    public void mostrarInformacion(){
        System.out.println("Persona: nombre "+ nombre+ ", edad "+ edad);
    }
   
}
