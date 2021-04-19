package EntradaSalida;

import EntradaSalida.Excepciones.TareaNoSeEncuentraEnProyectoException;
import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.Scanner;

public class MarcarTareaComoFinalizada {

    public static void marcarTareaComoFinalizada(Scanner sc, Proyecto proyecto){
        try {
            System.out.print("\nINTRODUCE EL TÍTULO DE LA TAREA QUE QUIRES FINALIZAR ---> ");
            String título = sc.next();
            if (UtilidadesParaListas.objetoEstaEnListaObjetos(título,proyecto.getTareas())) {
                Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(título);
                tarea.finalizarTarea();
                System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO.");
            }
            else{
                throw new TareaNoSeEncuentraEnProyectoException();
            }
        }
        catch (TareaNoSeEncuentraEnProyectoException e){
            e.printStackTrace();
        }
    }

}
