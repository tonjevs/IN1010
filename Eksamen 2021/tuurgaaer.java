class Tuurgaaer extends Aktivitet {
    int tid = 0;
    int hastighet;
    Kryss krysset;

    Tuurgaaer(int hastighet, Kryss krysset) {
        super();
        this.hastighet = hastighet;
        this.krysset = krysset;
    }
    @Override
    void handling(){
        Sti stien = krysset.returnerTilfeldigSti();
        Kryss nyKryss = stien.kryssSlutt;
        int tidSti = stien.beregnGaaTid(hastighet);
        tid += tidSti;
        //Her antar jeg at man ogsaa maa oppdatere at turgaaeren er i 
        //det nye krysset etter at den har gatt
        krysset = nyKryss;
    }
}