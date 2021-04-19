package Proyecto.Tareas;

import Proyecto.Personas.Persona;
import Proyecto.Tareas.Resultado.Resultado;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TareaTest {

    @Test
    void finalizarTarea() {
        Fecha f = new Fecha( "ttt", "ttt", false);
        LinkedList<Persona> l = new LinkedList<Persona>();
        Resultado r = new Resultado();
        Persona p = new Persona();
        LinkedList<String> s = new LinkedList<String>();
        Tarea t = new Tarea("t","d", l,p,1,f,r,s);
        t.finalizarTarea();
        boolean res = t.EstadoTarea();
        assertEquals(true, res  );

    }
}