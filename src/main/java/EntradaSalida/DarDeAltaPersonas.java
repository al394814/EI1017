package EntradaSalida;

import Proyecto.Proyecto;

import java.util.Scanner;

import static Proyecto.Personas.Persona.*;
import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMásDatos.deseaIntroducirMásDatos;

public class DarDeAltaPersonas {

    public void darDeAltaPersonas(Scanner sc, Proyecto proyecto){
        System.out.println("\nHA SELECCIONADO LA OPCIÓN DAR DE ALTA PERSONA\n");
        System.out.println("\nDEBE INTRODUCIR TODAS LAS PERSONAS DEL PROYECTO CON SUS DATOS");

        boolean quedanPersonaPorIntroducir= true;

        while(quedanPersonaPorIntroducir){

            System.out.println("\n1-NOMBRE ---> ");
            String nombre = sc.next();
            System.out.println("\n2-DNI ---> ");
            String dni = sc.next();
            System.out.println("\n3-CORREO ELECTRÓNICO ---> ");
            String correoElectrónico = sc.next();

            proyecto.añadirPersonaProyecto(creoPersona(nombre,dni,correoElectrónico));
            quedanPersonaPorIntroducir=deseaIntroducirMásDatos(new String("PERSONAS"),sc);
        }

        System.out.println("\nLA TAREA HA FINALIZADO CON ÉXITO.");

    }

}
