package EntradaSalida;

import Proyecto.Personas.Persona;
import Proyecto.Proyecto;

public class ListarPersonasProyecto {

    public String listarPersonasProyecto(Proyecto proyecto){

        StringBuilder sb = new StringBuilder(10000*10000);

        for (Persona persona: proyecto.getPersona())

            sb.append("\n"+persona.toString()+"\n");

        return sb.toString();
    }

}