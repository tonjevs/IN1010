import java.util.ArrayList;
import java.util.List;

public class TestBaathus{
    public static void main(String[] args){
        Baathus baathus = new Baathus(3);

        Baat b1 = new Baat("Triton");
        Baat b2 = new Baat("Chaparral");
        Baat b3 = new Baat("Mercury");
        Baat b4 = new Baat("Mercury");

        baathus.settInn(b1);
        baathus.settInn(b2);
        baathus.settInn(b3);
        baathus.settInn(b4);

        baathus.skrivBaater();
    }
}
class Baat{

    private static int antProd = 0;
    private int prodnr;
    private String merke;

    public Baat(String mrk){
        prodnr = antProd;
        antProd++;
        merke = mrk;
    }

    public String HentInfo(){
        return "Produksjonsnummer: " + prodnr + "merke: "
        + merke;
    }
}

class Baathus{

    public Baathus(int antallPlasser){
      int ap = antallPlasser;
    }
    
    ArrayList<Baat> arList = new ArrayList<Baat>();

    void settInn(Baat batObj){

        if ( arList.length < antallPlasser){
            arList.add(batObj);
        }
        else {
          System.out.println("Kunne ikke legge til flere element i liste");
        }
    }

    void skrivBaater(){
        for (Baat navn:arList){
            System.out.println(navn);
        }
    }
}
