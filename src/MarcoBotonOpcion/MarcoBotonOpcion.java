import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MarcoBotonOpcion extends JFrame {
    private final JTextField textField; // used to show changes in font
    private final Font simpleLetterType; // font for plain text
    private final Font boldType; // font for bold text
    private final Font typeItalic; // font for italic text
    private final Font typeBoldItalic; // font for bold and italic text
    private final JRadioButton simpleJRadioButton;//select simple text
    private final JRadioButton boldJRadioButton;//select bold text
    private final JRadioButton italicJRadioButton;//select italic text
    private final JRadioButton boldItalicJRadioButton; // bold and italic
    private ButtonGroup groupOptions; // contains the option buttons

    //The constructor of OptionButtonFrame adds the JRadioButton objects to the JFrame
    public MarcoBotonOpcion() {
        super("RadioButton test");
        setLayout(new FlowLayout());

        textField = new JTextField("Esteban Gonzalez Garcia",25);
        add(textField); // add TextField to JFrame

        //create radio buttons
        simpleJRadioButton = new JRadioButton("Simple",true);
        boldJRadioButton = new JRadioButton("Bold",false);
        italicJRadioButton = new JRadioButton("Italic",false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic",false);
        add(simpleJRadioButton); // add simple button to JFrame
        add(boldJRadioButton); // adds bold button to JFrame
        add(italicJRadioButton); // add italics button to JFrame
        add(boldItalicJRadioButton); // add bold and italic button

        // create a logical relationship between the JRadioButton objects
        groupOptions = new ButtonGroup(); // create ButtonGroup
        groupOptions.add(simpleJRadioButton); // create ButtonGroup
        groupOptions.add(boldJRadioButton); // adds bold to the group
        groupOptions.add(italicJRadioButton); // add italics to the group
        groupOptions.add(boldItalicJRadioButton); // add bold and italic

        // create the font objects
        simpleLetterType = new Font("Serif",Font.PLAIN,14);
        boldType = new Font("Serif",Font.BOLD,14);
        typeItalic = new Font("Serif",Font.BOLD,14);
        typeBoldItalic = new Font("Serif",Font.BOLD+Font.ITALIC,14);
        textField.setFont(simpleLetterType);

        // register events for JRadioButton objects
        simpleJRadioButton.addItemListener(new OptionButtonHandler(simpleLetterType));
        boldJRadioButton.addItemListener(new OptionButtonHandler(boldType));
        italicJRadioButton.addItemListener(new OptionButtonHandler(typeItalic));
        boldItalicJRadioButton.addItemListener(new OptionButtonHandler(typeBoldItalic));
    }

    // private inner class to handle radio button events
    private class OptionButtonHandler implements ItemListener {
        private Font typeLetter; // font associated with this listener component
        public OptionButtonHandler(Font f) {
            typeLetter = f;
        }

        // handle radio button events
        @Override
        public void itemStateChanged(ItemEvent event) {
            textField.setFont(typeLetter);
        }
    }
}