import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;

class Rutenett extends JPanel{
    Labyrint labyrint;
    Knappeoppretter knapp;

    Rutenett(File fil, Knappeoppretter hei)throws FileNotFoundException{
        knapp = hei;

        try{
            labyrint = new Labyrint(fil,knapp);
            
        }
        catch(FileNotFoundException e){
            throw new FileNotFoundException();
        }
    }
    public Knappeoppretter hentKnapp(){
        return knapp;
    }

    void initGUI(){
        
        int rad = labyrint.rader;
        int kolonne = labyrint.kolonner;
        setLayout(new GridLayout(rad,kolonne));
        for(int i = 0; i < rad; i++){
            for(int j = 0; j < kolonne;j++){
                labyrint.rutenett[i][j].initGUI();
                add(labyrint.rutenett[i][j]);
            }
        }
    }
}
