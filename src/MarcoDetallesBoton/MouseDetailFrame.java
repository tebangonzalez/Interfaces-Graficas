//MarcoDetallesRaton.java
// Demonstration of mouse clicks and how to differentiate mouse buttons. import java.awt.BorderLayout;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailFrame extends JFrame {
    private String datails; // String displayed in StatusBar
    private final JLabel statusBar;

    public MouseDetailFrame() {
        super("Clicks and mouse buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler()); // add handler
    }

    // inner class to handle mouse events
    private class MouseClickHandler extends MouseAdapter {
        // handle mouse click event and determine which button was pressed
        @Override
        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX(); // get mouse position x
            int yPos = event.getY(); // get mouse y position

            datails = String.format("Clicked %d time(s)", event.getClickCount());

            if (event.isMetaDown()) { // right mouse button
                datails += "with the right mouse button";
            } else if (event.isAltDown()) { // middle mouse button
                datails += " with the middle mouse button";
            } else { // left mouse button
                datails += " with the left mouse button";
            }
            statusBar.setText(datails); // display message in statusbar
        }
    }
}