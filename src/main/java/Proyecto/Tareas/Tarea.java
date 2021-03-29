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

    public String getTítulo() {
        return título;
    }


    public static Tarea añadirTareaProyecto(String titulos, String descripción, LinkedList<Persona> personas, Persona responsable, int prioridad, Fecha atributosFecha, Resultado resultadosTarea, LinkedList<String> etiquetas){
        return new Tarea(titulos,descripción,personas,responsable,prioridad,atributosFecha,resultadosTarea,etiquetas);
    }

    public void addPersonasTarea(Persona persona) {
        this.personas.add(persona);
    }

    public void eliminarPersonaTarea(Persona persona){
        this.personas.remove(persona);
    }
    public LinkedList<Persona> getPersonas(){
        return personas;
    }
    public int númeroPersonas(){return personas.size();}

    @Override
    public String toString() {
        return "\nTAREA\n" +
                "\ntítulo ---> '" + this.título + '\'' +
                "\nresponsable de la tarea ---> " + this.responsable.getNombre() + ""+
                "\npersonas asignadas a la tarea ---> " + this.imprimirPorPantallaPersonasDeLaTarea() +
                "\nestado de la tarea ---> " + this.atributosFecha.imprimirEstadoTarea() +
                "\nResultadoTarea ---> " + this.ResultadoTarea ;
    }

    public StringBuilder imprimirPorPantallaPersonasDeLaTarea(){
        StringBuilder sb = new StringBuilder(númeroPersonas()*30);
        for (Persona persona: this.getPersonas()){
            sb.append(persona.getNombre()+", ");
        }
        sb.append(".");

        return sb;
    }

}