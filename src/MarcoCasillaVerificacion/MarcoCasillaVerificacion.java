import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MarcoCasillaVerificacion extends JFrame {
    private JTextField textField; // Shows the text in changing types
    private JCheckBox boldJCheckBox; // to select/deselect bold
    private JCheckBox italicsJCheckBox; // to select/unselect italics

    // The constructor of CheckBoxFrame adds JCheckBox objects to JFrame
    public MarcoCasillaVerificacion() {
        super("JCheckBox test");
        setLayout(new FlowLayout()); //set JTextField and its font
        textField = new JTextField("Esteban Gonzalez Garcia", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField); // add TextField to JFrame

        boldJCheckBox = new JCheckBox("Bold");
        italicsJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox); // add "bold" checkbox to JFrame
        add(italicsJCheckBox); // add "italic" checkbox to JFrame

        // register listener components for JCheckBox objects
        HandlerCheckBox handler = new HandlerCheckBox();
        boldJCheckBox.addItemListener(handler);
        italicsJCheckBox.addItemListener(handler);
    }

    // private inner class for handling ItemListener events
    private class HandlerCheckBox implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null; // store the new Font object

            // determines which CheckBox objects are selected and creates the Font object
            if (boldJCheckBox.isSelected() && italicsJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicsJCheckBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);

            textField.setFont(font);

        }
    }
}