import java.util.concurrent.locks.*;

class MistenkligePersoner {
    
    Lock laas = new ReentrantLock();
    Condition ikkeTom = new laas.newCondition();
    Priokoe<Passasjer> listen = new Priokoe();

    void settInn(Passasjer pas, int prio){
        laas.lock();
        try{
            listen.settInn(pas, prio);
            ikkeTom.signalAll();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        finally{
            laas.unlock();
        }
    }
    Passasjer taUt(){
        laas.lock();
        try{
            while(listen.antall() == 0){
                ikkeTom.await();
                return listen.taUt();
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        finally{
            laas.unlock();
        }
    }
}
