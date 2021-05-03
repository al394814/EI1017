package Interfaz;

import java.io.*;
import java.util.Scanner;

import EntradaSalida.*;
import EntradaSalida.Excepciones.PedimosUnosDatosSeIntroducenOtrosException;
import EntradaSalida.ListadosQuePuedoObtener.ListarPersonasNoResponsablesDeTareas;
import EntradaSalida.ListadosQuePuedoObtener.ListarPersonasProyecto;
import EntradaSalida.ListadosQuePuedoObtener.ListarTareasProyecto;
import EntradaSalida.ListadosQuePuedoObtener.ListarTareasSinPersonasAsignadas;
import Proyecto.Proyecto;

public class MenuPrograma {

    public static void MenúPrograma (Proyecto proyecto) throws IOException {

        Scanner scanner = new Scanner(System.in);
        boolean respuesta=true;
        while (respuesta){
        System.out.println(Opciones.OpcionesDelMenú.getMenú());
        System.out.print("ELIJA ");
        int opcion = scanner.nextInt() - 1;
        scanner.nextLine();
        try {
            if (opcion>=0 && opcion<=Opciones.OpcionesDelMenú.numeroOpcionesMenu()) {

                Opciones.OpcionesDelMenú opcionMenú = Opciones.OpcionesDelMenú.getOpcion(opcion);

                switch (opcionMenú) {

                    case DAR_DE_ALTA_TAREAS:
                        DarDeAltaTareas.darDeAltaTareas(scanner, proyecto);
                        break;
                    case DAR_DE_ALTA_PERSONAS:
                        DarDeAltaPersonas.darDeAltaPersonas(scanner, proyecto);
                        break;
                    case ELIMINAR_PERSONA_TAREA:
                        EliminarPersonaTarea.eliminarPersonaTarea(scanner, proyecto);
                        break;
                    case INTRODUCIR_PERSONA_TAREA:
                        IntroducirPersonaTarea.introducirPersonaTarea(scanner, proyecto);
                        break;
                    case LISTAR_TAREAS_PROYECTO:
                        ListarTareasProyecto.listarTareasProyecto(proyecto);
                        break;
                    case LISTAR_PERSONAS_PROYECTO:
                        ListarPersonasProyecto.listarPersonasProyecto(proyecto);
                        break;
                    case MARCAR_TAREA_FINALIZADA:
                        MarcarTareaComoFinalizada.marcarTareaComoFinalizada(scanner, proyecto);
                        break;
                    case LISTAR_TAREAS_SIN_PERSSONAS_ASIGNADAS:
                        ListarTareasSinPersonasAsignadas.listarTareasSinPersonasASigandas(proyecto);
                        break;
                    case LISTAR_PERSONAS_NO_RESPONSABLES_DE_TAREAS:
                        ListarPersonasNoResponsablesDeTareas.listarPersonasNoResponsablesDeTareas(proyecto);
                        break;
                    case CAMBIAR_COSTE_TAREA:
                        CambiarCosteTarea.cambiarCosteTarea(proyecto,scanner);
                        break;
                    case SALIR:
                        respuesta = false;
                        break;
                    default:
                        System.out.println("NO HA SELECCIONADO NINGUNA OPCIÓN VÁLIDA");
                        break;
                }
            }
            else
                throw new PedimosUnosDatosSeIntroducenOtrosException();
        }
            catch (PedimosUnosDatosSeIntroducenOtrosException e){
                System.out.println(e.getMessage());
            }
        }
        FileOutputStream fos = new FileOutputStream(proyecto.getNombre()+".bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(proyecto);
        oos.close();
    }
}
