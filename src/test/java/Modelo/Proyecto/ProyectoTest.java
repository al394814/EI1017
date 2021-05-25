/*
package Modelo.Proyecto;

import Modelo.Proyecto.Personas.Persona;
import Modelo.Proyecto.Tareas.Tarea;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProyectoTest {

    @Test
    void getTareas() {
        Proyecto proyecto = new Proyecto("nombreProyecto");
        List<Tarea> l = new ArrayList<Tarea>();
        assertEquals(l, proyecto.getTareas());
    }

    @Test
    void getPersona() {
        Proyecto proyecto = new Proyecto();
        List<Persona> l = new ArrayList<Persona>();
        assertEquals(l, proyecto.getPersona());

    }
    @Test
    void añadirPersonaProyecto(){
        Proyecto proyecto = new Proyecto();
        String dni= "tretre";
        Persona p = new Persona("paco", dni, "fsef");
        proyecto.añadirPersonaProyecto(p);
        proyecto.EncontramosDniEnLasPersonasDelProyecto(dni);
        assertEquals(proyecto.devuelvoPersonaConEsteDni(dni), p);
    }
    // En el p1 no se pueden dar de baja personas
}*/
