package EntradaSalida.ListadosQuePuedoObtener;

import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

public class ListarTareasProyecto {

    public static void listarTareasProyecto(Proyecto proyecto){

        StringBuilder sb = new StringBuilder(10000*10000);
        int contadorTareas=0;
        for (Tarea tarea: proyecto.getTareas()) {

            sb.append("\nTAREA "+(contadorTareas+1)+":"+ tarea.toString());
            contadorTareas++;
        }
        System.out.println(sb.toString());
    }

}
