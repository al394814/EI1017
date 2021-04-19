package EntradaSalida;

import EntradaSalida.Excepciones.PersonaNoSeEncuentraEnProyectoException;
import EntradaSalida.Excepciones.TareaNoSeEncuentraEnProyectoException;
import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.Scanner;

public class EliminarPersonaTarea {

    public static void eliminarPersonaTarea(Scanner sc, Proyecto proyecto) {

        try {
            System.out.println("\nINTRODUCE EL TÍTULO DE LA TAREA QUE DESEAS ELIMINAR ---> ");
            String título = sc.next();
            if (UtilidadesParaListas.objetoEstaEnListaObjetos(título,proyecto.getTareas())) {

                try {
                System.out.println("\nINTRODUCE EL DNI DE LA PERSONA QUE DESEA ELIMINAR DE LA TAREA " + título + " ---> ");
                String dni = sc.next();
                if (UtilidadesParaListas.objetoEstaEnListaObjetos(dni,proyecto.getPersona())) {
                    System.out.println("\nLA TAREA HA FINALIZADO CON ÉXITO.");
                    Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
                    Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(título);
                    tarea.eliminarPersonaTarea(persona);
                }
                else {
                    throw new PersonaNoSeEncuentraEnProyectoException();
                }
                }
                catch (PersonaNoSeEncuentraEnProyectoException e){
                    e.printStackTrace();
                }
            }
            else{
                throw new TareaNoSeEncuentraEnProyectoException();
            }
        }
        catch (TareaNoSeEncuentraEnProyectoException e){
            e.printStackTrace();
        }
    }
}
