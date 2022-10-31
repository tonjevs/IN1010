//Her vil vi bare bruke gettere og settere i aktivitet slik at det
//håndtert slik  
class Tuurgaaer2 extends Aktivitet2 {
    int tid = 0;
    int hastighet;
    Kryss krysset;

    Tuurgaaer2(int hastighet, Kryss krysset) {
        super();
        this.hastighet = hastighet;
        this.krysset = krysset;
    }
    @Override
    void handling(){
        Sti stien = krysset.returnerTilfeldigSti();
        Kryss nyKryss = stien.kryssSlutt;
        int tidSti = stien.beregnGaaTid(hastighet);
        //sjekker om tiden vi fant stemmer med det som er mulig
        //for en aktivitet å være og returnerer
        settTid(tidSti);
        krysset = nyKryss;
    }
}

abstract class Aktivitet2 implements Comparable<Aktivitet>{
    public Aktivitet neste;
    public Aktivitet forrige;
    private int tid = 0;

    abstract void handling();

    int getTid(){ //prover aa bruke gettere og settere
        return tid;
    }

    void settTid(int t){
        if(t <= 0){
            return;
        }
        tid += t;
    }

    @Override
    public int compareTo(Aktivitet a){
        if(tid != a.tid){
            return tid - a.tid;
        }
        return 0;
    }
}
