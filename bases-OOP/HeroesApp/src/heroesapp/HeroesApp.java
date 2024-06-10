/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heroesapp;

/**
 *
 * @author juanalvarenga
 */
public class HeroesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Batman y el Joker
        //1. El objeto Villano (requisito)
        Villano joker = new Villano("Joker", "No tiene", "El aburrimiento");
        
        
        //2. El Heroe
        Heroe batman = new Heroe("Batman",
                "El dinero",
                "Recordar a los padres",
                joker
        );
        
        
        System.out.println("----------INFO DE BATMAN----------");
        System.out.println(batman.nombre);
        System.out.println(batman.poder);
        System.out.println(batman.debilidad);
        System.out.println( batman.villano.toString()); // una instancia de Villano

    }

}
