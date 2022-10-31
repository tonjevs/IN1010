import java.io.*;
import java.util.HashMap;

class Fletting implements Runnable{
    HashMap<String,Subsekvens> hm1;
    HashMap<String,Subsekvens> hm2;
    HashMap<String,Subsekvens> hm3;
    Beholderklasse beholder;


    Fletting(HashMap<String,Subsekvens> hm1, HashMap<String,Subsekvens> hm2, Beholderklasse beholder){
        this.hm1 = hm1;
        this.hm2 = hm2;
        this.beholder = beholder;
    }

    @Override
    public void run(){
        hm3 = hm1;

        for(String nokkel : hm2.keySet()){
            if (hm3.containsKey(nokkel)){
                hm3.get(nokkel).settAntall(hm2.get(nokkel).hent());
            }
    
            else{
                hm3.put(nokkel, hm2.get(nokkel));
            }
        }
        beholder.settInn(hm3);
    }
}