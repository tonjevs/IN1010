import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Hvitrute extends Ruter{

    public Hvitrute(int koor1, int koor2, Labyrint laberynt,Ruter[][] rutenett){
        super(koor1,koor2,laberynt,rutenett);
        this.koordinat1 = koor1;
        this.koordinat2 = koor2;
    }

    @Override
    public void gaa(ArrayList<Tuppel> liste){
        ArrayList<Tuppel> nySti = new ArrayList<>(liste);

        if(!besoekt){
            besoekt = true;
            Tuppel gammelTuppel = new Tuppel(koordinat1,koordinat2);
            nySti.add(gammelTuppel);

            if (naboNord != null){
                naboNord.gaa(nySti);
            }
            if(naboSor != null){
                naboSor.gaa(nySti);
            }
            if(naboVest != null){
                naboVest.gaa(nySti);
            }
            if(naboOst != null){
                naboOst.gaa(nySti);
            }
        }
    }
    @Override
    void initGUI(){
        super.initGUI();
        setBackground(Color.WHITE);
    }


    @Override
    public char chartilTegn() {
        return '.';
    }
}
