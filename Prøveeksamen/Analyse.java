class Analyse implements Runnable{
    AnalyseBuffer analyseBuffer;

    Analyse(AnalyseBuffer a){
        analyseBuffer = a;
    }
    public void run(){
        while(true){
            try{
                Pasient pas = analyseBuffer.hentUt();
                pas.kanHaSykdom();
            }

            catch(InterruptedException e){
                System.err.println(e);
            }
        }
    }
}
