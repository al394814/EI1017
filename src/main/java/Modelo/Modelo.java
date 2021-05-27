package Modelo;

import Modelo.Excepciones.*;
import Modelo.Metodos.ListaPersonasNoResaponsablesDeTareas;
import Modelo.Proyecto.Personas.Persona;
import Modelo.Proyecto.Proyecto;
import Modelo.Proyecto.Tareas.Tarea;
import Vista.Vista;
import com.sun.jdi.IntegerValue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
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
    public boolean buscarPersonat(String dni){
        Persona persona = proyecto.devuelvoPersonaConEsteDni(dni);
        if (persona == null){
            return false;
        }else{
            return true;
        }
    }

    public boolean encontrarTareab(String titulo){
        Tarea tarea = proyecto.devuelvePersonaConEsteTitulo(titulo);
        if (tarea == null) {
            return false;
        } else {
            return true;
        }
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

    public void añadirEtiqueta(String titulo, String texto) {

        Tarea tarea = encontrarTarea(titulo);
            tarea.añadirEtiqueta(texto);
    }

    public Tarea encontrarTarea(String titulo) {
        List <Tarea> lista = proyecto.getTareas();
        for (Tarea t : lista ){
            if(t.getTítulo() == titulo ){
                return t;
            }
        }
        return null;
    }

    public List< Tarea> getTareas() {
        return proyecto.getTareas();
    }

    public String informacionTarea(List<Tarea> tareas) {
        String datos = "";
        String tareaf= null;
        String responsable = null;
        if (tareas == null) {
            System.out.print("No hay personas");
        } else {
            datos += "TITULO\tRESPONSABLE\tFECHA DE CREACION\tESTADO\n";
            for (Tarea p : tareas) {
                String datos2 = "";
                if(p.EstadoTarea()) {
                    tareaf= "Finalizado";
                }else{tareaf = "Sin finalizar";}

                if(p.getResponsable() == null){
                    responsable ="No hay responsable";
                }else{
                    responsable = p.getResponsable().getNombre();
                }

                datos += (p.getTítulo() + "\t" + responsable + "\t" + p.getAtributosFecha().getFechaCreación() + "\t" + tareaf + "\n");
            }
        }
        return datos;
    }

    public void finalizarTarea(String titulo) {

        Tarea tarea = encontrarTarea(titulo);
        if (tarea == null) {

        } else {
            tarea.finalizarTarea();
            Date fecha =  new Date();
            tarea.setFechafinalizar(String.valueOf(fecha.getDate()));
        }
    }

    public void BorrarPersona(String titulo, String dni) throws EliminasElResponsableException, PersonaNoSeEncuentraEnListaPersonasTarea {
        Tarea tarea = encontrarTarea(titulo);
        Persona persona = buscarPersona(dni);
        tarea.eliminarPersonaTarea(persona);
    }

    public void AnyadirPersonaTarea(String titulo, String dni) throws NoIntroduzcaDosVecesLaMismaPersonaException, PersonaNoSeEncuentraEnProyectoException {
        Tarea tarea = encontrarTarea(titulo);
        Persona persona = buscarPersona(dni);
        persona.añadirTareas(tarea);
        tarea.addPersonasTarea(persona, proyecto);




    }

    public void CrearTarea(String titulo, String descripcion, String prioridad, String diaIn, String mesIn, String añoIn, String facturacion) throws PersonaResponsableNoEstaEnListaException, DarDeAltaTareasException {
        int prioridad1 = Integer.parseInt(prioridad);
        double coste = Double.parseDouble(facturacion);
        proyecto.añadirTareaProyecto2(titulo, descripcion, prioridad1, diaIn, mesIn, añoIn, coste );
    }
}



  /*  public void insertarTarea() {
        proyecto.añadirTareaProyecto(titulos, descripcion,);*/




