package Controlador;

import Modelo.Excepciones.*;
import Modelo.Modelo;
import Modelo.Proyecto.Personas.Persona;
import Vista.Vista;

import java.io.IOException;
import java.util.LinkedList;

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


    public Boolean buscarPersonat(String dni){
        boolean res =  modelo.buscarPersonat(dni);
        return res;
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

    public void añadirEtiqueta(String titulo,String text) {
        modelo.añadirEtiqueta(titulo, text);
    }

    public void finalizar(String text) {
        modelo.finalizarTarea(text);
    }

    public void BorrarPersona(String tarea, String dni) throws EliminasElResponsableException, PersonaNoSeEncuentraEnListaPersonasTarea {
        modelo.BorrarPersona(tarea, dni);

    }

    public void AnyadirPersonaTarea(String titulo, String dni) throws NoIntroduzcaDosVecesLaMismaPersonaException, PersonaNoSeEncuentraEnProyectoException {
        modelo.AnyadirPersonaTarea(titulo, dni);

    }

    public boolean encontrarTareab(String titulo) {
        boolean res = modelo.encontrarTareab(titulo);
        return res;
    }

    public void CrearTarea(String titulo, String descripcion, String prioridad, String diaIn, String mesIn, String añoIn, String facturacion) throws PersonaResponsableNoEstaEnListaException, DarDeAltaTareasException {
        modelo.CrearTarea(titulo,descripcion,prioridad, diaIn, mesIn, añoIn, facturacion);

    }
  /*  public void insertarTarea() {
        modelo.insertarTarea();
    }*/
}
