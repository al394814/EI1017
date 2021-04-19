package Interfaz;

import java.util.Scanner;

import EntradaSalida.*;
import Proyecto.Proyecto;

public class MenúPrograma  {

    public static void MenúPrograma(Proyecto proyecto){

        Scanner scanner = new Scanner(System.in);
        boolean respuesta=true;
        while (respuesta){
        System.out.println(Opciones.OpcionesDelMenú.getMenú());
        System.out.print("ELIJA ");
        int opcion = scanner.nextInt() - 1;
        Opciones.OpcionesDelMenú opcionMenú = Opciones.OpcionesDelMenú.getOpcion(opcion);

        switch (opcionMenú){

            case DAR_DE_ALTA_TAREAS:
                DarDeAltaTareas.darDeAltaTareas(scanner,proyecto);
                break;
            case DAR_DE_ALTA_PERSONAS:
                DarDeAltaPersonas.darDeAltaPersonas(scanner,proyecto);
                break;
            case ELIMINAR_PERSONA_TAREA:
                EliminarPersonaTarea.eliminarPersonaTarea(scanner,proyecto);
                break;
            case INTRODUCIR_PERSONA_TAREA:
                IntroducirPersonaTarea.introducirPersonaTarea(scanner,proyecto);
                break;
            case LISTAR_TAREAS_PROYECTO:
                ListarTareasProyecto.listarTareasProyecto(proyecto);
                break;
            case LISTAR_PERSONAS_PROYECTO:
                ListarPersonasProyecto.listarPersonasProyecto(proyecto);
                break;
            case ASIGNAR_TAREAS_RESPONSABLE_PERSONA:
                TareasResponsablePersona.TareasResponsablePersona(scanner,proyecto);
                break;
            case MARCAR_TAREA_FINALIZADA:
                MarcarTareaComoFinalizada.marcarTareaComoFinalizada(scanner,proyecto);
                break;
            case LISTAR_TAREAS_SIN_PERSSONAS_ASIGNADAS:
                ListarTareasSinPersonasAsignadas.listarTareasSinPersonasASigandas(proyecto);
                break;
            case LISTAR_PERSONAS_NO_RESPONSABLES_DE_TAREAS:
                ListarPersonasNoResponsablesDeTareas.listarPersonasNoResponsablesDeTareas(proyecto);
                break;
            case SALIR:
                respuesta=false;
                break;
            default:
                System.out.println("NO HA SELECCIONADO NINGUNA OPCIÓN VÁLIDA");
                break;
            }

        }

    }
}
