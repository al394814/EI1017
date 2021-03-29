package EntradaSalida;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.List;
import java.util.Scanner;


public class TareasResponsablePersona {

    public static void TareasResponsablePersona(Scanner sc, Proyecto proyecto){

        System.out.println("\nHA SELECCIONADO LA OPCIÓN INTRODUCIR TAREAS BAJO LA RESPONSABILIDAD DE UNA PERSONA\n");

        System.out.println("\nA QUE PERSONA QUIERE ADJUDICARLE LAS TAREAS DE LAS QUE SEA RESPONSABLE, IDENTIFIQUELO CON SU DNI ---> ");
        String dni = sc.next();

        Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
        List<Tarea> tareasResponsable = persona.getListaTareas();

        boolean quedanTareasPorIntroducir=true;
        while (quedanTareasPorIntroducir){

            System.out.println("\nINTRODUCE EL TÍTULO DE LA TAREA PARA IDENTIFICARLA ---> ");
            String título = sc.next();
            Tarea  tarea = proyecto.devuelvoTareaConEsteTítulo(título);
            tareasResponsable.add(tarea);

            System.out.println("\nDESEA INTRODUCIR MÁS TAREAS? (SI/NO) ---> ");
            String respuesta = sc.next();
            if ("NO".equals(respuesta))
                quedanTareasPorIntroducir=false;

        }
        System.out.println("\nHA INCLUIDO TODAS LAS TAREAS DE LAS QUE ES RESPONSABLE "+dni+".");
        persona.añadirTareasBajoSuResponsabilidad(tareasResponsable);
    }
}
