import java.util.Random;

class Bruktbil2{
    public static void main(String[] args){
        Bil2 bil = new Bil2();
        bil.SkrivUt();
    }
}

class Bil2{

  private String bilnummer;

  public Bil2(){
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
