class Tuurgaaer implements Runnable {
    int tid = 0;
    int hastighet;
    Kryss krysset;
    Kryss nyKryss;


    Tuurgaaer(int hastighet, Kryss krysset) {
        this.hastighet = hastighet;
        this.krysset = krysset;
    }

    public void run(){
        krysset.turgaaerKommer(this);
        int min = Trekk.trekkInt(1, 5);
        Thread.sleep(min);
        krysset.giFraaSitteplass(this);
        int tid = handling();
        Thread.sleep(tid*1000);
        krysset = nyKryss;
    }

    int handling(){
        Sti stien = krysset.returnerTilfeldigSti();
        Kryss nyKryss = stien.kryssSlutt;
        int tidSti = stien.beregnGaaTid(hastighet);
        return tidSti;
    }
}
