import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

class LesFraFil{
    public static void main(String[] args) throws IOException{
        String filnavn = args[0];
        int antallTraader = Integer.parseInt(args[1]);

        ReentrantLock laas = new ReentrantLock();
        
        ArrayList<Thread> mineTraader = new ArrayList<>();
        String linje;

        Beholderklasse syk = new Beholderklasse(true);
        Beholderklasse frisk = new Beholderklasse(false);
        
        try{
            Scanner in = new Scanner(new File(filnavn));
            in.nextLine();

            while (in.hasNextLine()){
                linje = in.nextLine();
                linje = linje.trim();
                String[] linjer = linje.split(",");

                if(mineTraader.size()+1 <= antallTraader){
                   
                    if(linjer[1].contains("True")){
                        Runnable r = new Arbeider(linjer[0],syk);
                        Thread traad = new Thread(r);
                        traad.start();
                        mineTraader.add(traad);
                    }

                    else if(linjer[1].contains("False")){
                        Runnable a = new Arbeider(linjer[0],frisk);
                        Thread traad = new Thread(a);
                        traad.start();
                        mineTraader.add(traad);
                    }
                }
            }
        }

        catch(Exception e){
            System.out.println(e); 
        }
        
        for(Thread traad : mineTraader){
            try{
                traad.join();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

        System.out.println("Antall friske pasienter: " + frisk.stoerellse());
        System.out.println("Antall syke pasienter: " + syk.stoerellse());
        System.out.println("");

        while (frisk.stoerellse() > 1){
            Monitor monitor = new Monitor(frisk);
            Beholderklasse in = monitor.hentForSlaaSammen();
            Runnable fl1 = new Fletting(in.taUt(),in.taUt(),frisk);

            laas.lock();
            try{
                Thread traad = new Thread(fl1);
                traad.start();
                traad.join();
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                laas.unlock();
            }
        }

        while (syk.stoerellse() > 1){
            Monitor monitor = new Monitor(syk);
            Beholderklasse in = monitor.hentForSlaaSammen();
            Runnable fl2 = new Fletting(in.taUt(),in.taUt(),syk);
            laas.lock();
            try{
                Thread traad = new Thread(fl2);
                traad.start();
                traad.join();
                
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                laas.unlock();
            }
        }

        System.out.println("Antall positive subsekvenser: ");
        syk.testHele();
        System.out.println("");
        System.out.println("Antall negative subsekvenser: ");
        frisk.testHele();

        System.out.println("FERDIG med aa samle data ");
        HashMap<String,Subsekvens> hSyk = syk.taUt();	
        HashMap<String,Subsekvens> hfrisk = frisk.taUt();
        

        System.out.println();
        System.out.println("Indikatorer paa syke pasienter:  ");
        System.out.println();
    

        for(Subsekvens sS : hSyk.values()){
            int antall = 0;

            if(sS.hent() > 7){

                for(Subsekvens nok : hfrisk.values()){

                    if(sS.hentNavn().equals(nok.hentNavn())){
                        antall = nok.hent();
                        int differanse = sS.hent() - antall;

                        if (differanse >= 5){
                            System.out.println(sS.hentNavn() + " med antall: " + sS.hent());
                            System.out.println("Antall friske med samme sekvens " + antall);
                            System.out.println("Differanse " + differanse);
                            System.out.println("");
                        }
                    }
                }
            }
        }
        System.out.println("FERDIG. Programmet terminerer. ");
    }
}

