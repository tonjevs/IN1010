import java.util.ArrayList;
import java.util.Scanner;

class KoProgram{

    public static void main(String[] args){

          Scanner in = new Scanner(System.in);
          KoSystem koSystem = new KoSystem();
          System.out.println("**MENY FOR BILLETTSYSTEM**\n1 - Trekk ny kolapp\n2 - Betjen kunde\n3 - Print antall kunder i kø\n4 - Avslutt.");
          int svar = in.nextInt();

          while(svar != 4){

              if (svar == 1){
                  koSystem.trekkKolapp();
              }else if(svar == 2){
                  koSystem.betjenKunde();
              }else if(svar == 3){
                  koSystem.printKunderIKo();
              }else if(svar == 4){
                  System.out.print("Error: tast inn 1,2,3 eller 4...");
              }
          }
    }

class KoSystem{
    ArrayList<KoLapp> koListe = new ArrayList<>();
    int index = 0;

    //Lager et nytt objekt av KoLapp, printer ut informasjon om den og legger den til i listen over koLapper.
    public void trekkKoLapp(){
        index++;
        KoLapp lapp = new KoLapp(index);
        koListe.add(lapp);
        System.out.println("Du er nr " + lapp.hentNummer() + "i kø");
        System.out.println("Det er " + (antKunder() - 1) + "framfor deg");

    }
    //Henter ut, printer ut informasjon og fjerner den forste kolappen i lista. Gir feilmelding dersom ingen kunder staar i ko.
    public void betjenKunde(){
        if (koListe.isEmpty()){
            System.out.println("Det er ingen i kø");
            }

        else{
            KoLapp betjenes = koListe.remove(0);
            System.out.println("kunde med billettnummer: ");
            System.out.println(betjenes.hentNummer() + "er betjent\n");
            }
    }

    //Returnerer antall kunder som er i ko.
    public int antKunder(){
        int antKunder = koListe.size();
        return antKunder;
    }

    //Printer alle kunder i ko
    public void printKunderIKo(){
        System.out.println("Det er: " + antKunder() + "i kø");

    }

}
class KoLapp{
    int nummer;

    //Konstruktor
    public KoLapp(int nummer){
        this.nummer = nummer;
    }
    //Returnerer et tildelt nummer paa kolappen.
    public int hentNummer(){
        return nummer;

    }
}
}
