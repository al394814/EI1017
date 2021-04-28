package EntradaSalida.ListadosQuePuedoObtener;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;

public class ListarPersonasProyecto {

    public static void listarPersonasProyecto(Proyecto proyecto){

        StringBuilder sb = new StringBuilder(10000*10000);
        int contadorPersonas=0;

        for (Persona persona: proyecto.getPersona()) {
            sb.append("\nPERSONA " + (contadorPersonas + 1)+":\n" + persona.toString() + "\n");
            contadorPersonas++;
        }
        System.out.println(sb);
    }
}