 // MarcoAreaTexto.java
 // Copies the selected text from one JText area to another.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class MarcoAreaTexto extends JFrame {

    private final JTextArea areaTexto1; // sample demonstration chain
    private final JTextArea areaTexto2; // the highlighted text is copied here
    private final JButton botonCopiar; // starts copying text

    // constructor without arguments
    public MarcoAreaTexto() {
        super("Demostracion de JTextArea");
        Box cuadro = Box.createHorizontalBox(); // create a picture
        String demo = "Esta es una cadena de\ndemostracion para\n"
                + "ilustrar como copiar texto\nde un area de texto a \n"
                + "otra, usando un\nevento externo\n";

        areaTexto1 = new JTextArea(demo, 10, 15);
        cuadro.add(new JScrollPane(areaTexto1)); // adds scrolling panel

        botonCopiar = new JButton("Copiar >>>"); // creates copy button
        cuadro.add(botonCopiar); // adds copy button to the box
        botonCopiar.addActionListener(new ActionListener() // anonymous internal class
        {
            // sets the text in areaText2 with the text selected from areaText1
            @Override
            public void actionPerformed(ActionEvent evento) {
                areaTexto2.setText(areaTexto1.getSelectedText());
            }
        }
        );

        areaTexto2 = new JTextArea(10, 15);
        areaTexto2.setEditable(false);
        cuadro.add(new JScrollPane(areaTexto2)); // adds scrolling panel

        add(cuadro); // add frame to frame
    }
} // End of class MarcoAreaTexto
