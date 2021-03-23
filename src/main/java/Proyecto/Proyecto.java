package Proyecto;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Tareas;

import java.util.List;

public class Proyecto {

    private String nombre;
    private List<Persona> persona;
    private List<Tareas> tareas;



    public Proyecto(){
    }

    public  Proyecto(String nombre,List<Persona> persona,List<Tareas> tareas){
        this.nombre=nombre;
        this.persona=persona;
        this.tareas=tareas;
    }

    public List<Persona> getPersona(){
        return persona;
    }

    public List<Tareas> getTareas() { return tareas; }
}


