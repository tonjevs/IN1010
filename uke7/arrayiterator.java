import java.util.Iterator;

class EnkelArrayListe implements Iterable<String>{
    private String[] arr;
    private int plasser;
    private int stoerrelse = 0;

    @SuppressWarnings("unchecked")
    EnkelArrayListe(int plasser){
        this.plasser = plasser;
        arr = new String[plasser];
    }
    void leggTil(String noe){
        if(stoerrelse >= plasser){
            throw new IllegalStateException("Ikke plass til flere");
        }
        else{
            arr[stoerrelse] = noe;
            stoerrelse++;
        }
    }
    public Iterator<String> iterator(){
        return new ListeIterator();
    }

    public class ListeIterator implements Iterator<String>{
        private int indeks = 0;

        public String next(){
            return arr[indeks++];
        }
        public boolean hasNext(){
            return indeks < plasser;
        }
    }

    
}
