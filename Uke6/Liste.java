import java.util.*;

class Lenkeliste<T> implements Liste<T> {
        class Node{
            Node neste = null;
            T data;
            Node(T x){
                data = x;
            }
        }

        private Node forste = null;
        int stoerrelse = 0;


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
            int index = pos;
            Node node = new Node(x);

            if (pos < 0 || pos > stoerrelse()){
                System.out.println("nei");
                //throw UgyldigListeIndeks(index);
            }

            Node denne = forste;
            Node forrige = null;

            if(denne != null){
                for(int i = 0; i < pos-1; i++){
                    forrige = denne;
                    denne = denne.neste;
                }
            node.neste = denne;
            forrige.neste = node;
            }

            else if(denne == null){
                denne = node;
            }
            this.stoerrelse++;
        }

        @Override
        public void leggTil(T x){
            Node denne = forste;
            while(denne.neste != null){
                denne = denne.neste;
            }
            denne.neste = new Node(x);
        }

        @Override
        public void sett(int pos, T x)throws UgyldigListeIndeks{
            int index = pos;

            if (pos < 0 || pos > stoerrelse()){
                System.out.println("nei");
                //throw UgyldigListeIndeks(index);
            }

            Node denne = forste;
            Node forrige = null;

            if(denne != null){
                for(int i = 0; i < pos; i++){
                    denne = denne.neste;
                }
            denne.data = x;
            denne.neste = denne.neste.neste;
            }

            else if(denne == null){
                denne.data = x;
            }
        }
        @Override
        public T hent(int pos){
            Node denne = forste;
            for (int i = 0; i < pos; i++){
                denne = denne.neste;
            }
            return denne.data;
        }
        @Override
        public T fjern(int pos){

            Node denne = forste;

            if(denne != null){
                for(int i = 1; i < pos; i++){
                    denne = denne.neste;
                }
            Node n = denne.neste;
            denne.neste = n.neste;

            }

            else if(denne == null){
                denne = null;
            }
            return denne.data;
        }
        @Override
        public T fjern(){
            Node denne = forste;
            Node forrige = denne;
            while(denne.neste != null){
                forrige = denne;
                denne = denne.neste;
                }
            denne = null;
            return denne.data;
            }
        @Override
        public String toString(){
            Node tmp = forste;
            String tmpString = "";
            while (tmp != null){
                tmpString += tmp.data;
                tmp = tmp.neste;
            }
            return tmpString;
        }

}

interface Liste<T> {
    public int stoerrelse();
    public void leggTil(int pos, T x);
    public void leggTil(T x);
    public void sett(int pos, T x);
    public T hent(int pos);
    public T fjern(int pos);
    public T fjern();

}
