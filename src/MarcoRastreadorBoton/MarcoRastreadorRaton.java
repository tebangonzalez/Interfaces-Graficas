
//MarcoRastreadorRaton.java
// Mouse event handling.import java.awt.Color;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoRastreadorRaton extends JFrame {
    private final JPanel panelMause; // panel in which mouse events will occur
    private final JLabel barStatus; // displays event information

    // The MouseTrackerFrame constructor sets the GUI and registers the mouse event handlers
    public MarcoRastreadorRaton() {
        super("Mouse Events Demo");

        panelMause = new JPanel();
        panelMause.setBackground(Color.WHITE);
        add(panelMause,BorderLayout.CENTER); //adds tag to JFrame

        barStatus = new JLabel("Mouse out of JPanel");
        add(barStatus, BorderLayout.SOUTH); //adds tag to JFrame

        // creates and registers a listening component for mouse events and its movement
        MouseHandler driver = new MouseHandler();
        panelMause.addMouseListener(driver);
        panelMause.addMouseMotionListener(driver);
    }

    private class MouseHandler implements MouseListener, MouseMotionListener {
        // MouseListener's event handlers handle the event when the mouse is released right after the button is pressed
        @Override
        public void mouseClicked(MouseEvent event) {
            barStatus.setText(String.format("Clicked [%d, %d]", event.getX(),event.getY()));
        }

        // handle the event when the mouse is pressed
        @Override
        public void mousePressed(MouseEvent event) {
            barStatus.setText(String.format("Oppressed in [%d, %d]", event.getX(),event.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent event) {
            barStatus.setText(String.format("It was released in [%d,%d]", event.getX(),event.getY()));
        }

        // handle the event when the mouse button is released
        @Override
        public void mouseEntered(MouseEvent event){
            barStatus.setText(String.format("Mouse entered [%d, %d]",
                    event.getX(),event.getY()));
            panelMause.setBackground(Color.GREEN);
        }
        // handle the event when the mouse leaves the area
        @Override
        public void mouseExited(MouseEvent event){
            barStatus.setText("Mouse out of JPanel");
            panelMause.setBackground(Color.WHITE);
        }

        // MouseMotionListener event handlers handle the event when the user drags the mouse with the button down
        @Override
        public void mouseDragged(MouseEvent event){
            barStatus.setText(String.format("It is dragged in [%d, %d]",event.getX(),
                    event.getY()));
        }

        // handle the event when the user moves the mouse
        @Override
        public void mouseMoved(MouseEvent event) {
            barStatus.setText(String.format("Moved by [%d, %d]",
                    event.getX(),event.getY()));
        }
    }
}
 