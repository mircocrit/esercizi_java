// Applet semplicissimo

import javax.swing.*;
import java.awt.*;

public class applet extends JApplet {
    public void init() {
        getContentPane().add(new JLabel("Applet!"));
    }
}