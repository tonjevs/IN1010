import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Monitor{
    protected int storeste = Integer.MIN_VALUE;
    protected int minste = Integer.MAX_VALUE;
    private Lock laas = new ReentrantLock();

    public Boolean settMinste(int tall){
        laas.lock();
        try{
            if (tall <= minste){
                minste = tall;
                return true;
            }
            else {
                return false;
            }
        }
        finally{
            laas.unlock();
        }
    }
    public Boolean settStorste(int tall){
        laas.lock();
        try{
            if (tall >= storeste){
                storeste = tall;
                return true;
            }
            else {
                return false;
            }
        }
        finally{
            laas.unlock();
        }
    }
}
