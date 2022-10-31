class KullListe extends Kull{
    Hund forste = null; 

    KullListe(Hund mor, Hund far){
        super(mor,far);
    }
    
    public void settInn(Hund h){
        if(forste == null){
            h = forste;
            return;
        }
        Hund iter = forste;
        Hund forrige = null;

        while(iter.compareTo(h) < 0){
            forrige = iter;
            iter = iter.neste;
        }
        h.neste = iter;
        forrige.neste = h;
    }

    @Override
    public Iterator<Hund> iterator(){
        return new ListeIterator();
    }
}

class ListeIterator implements Iterable<Hund>{
    private Hund denne = forste;

    public boolean hasNext(){
        if (denne.neste != null){
            return true;
        }
        return false;
    }
    public Hund next(){
        Hund nesteHund = denne.neste;
        return nesteHund;
    }
}
