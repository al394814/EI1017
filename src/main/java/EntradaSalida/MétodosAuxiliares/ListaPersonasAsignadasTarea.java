package EntradaSalida.MétodosAuxiliares;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;

import java.util.LinkedList;
import java.util.Scanner;

import static EntradaSalida.MétodosAuxiliares.personaconDniNoPerteneceProyectoYpedimosDatos.personaconDniNoPerteneceProyectoYpedimosDatos;
import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMásDatos.deseaIntroducirMásDatos;

public class ListaPersonasAsignadasTarea {

    public static LinkedList<Persona> listaPersonasAsignadasTarea(Scanner sc, Proyecto proyecto) {

        Persona PersonaNueva;

        System.out.println("\nINTRODUCE EL DNI DE CADA PERSONA ASIGNADA A ESTA TAREA\n(Introduce NO cuando ha introducido el DNI de todas las personas)\n(introduce SI para seguir introduciendo)\n");
        LinkedList<Persona> listaPersonasAsiganadasTarea = new LinkedList<Persona>();
        boolean quedanPersonasPorIntroducir = true;
        int contadorPersonas = 1;
        while (quedanPersonasPorIntroducir){

            System.out.println("INTRODUZCA EL DNI DE LA PERSONA "+contadorPersonas+" ---> ");
            String dni = sc.next();
            if (proyecto.EncontramosDniEnLasPersonasDelProyecto(dni))
                listaPersonasAsiganadasTarea.add(proyecto.devuelvoPersonaConEsteDni(dni));
            else
                PersonaNueva = personaconDniNoPerteneceProyectoYpedimosDatos(proyecto,sc,dni);

            quedanPersonasPorIntroducir=deseaIntroducirMásDatos("PERSONA",sc);
        }

        return listaPersonasAsiganadasTarea;
    }

}
