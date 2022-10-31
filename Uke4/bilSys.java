import java.util.Scanner;
import java.util.ArrayList;

class Kjøretøysystem{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    ArrayList<Kjoretoy> liste = new ArrayList<>();
    System.out.println("Velkommen til bilregistrering...");
    System.out.println("**********MENY**********");
    System.out.println("1 : Registrere nytt kjøretøy");
    System.out.println("2 : Skrive ut alle data om kjøretøyet");
    System.out.println("3 : Summere registreringsavgift");
    System.out.println("Hva vil du gjøre hos oss i dag; ");
    int svar = in.NextInt();

    if (svar == 1){
      System.out.println("Hva type kjøretøy er det: ");
      System.out.println("Personbil , Varebil , Buss")
      String kjøretøy = in.NextLine();
      if (kjøretøy == "Personbil"){
        Personbil bil = new Personbil();
      }

    }
  }
}
//unfinished
