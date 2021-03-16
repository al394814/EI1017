package Proyecto.Tareas;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Resultado.Resultado;

import java.util.LinkedList;

public class Tareas {

    String título;
    String descripción;
    LinkedList<Persona> personas;
    Persona responsable;
    int prioridad;
    Fecha atributosFecha;
    Resultado ResultadoTarea;
    LinkedList<String> etiquetas;
}
