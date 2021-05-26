package Vista.Formularios;

import Controlador.Controlador;
import Modelo.Proyecto.Personas.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class FormularioBuscarPersona {
    private Controlador controlador;


    private JTextField nombre = new JTextField(20);
    private JTextField dni = new JTextField(20);

    private JTextField correo = new JTextField(20);
    private JTextField tarea = new JTextField(20);


   public FormularioBuscarPersona(Controlador controlador, Persona persona) {
        this.controlador = controlador;
        JFrame formulario = new JFrame("Buscar Persona");

        formulario.setLayout(new GridLayout(5, 2));
        Container contenedor = formulario.getContentPane();

        contenedor.add(new JLabel("Nombre:"));
        nombre.setText(persona.getNombre());
        nombre.setEditable(false);
        contenedor.add(nombre);

        contenedor.add(new JLabel("DNI:"));
        dni.setText(persona.getDni());
        dni.setEditable(false);
        contenedor.add(dni);

        contenedor.add(new JLabel("Correo:"));
        correo.setText(persona.getCorreoElectrónico());
        correo.setEditable(false);
        contenedor.add(correo);

       contenedor.add(new JLabel("Tareas:"));
       tarea.setText(persona.getDni());//Falta poner las tareas
       tarea.setEditable(false);
       contenedor.add(tarea);

        formulario.pack();
        formulario.setVisible(true);

    }


}