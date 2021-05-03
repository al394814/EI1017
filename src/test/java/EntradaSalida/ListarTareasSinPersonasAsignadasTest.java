
package EntradaSalida;

import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import Proyecto.Tareas.Facturaciones.ConsumoInterno;
import Proyecto.Tareas.Facturaciones.Facturacion;
import Proyecto.Tareas.Fecha;
import Proyecto.Tareas.Resultado.Resultado;
import Proyecto.Tareas.Tarea;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListarTareasSinPersonasAsignadasTest {

    @Test
    void listarTareasSinPersonasASigandas() {
        for (int i = 0; i < 100; i++) {

            Fecha f = new Fecha("ttt", "ttt", false);
            LinkedList<Persona> l = new LinkedList<Persona>();
            LinkedList<Persona> x = new LinkedList<Persona>();
            Resultado r = new Resultado();
            Persona p = new Persona();
            Facturacion fac =new Facturacion(new ConsumoInterno());
            LinkedList<String> s = new LinkedList<String>();
            Tarea t1 = new Tarea("t","d", x,p,1,f,r,s, 3.3, fac);
            Proyecto proyecto = new Proyecto();
            Persona persona = new Persona("Alex", String.valueOf(i), "alex@gmail.com");
            Persona persona2 = new Persona("Marcos", String.valueOf(i + 1), "marcos@gmail.com");
            l.add(persona);
            l.add(persona2);
            Tarea t2 = new Tarea("t","d", l,p,1,f,r,s, 3.3, fac);
            proyecto.añadirTareaProyecto(t1);
            proyecto.añadirTareaProyecto(t2);
            List<Tarea> res =  UtilidadesParaListas.elementosConListaVacia(proyecto.getTareas());
            List<Tarea> res2 = new LinkedList<Tarea>();
            res2.add(t1);
            assertEquals(res, res2);
        }
    }
}
