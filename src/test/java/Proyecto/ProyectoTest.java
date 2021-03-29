package Proyecto;

import Proyecto.Tareas.Tarea;
import org.junit.jupiter.api.Test;

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
    }

    @Test
    void añadirPersonaProyecto() {
    }
}