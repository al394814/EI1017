package EntradaSalida;

import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.Scanner;

public class MarcarTareaComoFinalizada {

    public static void marcarTareaComoFinalizada(Scanner sc, Proyecto proyecto){
        System.out.print("\nINTRODUCE EL TÍTULO DE LA TAREA QUE QUIRES FINALIZAR ---> ");
        String título = sc.next();
        Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(título);
        tarea.marcarTareaFinalizada();
        System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO.");
    }

}
