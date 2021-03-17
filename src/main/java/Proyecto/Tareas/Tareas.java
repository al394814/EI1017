package Proyecto.Tareas;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Resultado.Resultado;

import java.util.LinkedList;

public class Tareas {

    String título;
    String descripción;
    LinkedList<Persona> personas;
    Persona responsable;
    int prioridad;
    Fecha atributosFecha;
    Resultado ResultadoTarea;
    LinkedList<String> etiquetas;


    public Tareas() {
    }

    public Tareas(String titulos, String descripción, LinkedList<Persona> personas, Persona responsable, int prioridad, Fecha atributosFecha, Resultado ResultadosTarea, LinkedList<String> etiquetas) {
        this.título = titulos;
        this.descripción = descripción;
        this.personas = personas;
        this.responsable = responsable;
        this.prioridad = prioridad;
        this.atributosFecha = atributosFecha;
        this.ResultadoTarea = ResultadosTarea;
        this.etiquetas = etiquetas;

    }


    public void addPersonas(Persona persona) {
        this.personas.add(persona);
    }

    public void eliminarPersona(Persona persona){
        this.personas.remove(persona);
    }
    public int getPersonas(){
        return personas.size();
    }
}