package Proyecto.Personas;

import Proyecto.Tareas.Tareas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Persona {

    String nombre;

    String correoElectrónico;
    List<Tareas> listaTareas;

    public Persona(){}

    public Persona(String nombre,String correoElectrónico, List<Tareas> listaTareas){
        this.nombre=nombre;
        this.correoElectrónico=correoElectrónico;
        this.listaTareas=listaTareas;
    }

    public Persona DarDeAlta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        String nombre= sc.nextLine();
        System.out.println("Introduce el correo electrónico:");
        String correo= sc.nextLine();
        ArrayList<Tareas>tareas = new ArrayList<Tareas>();
        return new Persona(nombre, correo, tareas);
    }


}
