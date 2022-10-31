import java.util.Random;

class Bruktbil3{
    public static void main(String[] args){
        Bil3 bil = new Bil3();
        Person nyPers = new Person(bil);
        nyPers.persSkrivUt();
    }
}

class Bil3{
    private String bilnummer;

    String hentNummer(){
      return bilnummer;
      }

    public Bil3(){
        Random rand = new Random();
        int n = 10000 + rand.nextInt(90000);
        String m = String.valueOf(n);
        bilnummer = m;
      }

     void SkrivUt(){
        System.out.println("Jeg er en bil");
        System.out.println("Bilnummer:" + bilnummer);
      }
}

class Person{
      private Bil3 bil;

      Person(Bil3 b){
          bil = b;
      }

      void persSkrivUt(){
          System.out.println("Bilnummer: " + bil.hentNummer());

    }
}
