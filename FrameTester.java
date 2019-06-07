import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTester {
    public static void main (String args[]) {
        JFrame f = new JFrame ("JFrame Example");
        Container c = f.getContentPane();
        c.setLayout (new FlowLayout());
        for (int i = 0; i < 5; i++) {
            c.add (new JButton ("No")).setBackground(SystemColor.control);
            c.add (new JButton ("Batter"));
        }
        c.add (new JLabel ("Swing"));
        f.setSize (300, 200);
        f.show();
    }
}