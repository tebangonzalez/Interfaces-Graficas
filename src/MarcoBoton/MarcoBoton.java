//MarcoBoton.java
// Command buttons and action events.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame{
    private final JButton botonJButtonSimple;
    private final JButton botonJButtonElegante;

    //MarcoBoton adds JButton objects to JFrame
    public MarcoBoton(){
        super("Pruba de Botones");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Boton Simple");//button with text
        add(botonJButtonSimple);//agrega botonJButtonSimple a JFrame


        Icon insecto1= new ImageIcon(getClass().getResource("insecto1.gif"));
        Icon insecto2= new ImageIcon(getClass().getResource("insecto2.gif"));
        botonJButtonElegante = new JButton("Boton elegante", insecto1);//Sets the image

        botonJButtonElegante.setRolloverIcon(insecto2);//Sets the replacement image
        add(botonJButtonElegante);//add buttonJButtonElegante to JFrame

        // creates new ButtonHandler to handle button events
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }
    // internal class to handle button events
    private class  ManejadorBoton implements  ActionListener{
        // handles button event
        @Override
        public void actionPerformed(ActionEvent evento){
            JOptionPane.showMessageDialog(MarcoBoton.this,String.format("Usted oprimio" +
                    ": %s", evento.getActionCommand()));
        }
    }
}// end of class MarcoBoton 
