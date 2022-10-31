class SortertLenkeliste<T extends Comparable<T> > extends Lenkeliste<T> {
    class Node{
        Node neste = null;
        T data;
        Node(T x){
            data = x;
        }
    }
    private Node forste = null;
    private Node siste = null;

    @Override
    public int stoerrelse(){
        int teller = 0;
        Node denne = forste;
        while(denne != null){
            teller++;
            denne = denne.neste;
        }
        return teller;
    }
    @Override
    public void leggTil(int pos, T x) throws UgyldigListeIndeks{
        throw new UnsupportedOperationException();
    }
    

    @Override
    public void leggTil(T x){
        
        Node nyNode = new Node(x);
        Node denne = forste;

        if (forste == null) {
            siste = forste = nyNode;
            siste.neste = null;
            return;
        }
        else if (forste.data.compareTo(x) >= 0) {
            nyNode.neste = forste;
            forste = nyNode;
            return;
        }
        
        while (denne.neste != null && denne.neste.data.compareTo(x) < 0) {
            denne = denne.neste;
        }
        nyNode.neste = denne.neste;
        denne.neste = nyNode;
    }

    @Override
    public void sett(int pos, T x) throws UgyldigListeIndeks{

        throw new UnsupportedOperationException();
        
    }

    @Override
    public T hent(int pos)throws UgyldigListeIndeks{

        if (pos < 0 || pos >= stoerrelse()){
            throw new UgyldigListeIndeks(pos);

        }
        if (pos == 0){
            return forste.data;
        }

        Node denne = forste;
        for (int i = 0; i < pos; i++){
            denne = denne.neste;   
        }
        return denne.data;    
    }
    @Override
    public T fjern(int pos)throws UgyldigListeIndeks{
        
        int i = 0;

        if (pos < 0 || pos >= stoerrelse()){
            throw new UgyldigListeIndeks(pos);
        }
        if(pos == 0){
            Node denne = forste;
            forste = denne.neste;
            denne.neste = null;
            return denne.data;
        }
        
        else{
            Node forrige = forste;

            while(i < pos-1){
                 if (forrige == null){
                    break;
                 }

            forrige = forrige.neste;
             i++;
        }
        Node denne = forrige.neste;
        siste = forrige;
        forrige.neste = denne.neste;
        denne.neste = null;
        return denne.data;
        
        }
    }
    @Override
    public T fjern()throws UgyldigListeIndeks{

        if (forste == null){
            throw new UgyldigListeIndeks(0);
            
        }
        Node denne = forste;
        Node tmp = null;
        Node forrige = null;
    
        if(forste != siste){
            while(denne.neste != null){
                forrige = denne;
                denne = denne.neste;
            }
            tmp = denne;
            siste = forrige;
            siste.neste = null;
            return tmp.data;
        }

        else{
            Node wii = null;
            wii = forste;
            forste = siste = null;
            return wii.data;
        }        
}

    @Override
    public String toString(){
        Node tmp = forste;
        String tmpString = "";
        while (tmp != null){
            tmpString += " " + tmp.data;
            tmp = tmp.neste;
        }
        return tmpString;
    }
}
    

