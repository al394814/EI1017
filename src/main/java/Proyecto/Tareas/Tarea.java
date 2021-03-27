package Proyecto.Tareas;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Resultado.Resultado;

import java.util.LinkedList;

public class Tarea {

    String título;
    String descripción;
    LinkedList<Persona> personas;
    Persona responsable;
    int prioridad;
    Fecha atributosFecha;
    Resultado ResultadoTarea;
    LinkedList<String> etiquetas;


    public Tarea() {
    }

    public Tarea(String titulos, String descripción, LinkedList<Persona> personas, Persona responsable, int prioridad, Fecha atributosFecha, Resultado ResultadosTarea, LinkedList<String> etiquetas) {
        this.título = titulos;
        this.descripción = descripción;
        this.personas = personas;
        this.responsable = responsable;
        this.prioridad = prioridad;
        this.atributosFecha = atributosFecha;
        this.ResultadoTarea = ResultadosTarea;
        this.etiquetas = etiquetas;

    }


    public void addPersonasTarea(Persona persona) {
        this.personas.add(persona);
    }

    public void eliminarPersonaTarea(Persona persona){
        this.personas.remove(persona);
    }
    public int getPersonas(){
        return personas.size();
    }
}