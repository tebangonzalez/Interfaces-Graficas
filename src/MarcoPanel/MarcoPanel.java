
//MarcoPanel.java
// Uso de un objeto JPanel para ayudar a distribuir los componentes.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MarcoPanel extends JFrame {

    private final JPanel panelBotones; // Panel containing the buttons
    private final JButton[] botones;
    // Constructor without arguments

    public MarcoPanel() {
        super("Demostracion de Panel");
        botones = new JButton[5];
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, botones.length));

        // Create and add buttons
        for (int cuenta = 0; cuenta < botones.length; cuenta++) {
            botones[cuenta] = new JButton("Boton " + (cuenta + 1));
            panelBotones.add(botones[cuenta]); // Adds the button to the panel
        }
        add(panelBotones, BorderLayout.SOUTH); // Add the panel to JFrame
    }
} // fin de la clase MarcoPanel
