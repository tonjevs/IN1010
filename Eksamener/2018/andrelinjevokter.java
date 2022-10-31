class Andrelinjevokter implements Runnable{
    MistenkligePersoner monitor;

    Andrelinjevokter(MistenkligePersoner m){
        this.monitor = m;
    }

    @Override
    public void run(){
        while(true){
            Passasjer pas = monitor.taUt();
            TerrorKlasse.mistenkelig(pas);
        }
    }
}
