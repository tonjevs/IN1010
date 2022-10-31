abstract class Figurer {
  public abstract double areal();
}
class Trekant extends Figurer {}
class Firkant extends Figurer {}
class Rektangel extends Figurer {}
class Sirkel extends Figurer{}

class double Trekant {
    private double hoyde;
    private double lengde;

    public Trekant(double h, double l){
        hoyde = h;
        lengde = l;
    }
    public double areal(){
        return (h*l)/2;
    }

}
class double Firkant {
    private double hoyde;

    public Firkant(double h){
        hoyde = h;
    }
    public double areal(){
        return h*2;
    }

}

class double Rektangel {
    private double hoyde;
    private double lengde;

    public Rektangel(double h, double l){
        hoyde = h;
        lengde = l;
    }
    public double areal(){
        return h*l;
    }

}
class double Sirkel {
    private double radius;

    public Trekant(double r){
        radius = r;

    }
    public double areal(){
        return radius*radius*Math.PI;
    }

}
