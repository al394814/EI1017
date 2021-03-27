package EntradaSalida;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;
import java.util.Scanner;

import static Proyecto.Personas.Persona.*;

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
            System.out.println("\nDESEA INTRODUCIR MÁS PERSONAS? ---> \nINTRODUCE SI O NO POR PANTALLA");
            String entrada = sc.next();
            if (entrada=="NO")
                quedanPersonaPorIntroducir=false;
        }

        System.out.println("\nLA TAREA HA FINALIZADO CON ÉXITO.");

    }

}
