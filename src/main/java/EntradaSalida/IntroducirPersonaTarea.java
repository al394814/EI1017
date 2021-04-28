package EntradaSalida;

import EntradaSalida.Excepciones.PersonaNoSeEncuentraEnProyectoException;
import EntradaSalida.Excepciones.TareaNoSeEncuentraEnProyectoException;
import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.Scanner;

public class IntroducirPersonaTarea {

    public static void introducirPersonaTarea(Scanner sc, Proyecto proyecto){
        try {
            System.out.print("\nINTRODUCE EL TÍTULO DE LA TAREA DONDE DESEAS AÑADIR UNA PERSONA ---> ");
            String título = sc.nextLine();
            if (!UtilidadesParaListas.objetoEstaEnListaObjetos(título,proyecto.getTareas())) {
                try{
                System.out.print("\nINTRODUCE EL DNI DE LA PERSONA QUE DESEA AÑADIR DE LA TAREA " + título + " ---> ");
                String dni = sc.nextLine();
                if (!UtilidadesParaListas.objetoEstaEnListaObjetos(dni,proyecto.getPersona())){
                    System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO.");
                    Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(título);
                    Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
                    tarea.addPersonasTarea(persona);
                }
                else {
                    throw new PersonaNoSeEncuentraEnProyectoException();
                    }
                }
                catch (PersonaNoSeEncuentraEnProyectoException e){
                    System.out.print(e.getMessage());
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
