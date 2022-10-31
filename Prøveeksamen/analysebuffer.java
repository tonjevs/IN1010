import java.util.ArrayList;
import java.util.concurrent.locks.*;

class AnalyseBuffer {
    
    ArrayList<Pasient> listen = new ArrayList<>();
    Lock laas = new ReentrantLock();
    Condition ikkeTom = laas.newCondition();

    void settInn(Pasient p){
        laas.lock();
        try{
            listen.add(p);
            ikkeTom.signalAll();
        }
        finally{
            laas.unlock();
        }
    }

    Pasient hentUt(){
        laas.lock();
        try{
            while(listen.size() == 0){
                ikkeTom.await();
            }
            return listen.remove(0);
        }
        finally{
            laas.unlock();
        }
    }

}
