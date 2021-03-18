package Proyecto;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Tareas;

public class Proyecto {

    private String nombre;
    private Persona persona;
    private Tareas tareas;


    public Proyecto(){

    }

    public  Proyecto(String nombre,Persona persona,Tareas tareas){
        this.nombre=nombre;
        this.persona=persona;
        this.tareas=tareas;
    }

    public Persona getPersona(){
        return persona;
    }//devuelvo la lista pero si no es asi lo cambiare
}
