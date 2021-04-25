package EntradaSalida.MétodosAuxiliares;

import Proyecto.Personas.Persona;


import java.util.LinkedList;
import java.util.List;

public class AnyadoListaObjetosCumplenCondicion {

    public static <T extends Persona> List<T> anyadoListaObjetosCumplenCondición(List<T> listaObjeto){

        List<T> listaResultado = new LinkedList<T>();

        for (T objeto: listaObjeto)
            if (UtilidadesParaListas.elementosConListaVacía(objeto.getLista()))
                listaResultado.add(objeto);

        return listaResultado;
    }
}
