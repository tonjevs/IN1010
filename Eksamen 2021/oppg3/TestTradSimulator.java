class TestTradSimulator {
    public static void main(String[] args) {
        final int antTuurgaaere = args[0];
        Skog skogen = new Skog(10,20);
        
        for(int i = 0; i < antTuurgaaere;i++){
            Kryss start = skogen.hentTilfeldigStart();
            int hast = Trekk.trekkInt(20,200);
            Thread traad = new Thread(new Tuurgaaer(hast,start));
            traad.start();
        }
    }
}