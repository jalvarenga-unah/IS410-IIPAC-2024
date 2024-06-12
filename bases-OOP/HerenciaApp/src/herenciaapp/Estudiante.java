/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaapp;

/**
 *
 * @author juanalvarenga
 */
public class Estudiante extends Persona {
    
    public String[] asignaturas;
    
    Estudiante(String nombre, int edad, String[] asignaturas){

//        ❌ no es la forma correcta de inicializar los datos
//        this.edad = edad;
//        this.nombre = nombre;

        // ⬇️ es el llamado al constructor de la clase Padre
        super( nombre, edad); // ➡️ Persona(nombre, edad)
        
        this.asignaturas = asignaturas;
        
    }
    
    public void mostrarInformacion(){
        System.out.println("Estudiante: nombre "+ super.nombre+ ", edad "+ this.edad);
    }
   
    
}
