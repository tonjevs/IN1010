import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class RutenettGUI{
    public static void main(String[] args){
        JFrame vindu = new JFrame("Labyrint");
        File fil;
        JFileChooser filen = new JFileChooser();
        int svar = filen.showOpenDialoge(null);
        Knappeoppretter wii;

        if(svar == JFileChooser.APPROVE_OPTION){
            try{
                int teller = 0;
                JPanel ny = new JPanel();
                JPanel subny = new JPanel();
                JPanel subny2 = new JPanel();
                fil = filen.getSelectedFile();
                wii = new Knappeoppretter(teller);
                Rutenett brett = new Rutenett(fil, wii);
                brett.initGUI();
                subny.add(brett);

                ArrayList<ArrayList<Tuppel>> hel = brett.labyrint.hele;
                for (ArrayList<Tuppel> arrayList : hel) {
                    for (Tuppel tuppel : arrayList) {
                        teller++;
                    }
                }

                subny2.add(wii);

                vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vindu.setLayout(new BorderLayout());
                ny.add(subny);
                ny.add(subny2);
                vindu.add(ny);
                vindu.pack();
                vindu.setVisible(true);
            }
            catch(FileNotFoundException e){
                System.out.println("Kunne ikke finne filen du snakket om...");
            }
        }

        else{
            System.exit(1);
        }     
    }
}

