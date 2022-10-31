public class Priokoe<T> {
    private int antall = 0;

    private class Node {
        private Node neste = null;
        int prioritet;
        T data;

        Node(T n, int prio){
            data = n;
            prioritet = prio;
        }
    }
    private Node forste;

    void settInn(T inn, int prio){
        Node ny = new Node(inn, prio);

        if(prio < 0){
            return;
        }

        if (forste == null){
            ny = forste;
            antall++;
            return;
        }

        Node iter = forste;
        Node forrige = null;

        while(prio > iter.prioritet && iter.neste != null){
            forrige = iter;
            iter = iter.neste;
        }
        ny.neste = iter;
        forrige.neste = ny;
        antall++;
    }

    T taUt(){
        if (forste == null){
            return null;
        }

        Node temp = forste;
        forste.neste = forste;
        antall--;
        return temp.data;
    }

    int antall(){
        return antall;
    }
}
