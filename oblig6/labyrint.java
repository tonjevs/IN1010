import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;

class Labyrint extends JPanel{
    JButton sluttknapp;
    JLabel statustekst;
    Rutenett spillet;

    String filnavn;
    Ruter[][] rutenett;
    ArrayList<ArrayList<Tuppel>> hele;
    int rader;
    int kolonner;
    Knappeoppretter knapp;

    public Labyrint(File filnavn, Knappeoppretter k)throws FileNotFoundException{
        knapp = k;
        int koord1 = 0;
        int koord2 = 0;
        hele = new ArrayList<>();

        try{
            Scanner in = new Scanner(filnavn);

            String linje = in.nextLine();
            String[] tallListe = linje.split(" ");
            rader = Integer.parseInt(tallListe[0]);
            kolonner = Integer.parseInt(tallListe[1]);
            
            rutenett = new Ruter[rader][kolonner];
            
            while(in.hasNextLine()){

                String linjene = in.nextLine();
                String[] linjer = linjene.split("");
                for (String symbol : linjer){
                    
                    if(symbol.equals("#")){
                        rutenett[koord1][koord2] = new Sortrute(koord1,koord2++,this,rutenett);
                    }

                    else if(symbol.equals(".")){
                        if(koord1 == 0 || koord2 == 0 || koord1 == rader - 1 || koord2 == kolonner - 1){
                            rutenett[koord1][koord2] = new Aapning(koord1,koord2++,this,rutenett);
                        }
                        else{
                            rutenett[koord1][koord2] = new Hvitrute(koord1,koord2++,this,rutenett);
                        }
                    }
                }

                System.out.println("");
                koord1++;
                koord2 = 0;
            }
            for(int i = 0; i < rader; i++){
                for(int j = 0; j < kolonner;j++){
                    rutenett[i][j].settNabo();
                }
            }            

        }catch(FileNotFoundException e){
            throw new FileNotFoundException();
        }
    }
    void nulstillRute(){
        for (Ruter[] in : rutenett){
            for (Ruter ruten : in) {
                if(ruten.chartilTegn() == '#'){
                    ruten.setBackground(Color.BLACK);
                    ruten.setOpaque(true);
                }
                else{
                    ruten.setBackground(Color.WHITE);
                    ruten.setOpaque(true);
                }
            }
        }
    }
    
    public ArrayList<ArrayList<Tuppel>> finnUtveiFra(int kol, int rad){

        nulstillRute();
        rutenett[rad][kol].finnUtvei();

        try{
            settFarge(0);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Kunne ikke finne losning...");
        }

        for(Ruter[] in : rutenett){
            for (Ruter ruter : in) {
                ruter.besoekt = false;
            }
        }

        ArrayList<ArrayList<Tuppel>> tmp = hele;
        return tmp;
    }
    void settFarge(int teller){

        ArrayList<Tuppel> hei = hele.get(teller);
        for (Tuppel tuppel : hei) {
            Ruter ruten = rutenett[tuppel.koordinat1][tuppel.koordinat2];
            ruten.setBackground(Color.PINK);
            ruten.setOpaque(true);
        }
    }
    

    void initGUI(){
        spillet.initGUI();
    }

    @Override
    public String toString(){
        String ruter = "";
        for (int i = 0; i < rader; i++) {
            for (int k = 0; k < kolonner; k++){
                ruter += rutenett[i][k].chartilTegn();
            }
            ruter = ruter + "\n";
        }
        return ruter;
    }
}
