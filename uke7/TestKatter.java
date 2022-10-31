import java.util.ArrayList;

public class TestKatter {
    public static void main(String[] args){
    ArrayList<Katter> katteliste = new ArrayList<>();
    Katter katt1 = new Katter("Rosa",2);
    Katter katt2 = new Katter("Pus",3);
    Katter katt3 = new Katter("Franz",1);

    katteliste.add(katt1);
    katteliste.add(katt2);
    katteliste.add(katt3);

    Katter
     eldst = katteliste.get(0);
    for (Katter katt : katteliste){
        if (katt.compareTo(eldst) > 0){
            eldst = katt;
        }
    }
    System.out.println(eldst);
    }
}
