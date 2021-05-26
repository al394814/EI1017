package Modelo.Metodos;

import Modelo.Proyecto.Personas.Persona;

import java.util.LinkedList;
import java.util.List;

public class UtilidadesParaListas<T> {

    public static <T extends TieneLista<E>,E> LinkedList<T> elementosConListaVacia(List<Persona> listaObjeto){

        LinkedList<T> listaResultado = new LinkedList<T>();

        for (Persona objeto: listaObjeto)
            if (objeto.getLista().isEmpty())
                listaResultado.add((T) objeto);

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

