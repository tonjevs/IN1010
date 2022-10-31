import java.util.ArrayList;

class Kryss{
    ArrayList<Sti> stiListe;
    Kryss naboKryss = null;
    boolean besokt = false;

    Kryss(){
        stiListe = new ArrayList<>();  
    }

    Sti returnerTilfeldigSti(){
        int tall = Trekk.trekkInt(0,3);
        return stiListe.get(tall);
    }
    boolean isolertKryss(Sti sti){
        if(sti.kryssSlutt == sti.kryssStart){
            return true;
        }
        return false;
    }
    boolean finnesVeiTil(Kryss kryss2){
        if(!besokt){
            besokt = true;
            if(this == kryss2){
                return true;
            }
            if(naboKryss != null && naboKryss != this){
                naboKryss.finnesVeiTil(kryss2);
            }
        }
        return false;
    }
}
