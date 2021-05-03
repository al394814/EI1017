package EntradaSalida;

import EntradaSalida.Excepciones.DarDeAltaTareasException;
import EntradaSalida.Excepciones.PersonaResponsableNoEstaEnListaException;
import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Facturaciones.ConsumoInterno;
import Proyecto.Tareas.Facturaciones.Descuento;
import Proyecto.Tareas.Facturaciones.Facturacion;
import Proyecto.Tareas.Facturaciones.Urgente;
import Proyecto.Tareas.Fecha;
import Proyecto.Tareas.Tarea;

import java.util.LinkedList;
import java.util.Scanner;

import static EntradaSalida.MétodosAuxiliares.ListaPersonasAsignadasTarea.listaPersonasAsignadasTarea;
import static EntradaSalida.MétodosAuxiliares.PedirAlUsuarioListaDeEtiquetasDeUnaTarea.PedirAlUsuarioListaDeEtiquetasDeUnaTarea;
import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMasDatos.deseaIntroducirMásDatos;

public class DarDeAltaTareas  {

    public static void darDeAltaTareas(Scanner sc, Proyecto proyecto) {

        System.out.println("\nHA SELECCIONADO LA OPCIÓN DAR DE ALTA TAREAS DE UN PROYECTO\n");
        System.out.println("DEBE INTRODUCIR TODAS LAS TAREAS DEL PROYECTO CON SUS DATOS");

        boolean quedanTareasPorIntroducir = true;
        Persona personaResponsable;

        while (quedanTareasPorIntroducir) {
            System.out.print("\nTÍTULO ---> ");
            String título = sc.nextLine();
            try {
                if (!UtilidadesParaListas.objetoEstaEnListaObjetos(título, proyecto.getTareas()))
                    throw new DarDeAltaTareasException();
            } catch (DarDeAltaTareasException e) {
                System.out.println(e.getMessage());
                while (true) {
                    System.out.print("INTRODUCE EL TÍTULO DE OTRA TAREA ---> ");
                    título = sc.nextLine();
                    if (UtilidadesParaListas.objetoEstaEnListaObjetos(título, proyecto.getTareas())) {
                        break;
                    }
                }
            }
            System.out.print("\nDESCRIPCIÓN ---> ");
            String descripción = sc.nextLine();
            LinkedList<Persona> listaPersonasAsignadasTarea = listaPersonasAsignadasTarea(sc, proyecto);
            System.out.print("\nINTRODUCE EL RESPONSABLE DE LA TAREA(ESTA PERSONA DEBE ESTAR ENTRE LAS PERSONA ASIGNADAS A LA TAREA) ---> ");
            String dniResponsable = sc.nextLine();
            try {
                if (!listaPersonasAsignadasTarea.contains(proyecto.devuelvoPersonaConEsteDni(dniResponsable))) {
                    throw new PersonaResponsableNoEstaEnListaException();
                }
            }
            catch (PersonaResponsableNoEstaEnListaException e) {
                System.out.println(e.getMessage());
                while (true) {
                    System.out.print("INTRODUZCA UN DNI VÁLIDO --->");
                    String nuevoDNIresponsable = sc.nextLine();
                    if (listaPersonasAsignadasTarea.contains(proyecto.devuelvoPersonaConEsteDni(nuevoDNIresponsable))) {
                        dniResponsable=nuevoDNIresponsable;
                        System.out.println("ESTE DNI ES VÁLIDO\n");
                        break;
                    } else
                        System.out.println(e.getMessage());
                }
            }
            personaResponsable=proyecto.devuelvoPersonaConEsteDni(dniResponsable);
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

            System.out.print("\nINTRODUCE EL COSTE DE LA TAREA ---> ");
            int coste = sc.nextInt();
            sc.nextLine();
            System.out.print("\n1.-consumo intero\n2.-descuento\n3.-urgente");
            System.out.print("\nINTRODUCE EL TIPO DE FACTURACION ---> ");
            int tipoFacturacion= sc.nextInt();

            while (tipoFacturacion<0 && tipoFacturacion>4) {
                System.out.print("DATO INCORRECTO, SIGA LAS INDICACIONES");
                tipoFacturacion = sc.nextInt();
            }

            sc.nextLine();
            Facturacion facturacion=null;
            switch (tipoFacturacion){
                case 1:
                    facturacion =new Facturacion(new ConsumoInterno());
                    break;
                case 2:
                    facturacion = new Facturacion(new Descuento());
                    break;
                case 3:
                    facturacion = new Facturacion(new Urgente());
                    break;
            }
            facturacion.getCalculoFacturacion(coste);



            proyecto.añadirTareaProyecto(Tarea.añadirTareaProyecto(título, descripción, listaPersonasAsignadasTarea, personaResponsable, prioridad, atributosFecha, null, etiquetas,coste,facturacion));
            personaResponsable.añadirTareas(proyecto.devuelvoTareaConEsteTítulo(título));
            quedanTareasPorIntroducir = deseaIntroducirMásDatos("TAREAS", sc);
            System.out.println("\nLA TAREA HA FINALIZADO CON ÉXITO.");
        }
    }
}


