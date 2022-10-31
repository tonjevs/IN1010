import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Monitor{
    ReentrantLock laas = new ReentrantLock();
    Condition nokHms = laas.newCondition();
    Beholderklasse beholder;

    public Monitor(Beholderklasse i){
        beholder = i;
    }

    public Beholderklasse hentForSlaaSammen(){
        laas.lock();
        try{
            while(beholder.stoerellse() < 2){
                nokHms.await();
            }
            Beholderklasse nyBeholder = new Beholderklasse(beholder.hentBool());
            nyBeholder.settInn(beholder.taUt());
            nyBeholder.settInn(beholder.taUt());
            return nyBeholder;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            laas.unlock();
        }
    } 
}
