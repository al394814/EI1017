package EntradaSalida;

import Proyecto.Proyecto;
import Proyecto.Tareas.Tarea;

import java.util.Scanner;

public class CambiarCosteTarea {

    public static void cambiarCosteTarea(Proyecto proyecto, Scanner sc){

        System.out.print("INTRODUCE EL TÍTULO DE LA TAREA DE LA CUAL QUIERE CAMBIAR EL COSTE ---> ");
        String titulo=sc.nextLine();
        System.out.print("INTRODUCE EL NUEVO COSTE ---> ");
        int nuevoCoste = sc.nextInt();
        sc.nextLine();
        Tarea tarea = proyecto.devuelvoTareaConEsteTítulo(titulo);
        tarea.setCoste(nuevoCoste);
        //TODO soy consciente de que aqui hay excepciones que se pueden tratar
        // pero dado que tengo que cambiar el sitio donde las lanzo en casi todas para que sea mas eficaz
        // lo haré en todas a la vez.

    }

}
