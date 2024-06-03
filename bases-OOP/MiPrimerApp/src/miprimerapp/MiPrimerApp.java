package miprimerapp;

/**
 *
 * @author juanalvarenga
 */
public class MiPrimerApp {

    int edad = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //variables para crear mi primer objeto
        String nombre = "Juan";
        int edad = 7;

        System.out.println("=========== variables dentro de main ============");
        System.out.println(nombre);
        System.out.println(edad);

        Persona p1 = new Persona(); // La instancia de la clase "Persona"

        // concatenación
        nombre = nombre + " Enrique";

        //asignación de valores a las propiedades
        p1.setNombre(nombre);
        p1.edad = edad;

        System.out.println("=========== propiedades de la clase P1 ============");
        System.out.println(p1.getNombre()); //get
        System.out.println(p1.edad);

        Persona p2 = new Persona();

        //inicialización de las propiedades
//        p2.nombre = "Pedro";
        p2.setNombre("    ");

        System.out.println("=========== propiedades de la clase P2 ============");
        System.out.println(p2.getNombre());
        System.out.println(p2.edad);

        // es una Instancia (extensión) de la clase MyPrimerApp
        // "this", hace referencia hacia si misma (MiPrimerApp)
//        this.edad = 20;
    }

}
