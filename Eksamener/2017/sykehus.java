class Sykehus {
    public static void main(String[] args) {
        Sykehus sykehus = new Sykehus();
        Akutten akutten = new Akutten();
        Sengepost sengepost = new Sengepost(100);

        Pasient lars = new Pasient("Lars",041201,2);
        Pasient karl = new Pasient("Karl",060611,3);

        sykehus.skrivInnPas(lars, akutten);
        sykehus.skrivInnPas(karl, akutten);

        sykehus.overfoerPas(lars, sengepost, akutten);
        sykehus.skrivUtPas(karl, akutten);

    }
    //desse metodene ville jeg skrevet polimorfisk i kvinne og 
    //mannlige pasienter slik at det blir handtert
    @Override
    static boolean iFaresonen(){
        return true;
    }
    @Override
    static boolean kanHaSykdom(){
        return true;
    }

    Akutten akutten;
    Sengepost sengepost;

    void skrivInnPas(Pasient p, Avdeling a){
        a.settInn(p);
    }

    void overfoerPas(Pasient p, Avdeling settInn, Avdeling taUt){
        if(taUt.hentUt(p) == p){
            settInn.settInn(p);
        }
    }

    void skrivUtPas(Pasient p, Avdeling a){
        a.hentUt(p);
    }

    void utforAnalyse(PasientPrio p, int antTraad){
        AnalyseBuffer analyseBuffer = new AnalyseBuffer();
        for(int i = 0; i < Pasient.MAXPASPRIO; i++){
            Thread traad = new Thread(new Sil(p,analyseBuffer,i));
            traad.start();
        }

        for(int j = 0; j < antTraad; j++){
            Thread traader = new Thread(new Analyse(analyseBuffer));
            traader.start();
        }

        traad.join();
        traader.join();
    }
}
