package Interfaz;

import java.io.*;
import java.util.Scanner;

import EntradaSalida.*;
import Proyecto.Proyecto;

public class MenuPrograma {

    public static void MenúPrograma (Proyecto proyecto) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("proyecto.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(proyecto);
        oos.close();

        FileInputStream fis = new FileInputStream("proyecto.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        proyecto = (Proyecto)ois.readObject();
        ois.close();

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
