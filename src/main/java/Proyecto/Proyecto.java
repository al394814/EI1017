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
    }

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

    public List<Tarea> personaTareas(Proyecto proyecto, String dni) {
        for (Persona persona: proyecto.getPersona())
            if (persona.getDni()==dni)
                return persona.getListaTareas();

        return null;
    }

}



