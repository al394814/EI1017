package EntradaSalida.ListadosQuePuedoObtener;

import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.List;

public class ListarPersonasNoResponsablesDeTareas  {

    public static void listarPersonasNoResponsablesDeTareas(Proyecto proyecto){

        List<Persona> personasNoResponsablesTareas =UtilidadesParaListas.elementosConListaVacia(proyecto.getPersona());
        if (personasNoResponsablesTareas.isEmpty())
            System.out.print("NO HAY PERSONAS QUE NO SEAN RESPONSABLES DE TAREAS\n");
        for (Persona persona: personasNoResponsablesTareas ){
            System.out.print(persona+"\n\n");
        }
    }

}
