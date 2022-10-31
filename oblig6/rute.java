import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

abstract class Ruter extends JButton{

    int koordinat1;
    int koordinat2;
    Ruter naboSor = null;
    Ruter naboOst = null;
    Ruter naboNord = null;
    Ruter naboVest = null;
    Boolean besoekt = false;
    ArrayList<Tuppel> tuppelListe;
    Labyrint labyrint;
    Ruter[][] rutenett;
    char merke = ' ';

    Ruter(int koor1, int koor2, Labyrint labyrint,Ruter[][] rutenett){
        tuppelListe = new ArrayList<>();
        this.rutenett = rutenett;
        this.labyrint = labyrint;
        this.koordinat1 = koor1;
        this.koordinat2 = koor2;
        
    }

    public void settNabo(){

        int sjekkRad = koordinat1;
        int sjekkKollone = koordinat2;

        if (sjekkRad - 1 >= 0){
            naboNord = rutenett[sjekkRad - 1][sjekkKollone];
        }

        if (sjekkRad + 1 <= labyrint.rader-1){
            naboSor = rutenett[sjekkRad+1][sjekkKollone];
        }

        if (sjekkKollone - 1 >= 0){
            naboVest = rutenett[sjekkRad][sjekkKollone-1];
        }

        if (sjekkKollone + 1 <= labyrint.kolonner-1){
            naboOst = rutenett[sjekkRad][sjekkKollone+1];
        }
    }

    public void finnUtvei(){
        this.gaa(tuppelListe);
    }

    void initGUI(){
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        setFont(new Font("Monospaced" , Font.BOLD, 70));
        setPreferredSize(new Dimension(20,20));
        setText(" ");
        int k1 = this.koordinat1;
        int k2 = this.koordinat2;

        class Rutevelger implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e){
                labyrint.finnUtveiFra(k2,k1);
                labyrint.knapp.endre(labyrint.hele.size());
                labyrint.hele.clear();
            } 
        }
        
        addActionListener(new Rutevelger());
    }

    abstract void gaa(ArrayList<Tuppel> liste);


    abstract char chartilTegn();
}
