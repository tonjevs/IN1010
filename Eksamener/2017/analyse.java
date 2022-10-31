class Analyse implements Runnable{
    AnalyseBuffer buffer;
        
    Analyse(AnalyseBuffer buf){
        this.buffer = buf; 
    }
    
    public void run(){
        Pasient pas = buf.hentUt();
        while(pas != null){
            pas.iFaresonen();
            pas = buf.hentUt();
        }
    }
}
