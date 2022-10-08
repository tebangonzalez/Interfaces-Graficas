// MarcoGridLayout.java
// GridLayout containing six buttons.

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoGridLayout extends JFrame implements ActionListener {

    private final JButton[] botones; // button arrangement
    private static final String[] nombres
            = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
    private boolean alternar = true; // alternates between two schemes
    private Container contenedor; // frame container
    private GridLayout cuadricula1; // first GridLayout object
    private GridLayout cuadricula2; // second GridLayout object

    // constructor without arguments
    public MarcoGridLayout() {
        super("Demostracion de GridLayou");
        cuadricula1 = new GridLayout(2, 3, 5, 5); // 2 by 3; spaces of 5
        cuadricula2 = new GridLayout(3, 2); // 3 by 2; no spaces
        contenedor = getContentPane();
        setLayout(cuadricula1);
        botones = new JButton[nombres.length];

        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this); // records listening component
            add(botones[cuenta]); // add button to JFrame object
        }
    }

    // handles button events, toggling between the following schemes
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (alternar) // establishes a scheme based on alternating
        {
            contenedor.setLayout(cuadricula2);
        } else {
            contenedor.setLayout(cuadricula1);
        }

        alternar = !alternar;
        contenedor.validate(); // redistributes the container
    }
} // end of MarcoGridLayout class
