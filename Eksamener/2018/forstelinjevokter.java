import javax.management.monitor.Monitor;

class Forstelinjevokter implements Runnable{
    Flygninger flygning;
    String monester;
    MistenkligePersoner monitor;

    Forstelinjevokter(Flygninger fly, String monster, MistenkligePersoner m){
        this.flygning = fly;
        this.monster = monster;
        this.monitor = m;
    }

    @Override
    public void run(){
        Seter[] alle = flygning.denne;
        for (Seter seter : alle) {
            if(seter.passasjer != null){
                String navn = seter.passasjer.navn;
                if(inneholder(navn, this.monster) > -1){
                    int prio = inneholder(navn, this.monster);
                    monitor.settInn(seter.passasjer, prio);
                }
            } 
        } 
    }
}
