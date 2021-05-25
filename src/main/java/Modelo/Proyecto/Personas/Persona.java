package Modelo.Proyecto.Personas;

import Modelo.Metodos.TieneClave;
import Modelo.Metodos.TieneLista;
import Modelo.Proyecto.Tareas.Tarea;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Persona implements TieneLista<Tarea>, TieneClave<String>, Serializable {

    String nombre;
    String dni;
    String correoElectrónico;
    LinkedList<Tarea> listaTareas;

    public Persona(){}

    public Persona(String nombre, String dni, String correoElectrónico){
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

    public void añadirTareasBajoSuResponsabilidad(List<Tarea> TareasResponsable){
        this.listaTareas= (LinkedList<Tarea>) TareasResponsable;
    }

    public void añadirTareas( Tarea tarea){
        this.listaTareas.add(tarea);
    }

    @Override
    public String toString() {
        return  "nombre ---> '" + this.nombre + '\'' +
                "\ndni ---> '" + this.dni + '\'' +
                "\ncorreoElectrónico ---> '" + this.correoElectrónico + '\'' +
                "\ntareas Responsable ---> " + this.imprimirListaTareas();
    }

    public StringBuilder imprimirListaTareas(){

        StringBuilder sb = new StringBuilder(1000*10000);

        for (Tarea tarea: this.getListaTareas())
            sb.append(tarea.getTítulo()+" ");

        return sb;
    }

    public List getLista() {
        return listaTareas;
    }

    public String getClave() {
        return getDni();
    }
}
