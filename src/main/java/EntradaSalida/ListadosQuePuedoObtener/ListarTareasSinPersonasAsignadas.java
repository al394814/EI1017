package EntradaSalida.ListadosQuePuedoObtener;

import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;


import java.util.List;

import static EntradaSalida.MétodosAuxiliares.AnyadoListaObjetosCumplenCondicion.*;

public class ListarTareasSinPersonasAsignadas  {

    public static void listarTareasSinPersonasASigandas(Proyecto proyecto){

        List<Tarea> listaTareasSinPersonasAsignadas = anyadoListaObjetosCumplenCondición(proyecto.getTareas());
        //TODO no se como solucionar esto, la única forma que se me ocurre es que Tareas extienda a Persona pero no me parece una solución

        for (Tarea tarea: listaTareasSinPersonasAsignadas)
            tarea.toString();
    }

}
