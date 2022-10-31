class Bok {
    private String tittel;

    public Bok (String t) {
        tittel = t;
    }

    public String toString() {
        return tittel;
    }
}

class Bokhylle {
    private Bok[] boeker;

    public Bokhylle (int antPlasser) {
        boeker = new Bok[antPlasser];
    }

    //Forsoeker aa sette inn en bok paa foerste ledige plass i bokhyllen
    public void settInn(Bok b) throws DuplikatException, IkkeMerPlassException{

        for (int i = 0; i < boeker.length; i++) {
            if (boeker[i] == null && boeker[i].toString().equals(b.toString())) {
                throw new DuplikatException(b.toString());
            }

                boeker[i] = b;
                return;
            }
        }

    public void skrivBoeker() {
        for (Bok b: boeker) {
            if (b != null) {
                System.out.println(b);
            }
        }
    }
}

class TestBokhylle {

    public static void main(String[] args) {

        Bokhylle bokhylle = new Bokhylle(3);
        System.out.println("Setter inn boeker:");

        String[] titler = {"De doedes tjern", "Doppler", "Doppler", "Misery", "Gone with the Wind"};

        for (int i = 0; i < titler.length; i++) {
                bokhylle.settInn(new Bok(titler[i]));
        }

        System.out.println("\nSkriver ut boeker:");
        bokhylle.skrivBoeker();
    }
}
class DuplikatException{

    public DuplikatException(String element){
        super("Elementet du prøvde å sende var ett duplikat..." + element);
    }
}

class IkkeMerPlassException extends Exception{

    public IkkeMerPlassException(String boktittel){
        super("Det var ikke mer plass til å sette inn " + boktittel);
    }

}
