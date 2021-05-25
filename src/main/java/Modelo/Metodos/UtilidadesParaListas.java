package Modelo.Metodos;

import java.util.LinkedList;
import java.util.List;

public class UtilidadesParaListas<T> {

    public static <T extends TieneLista<E>,E> List<T> elementosConListaVacia(List<T> listaObjeto){

        List<T> listaResultado = new LinkedList<T>();

        for (T objeto: listaObjeto)
            if (objeto.getLista().isEmpty())
                listaResultado.add(objeto);

        return listaResultado;
    }

     public static <T extends TieneClave<E>,E> boolean objetoEstaEnListaObjetos(E clave, List<T> listaObjetos){

        for (T objetoDeLaLista: listaObjetos){
            if (objetoDeLaLista.getClave().equals(clave))
                return false;
        }
        return true;
    }
}

