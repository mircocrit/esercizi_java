import java.awt.*;
import javax.swing.*;

class Dialog1 extends JDialog {
    static final long serialVersionUID = 231243;
    BorderLayout borderLayout1 = new BorderLayout();
    JPanel jPanel1 = new JPanel();
    JButton jButton1 = new JButton();
  
    public Dialog1(Frame parent, String title, boolean modal) {
      super(parent, title, modal);
      try  {
        jbInit();
        pack(); //Causes this Window to be sized to 
  // fit the preferred size and layouts of its 
  // subcomponents
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }
  
    /**
     * Constructs a new non-modal unparented instance with a blank title.
     */
    public Dialog1() {
      this(null, "", false);
    }
  
    /**
     * Initializes the state of this instance.
     */
    private void jbInit() throws Exception {
      jPanel1.setLayout(borderLayout1);
      jButton1.setText("jButton1");
      getContentPane().add(jPanel1);
      jPanel1.add(jButton1, BorderLayout.WEST);
    }
  }
  
  

// costruisce un frame e una finestra di dialogo

public class MyClass{
    public MyClass() {
    }
    
    static public void main(String[] args) {
        
        JFrame myframe= new JFrame("one frame");
        myframe.resize(100,200);
        myframe.show();
        
        Dialog1 dialog1=new Dialog1();
        dialog1.resize(100,200);
        dialog1.show();
    }
    
    
}

