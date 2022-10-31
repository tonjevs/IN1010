import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Sortrute extends Ruter{

    public Sortrute(int koor1, int koor2, Labyrint laberynt,Ruter[][] rutenett){
        super(koor1,koor2,laberynt,rutenett);
        this.koordinat1 = koor1;
        this.koordinat2 = koor2;
    }
    
    @Override
    public void gaa(ArrayList<Tuppel> liste){
        return;
    }

    @Override
    void initGUI () {
        super.initGUI();
        setBackground(Color.BLACK);
        this.setOpaque(true);
    }

    @Override
    public char chartilTegn() {
        return '#';
    }
    
}
