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

            System.out.print("\n1-NOMBRE ---> ");
            String nombre = sc.next();
            System.out.print("\n2-DNI ---> ");
            String dni = sc.next();
            System.out.print("\n3-CORREO ELECTRÓNICO ---> ");
            String correoElectrónico = sc.next();

            proyecto.añadirPersonaProyecto(creoPersona(nombre,dni,correoElectrónico));
            quedanPersonaPorIntroducir=deseaIntroducirMásDatos(new String("PERSONAS"),sc);
        }

        System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO. \n\n");

    }

}
