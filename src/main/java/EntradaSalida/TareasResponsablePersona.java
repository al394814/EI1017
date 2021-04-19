package EntradaSalida;

import EntradaSalida.Excepciones.PersonaNoSeEncuentraEnProyectoException;
import EntradaSalida.Excepciones.TareaNoSeEncuentraEnProyectoException;
import EntradaSalida.MétodosAuxiliares.DeseaIntroducirMásDatos;

import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.List;
import java.util.Scanner;

import static EntradaSalida.MétodosAuxiliares.UtilidadesParaListas.objetoEstaEnListaObjetos;


public class TareasResponsablePersona  {

    public static void TareasResponsablePersona(Scanner sc, Proyecto proyecto){

        System.out.print("\nHA SELECCIONADO LA OPCIÓN INTRODUCIR TAREAS BAJO LA RESPONSABILIDAD DE UNA PERSONA");


        try {
            System.out.print("\nA QUE PERSONA QUIERE ADJUDICARLE LAS TAREAS DE LAS QUE SEA RESPONSABLE, IDENTIFIQUELO CON SU DNI ---> ");
            String dni = sc.next();
            if (objetoEstaEnListaObjetos(dni,proyecto.getPersona())){

            Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
            List<Tarea> tareasResponsable = persona.getListaTareas();

            boolean quedanTareasPorIntroducir = true;
            while (quedanTareasPorIntroducir) {

                try {
                    System.out.print("\nINTRODUCE EL TÍTULO DE LA TAREA PARA IDENTIFICARLA ---> ");
                    String título = sc.next();
                    if (UtilidadesParaListas.objetoEstaEnListaObjetos(título, proyecto.getTareas())) {
                        Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(título);
                        tareasResponsable.add(tarea);

                    } else {
                        throw new TareaNoSeEncuentraEnProyectoException();
                    }
                } finally {
                    quedanTareasPorIntroducir = DeseaIntroducirMásDatos.deseaIntroducirMásDatos("TAREAS", sc);
                }

            }
            System.out.println("\nHA INCLUIDO TODAS LAS TAREAS DE LAS QUE ES RESPONSABLE " + dni + ".");
            persona.añadirTareasBajoSuResponsabilidad(tareasResponsable);
            }
            else{
                throw new PersonaNoSeEncuentraEnProyectoException();
            }
        }
        catch (PersonaNoSeEncuentraEnProyectoException e) {
            e.printStackTrace();
        }
        catch (TareaNoSeEncuentraEnProyectoException e){
            e.printStackTrace();
        }
    }
}
