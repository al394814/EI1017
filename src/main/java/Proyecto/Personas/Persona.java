package Proyecto.Personas;

import EntradaSalida.TieneClave;
import EntradaSalida.TieneLista;
import Proyecto.Tareas.Tarea;

import java.util.LinkedList;
import java.util.List;

public class Persona implements TieneLista, TieneClave {

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
        this.listaTareas.addAll(TareasResponsable);
    }

    @Override
    public String toString() {
        return "\nPERSONA\n" +
                "\nnombre ---> '" + this.nombre + '\'' +
                "\ndni ---> '" + this.dni + '\'' +
                "\ncorreoElectrónico ---> '" + this.correoElectrónico + '\'' +
                "\nlistaTareas ---> " + this.imprimirListaTareas();
    }

    public StringBuilder imprimirListaTareas(){

        StringBuilder sb = new StringBuilder(1000*10000);

        for (Tarea tarea: this.getListaTareas())
            sb.append(tarea.getTítulo()+", ");

        return sb;
    }

    public List getLista() {
        return listaTareas;
    }

    public Object getClave() {
        return getDni();
    }
}
