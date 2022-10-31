class TestSimulator {
    public static void main(String[] args) {
        final int antTuurgaaere = args[0];
        Skog skogen = new Skog(10,20);
        Aktivitet[] listen = new Aktivitet[antTuurgaaere];

        for(int i = 0; i < antTuurgaaere;i++){
            Kryss start = skogen.hentTilfeldigStart();
            int hast = Trekk.trekkInt(20,200);
            Tuurgaaer gaaer = new Tuurgaaer(hast,start);
            listen[i] = gaaer;
        }
        Simulator simulatoren = new Simulator(listen);
        int tiden = Trekk.trekkInt(30,480);
        simulatoren.simuler(tiden);
    }
}
