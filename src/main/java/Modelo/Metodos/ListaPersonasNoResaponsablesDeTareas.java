package Modelo.Metodos;

import Modelo.Proyecto.Personas.Persona;
import Modelo.Proyecto.Proyecto;

import java.util.LinkedList;
import java.util.List;

public class ListaPersonasNoResaponsablesDeTareas {


    public static LinkedList<Persona> ListaPersonasNoResaponsablesDeTareas(Proyecto proyecto) {

            LinkedList<Persona> personasNoResponsablesTareas =UtilidadesParaListas.elementosConListaVacia(proyecto.getPersona());
            return personasNoResponsablesTareas;
    }

}
