/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author juanalvarenga
 */
public class Gato extends Animal implements AccionesAnimales {
    
    Gato(String nombre, int edad, String alimento){
        super(nombre, edad, alimento); //constructor de la clase Padre
    }
    
//    void maullar(){
//        System.out.println(nombre + " estaá maullando");
//    }

    
    @Override
    public void emitirSonido(){
         System.out.println(nombre + " estaá maullando");
    }

    @Override
    public void cazar(String animal) {
       System.out.println(nombre + " se está comiendo un "+ animal);
    }

    @Override
    public void desplazarse() {
        
    }


    
}
