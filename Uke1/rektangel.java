class Rektangel {

  public Rektangel (double l, double b) {   // Konstruktør

        lengde = l;
        bredde = b;
  }

  public void oekLengde (int okning) {    // Oek lengden som angitt
        lengde = lengde + okning;
  }

  public void oekBredde (int okning) {    // Oek bredden som angitt
        bredde = bredde + okning;
  }

  public double areal () {     // Beregn mitt areal
        return bredde*lengde;
  }

  public double omkrets () {   // Beregn min omkrets
        return (2*lengde + 2*bredde);
  }

  public void reduserlengde(double l){
        if (bredde - l < 1){
          System.out.println("Lengde kan ikke reduseres så mye");

        } else {
              lengde = lengde - l;
        }
  }

  public void reduserbredde(double b){
        if (bredde - b < 1){
          System.out.println("Bredde kan ikke reduseres så mye");

        } else {
              bredde = bredde - b;
        }
  }
}

class RektangelHovudprogram{

    public static void main(String[] args){

        Rektangel en = new Rektangel(3,4);
        Rektangel to = new Rektangel(7,9);

        System.out.println("Rektangel areal: " + en);
        System.out.println("Rektangel areal: " + to);

        en.oekBredde(6);
        to.oekLengde(2);

        System.out.println("Rektangel omkrets: " + en.omkrets());
        System.out.println("Rektangel omkrets: " + to.omkrets());
    }
}
