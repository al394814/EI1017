package EntradaSalida;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.List;
import java.util.Scanner;

public class TareasResponsablePersona {

    public void TareasResponsablePersona(Scanner sc, Proyecto proyecto){

        System.out.println("\nHA SELECCIONADO LA OPCIÓN INTRODUCIR TAREAS BAJO LA RESPONSABILIDAD DE UNA PERSONA\n");

        System.out.println("\nA QUE PERSONA QUIERE ADJUDICARLE LAS TAREAS DE LAS QUE SEA RESPONSABLE, IDENTIFIQUELO CON SU DNI ---> ");
        String dni = sc.next();

        proyecto.personaTareas(proyecto, dni);

        System.out.println("\nDEBE INTRODUCIR TODAS LAS TAREAS DE "+dni+" CON TODOS SUS DATOS");
        boolean quedanTareasPorIntroducir=true;
        while (quedanTareasPorIntroducir){

        }
    }
}
