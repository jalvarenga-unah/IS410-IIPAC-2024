/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerapp;

/**
 *
 * @author juanalvarenga
 */
public class Persona {

    // Propiedades (Publicas) por lo tanto, se comportan como
    // "getters" y "setters"
    //público
    private String nombre;
    int edad;

    //Constructor, se ejecuta al inicio o creación de la instancia
    Persona() {

    }

    //Comportamientos (métodos)
    //retornar el valor de la propiedad nombre
    String getNombre() {
        return this.nombre;
    }

    void setNombre(String nombre) {

        // condicionar que no inicialicen con una cadena vacia
//        if (nombre.length() == 0) {
//            //yo no voy a inicializar la propiedad
//            System.out.println("No se puede inicializar con una cadena vacía");
//        }
        if (nombre.isBlank()) {
            //yo no voy a inicializar la propiedad
            System.out.println("No se puede inicializar con una cadena vacía");
            
            //TODO: generar un excepción
            
            return; // esto finaliza la ejecución del resto de código del método
        } 
            
        this.nombre = nombre;
        
    }
    
    //TODO: crear metodos getter y setter de la propiedad edad

}
