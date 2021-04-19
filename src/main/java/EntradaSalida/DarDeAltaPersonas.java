package EntradaSalida;

import Proyecto.Proyecto;

import java.util.Scanner;

import static Proyecto.Personas.Persona.*;
import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMásDatos.deseaIntroducirMásDatos;

public class DarDeAltaPersonas {

    public static void darDeAltaPersonas(Scanner sc, Proyecto proyecto){
        System.out.println("\nHA SELECCIONADO LA OPCIÓN DAR DE ALTA PERSONA");
        System.out.println("\nDEBE INTRODUCIR TODAS LAS PERSONAS DEL PROYECTO CON SUS DATOS");

        boolean quedanPersonaPorIntroducir= true;

        while(quedanPersonaPorIntroducir){


            String nombre = sc.nextLine();
            System.out.print("1-NOMBRE ---> ");
            String dni = sc.nextLine();
            System.out.print("2-DNI ---> ");
            String correoElectrónico = sc.nextLine();
            System.out.print("3-CORREO ELECTRÓNICO ---> ");

            proyecto.añadirPersonaProyecto(creoPersona(nombre,dni,correoElectrónico));
            quedanPersonaPorIntroducir=deseaIntroducirMásDatos("PERSONAS",sc);

        }

        System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO. \n\n");

    }

}
