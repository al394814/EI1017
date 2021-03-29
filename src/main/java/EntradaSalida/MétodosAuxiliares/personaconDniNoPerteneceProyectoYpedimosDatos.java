package EntradaSalida.MétodosAuxiliares;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;

import java.util.Scanner;

public class personaconDniNoPerteneceProyectoYpedimosDatos {


    public static Persona personaconDniNoPerteneceProyectoYpedimosDatos(Proyecto proyecto, Scanner sc, String dni){

        System.out.println("\nHAS INTRODUCIDO EN LA LISTA DE PERSONAS QUE PARTICIPAN EN UNA TAREA, UNA PEROSONA QUE NO PERTENECE AL PROYECTO, POR LO TANTO, HAY QUE AÑADIRLA.");
        System.out.println("\nNOMBRE ---> ");
        String nombre = sc.next();
        System.out.println("CORREO ELECTRÓNICO ---> ");
        String correoElectrónico = sc.next();

        Persona persona = Persona.creoPersona(nombre,dni,correoElectrónico);
        proyecto.añadirPersonaProyecto(persona);
        return persona;
    }
}
