package Vista.Formularios;

import Controlador.Controlador;
import Modelo.Excepciones.NoIntroduzcaDosVecesLaMismaPersonaException;
import Modelo.Excepciones.PersonaNoSeEncuentraEnProyectoException;
import Vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioAnyadirPersonaTarea {
    Controlador controlador;
    private JFrame formulario;

    private JCheckBox tardes = new JCheckBox("Responsable");
    private JCheckBox domingos = new JCheckBox("No responsable");

    public FormularioAnyadirPersonaTarea(Controlador controlador, JTextField titulo){

        this.controlador= controlador;
        formulario = new JFrame("Añadir Persona de Tarea");
        formulario.setLayout(new GridLayout(10, 2));
        Container contenedor = formulario.getContentPane();
        JTextField dni = new JTextField(20);
        JLabel proyectoLabel = new JLabel("INTRODUCE EL DNI DE LA PERSONA: ");
        JButton aceptar = new JButton("Añadir");
        contenedor.setLayout(new FlowLayout());
        contenedor.add(proyectoLabel);
        contenedor.add(dni);
        contenedor.add(aceptar);

        formulario.pack();

        formulario.setVisible(true);


        aceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    System.out.print("añadir");
                    AnyadirPersona(titulo, dni.getText());
                } catch (NoIntroduzcaDosVecesLaMismaPersonaException noIntroduzcaDosVecesLaMismaPersonaException) {
                    noIntroduzcaDosVecesLaMismaPersonaException.printStackTrace();
                } catch (PersonaNoSeEncuentraEnProyectoException personaNoSeEncuentraEnProyectoException) {
                    personaNoSeEncuentraEnProyectoException.printStackTrace();
                }
            }
        });
    }

    public void AnyadirPersona(JTextField titulo, String texto) throws NoIntroduzcaDosVecesLaMismaPersonaException, PersonaNoSeEncuentraEnProyectoException {
        controlador.AnyadirPersonaTarea(titulo.getText(), texto);
    }

}
