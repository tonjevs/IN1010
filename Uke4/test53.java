class Testboks{
  public static void main(String[] args){
    Boks boks1 = new Boks(10,10,10);
    Boks boks2 = new Boks(2,2,2);

    if (boks1.beregnAreal() == 600){
      System.out.println("Riktig1");
    }else{
      System.out.println("Feil1");
    }

    if (boks1.beregnVolum() == 1000){
      System.out.println("Riktig");
    }
  }
}

public class Boks {

    private int lengde;
    private int bredde;
    private int hoyde;

    public Boks(int lengde, int bredde, int hoyde) {
        this.lengde = lengde;
        this.bredde = bredde;
        this.hoyde = hoyde;
    }

    public int beregnAreal() {
        return (lengde * bredde * 2) + (bredde * hoyde * 2) + (hoyde * lengde * 2);
    }

    public int beregnVolum() {
        return lengde * bredde * hoyde;
    }
}
//++
