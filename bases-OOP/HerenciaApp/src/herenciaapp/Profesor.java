/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaapp;

/**
 *
 * @author juanalvarenga
 */
public class Profesor extends Persona {
    
    private String carrera;
    
    Profesor(String nombre, int edad, String carrera){
        super(nombre, edad); // constructor del Padre
        
        this.carrera = carrera;
    }
    
        
    public void mostrarInformacion(){
        System.out.println("Profesor: nombre "+ nombre+ ", edad "+ edad);
    }
   
}
