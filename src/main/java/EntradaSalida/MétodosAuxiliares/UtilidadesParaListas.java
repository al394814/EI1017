package EntradaSalida.MétodosAuxiliares;

import Proyecto.Tareas.Tarea;

import java.util.LinkedList;
import java.util.List;

public class UtilidadesParaListas<T> {

    public static <T> boolean elementosConListaVacía(List<T> listaObjetosDeListas){

        List<T> listaResultante = new LinkedList<T>();

        return listaObjetosDeListas.isEmpty();
    }

    public static <T extends Tarea> boolean objetoEstaEnListaObjetos(T objetoNuevo, List<T> listaObjetos){

        for (T objetoDeLaLista: listaObjetos){
            if (objetoDeLaLista.getClave().equals(objetoNuevo.getClave()))
                return false;
        }
        return true;
    }

}
