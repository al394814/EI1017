package Vista.Formularios;

import Controlador.Controlador;
import Modelo.Proyecto.Personas.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class FormularioListarPersonaSinTarea {

    private Controlador controlador;
    private JTextField nombre = new JTextField(20);
    private JTextField dni = new JTextField(20);


    public  FormularioListarPersonaSinTarea (Controlador controlador){
        this.controlador = controlador;
        JFrame formulario = new JFrame("Personas sin Tarea");

        formulario.setLayout(new GridLayout(5, 2));
        Container contenedor = formulario.getContentPane();

        LinkedList <Persona> personas = controlador.buscarPersonasSinTarea();
        if ( personas != null){
            for(int i=0; i<personas.size();i++){

                JTextField nombre = new JTextField(30);
                contenedor.add(new JLabel("Persona "+ i +":"));
                nombre.setText(personas.get(i).getNombre() + ", " + personas.get(i).getDni());
                nombre.setEditable(false);
                contenedor.add(nombre);
            }
            formulario.pack();
            formulario.setVisible(true);
        }

        else{
            JFrame formulario2 = new JFrame("Error");
            Container contenedor2 = formulario2.getContentPane();
            contenedor2.add(new JLabel("No hay personas sin tareas"));
            formulario2.pack();
            formulario2.setVisible(true);


        }

    }
}



