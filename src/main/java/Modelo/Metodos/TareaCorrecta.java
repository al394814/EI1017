package Modelo.Metodos;

import Modelo.Excepciones.TareaNoSeEncuentraEnProyectoException;
import Modelo.Proyecto.Proyecto;
import Modelo.Proyecto.Tareas.Tarea;

public class TareaCorrecta {

    public static void TareaCorrecta(Tarea tarea, Proyecto proyecto) throws TareaNoSeEncuentraEnProyectoException {

        if (!UtilidadesParaListas.objetoEstaEnListaObjetos(tarea.getClave(),proyecto.getTareas()))
            throw new TareaNoSeEncuentraEnProyectoException();

    }
}
