import java.util.ArrayList;

class Kryss{
    ArrayList<Sti> stiListe;
    int antStier;

    Kryss(){
        stiListe = new ArrayList<>();
    }

    Sti returnerTilfeldigSti(){
        int tall = Trekk.trekkInt(0,antStier);
        return stiListe.get(tall);
    }
    boolean isolertKryss(Sti sti){
        if(sti.kryssSlutt == sti.kryssStart){
            return true;
        }
        return false;
    }
}
