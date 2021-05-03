package EntradaSalida.MétodosAuxiliares;

import EntradaSalida.Excepciones.NoIntroduzcaDosVecesLaMismaPersonaException;
import EntradaSalida.Excepciones.PersonaNoSeEncuentraEnProyectoException;
import Proyecto.Personas.Persona;
import Proyecto.Proyecto;

import java.util.LinkedList;
import java.util.Scanner;

import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMasDatos.deseaIntroducirMásDatos;

public class ListaPersonasAsignadasTarea {

    public static LinkedList<Persona> listaPersonasAsignadasTarea(Scanner sc, Proyecto proyecto) {

        System.out.print("\nINTRODUCE EL DNI DE CADA PERSONA ASIGNADA A ESTA TAREA\n");
        System.out.print("INTRODUCE q SI NO QUIERE ASIGNAR PERSONAS A LA TAREA");
        String entrada = sc.nextLine();
        LinkedList<Persona> listaPersonasAsiganadasTarea = new LinkedList<Persona>();
        if ("q".equals(entrada))
            return listaPersonasAsiganadasTarea;
        boolean quedanPersonasPorIntroducir = true;
        int contadorPersonas = 1;
        while (quedanPersonasPorIntroducir){

            System.out.print("INTRODUZCA EL DNI DE LA PERSONA "+contadorPersonas+" ---> ");
            contadorPersonas++;
            String dni = sc.nextLine();
            try{
                if (!proyecto.EncontramosDniEnLasPersonasDelProyecto(dni))
                    throw new PersonaNoSeEncuentraEnProyectoException();
            }
            catch (PersonaNoSeEncuentraEnProyectoException e){
                System.out.print(e.getMessage());
                while (true){
                    System.out.print("INTRODUCE UN DNI CORRECTO ---> ");
                    dni=sc.nextLine();
                    if (proyecto.EncontramosDniEnLasPersonasDelProyecto(dni)){
                        break;
                    }
                }
            }
            try{
                if (listaPersonasAsiganadasTarea.contains(proyecto.devuelvoPersonaConEsteDni(dni)))
                    throw new NoIntroduzcaDosVecesLaMismaPersonaException();
            }
            catch (NoIntroduzcaDosVecesLaMismaPersonaException e){
                System.out.print(e.getMessage());
                while(true){
                    System.out.print("INTRODUCE UN DNI CORRECTO ---> ");
                    dni = sc.nextLine();
                    if (!listaPersonasAsiganadasTarea.contains(proyecto.devuelvoPersonaConEsteDni(dni)) &&proyecto.EncontramosDniEnLasPersonasDelProyecto(dni)){
                        break;
                    }
                }
            }
            listaPersonasAsiganadasTarea.add(proyecto.devuelvoPersonaConEsteDni(dni));

            quedanPersonasPorIntroducir=deseaIntroducirMásDatos("PERSONAS",sc);
        }

        return listaPersonasAsiganadasTarea;
    }

}
