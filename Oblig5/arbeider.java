import java.io.*;
import java.util.Scanner;
import java.util.HashMap;


class Arbeider implements Runnable{
    private String filnavn;
    private Beholderklasse beholder;

    Arbeider(String fil, Beholderklasse b){
        this.filnavn = fil;
        this.beholder = b;
    }

    @Override
    public void run(){
        try { 
            Scanner scan = new Scanner(new File(filnavn));

            HashMap<String,Subsekvens> subHash = new HashMap<>();
            System.out.println(" Virussjekker leser fil   " + filnavn);

            while(scan.hasNextLine()) {
                String linje = scan.nextLine();
                linje = linje.trim();
                for (int index = 0; index + 3 <= linje.length(); index++) {
                    String subStreng = linje.substring(index,index+3);
                    subHash.putIfAbsent(subStreng,new Subsekvens(subStreng));
                }
            }
            scan.close();
            this.beholder.settInn(subHash);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
