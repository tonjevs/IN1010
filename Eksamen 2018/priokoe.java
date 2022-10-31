class Prioritetskoe<T> {
    class Node{
        Node neste = null;
        T data;
        int prioritet; 

        Node(int prio, T d){
            data = d;
            prioritet = prio;
        }
    }
    private Node forste = null; 

    void settInn(T inn, int prio){
        if(prio < 0){
            return;
        }
        
        if(forste == null){
            forste = new Node(prio, inn);
            return;
        }
        else{
            Node iter = forste;
            Node forrige = null;
            while(prio > iter.prioritet){
                forrige = iter;
                iter = iter.neste;
            }
            Node ny = new Node(prio,inn);
            forrige.neste = ny;
            ny.neste = iter;
        }
        
    }
    T taUt(){
        if (forste == null){
            return null;
        }
        else{
            Node uttatt = forste;
            forste.neste = forste;
            return uttatt.data;
        }

    }
    int antall(){
        int teller = 0;
        Node iter = forste;
        while(iter.neste != null){
            iter = iter.neste;
            teller++;
        }
        return teller;
    }
}
