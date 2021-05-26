package Vista;

import javax.swing.*;
import java.awt.*;

public class TratamientoErrores extends JDialog {

        private String info;

        public TratamientoErrores(String info, JFrame padre, boolean bloqueante) {
            //super(padre, bloqueante);
            this.info = info;
            if (bloqueante) {
                JLabel text = new JLabel(info);
                JPanel panel = new JPanel();
                panel.add(text);

                add(panel, BorderLayout.CENTER);
                setBounds(750, 400, 250, 100);
                Image icono = Toolkit.getDefaultToolkit().getImage("src/imagenes/cancel.png");
                setTitle("ERROR");
                setIconImage(icono);
                setVisible(true);
            }
        }
}
