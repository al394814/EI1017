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
            System.out.print("\nINTRODUCE EL TÍTULO DE LA TAREA DE LA CUAL QUIERE BORRAR UNA PERSONA ---> ");
            String título = sc.nextLine();
            if (!UtilidadesParaListas.objetoEstaEnListaObjetos(título,proyecto.getTareas())) {

                try {
                System.out.print("\nINTRODUCE EL DNI DE LA PERSONA QUE DESEA ELIMINAR DE LA TAREA " + título + " ---> ");
                String dni = sc.nextLine();
                if (!UtilidadesParaListas.objetoEstaEnListaObjetos(dni,proyecto.getPersona())) {
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
                    System.out.println(e.getMessage());
                }
            }
            else{
                throw new TareaNoSeEncuentraEnProyectoException();
            }
        }
        catch (TareaNoSeEncuentraEnProyectoException e){
            System.out.println(e.getMessage());
        }
    }
}
