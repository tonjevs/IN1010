import java.util.ArrayList;

class Main{

    public static void main(String[] args){

      Brev brevet = new Brev("Per Askeladd", "Espen Askeladd");
      brevet.skrivLinje("Hvordan har du det?");
      brevet.skrivLinje("Jeg har det bare bra!");
      brevet.lesBrev();

    }
}

class Brev{
        String avsender;
        String mottaker;
        ArrayList<String> linjer;

        Brev(String avsender, String mottaker){
            this.avsender = avsender;
            this.mottaker = mottaker;
            linjer = new ArrayList<String>();
        }

    public void skrivLinje(String linje){
        linjer.add(linje);
    }

    public void lesBrev(){
        System.out.println("Hei," + this.mottaker);
        System.out.println("");
        for (String linje : this.linjer){
            System.out.println(linje);
        }
        System.out.println();
        System.out.println("Hilsen fra,");
        System.out.println(this.avsender);
    }
}
