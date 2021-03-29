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
        List<Persona> l = new ArrayList<>();
        Resultado r = new Resultado();
        LinkedList<String> s = new LinkedList<>();
        Tarea t = new Tarea( "ttt", "ttt", l, l, 3, f, r, s );
        t.finalizarTarea();
        boolean res = t.EstadoTarea();
        assertEquals(true, res  );



    }
}