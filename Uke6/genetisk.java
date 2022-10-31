public class KvadratBeholder {
    private Kvadrat kvadrat;

    public Kvadrat settInn(Kvadrat kvadrat) {
        this.kvadrat = kvadrat;
    }

    public Kvadrat taUt() {
        return this.kvadrat;
    }
}

class Beholder <E> {
    private E element;

    public void settInn(E element){
        this.element = element;
    }
    public E taUt(){
        return this.element;
    }
}
//uferdig, gidder ikke endre mappe på firkantklassene osv...
