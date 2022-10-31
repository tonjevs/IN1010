import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.*;


class Monitor {
    int tall;

    Monitor(int tall){
        this.tall = tall;
    }

    intskrivUt(int i){
        laas = new ReentrantLock();
        laas.lock();
        try{
            System.out.println(i);
        }
        catch(InterruptedException e){
            System.out.println("nei");
        }
        finally{
            laas.unlock();
        }
    }
}
