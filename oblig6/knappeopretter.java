import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Knappeoppretter extends JPanel{
    JLabel nytt;

    public Knappeoppretter(int teksten){
        nytt = new JLabel("Antall losninger: " + teksten);
        add(nytt, BorderLayout.NORTH);
    }
    
    public void endre(int ny){
        nytt.setText("Antall losninger: " + ny);
    }
}
