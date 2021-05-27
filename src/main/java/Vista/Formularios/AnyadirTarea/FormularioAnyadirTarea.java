package Vista.Formularios.AnyadirTarea;

import Controlador.Controlador;
import Modelo.Excepciones.DarDeAltaTareasException;
import Modelo.Excepciones.PersonaResponsableNoEstaEnListaException;
import Vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioAnyadirTarea {

    private JTextField titulo = new JTextField(20);
    private JTextField descripcion = new JTextField(20);
    private JButton banyadirPersonas = new JButton("AÑADIR PERSONAS");
    private ButtonGroup personasTarea = new ButtonGroup();
    private  JTextField prioridad = new JTextField(20);

    private JTextField diaIn = new JTextField(3);
    private JTextField mesIn = new JTextField(3);
    private JTextField anyIn = new JTextField(3);
    private JTextField diaFi = new JTextField(3);
    private JTextField mesFi = new JTextField(3);
    private JTextField anyFi = new JTextField(3);
    //TODO:pongo un boton introducir etiquetas que te lleve a lo que tu has programado
    private JButton bEtiquetas = new JButton("AÑADIR ETIQUETAS");
    private JTextField costeFacturación = new JTextField(20);
    private JButton bCrearTarea = new JButton("CREAR TAREA");

    private JFrame formulario;
    private Controlador controlador;

    public FormularioAnyadirTarea(Controlador controlador){
        this.controlador = controlador;
        formulario = new JFrame("AÑADIR TAREA");
        Image icono = Toolkit.getDefaultToolkit().getImage("src/imagenes/tarea.png");
        formulario.setIconImage(icono);

        formulario.setLayout(new GridLayout(10, 2));
        Container contenedor = formulario.getContentPane();



        JPanel fechaIn = new JPanel();
        fechaIn.add(new JLabel("Dia"));
        fechaIn.add(diaIn);
        fechaIn.add(new JLabel("Mes"));
        fechaIn.add(mesIn);
        fechaIn.add(new JLabel("Año"));
        fechaIn.add(anyIn);


        contenedor.add(new JLabel("TÍTULO:"));
        contenedor.add(titulo);
        contenedor.add(new JLabel("DESCRIPCIÓN:"));
        contenedor.add(descripcion);

        contenedor.add(new JLabel("PRIORIDAD:"));
        contenedor.add(prioridad);

        contenedor.add(new JLabel("FECHA INICIO"));
        contenedor.add(fechaIn);

        contenedor.add(new JLabel("COSTE FACTURACION"));

        contenedor.add(costeFacturación);

        contenedor.add(bCrearTarea);
        formulario.pack();
        formulario.setVisible(true);

        bCrearTarea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    crearTarea(titulo.getText(), descripcion.getText(), prioridad.getText(), diaIn.getText(), mesIn.getText(), anyIn.getText(), costeFacturación.getText());
                } catch (PersonaResponsableNoEstaEnListaException personaResponsableNoEstaEnListaException) {
                    personaResponsableNoEstaEnListaException.printStackTrace();
                } catch (DarDeAltaTareasException darDeAltaTareasException) {
                    darDeAltaTareasException.printStackTrace();
                }

            }
        });
    }

    public void crearTarea(String titulo, String descripcion, String prioridad, String diaIn, String mesIn, String añoIn, String facturacion) throws PersonaResponsableNoEstaEnListaException, DarDeAltaTareasException {
        controlador.CrearTarea(titulo,descripcion,prioridad,diaIn, mesIn, añoIn, facturacion);
    }

}
