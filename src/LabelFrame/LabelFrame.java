// LabelFrame.java
// Jlabel components with text and icons.

import java.awt.FlowLayout; // specifies how components are to be ordered
import javax.swing.JFrame; // provides the basic features of a window
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // load the images

public class LabelFrame extends JFrame {

    private JLabel etiqueta1;//JLabel with text only
    private JLabel etiqueta2;//JLabel built with tecto and an icon
    private JLabel etiqueta3; //JLabel with additional text and icon

    public LabelFrame() {
        super("Prueba de JLabel");
        setLayout(new FlowLayout());
        //JLabel constructor with String argument
        etiqueta1 = new JLabel("Esteban Gonzalez Garcia");
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1);//

        //Jlabel constructor with string, icon and alignment arguments
        Icon insecto = new ImageIcon(getClass().getResource("carro1.jpg"));
        etiqueta2 = new JLabel("Etiqueta con texto e icono", insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es la etiqueta2");
        add(etiqueta2);// agrega etiqueta2 a JFrame

        etiqueta3 = new JLabel(); //JLabel constructor with no arguments
        etiqueta3.setText("Esteban Gonzalez, etiqueta con texto e icono inferior");
        etiqueta3.setIcon(insecto); // add icon to JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3);
    }
}
