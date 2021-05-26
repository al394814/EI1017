package Modelo;

import Modelo.Excepciones.DarDeAltaPersonaException;
import Modelo.Metodos.ListaPersonasNoResaponsablesDeTareas;
import Modelo.Metodos.TieneLista;
import Modelo.Metodos.UtilidadesParaListas;
import Modelo.Proyecto.Personas.Persona;
import Modelo.Proyecto.Proyecto;
import Modelo.Proyecto.Tareas.Tarea;
import Vista.Paneles.PanelPersonas;
import Vista.Vista;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Modelo implements InterfaceModelo {

    Vista vista = new Vista();

    Proyecto proyecto = new Proyecto();

    public Persona devuelvePersona(String dni) {
        Persona persona;
        return new Persona();
    }

    public List< Persona> getPersona(){return proyecto.getPersona();}

    @Override
    public void setVista(Vista vista) {
        this.vista = vista;
    }



    @Override
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }


    public void insertarPersona(String nombre, String dni, String correo) throws DarDeAltaPersonaException {
        proyecto.añadirPersonaProyecto(nombre, dni, correo);
    }

    public Persona buscarPersona(String dni) {
        Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
        return persona;

    }


    public LinkedList<Persona> buscarPersonasSinTarea() {

        LinkedList<Persona> p = ListaPersonasNoResaponsablesDeTareas.ListaPersonasNoResaponsablesDeTareas(proyecto);
        return p;
    }

    public void guardarProyecto() throws IOException {
        FileOutputStream fos = new FileOutputStream(proyecto.getNombre() + ".bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(proyecto);
        oos.close();

    }

    public String informacionPersona(List< Persona> personas) {

        String datos = "";

        if (personas == null) {
            System.out.print("No hay personas");
        } else {
            datos += "DNI\tNOMBRE\tCORREO\tTAREAS\n";
            for (Persona p : personas) {
                String datos2 = "";
                for (Tarea t : p.getListaTareas()) {
                    datos2 += (t.getTítulo() + "\t" );
                }

                datos += (p.getDni() + "\t" + p.getNombre() + "\t" + p.getCorreoElectrónico() + "\t" + datos2 + "\n");
            }
        }
        return datos;
    }
}


