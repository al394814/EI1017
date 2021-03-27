package Proyecto.Personas;

import Proyecto.Tareas.Tarea;

import java.util.LinkedList;

public class Persona {

    String nombre;
    String dni;
    String correoElectrónico;
    LinkedList<Tarea> listaTareas;

    public Persona(){}

    public Persona(String nombre, String dni,String correoElectrónico){
        this.nombre=nombre;
        this.dni=dni;
        this.correoElectrónico=correoElectrónico;
        this.listaTareas=new LinkedList<Tarea>();
    }


    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getCorreoElectrónico() {
        return correoElectrónico;
    }

    public LinkedList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public static Persona creoPersona(String nombre,String dni,String correoElectrónico){

        return new Persona(nombre,dni,correoElectrónico);

    }

}
