package Modelo;

import Modelo.Excepciones.DarDeAltaPersonaException;
import Modelo.Proyecto.Personas.Persona;
import Modelo.Proyecto.Proyecto;
import Vista.Vista;

public class Modelo implements InterfaceModelo {

    Vista vista = new Vista();
    Proyecto proyecto = new Proyecto();
    public Persona devuelvePersona(String dni){
        Persona persona;
        return new Persona();
    }

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    @Override
    public void setProyecto(Proyecto proyecto) {
        this.proyecto= proyecto;
    }

    public void insertarPersona(String nombre, String dni, String correo) throws DarDeAltaPersonaException {
        proyecto.añadirPersonaProyecto(nombre, dni, correo);
    }

    public Persona buscarPersona(String dni){
        Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
        return persona;

    }



}

