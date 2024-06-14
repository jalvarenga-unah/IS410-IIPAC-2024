/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

/**
 *
 * @author juanalvarenga
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Perro apolo = new Perro("Apolo", 2, "pollito");
        Perro polar = new Perro("Polar", 4, "pollito", true);
        Perro dolar = new Perro("No tiene apodo", "Polar", 4, "pollito");
        

        System.out.println(Perro.algo);
        apolo.ladrar();
        apolo.mostrarInformacion();

        dolar.mostrarInformacion();

    }

}
