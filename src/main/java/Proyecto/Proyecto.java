package Proyecto;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Tareas;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Proyecto {

    private String nombre;
    private List<Persona> persona;
    private List<Tareas>tareas;



    public Proyecto(){

    }

    public  Proyecto(String nombre,List<Persona> persona,List<Tareas> tareas){

        this.nombre=nombre;
        this.persona=persona;
        this.tareas=tareas;

    }

  /*  public void leeProyecto(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del proyecto: ");
        String nombreProyecto = sc.next();
        creadorProyecto(nombreProyecto);
    }*/

    public static Proyecto creadorProyecto(String nombreProyecto){
        List<Persona> listaPersonas = new LinkedList<Persona>();
        List<Tareas> listaTareas = new LinkedList<Tareas>();
        return new Proyecto(nombreProyecto,listaPersonas,listaTareas);
    }


    public List<Persona> getPersona(){
        return persona;
    }//devuelvo la lista pero si no es asi lo cambiare
}



