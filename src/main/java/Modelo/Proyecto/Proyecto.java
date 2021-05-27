package Modelo.Proyecto;

import Modelo.Excepciones.DarDeAltaPersonaException;
import Modelo.Excepciones.DarDeAltaTareasException;
import Modelo.Excepciones.PersonaResponsableNoEstaEnListaException;
import Modelo.InterfaceModelo;
import Modelo.Metodos.UtilidadesParaListas;
import Modelo.Proyecto.Personas.Persona;
import Modelo.Proyecto.Tareas.Facturaciones.Facturacion;
import Modelo.Proyecto.Tareas.Fecha;
import Modelo.Proyecto.Tareas.Resultado.Resultado;
import Modelo.Proyecto.Tareas.Tarea;
import Vista.Vista;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Proyecto implements Serializable {

    private String nombre;
    private List<Persona> personas;
    private List<Tarea> tareas;
    private Vista vista;


    public Proyecto(){
        this.personas= new LinkedList<Persona>();
        this.tareas=new LinkedList<Tarea>();
    }



    public Proyecto(String nombre){
        this.nombre=nombre;
        this.personas= new LinkedList<Persona>();
        this.tareas=new LinkedList<Tarea>();
    }
    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getTareas() { return tareas; }

    public List<Persona> getPersona(){
        return personas;
    }

    public static Proyecto creadorProyecto(String nombreProyecto) {
        Proyecto proyecto;
        proyecto = new Proyecto(nombreProyecto);
        try {
            FileInputStream fis = new FileInputStream(nombreProyecto+".bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            proyecto = (Proyecto)ois.readObject();
            ois.close();
        }
        catch (FileNotFoundException e){
            System.out.print("EL SISTEMA NO ENCUENTRA EL ARCHIVO\n");
        }
        catch (IOException e){
            System.out.print("ERROR ENTRADA/SALIDA\n");
        }
        catch(ClassNotFoundException e ){
            System.out.print("NO SE ENCUENTRA LA CLASE\n");
        }
        return proyecto;

    }

    public void añadirPersonaProyecto(String dni, String nombre, String correoElectronico) throws DarDeAltaPersonaException {

        if (!(UtilidadesParaListas.objetoEstaEnListaObjetos(dni,personas)))
            throw new DarDeAltaPersonaException();
        personas.add(Persona.creoPersona(nombre,dni,correoElectronico));
    }

    public void añadirTareaProyecto(String titulos, String descripción, LinkedList<Persona> personas, Persona responsable, int prioridad, Fecha atributosFecha, Resultado resultadosTarea, LinkedList<String> etiquetas, double coste, Facturacion facturacion) throws DarDeAltaTareasException, PersonaResponsableNoEstaEnListaException {
        if (!UtilidadesParaListas.objetoEstaEnListaObjetos(titulos, tareas))
            throw new DarDeAltaTareasException();
        tareas.add(Tarea.añadirTareaProyecto(titulos, descripción, personas, responsable, prioridad, atributosFecha, resultadosTarea, etiquetas, coste, facturacion));
    }

    public void añadirTareaProyecto2(String titulos, String descripción, int prioridad, String diaIn, String mesIn, String añoIn, double coste) throws DarDeAltaTareasException, PersonaResponsableNoEstaEnListaException {
        if (!UtilidadesParaListas.objetoEstaEnListaObjetos(titulos, tareas))
            throw new DarDeAltaTareasException();
        tareas.add(Tarea.añadirTareaProyecto2(titulos, descripción, prioridad, diaIn, mesIn, añoIn, coste ));
    }

    public boolean EncontramosDniEnLasPersonasDelProyecto(String dni) {
        for (Persona persona: this.getPersona())
            if (persona.getDni().equals(dni))
                return true;
        return false;
    }

    public Persona devuelvoPersonaConEsteDni(String dni){

        for (Persona persona: this.getPersona())
            if (persona.getDni().equals(dni))
                return persona;
        return null;
    }

    public Tarea devuelvePersonaConEsteTitulo(String titulo){
        for (Tarea tarea : this.getTareas())
            if (tarea.getTítulo().equals(titulo))
                return tarea;
        return null;
    }
    public Tarea devuelvePersonaConEsteTitulo1(String titulo){
        for (Tarea tarea : this.getTareas())
            if (tarea.getTítulo().equals(titulo))
                return tarea;
        return null;
    }


    public Tarea devuelvoTareaConEsteTítulo(String título){

        for (Tarea tarea: this.getTareas())
            if (tarea.getTítulo().equals(título))
                return tarea;
        return null;
    }



    public void setVista(Vista vista) {
        this.vista=vista;
    }

    public static LinkedList<Persona> buscarPersonasSinTarea(List<Persona> p){
        LinkedList<Persona> l = null;
        for (Persona persona : p ){
            if (persona.getListaTareas() == null){
                l.add(persona);
            }
        }
        return l;
    }
}



