package EntradaSalida.MétodosAuxiliares;

import EntradaSalida.TieneClave;
import EntradaSalida.TieneLista;
import Proyecto.Tareas.Tarea;

import java.util.LinkedList;
import java.util.List;

public class UtilidadesParaListas<T> {

    public static <T> boolean elementosConListaVacía(List<T> listaObjetosDeListas){

        List<T> listaResultante = new LinkedList<T>();

        return listaObjetosDeListas.isEmpty();
    }

    public static <T extends TieneClave> boolean objetoEstaEnListaObjetos(String identificador, List<T> listaObjetos){

        for (T objetoDeLaLista: listaObjetos){
            if (objetoDeLaLista.getClave().equals(identificador))
                return false;
        }
        return true;
    }

}
