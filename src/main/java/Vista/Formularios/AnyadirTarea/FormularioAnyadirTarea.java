package Vista.Formularios.AnyadirTarea;

import Controlador.Controlador;
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

        JPanel fechaFi = new JPanel();
        fechaFi.add(new JLabel("Dia"));
        fechaFi.add(diaFi);
        fechaFi.add(new JLabel("Mes"));
        fechaFi.add(mesFi);
        fechaFi.add(new JLabel("Año"));
        fechaFi.add(anyFi);

        contenedor.add(new JLabel("TÍTULO:"));
        contenedor.add(titulo);
        contenedor.add(new JLabel("DESCRIPCIÓN:"));
        contenedor.add(descripcion);

        contenedor.add(new JLabel("PRIORIDAD:"));
        contenedor.add(prioridad);

        contenedor.add(new JLabel("FECHA INICIO"));
        contenedor.add(fechaIn);

        contenedor.add(new JLabel("FECHA FIN"));
        contenedor.add(fechaFi);

        contenedor.add(costeFacturación);

        contenedor.add(bCrearTarea);
        formulario.pack();
        formulario.setVisible(true);

        bCrearTarea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearTarea();

            }
        });
    }

    public void crearTarea(){

    }

}
