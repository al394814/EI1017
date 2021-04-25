package EntradaSalida;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Fecha;
import Proyecto.Tareas.Resultado.Resultado;
import Proyecto.Tareas.Tarea;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static EntradaSalida.MétodosAuxiliares.AnyadoListaObjetosCumplenCondicion.anyadoListaObjetosCumplenCondición;
import static org.junit.jupiter.api.Assertions.*;

class ListarTareasSinPersonasAsignadasTest {

    @Test
    void listarTareasSinPersonasASigandas() {
        for (int i = 0; i < 100; i++) {
            Fecha f = new Fecha("ttt", "ttt", false);
            LinkedList<Persona> l = new LinkedList<Persona>();
            Resultado r = new Resultado();
            Persona p = new Persona();
            LinkedList<String> s = new LinkedList<String>();
            Tarea t1 = new Tarea("t","d", l,p,1,f,r,s);
            Proyecto proyecto = new Proyecto();
            Resultado resultado = new Resultado( "3340", 3, true);
            Persona persona = new Persona("Alex", String.valueOf(i), "alex@gmail.com");
            Persona persona2 = new Persona("Marcos", String.valueOf(i + 1), "marcos@gmail.com");
            l.add(persona);
            l.add(persona2);
            Tarea t2 = new Tarea("t","d", l,p,1,f,r,s);
            List<Tarea> res;
            res = anyadoListaObjetosCumplenCondición(proyecto.getTareas());
            List<Persona> res2 = new LinkedList<Persona>();
            res2.add(t1);
            assertEquals(res2, res);
        }
    }
}