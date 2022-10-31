import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator {
    

    public static void main(String[] args) {
        
        JFrame vindu = new JFrame("Kalkulator");
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel hovedPanel = new JPanel(new GridLayout(2,1));

        JLabel tekst = new JLabel("");
        hovedPanel.add(tekst);

        JPanel knapper = new JPanel(new GridLayout(4, 4));
        
        String[] knappe_navn = {"7", "8", "9", "*", "4", "5", "6", "%", "1", "2", "3" ,"0", "+" , "-", "=" ,"<3"};

        class Knappetrykk implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e){
                JButton klikket = (JButton) e.getSource();
                String ny = klikket.getText();
                String teksten = tekst.getText();
                tekst.setText(ny + teksten);
            }
        }

        for (String i : knappe_navn) {
            JButton nyKnapp = new JButton(i);
            knapper.add(nyKnapp);
            nyKnapp.addActionListener(new Knappetrykk());
        }

        hovedPanel.add(knapper);
        vindu.add(hovedPanel);

        if (addActionListener(new Knappetrykk()) == "+"){
            int tall = Integer.parseInt(tekst.getText());
        }
        
        if (addActionListener(new Knappetrykk()) == "-"){
            int tall = Integer.parseInt(tekst.getText());
        }
        
        if (addActionListener(new Knappetrykk()) == "*"){
            int tall = Integer.parseInt(tekst.getText());
        }
        if (addActionListener(new Knappetrykk()) == "%"){
            int tall = Integer.parseInt(tekst.getText());
        }
        
        if (addActionListener(new Knappetrykk()) == "="){
            int tall = Integer.parseInt(tekst.getText());
        }
        vindu.pack();
        vindu.setVisible(true);
    }
}
