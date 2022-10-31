import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

class Beholderklasse{
    protected Boolean bool;
    protected ArrayList<HashMap<String,Subsekvens>> beholderen;

    Beholderklasse(Boolean i){
        this.bool = i;
        beholderen = new ArrayList<>();
    }
    
    public void settInn(HashMap<String,Subsekvens> hm){
        beholderen.add(hm);
    }

    public HashMap<String,Subsekvens> taUt(){
        return beholderen.remove(0); 
    }

    public Boolean hentBool(){
        return this.bool;
    }

    public int stoerellse(){
        return beholderen.size();
    }

    public void testHele(){
        for(HashMap<String,Subsekvens> hashN: beholderen){
            System.out.println(" Storrelsen av HashMap:  " + hashN.size());
        }
    }
}

