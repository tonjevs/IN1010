import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.locks.*;

class Main{
    public static void main(String[] args) {
        
        try{
            String ord = args[0];
            String filnavn = args[1];
            Scanner in;
            int intantall = 0;
            int antallLinjer = 0;
            System.out.println(ord);

            in = new Scanner(new File(filnavn));
        
            String antall = in.nextLine();
            intantall = Integer.parseInt(antall);
            String[] listen = new String[intantall];

            int teller = 0;

            while(in.hasNextLine()){
                String ordet = in.nextLine();
                ordet = ordet.toLowerCase().strip();
                listen[teller++] = ordet;
                antallLinjer++;
            }

            int antallTraader = antallLinjer/intantall;
            
            ArrayList<String[]> stringArray = new ArrayList<>();
            int a = 0;
            int tell = 0;
            while(a < antallTraader){
                String[] listeene;
                listeene = new String[antallTraader];
                for(int i = 0; i < antallTraader; i++){
                    listeene[i++] = listen[tell++];
                }
                stringArray.add(listeene);
                a++;
            }

            Ordmonitor monitor = new Ordmonitor();
            ArrayList<Thread> trader = new ArrayList<>();
            for (String[] strings : stringArray) {
                Traadleser lesing = new Traadleser(strings,ord, monitor);
                Thread traad  = new Thread(lesing);
                traad.start();
                trader.add(traad);
            }
            try{
                for (Thread thread : trader) {
                    thread.join();
                }
            }
            catch(InterruptedException e){
                System.err.println(e);
            }

            System.out.println("Det forekom til sammen " + monitor.hentUtAlle() + " av dette ordet i teksten");
        }
        catch(FileNotFoundException e){
            System.err.println();
        }
    }
}

class Traadleser implements Runnable{
    String[] listen;
    String ordet;
    Ordmonitor monitor;

    Traadleser(String[] l, String o, Ordmonitor m){
        ordet = o;
        monitor = m;
        this.listen = l;

    }

    public void run(){
        for (String string : listen) {
            if(ordet.equals(string)){
                monitor.fantOrdet();
            }
        }
    }
}

class Ordmonitor {
    int antall = 0;
    Lock laas = new ReentrantLock();

    public void fantOrdet(){
        laas.lock();
        try{
            antall++;
        }
        finally{
            laas.unlock();
        }
    }
    public int hentUtAlle(){
        return antall;
    }
}

