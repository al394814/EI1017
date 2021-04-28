package EntradaSalida;

import EntradaSalida.Excepciones.DarDeAltaPersonaException;
import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Proyecto;

import java.io.Serializable;
import java.util.Scanner;

import static Proyecto.Personas.Persona.*;
import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMasDatos.deseaIntroducirMásDatos;

public class DarDeAltaPersonas {

    public static void darDeAltaPersonas(Scanner sc, Proyecto proyecto){
        System.out.println("\nHA SELECCIONADO LA OPCIÓN DAR DE ALTA PERSONA");
        System.out.println("\nDEBE INTRODUCIR TODAS LAS PERSONAS DEL PROYECTO CON SUS DATOS");

        boolean quedanPersonaPorIntroducir= true;

        while(quedanPersonaPorIntroducir){

            try {

                System.out.print("1-NOMBRE ---> ");
                String nombre = sc.nextLine();
                System.out.print("2-DNI ---> ");
                String dni = sc.nextLine();
                System.out.print("3-CORREO ELECTRÓNICO ---> ");
                String correoElectrónico = sc.nextLine();
                if (UtilidadesParaListas.objetoEstaEnListaObjetos(dni,proyecto.getPersona())) {
                    proyecto.añadirPersonaProyecto(creoPersona(nombre, dni, correoElectrónico));
                    quedanPersonaPorIntroducir = deseaIntroducirMásDatos("PERSONAS", sc);
                    }
                    else{
                    throw new DarDeAltaPersonaException();
                }
            }
             catch (DarDeAltaPersonaException e) {
                 System.out.println(e.getMessage());
            }
        }
        System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO. \n\n");
    }
}
