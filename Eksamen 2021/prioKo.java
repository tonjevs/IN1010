class PrioKo<Aktivitet> {

    private Aktivitet forste = null;
    private Aktivitet siste = null;
    
    void settInn(Aktivitet a){
        
        if(forste == null){
            forste = siste = a;
            return;
        }
        if(forste == siste){
            if(denne.compareTo(a) < 0){
                Aktivitet tmp = forste; 
                forste = a;
                siste = tmp;
                forste.neste = siste;
                siste.forrige = forste;
            }
            return;
        }
        
        Aktivitet denne = siste;
        while(denne.compareTo(a) > 0 && forste.forrige != null){
            denne = denne.forrige;
        }
        a.neste = denne.neste;
        denne.neste.forrige = a;
        denne.neste = a;
        a.forrige = denne;
    }

    Aktivitet hentUt(){
        if(forste == null){
            return null;
        }
        Node tmp = forste;
        forste = forste.neste;
        return tmp;
    }
}
