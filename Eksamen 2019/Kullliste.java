import java.util.Iterator;

class KullListe extends Kull{
    KullListe(Hund mor, Hund far){
        super(mor,far);
    }
    
    private Hund forste;

    public void settInn(Hund h){
        if(forste == null){
            h = forste;
            return;
        }
        if(forste.compareTo(h) < 0){
            h.neste = forste;
            forste = h;
            return;
        }
        Hund iter = forste;
        Hund forrige = null;
        while(iter.neste != null){
            while(iter.compareTo(h) > 0){
                forrige = iter;
                iter = iter.neste;
            }
            h.neste = iter;
            forrige.neste = h;
            return;
        }
    }

    public Iterator<Hund> iterator(){
        return new HundeIterator();
    }
    class HundeIterator implements Iterator<Hund>{
        private Hund denne = forste;

        public boolean hasNext(){
            return denne.neste != null;
        }
        public Hund next(){
            return denne.neste;
        }
    }
}
