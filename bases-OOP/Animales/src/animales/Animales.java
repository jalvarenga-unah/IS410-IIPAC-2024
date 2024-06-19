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
        
        Gato michi = new Gato("Colita", 2, "pescado");
//        Animal a1 = new Animal("firulais",3, "croquetas");
    
        System.out.println(Perro.algo);
        
        apolo.emitirSonido();  
        apolo.desplazarse();
//        apolo.ejecutarDormir();
        
        polar.cazar("gallina");
            
//        apolo.ladrar();
        apolo.mostrarInformacion();

        michi.emitirSonido();
//        michi.maullar();
        michi.mostrarInformacion();
        michi.cazar("raton");

    }

}
