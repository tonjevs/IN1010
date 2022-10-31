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
    private Node siste = null;

    @Override
    public int stoerrelse(){
        int teller = 0;
        Node denne = forste;
        while (denne != null){
            denne = denne.neste;
            teller++;
        }
        return teller;
    }
    @Override
    public void leggTil(int pos, T x){
        Node nyNode = new Node(x);

        if (pos < 0 || pos > stoerrelse()){
                System.out.println("Nei");
                //throw UgyldigListeIndeks(index);
            }
        
        if (this.forste == null){
            this.forste = nyNode;
            this.siste = nyNode;
            return;
        }

        if (this.forste != null && pos == 0){
            nyNode.neste = this.forste;
            this.forste = nyNode;
            return;
        }
        Node denne = forste;
        Node forrige = null;
        int i = 0;

        while(i<pos){
            forrige = denne;
            denne = denne.neste;

            if (denne == null){
                break;
            }
            i++;
        }
        nyNode.neste = denne;
        forrige.neste = nyNode;

    }
    @Override
    public void leggTil(T x){
        Node nyNode = new Node(x);

        if (forste == null){
            forste = nyNode;
            siste = nyNode;
            return;
        }
        
        Node denne = forste;

        while(denne != null){
            denne = denne.neste;
        }
        denne.neste = nyNode = siste;
    }
    @Override
    public void sett(int pos, T x){

        if (pos < 0 || pos > stoerrelse()){
                System.out.println("Nei");
                //throw UgyldigListeIndeks(index);
            }

        Node nyNode = new Node(x);
        Node denne = forste;

        for (int i = 0; i < pos; i++){
            denne = denne.neste;
        }
        denne = nyNode;
    }
    @Override
    public T hent(int pos){
        Node denne = forste;

        if (pos < 0 || pos > stoerrelse()){
                System.out.println("Nei");
                //throw UgyldigListeIndeks(index);
            }

        for (int i = 0; i < pos;i++){
            denne = denne.neste;
        }
        return denne.data;
    }
    @Override
    public T fjern(int pos){
        if (pos < 0 || pos > stoerrelse()){
                System.out.println("Nei");
                //throw UgyldigListeIndeks(index);
            }

        if (forste == null){
            return null;
        }
        Node tmp = forste;

        if (pos == stoerrelse()-1 && pos == 0){
            forste = null;
        }

        if(pos == 0){
            forste = tmp.neste;
          
        }
    

        for (int i=0; tmp != null && i < pos-1; i++){
            tmp = tmp.neste; 
        }
        
        if (tmp == null || tmp.neste == null){
            return null;
        }
        else{
         Node neste = tmp.neste.neste; 

         tmp.neste = neste;
        }

         return tmp.data;
    }
    @Override
        public T fjern(){

            if (forste == null){
                return null;
            }
            else{

            if (forste != siste){
                Node tmp = forste;
                forste = forste.neste;
                return tmp.data;
                }

            else{
                forste = siste = null;
                return null;
                }
            }
            
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