package EntradaSalida;

import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

public class ListarTareasProyecto {

    public String listarTareasProyecto(Proyecto proyecto){

        StringBuilder sb = new StringBuilder(10000*10000);//Debe existir una forma mejor que esta, per me he estado informando pero no he encontrado nada mejor.

        for (Tarea tarea: proyecto.getTareas())

            sb.append("\n"+tarea.toString()+"\n");

        return sb.toString();
    }

}
