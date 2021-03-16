package Proyecto.Personas;

import Proyecto.Tareas.Tareas;

import java.util.LinkedList;

public class Persona {

    String nombre;
    String correoElectrónico;
    LinkedList<Tareas> listaTareas;

    public Persona(){}

    public Persona(String nombre,String correoElectrónico, LinkedList<Tareas> listaTareas){
        this.nombre=nombre;
        this.correoElectrónico=correoElectrónico;
        this.listaTareas=listaTareas;
    }

}
