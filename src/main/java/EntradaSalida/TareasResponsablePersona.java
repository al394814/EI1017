package EntradaSalida;

import EntradaSalida.Excepciones.PersonaNoSeEncuentraEnProyectoException;
import EntradaSalida.Excepciones.TareaNoSeEncuentraEnProyectoException;
import EntradaSalida.MétodosAuxiliares.DeseaIntroducirMasDatos;

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
            String dni = sc.nextLine();
            if (!objetoEstaEnListaObjetos(dni,proyecto.getPersona())){

            Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
            List<Tarea> tareasResponsable = persona.getListaTareas();

            boolean quedanTareasPorIntroducir = true;
            while (quedanTareasPorIntroducir) {

                try {
                    System.out.print("\nINTRODUCE EL TÍTULO DE LA TAREA PARA IDENTIFICARLA ---> ");
                    String título = sc.nextLine();
                    if (!UtilidadesParaListas.objetoEstaEnListaObjetos(título, proyecto.getTareas())) {
                        Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(título);
                        tareasResponsable.add(tarea);
                        quedanTareasPorIntroducir = DeseaIntroducirMasDatos.deseaIntroducirMásDatos("TAREAS", sc);

                    } else {
                        throw new TareaNoSeEncuentraEnProyectoException();
                    }
                } catch (TareaNoSeEncuentraEnProyectoException e){
                    System.out.println(e.getMessage());
                }

            }
            System.out.println("\nHA INCLUIDO TODAS LAS TAREAS DE LAS QUE ES RESPONSABLE " + dni + ".\n");
            persona.añadirTareasBajoSuResponsabilidad(tareasResponsable);
            }
            else{
                throw new PersonaNoSeEncuentraEnProyectoException();
            }
        }

        catch (PersonaNoSeEncuentraEnProyectoException e) {
            System.out.println(e.getMessage());
        }

    }
}
