package Vista.Paneles;

import Controlador.Controlador;
import Modelo.Modelo;

import Vista.Formularios.AnyadirTarea.FormularioAnyadirEtiqueta;
import Vista.Formularios.AnyadirTarea.FormularioAnyadirTarea;
import Vista.Formularios.FormularioAnyadirPersonaTarea;
import Vista.Vista;
import Controlador.Controlador;
import Modelo.Modelo;
import Modelo.Proyecto.Personas.Persona;
import Vista.Formularios.AnyadirPersona.FormularioAnyadirPersonas;
import Vista.Formularios.AnyadirPersona.FormularioBuscarPersona;
import Vista.Formularios.AnyadirPersona.FormularioListarPersonaSinTarea;
import Vista.TratamientoErrores;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import Vista.TratamientoErrores;

public class PanelTareas extends JPanel {
    private Controlador controlador;
    private Modelo modelo;
    private JTextArea areaDatosTarea = new JTextArea(20, 10);
    private JTextField dniTarea;
    private JFrame vista;

    public PanelTareas(Controlador controlador, Modelo modelo, JFrame vista) {


        this.controlador = controlador;
        this.modelo = modelo;
        this.vista = vista;
        JButton bBuscarTarea = new JButton("Buscar Tarea");

        JButton bInsetarTarea = new JButton("Añadir Tarea");
        JButton bBorrarTarea = new JButton("Borrar Persona de Tarea ");
        JButton bfinalizarTarea = new JButton("Finalizar");

        JButton bEtiqueta = new JButton("Añadir etiqueta");
        JButton bAñadirPersonas = new JButton("Añadir Personas");
        JButton bActualizar = new JButton("Actualizar");

        JLabel jDNI = new JLabel("Nombre de la tarea: ");
        dniTarea = new JTextField(10);

        String datos = modelo.informacionTarea(modelo.getTareas());

        JScrollPane panel = new JScrollPane(areaDatosTarea);
        panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        rellenarInformacion(datos);


       bActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String datos = modelo.informacionTarea(modelo.getTareas());
                rellenarInformacion(datos);
            }
        });

        bInsetarTarea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new FormularioAnyadirTarea(controlador);
            }
        });

        bBorrarTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (dniTarea.getText().length() == 0) {
                    new TratamientoErrores("  No hay escrito ningun titulo  ");
                } else if (!controlador.encontrarTareab(dniTarea.getText())) {
                    new TratamientoErrores("  No se encuentra la tarea con ese titulo  ");
                } else {
                    borrarTarea();
                }
            }
        });
        finalizarTarea(dniTarea);
        bfinalizarTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (dniTarea.getText().length() == 0) {
                    new TratamientoErrores("  No hay escrito ningun titulo  ");
                } else if (!controlador.encontrarTareab(dniTarea.getText())) {
                    new TratamientoErrores("  No se encuentra la tarea con ese titulo  ");
                } else {
                    finalizarTarea(dniTarea);
                }
            }
        });


       /* bListarPersonasSinTarea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FormularioListarPersonasSinTarea(controlador);

            }
        });*/
        bAñadirPersonas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dniTarea.getText().length() == 0) {
                    new TratamientoErrores("  No hay escrito ningun titulo  ");
                } else if (!controlador.encontrarTareab(dniTarea.getText())) {
                    new TratamientoErrores("  No se encuentra la tarea con ese titulo  ");
                } else {
                    new FormularioAnyadirPersonaTarea(controlador, dniTarea);
                }
            }
        });

        bEtiqueta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dniTarea.getText().length() == 0) {
                    new TratamientoErrores("  No hay escrito ningun titulo  ");
                } else if (!controlador.encontrarTareab(dniTarea.getText())) {
                    new TratamientoErrores("  No se encuentra la tarea con ese titulo  ");
                } else {
                    new FormularioAnyadirEtiqueta(controlador, dniTarea);
                }
            }
        });


        JPanel panelDNI = new JPanel();
        panelDNI.add(jDNI);
        panelDNI.add(dniTarea);

        Container contenedor = new Container();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.PAGE_AXIS));
        JPanel panelOption = new JPanel();

        panelOption.add(panelDNI);
        panelOption.add(bBuscarTarea);
        panelOption.add(bInsetarTarea);
        panelOption.add(bBorrarTarea);
        panelOption.add(bfinalizarTarea);
        panelOption.add(bEtiqueta);
        panelOption.add(bAñadirPersonas);
        panelOption.add(bActualizar);
        contenedor.add(panelOption);
        contenedor.add(panel);
        add(contenedor);

        areaDatosTarea.setForeground(Color.BLACK);
        areaDatosTarea.setEditable(false);

    
      /*  public void buscarPersona() {
        if (!dniIsEmpty()){
            if controlador.
        }

        }*/




    }
    public void borrarTarea(){

    }

    public void rellenarInformacion(String datos){
        areaDatosTarea.setText("");
        areaDatosTarea.append(datos);
    }


    public void finalizarTarea(JTextField dniTarea){
        controlador.finalizar(dniTarea.getText());
    }

}