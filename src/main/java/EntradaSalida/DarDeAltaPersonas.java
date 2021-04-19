package EntradaSalida;

import EntradaSalida.Excepciones.DarDeAltaPersonaException;
import EntradaSalida.MétodosAuxiliares.UtilidadesParaListas;
import Proyecto.Proyecto;

import java.io.Serializable;
import java.util.Scanner;

import static Proyecto.Personas.Persona.*;
import static EntradaSalida.MétodosAuxiliares.DeseaIntroducirMasDatos.deseaIntroducirMásDatos;

public class DarDeAltaPersonas implements Serializable {

    public static void darDeAltaPersonas(Scanner sc, Proyecto proyecto){
        System.out.println("\nHA SELECCIONADO LA OPCIÓN DAR DE ALTA PERSONA");
        System.out.println("\nDEBE INTRODUCIR TODAS LAS PERSONAS DEL PROYECTO CON SUS DATOS");

        boolean quedanPersonaPorIntroducir= true;

        while(quedanPersonaPorIntroducir){

            try {
                    String nombre = sc.nextLine();
                    System.out.print("1-NOMBRE ---> ");
                    String dni = sc.nextLine();
                    System.out.print("2-DNI ---> ");
                    if (UtilidadesParaListas.objetoEstaEnListaObjetos(dni,proyecto.getPersona())) {
                        String correoElectrónico = sc.nextLine();
                        System.out.print("3-CORREO ELECTRÓNICO ---> ");

                        proyecto.añadirPersonaProyecto(creoPersona(nombre, dni, correoElectrónico));
                        quedanPersonaPorIntroducir = deseaIntroducirMásDatos("PERSONAS", sc);
                        System.out.print("\nLA TAREA HA FINALIZADO CON ÉXITO. \n\n");
                    }
                    else{
                    throw new DarDeAltaPersonaException();
                }
            }
             catch (DarDeAltaPersonaException e) {
                e.printStackTrace();
            }

    }

}
}
