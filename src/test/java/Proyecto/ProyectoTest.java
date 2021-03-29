package Proyecto;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Tarea;
import org.junit.jupiter.api.Test;

import java.net.HttpRetryException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProyectoTest {

    @Test
    void getTareas() {
        Proyecto proyecto = new Proyecto();
        List<Tarea> l = new ArrayList<>();
        assertEquals(l, proyecto.getTareas());
    }

    @Test
    void getPersona() {
        Proyecto proyecto = new Proyecto();
        List<Persona> l = new ArrayList<>();
        assertEquals(l, proyecto.getPersona());

    }

    @Test
    void añadirPersonaProyecto() {
        Proyecto proyecto = new Proyecto();
        String dni = "tretre";
        Persona p = new Persona("paco", dni, "fsef");
        proyecto.añadirPersonaProyecto(p);
        assertEquals(proyecto.EncontramosDniEnLasPersonasDelProyecto(dni), p);
    }
    // En el proyecto no se pueden dar de baja personas
}
