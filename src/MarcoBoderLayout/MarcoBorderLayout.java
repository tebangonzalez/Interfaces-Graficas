 //MarcoBorderLayout.java
// BorderLayout containing five buttons.

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoBorderLayout extends JFrame implements ActionListener {

    private final JButton botones[]; // arrangement of buttons to hide portions
    private static final String nombres[] = {"Ocultar Norte", "Ocultar Sur",
        "Ocultar Este", "Ocultar Oeste", "Ocultar Centro"};
    private final BorderLayout esquema;

    // establishes the GUI and event handling
    public MarcoBorderLayout() {
        super("Demostracion de BorderLayout");

        esquema = new BorderLayout(5, 5); // 5 pixel spacing
        setLayout(esquema);
        botones = new JButton[nombres.length];
        // creates JButton objects and registers listener components for them

        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
        }

        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);
        add(botones[2], BorderLayout.EAST);
        add(botones[3], BorderLayout.WEST);
        add(botones[4], BorderLayout.CENTER);
    }
// handles button events

    @Override
    public void actionPerformed(ActionEvent evento) {
        // checks the source of the event and distributes the content pane accordingly
        for (JButton boton : botones) {
            if (evento.getSource() == boton) {
                boton.setVisible(false); // hides the pressed button
            } else {
                boton.setVisible(true); // shows the other buttons
            }
        }

        esquema.layoutContainer(getContentPane()); // distributes the content panel
    }
} // end of MarcoBorderLayout class
