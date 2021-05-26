package Vista.Formularios.AnyadirTarea;

import Vista.Vista;

import javax.swing.*;

public class FormularioAnyadirTarea {

    private JTextField titulo = new JTextField(20);
    private JTextField descripcion = new JTextField(20);
    private JButton banyadirPersonas = new JButton("AÑADIR PERSONAS");
    private ButtonGroup personasTarea = new ButtonGroup();
    private  JTextField prioridad = new JTextField(20);
    private JTextField costeFacturación = new JTextField(20);

    public FormularioAnyadirTarea(){

    }

}
