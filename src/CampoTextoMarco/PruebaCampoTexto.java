 //PruebaCampoTexto.java
 // Test of FieldTextFrame.
import javax.swing.JFrame;

public class PruebaCampoTexto {
    public static void main(String[] args) {
        CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campoTextoMarco.setSize(350, 100);
        campoTextoMarco.setVisible(true);
    }
} // end of class TextFieldTest