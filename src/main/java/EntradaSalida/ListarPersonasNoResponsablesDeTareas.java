package EntradaSalida;

import EntradaSalida.MétodosAuxiliares.AñadoListaObjetosCumplenCondición;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;

import java.util.List;

public class ListarPersonasNoResponsablesDeTareas  {

    public static void listarPersonasNoResponsablesDeTareas(Proyecto proyecto){


        List<Persona> listaPersonasNoResponsablesDeTareas;
        listaPersonasNoResponsablesDeTareas = AñadoListaObjetosCumplenCondición.añadoListaObjetosCumplenCondición(proyecto.getPersona());

        for (Persona persona: listaPersonasNoResponsablesDeTareas){
            persona.toString();
        }
    }

}
