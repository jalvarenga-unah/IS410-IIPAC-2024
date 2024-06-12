/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaapp;

/**
 *
 * @author juanalvarenga
 */
public class HerenciaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String asignaturas[] = {"POO","Diseño Digital"};
        
        Persona p1 = new Persona("Juan", 30);
        Estudiante e1 = new Estudiante("Enrique", 29, asignaturas);
        
        Profesor prof1 = new Profesor("Pedro Perez", 40, "Ing. en Sistemas");
        
        
        p1.mostrarInformacion();
        
        e1.mostrarInformacion();
        
        prof1.mostrarInformacion();
        
        System.out.println(e1.asignaturas);
                
                

    }
    
}
