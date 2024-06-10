/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heroesapp;

/**
 *
 * @author juanalvarenga
 */
public class Villano {
    
    String nombre;
    String poder;
    String debilidad;
    
    
    // Creando uno nuevo
    Villano(String nombre, String poder, String debilidad){
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
    }
  
    
    //sobreescribiendo el metodo
    @Override
    public String toString(){
//        ❌ quitando el comportamiento por defecto
//        return super.toString();
        return this.nombre+ ", su poder es: " +this.poder;
    }
}
