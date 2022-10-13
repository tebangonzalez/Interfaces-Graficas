// Fig. 12.32: MouseDetails.java
// MouseDetailFrame test.

import javax.swing.JFrame;

public class MouseDetails {
    public static void main(String[] args) {
        MouseDetailFrame mouseDetailFrame = new MouseDetailFrame();
        mouseDetailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseDetailFrame.setSize(400, 150);
        mouseDetailFrame.setVisible(true);
    }
}