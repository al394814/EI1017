package Proyecto;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Tarea;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Proyecto implements Serializable {

    private String nombre;
    private List<Persona> personas;
    private List<Tarea> tareas;


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

    public void añadirPersonaProyecto(Persona personaNueva){
        personas.add(personaNueva);
    }

    public void añadirTareaProyecto(Tarea tareaNueva){
        tareas.add(tareaNueva);
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

    public Tarea devuelvoTareaConEsteTítulo(String título){

        for (Tarea tarea: this.getTareas())
            if (tarea.getTítulo().equals(título))
                return tarea;
        return null;
    }




}



