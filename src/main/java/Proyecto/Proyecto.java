package Proyecto;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Tarea;

import java.util.LinkedList;
import java.util.List;

public class Proyecto {

    private String nombre;
    private List<Persona> personas;
    private List<Tarea>tareas;

    public Proyecto(){
        this.personas= new LinkedList<Persona>();
        this.tareas=new LinkedList<Tarea>();
    }

//
    public  Proyecto(String nombre){
        this.nombre=nombre;
        this.personas= new LinkedList<Persona>();
        this.tareas=new LinkedList<Tarea>();
    }

    public List<Tarea> getTareas() { return tareas; }

    public List<Persona> getPersona(){
        return personas;
    }

    public static Proyecto creadorProyecto(String nombreProyecto){
        return new Proyecto(nombreProyecto);
    }

    public void añadirPersonaProyecto(Persona personaNueva){
        personas.add(personaNueva);
    }


    public void añadirTareaProyecto(Tarea tareaNueva){
        tareas.add(tareaNueva);
    }

    public List<Tarea> personaListaTareas(String dni) {
        for (Persona persona: this.getPersona())
            if (persona.getDni()==dni)
                return persona.getListaTareas();
        return null;
    }

    public boolean EncontramosDniEnLasPersonasDelProyecto(String dni) {
        for (Persona persona: this.getPersona())
            if (persona.getDni()==dni)
                return true;
        return false;
    }

    public Persona devuelvoPersonaConEsteDni(String dni){

        for (Persona persona: this.getPersona())
            if (persona.getDni()==dni)
                return persona;
        return null;
    }

    public Tarea devuelvoTareaConEsteTítulo(String título){

        for (Tarea tarea: this.getTareas())
            if (tarea.getTítulo()==título)
                return tarea;
        return null;
    }


}



