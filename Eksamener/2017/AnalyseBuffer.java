import java.util.ArrayList;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks;

class AnalyseBuffer{
    ArrayList<Pasient> listen;
    
    AnalyseBuffer(){
        listen = new Pasient<>();
        Lock laas = new ReentrantLock();
        Condition ikkeTom = lock.newCondition();
    }

    void leggInn(Pasient p){
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
        Pasient p;
        try{
            ikkeTom.await();
            p = listen.remove(0);
        }
        finally{
            laas.unlock();
            return p;
        }
    }
}
