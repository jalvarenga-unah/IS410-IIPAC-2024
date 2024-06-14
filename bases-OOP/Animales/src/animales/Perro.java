/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author juanalvarenga
 */
public class Perro extends Animal {
    
    // no requiere de una instancia para ser accedida
    static String algo = "son muy juguetones";
    

    Perro(String nombre, int edad, String alimentacion, boolean esMacho) {
//        new Animal(nombre, edad, alimentacion);        
        super(nombre, edad, alimentacion);
    }


    Perro(String nombre, int edad, String alimentacion) {
        super(nombre, edad, alimentacion);
    }

    Perro(String apodo, String nombre, int edad, String alimentacion) {
        super(nombre, edad, alimentacion);
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando");
        System.out.println(nombre + " está ladrando");
    }

}
