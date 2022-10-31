class Simulator {
    PrioKo<Aktivitet> koe;
    Aktivitet[] aktivArray;
    int globalTid = 0;

    Simulator(Aktivitet[] aktivitet){
        koe = new PrioKo<>();
        this.aktivArray = aktivitet;
        for (Aktivitet aktiv : aktivArray) {
            koe.settInn(aktiv);
        }
    }
    void simuler(int t){
        while(globalTid <= t){
            Aktivitet a = koe.hentUt();
            globalTid = a.tid;
            a.handling();
            a.tid = t;
            koe.settInn(a);
        }
    }
}
