package Proyecto.Tareas;

import EntradaSalida.TieneClave;
import EntradaSalida.TieneLista;
import Proyecto.Personas.Persona;
import Proyecto.Tareas.Facturaciones.Facturacion;
import Proyecto.Tareas.Resultado.Resultado;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Tarea implements TieneLista<Persona>, TieneClave<String>, Serializable {

    String título;
    String descripción;
    LinkedList<Persona> personas;
    Persona responsable;
    int prioridad;
    Fecha atributosFecha;
    Resultado ResultadoTarea;
    LinkedList<String> etiquetas;
    double coste;
    Facturacion facturacion;
    double dineroFacturado;




    public Tarea(String titulos, String descripción, LinkedList<Persona> personas, Persona responsable, int prioridad, Fecha atributosFecha, Resultado ResultadosTarea, LinkedList<String> etiquetas, double coste, Facturacion facturacion) {
        this.título = titulos;
        this.descripción = descripción;
        this.personas = personas;
        this.responsable = responsable;
        this.prioridad = prioridad;
        this.atributosFecha = atributosFecha;
        this.ResultadoTarea = ResultadosTarea;
        this.etiquetas = etiquetas;
        this.coste=coste;
        this.facturacion = facturacion;

    }

    public String getTítulo() {
        return título;
    }
    public LinkedList<Persona> getPersonas(){ return personas; }
    public Fecha getAtributosFecha() {
        return atributosFecha;
    }
    public void setCoste(double coste) {
        this.coste = coste;
    }
    public static Tarea añadirTareaProyecto(String titulos, String descripción, LinkedList<Persona> personas, Persona responsable, int prioridad, Fecha atributosFecha, Resultado resultadosTarea, LinkedList<String> etiquetas,double coste,Facturacion facturacion){
        return new Tarea(titulos,descripción,personas,responsable,prioridad,atributosFecha,resultadosTarea,etiquetas,coste,facturacion);
    }

    public void addPersonasTarea(Persona persona) {
        this.personas.add(persona);
    }

    public void eliminarPersonaTarea(Persona persona){
        this.personas.remove(persona);
    }

    public int númeroPersonas(){return personas.size();}

    @Override
    public String toString() {
        String nombre;
        if (this.responsable==null)
            nombre="";
        else
            nombre=this.responsable.getNombre();

        return  "\ntítulo ---> '" + this.título + '\'' +
                "\nresponsable de la tarea ---> " + nombre + ""+
                "\npersonas asignadas a la tarea ---> " + this.imprimirPorPantallaPersonasDeLaTarea() +
                "\nestado de la tarea ---> " + this.atributosFecha.imprimirEstadoTarea() +
                "\nResultadoTarea ---> " + this.ResultadoTarea +
                "\nCosteTarea ---> " + this.coste +"€"+
                "\nFacturación ---> " + this.facturacion.getCalculoFacturacion(coste)+"€";
    }

    public String imprimirPorPantallaPersonasDeLaTarea(){
        StringBuilder sb = new StringBuilder(númeroPersonas()*30);
        for (Persona persona: this.getPersonas()){
            sb.append(persona.getNombre()+" ");
        }

        return sb.toString();
    }

    public boolean EstadoTarea(){
        return this.getAtributosFecha().getFinalizado();
    }

    public void finalizarTarea(){
        this.getAtributosFecha().Finalizar();
    }


    public List getLista() {
        return personas;
    }

    public String getClave() {
        return getTítulo();
    }

    public void setFacturacion(Facturacion facturacion) {
        this.facturacion = facturacion;
    }

}
