import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Aapning extends Hvitrute{

    public Aapning(int koor1, int koor2, Labyrint laberynt,Ruter[][] rutenett){
        super(koor1,koor2,laberynt,rutenett);
        this.koordinat1 = koor1;
        this.koordinat2 = koor2;
    }
    @Override
    public void gaa(ArrayList<Tuppel> liste){
        ArrayList<Tuppel> nySti = new ArrayList<>(liste);
        Tuppel nyTuppel = new Tuppel(koordinat1,koordinat2);
        labyrint.hele.add(nySti);
        nySti.add(nyTuppel);
    }

    @Override
    public char chartilTegn(){
        return '.';
    }
}
