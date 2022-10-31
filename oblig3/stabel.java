class Stabel<T> extends Lenkeliste<T> {

        class Node{
            Node neste = null;
            T data;
            Node(T x){
                data = x;
            }
        }

        private Node forste = null;
        private Node siste = null;

        public T leggPaa(T x){
            leggTil(x);
            return hent(0);
        }

        public T taAv(){
            int antall = stoerrelse()-1;
            return fjern(antall); 
        }
        
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
            Node nyNode = new Node(x);

            if (pos < 0 || pos > stoerrelse()){
                throw new UgyldigListeIndeks(index);
            }
        
            if (forste != null && pos == 0){
                nyNode.neste = forste;
                forste = nyNode;  
                return;   
            }

            if (forste == null && pos == 0){
                siste = forste = nyNode;
                return;
            }
        
            Node denne = this.forste;
            Node forrige = null;
            int i = 0;

            while(i < pos){
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

            if(forste == null){
                siste = forste = nyNode;    
            }

            else{
                nyNode.neste = null;
                siste.neste = nyNode;
                siste = nyNode; 
            }
        }

        @Override
        public void sett(int pos, T x) throws UgyldigListeIndeks{
            int index = pos;
            Node nyNode = new Node(x);

            if (pos < 0 || pos >= stoerrelse()){
                throw new UgyldigListeIndeks(index);
            }

            Node denne = forste;

            if(denne != null){
                for(int i = 0; i < pos; i++){
                    denne = denne.neste;
                }
            denne.data = x;
            
            }

            if(forste == null){
                siste = forste = nyNode;ls
        
            }
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

            else if(forste != siste){
                Node tmp = forste;
                forste = forste.neste;
                return tmp.data;
            }

            else{
                forste = siste = null;
                return null;
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