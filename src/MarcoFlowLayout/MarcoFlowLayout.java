// MarcoFlowLayout.java
// FlowLayout allows components to flow across multiple lines.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame {

    private final JButton botonJButtonIzquierda; // button to set the alignment to the left
    private final JButton botonJButtonCentro; // button to set the alignment to the center
    private final JButton botonJButtonDerecha; // button to set the alignment to the right
    private final FlowLayout esquema; // schematic object
    private final Container contenedor; // container to establish the scheme

    // sets up the GUI and registers the button listening components
    public MarcoFlowLayout() {
        super("Demostracion de FlowLayout");

        esquema = new FlowLayout();
        contenedor = getContentPane(); // obtains container for outline
        setLayout(esquema);
        // set buttonJButtonLeft and register listening component
        botonJButtonIzquierda = new JButton("Izquierda");
        add(botonJButtonIzquierda); // adds Left button to the frame
        botonJButtonIzquierda.addActionListener(
                new ActionListener() { // anonymous internal class
            // processes buttonJButtonLeft event
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.LEFT);

                // realigns the attached components
                esquema.layoutContainer(contenedor);
            }
        }
        );

        // set buttonJButtonCenter and register listening component
        botonJButtonCentro = new JButton("Centro");
        add(botonJButtonCentro); // adds Center button to the frame
        botonJButtonCentro.addActionListener(
                new ActionListener() { // anonymous internal class
            // processes buttonJButtonCenter event
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.CENTER);

                // realigns the attached components
                esquema.layoutContainer(contenedor);
            }
        }
        );

        // set buttonJButtonRight and register listening component
        botonJButtonDerecha = new JButton("Derecha");
        add(botonJButtonDerecha); // adds Right button to the frame
        botonJButtonDerecha.addActionListener(
                new ActionListener() { // anonymous internal class

            // processesJButtonRightButton event
            @Override
            public void actionPerformed(ActionEvent evento) {
                esquema.setAlignment(FlowLayout.RIGHT);

                // realigns the attached components
                esquema.layoutContainer(contenedor);
            }
        }
        );
    } // end of MarcoFlowLayout builder
} // end of class MarcoFlowLayout
