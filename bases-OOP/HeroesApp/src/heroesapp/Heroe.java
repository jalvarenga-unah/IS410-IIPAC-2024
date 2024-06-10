/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroesapp;

/**
 *
 * @author juanalvarenga
 */
public class Heroe {
    
    // propiedades
    String nombre; // Superman
    String poder; // Volar 
    String debilidad; // Criptonita
    
    // "Villano" -> sus propias caracteristicas
    Villano villano; // Gral. Zod 
    
    
    // Constructor
    Heroe(String nombre, String poder, String debilidad, Villano villano ){
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.villano = villano;
    }
    
    // metodos
    
    
    
}
