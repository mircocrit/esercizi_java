import java.awt.event.*;

public class GenericWindowListener extends WindowAdapter
{
   //-------------------------------------------------------
   //  Termina il programma quando la finestra è chiusa
   //-------------------------------------------------------
   public void windowClosing (WindowEvent event)
   {
      System.exit(0);
   }
}