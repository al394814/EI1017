package EntradaSalida;

import EntradaSalida.Excepciones.DarDeAltaTareasException;
import EntradaSalida.Excepciones.PersonaResponsableNoEstaEnListaException;
import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Fecha;
import Proyecto.Tareas.Tarea;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

import static EntradaSalida.MétodosAuxiliares.ListaPersonasAsignadasTarea.listaPersonasAsignadasTarea;
import static EntradaSalida.MétodosAuxiliares.PedirAlUsuarioListaDeEtiquetasDeUnaTarea.PedirAlUsuarioListaDeEtiquetasDeUnaTarea;
import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMasDatos.deseaIntroducirMásDatos;

public class DarDeAltaTareas /*implements Serializable*/ {

    public static void darDeAltaTareas(Scanner sc, Proyecto proyecto){

        System.out.println("\nHA SELECCIONADO LA OPCIÓN DAR DE ALTA TAREAS DE UN PROYECTO\n");
        System.out.println("DEBE INTRODUCIR TODAS LAS TAREAS DEL PROYECTO CON SUS DATOS");

        boolean quedanTareasPorIntroducir = true;
        Persona personaResponsable;

        while (quedanTareasPorIntroducir) {

            try {
                System.out.print("\nTÍTULO ---> ");
                String título = sc.nextLine();
                if (UtilidadesParaListas.objetoEstaEnListaObjetos(título,proyecto.getTareas())){

                System.out.print("\nDESCRIPCIÓN ---> ");
                String descripción = sc.nextLine();

                LinkedList<Persona> listaPersonasAsignadasTarea = listaPersonasAsignadasTarea(sc, proyecto);

                System.out.print("\nINTRODUCE EL RESPONSABLE DE LA TAREA(ESTA PERSONA DEBE ESTAR ENTRE LAS PERSONA ASIGNADAS A LA TAREA) ---> ");
                String dniResponsable = sc.nextLine();

                try {
                    if (listaPersonasAsignadasTarea.contains(proyecto.devuelvoPersonaConEsteDni(dniResponsable))) {
                        personaResponsable = proyecto.devuelvoPersonaConEsteDni(dniResponsable);
                    }
                    else throw new PersonaResponsableNoEstaEnListaException();
                }
                catch (PersonaResponsableNoEstaEnListaException e){
                    System.out.println(e.getMessage());
                    while(true){
                        System.out.print("INTRODUZCA UN DNI VÁLIDO --->");
                        String nuevoDNIresponsable= sc.nextLine();
                        if (listaPersonasAsignadasTarea.contains(proyecto.devuelvoPersonaConEsteDni(nuevoDNIresponsable))) {
                            personaResponsable = proyecto.devuelvoPersonaConEsteDni(nuevoDNIresponsable);
                            System.out.println("ESTE DNI ES VÁLIDO");
                            break;
                        }
                        else
                            System.out.println(e.getMessage());
                    }
                }
                System.out.print("\nINDICA LA PRIORIDAD DE LA TAREA, PUNTUANDOLA DEL 1(MUY BAJA) AL 5(MUY ALTA) ---> ");
                int prioridad = sc.nextInt();

                sc.nextLine();
                System.out.print("FECHA DE CREACIÓN ---> ");
                String fechaCreación = sc.nextLine();

                System.out.print("\nFECHA DE FINALIZACIÓN(LA TAREA PUEDE NO HABER FINALIZADO TODAVÍA Y NO DEBERÁ INTRODUCIR NADA) ---> ");
                String fechaFinalización = sc.nextLine();
                boolean finalizado;
                finalizado = !("".equals(fechaFinalización));

                Fecha atributosFecha = Fecha.crearFecha(fechaCreación, fechaFinalización, finalizado);

                LinkedList<String> etiquetas = PedirAlUsuarioListaDeEtiquetasDeUnaTarea(sc);

                //Falta tratar los resultados de la tarea.

                proyecto.añadirTareaProyecto(Tarea.añadirTareaProyecto(título, descripción, listaPersonasAsignadasTarea, personaResponsable, prioridad, atributosFecha, null, etiquetas));
                personaResponsable.añadirTareas(proyecto.devuelvoTareaConEsteTítulo(título));
                quedanTareasPorIntroducir = deseaIntroducirMásDatos("TAREAS", sc);
                System.out.println("\nLA TAREA HA FINALIZADO CON ÉXITO.");
            }
                else{
                    throw new DarDeAltaTareasException();
                }
            }
            catch (DarDeAltaTareasException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
