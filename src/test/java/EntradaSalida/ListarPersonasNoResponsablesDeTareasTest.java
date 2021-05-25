/*

package EntradaSalida;

import Modelo.Metodos.UtilidadesParaListas;
import Modelo.Proyecto.Personas.Persona;
import Modelo.Proyecto.Proyecto;
import Modelo.Proyecto.Tareas.Facturaciones.ConsumoInterno;
import Modelo.Proyecto.Tareas.Facturaciones.Facturacion;
import Modelo.Proyecto.Tareas.Fecha;
import Modelo.Proyecto.Tareas.Resultado.Resultado;
import Modelo.Proyecto.Tareas.Tarea;
import org.junit.jupiter.api.Test;


import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListarPersonasNoResponsablesDeTareasTest {

    @Test
    void listarPersonasNoResponsablesDeTareas() {
        for (int i = 0; i < 100; i++) {
            Fecha f = new Fecha("ttt", "ttt", false);
            LinkedList<Persona> l = new LinkedList<Persona>();
            Resultado r = new Resultado();
            LinkedList<String> s = new LinkedList<String>();
            Facturacion fac =new Facturacion(new ConsumoInterno());
            Proyecto proyecto = new Proyecto();
            Persona persona = new Persona("Alex", String.valueOf(i), "alex@gmail.com");
            Persona persona2 = new Persona("Marcos", String.valueOf(i + 1), "marcos@gmail.com");
            Persona persona3 = new Persona("Carlos", String.valueOf(i + 2), "carlos@gmail.com");
            Tarea t = new Tarea("t", "d", l, persona, 1, f, r, s, 3.3, fac);
            persona.añadirTareas(t);
            proyecto.añadirPersonaProyecto(persona);
            proyecto.añadirPersonaProyecto(persona2);
            proyecto.añadirPersonaProyecto(persona3);
            List<Persona> res;
            res = UtilidadesParaListas.elementosConListaVacia(proyecto.getPersona());
            List<Persona> res2 = new LinkedList<Persona>();
            res2.add(persona2);
            res2.add(persona3);
            assertEquals(res2, res);
        }
    }
}
*/
