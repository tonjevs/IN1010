class Sil implements Runnable{
    PasientPrio pasPrio;
    AnalyseBuffer analyse;
    int tall;

    Sil(PasientPrio pasPrio, AnalyseBuffer analyse, int a){
        this.pasPrio = pasPrio;
        this.analyse = analyse;
        this.tall = a;
    }

    public void run(){
        Pasient pasient = pasPrio.hentUt(tall);
        while(pasient != null){
            //Her bruker jeg polimorfi ettersom at det vil 
            if(pasient.ifareSone() == true){
                analyse.leggInn(pasient);
                pasient = pasient.neste;
            }
        }
    }
}
