package EntradaSalida;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.Scanner;

public class IntroducirPersonaTarea {

    public static void introducirPersonaTarea(Scanner sc, Proyecto proyecto){

        System.out.println("\nINTRODUCE EL TÍTULO DE LA TAREA QUE DESEAS AÑADIR ---> ");
        String título = sc.next();
        Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(título);
        System.out.println("\nINTRODUCE EL DNI DE LA PERSONA QUE DESEA AÑADIR DE LA TAREA "+título+" ---> ");
        String dni = sc.next();
        Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
        System.out.println("\nLA TAREA HA FINALIZADO CON ÉXITO.");

        tarea.addPersonasTarea(persona);

    }

}
