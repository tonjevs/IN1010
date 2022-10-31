import java.util.concurrent.locks.*;
import java.util.ArrayList;


class Kryss{
    ArrayList<Sti> stiListe;
    static final int ANTALL_SETER = 4;
    int ledige;
    Lock laas;
    Condition ikkeLedig;

    Kryss(){
        //Her antar jeg at ett kryss kun kan ha 
        //fire stier ut av seg
        this.ledige = ANTALL_SETER;
        stiListe = new ArrayList<>();
        laas = new ReentrantLock();
        ikkeLedig = laas.newCondition();
    }

    Sti returnerTilfeldigSti(){
        int tall = Trekk.trekkInt(0,3);
        return stiListe.get(tall);
    }
    boolean isolertKryss(Sti sti){
        if(sti.kryssSlutt == sti.kryssStart){
            return true;
        }
        return false;
    }
    void turgaaerKommer(Tuurgaaer t) throws InterruptedException{
        while(t.tid <= 120){
            laas.lock();
            try{
                if(ledige == 0){
                    ikkeLedig.await();
                    ledige =- 1;
                    return;
                }
            }
            catch(InterruptedException e){
                System.err.println(e);
            }
    
            finally{
                laas.unlock();
            }
        }
        System.out.println("Turen er avsluttet...");
    }
    void giFraaSitteplass(Tuurgaaer t) throws InterruptedException{
        while(t.tid <= 120*1000){
            laas.lock();
            try{
                while(t.tid != 120){
                    ledige++;
                    ikkeLedig.signalAll();
                }
                System.out.println("Turen er ferdig...");

            }
            catch(InterruptedException e){
                System.err.println(e);
            }
            finally{
                laas.unlock();
            }
        }
        System.out.println("Turen er avsluttet...");
    }
}
