package Controlador;

import Modelo.Excepciones.DarDeAltaPersonaException;
import Modelo.Modelo;
import Modelo.Proyecto.Personas.Persona;
import Vista.Vista;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Controlador implements InterfaceControlador {
    private Modelo modelo;
    private Vista vista;

    @Override
    public void setVista(Vista vista) {
        this.vista=vista;
    }

    @Override
    public void setModelo(Modelo modelo) {this.modelo=modelo; }

    public Persona devuelvepersona(String dni){
        return new Persona();
    }

    public void insertarPersona(String nombre, String dni, String correo) throws DarDeAltaPersonaException {
        modelo.insertarPersona(dni, nombre, correo);
    }

    public Persona buscarPersona(String dni){
       Persona persona=  modelo.buscarPersona(dni);
       return persona;
    }

    public LinkedList<Persona> buscarPersonasSinTarea(){
        LinkedList<Persona> lista = modelo.buscarPersonasSinTarea();
            return lista;
    }


    public void guardarProyecto() throws IOException {
        modelo.guardarProyecto();
    }
}
