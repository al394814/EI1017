package EntradaSalida.MétodosAuxiliares;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;

import java.util.LinkedList;
import java.util.Scanner;

import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMasDatos.deseaIntroducirMásDatos;

public class ListaPersonasAsignadasTarea {

    public static LinkedList<Persona> listaPersonasAsignadasTarea(Scanner sc, Proyecto proyecto) {

        System.out.print("\nINTRODUCE EL DNI DE CADA PERSONA ASIGNADA A ESTA TAREA\n");
        LinkedList<Persona> listaPersonasAsiganadasTarea = new LinkedList<Persona>();
        boolean quedanPersonasPorIntroducir = true;
        int contadorPersonas = 1;
        while (quedanPersonasPorIntroducir){

            System.out.print("INTRODUZCA EL DNI DE LA PERSONA "+contadorPersonas+" ---> ");
            contadorPersonas++;
            String dni = sc.nextLine();
            if (proyecto.EncontramosDniEnLasPersonasDelProyecto(dni))
                listaPersonasAsiganadasTarea.add(proyecto.devuelvoPersonaConEsteDni(dni));
            else
                System.out.println("NO EXISTE DENTRO DEL PROYECTO UNA PERSONA CON ESTE DNI\n");

            quedanPersonasPorIntroducir=deseaIntroducirMásDatos("PERSONAS",sc);
        }

        return listaPersonasAsiganadasTarea;
    }

}
