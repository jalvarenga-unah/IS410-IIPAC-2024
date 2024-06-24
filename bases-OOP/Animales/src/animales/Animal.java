/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author juanalvarenga
 */
abstract class Animal {

    //publicas
    final protected String nombre; // final convierte a la propiedad en una constante
    public int  edad; 
    public String tipoAlimento;

    Animal(String nombre, int edad, String tipoAlimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAlimento = tipoAlimento;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + " edad: " + this.edad);
        System.out.println("come: " + tipoAlimento);
    }
    
    public void dormir(){
        System.out.println(nombre+ " está durmiendo");
    }
    
//    public void ejecutarDormir(){
//        dormir(); // puedo acceder si es privado
//    }
    
}
