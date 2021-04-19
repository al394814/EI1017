package EntradaSalida;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.io.Serializable;
import java.util.Scanner;

public class EliminarPersonaTarea implements Serializable {

    public static void eliminarPersonaTarea(Scanner sc, Proyecto proyecto){

        System.out.println("\nINTRODUCE EL TÍTULO DE LA TAREA QUE DESEAS ELIMINAR ---> ");
        String título = sc.next();
        Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(título);
        System.out.println("\nINTRODUCE EL DNI DE LA PERSONA QUE DESEA ELIMINAR DE LA TAREA "+título+" ---> ");
        String dni = sc.next();
        Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
        System.out.println("\nLA TAREA HA FINALIZADO CON ÉXITO.");

        tarea.eliminarPersonaTarea(persona);
    }

}
