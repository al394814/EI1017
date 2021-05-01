package EntradaSalida.ListadosQuePuedoObtener;

import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.List;

public class ListarTareasSinPersonasAsignadas  {

    public static void listarTareasSinPersonasASigandas(Proyecto proyecto){
        List<Tarea> tareasSinPersonas = UtilidadesParaListas.elementosConListaVacia(proyecto.getTareas());
        if (tareasSinPersonas.isEmpty())
            System.out.print("NO HAY TAREAS SIN PERSONAS ASIGANDAS\n");
        for (Tarea tarea: tareasSinPersonas )
            System.out.print(tarea+"\n");
    }
}
