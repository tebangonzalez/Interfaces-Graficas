//Sum program using JOptionPane for input and output.
import javax.swing.JOptionPane;

public class Suma {

    public static void main(String[] args) {
// Gets the user input from the JOptionPane input dialogs
        String primerNumero
                = JOptionPane.showInputDialog("Introduzca el primer enter");
        String segundoNumero
                = JOptionPane.showInputDialog("Introduzca el segundo entero");

// Converts String entries to int values for use in a calculation
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;

// Displays the results in a JOptionPane message dialog
        JOptionPane.showMessageDialog(null, "La suma es " + suma,
                "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);
    }
} // End of the Sum class