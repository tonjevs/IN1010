class DobbeltLenketListe <T> {
    Node forste = null;

    private class Node{
        Node neste = null;
        Node forrige = null;
        T data;
        Node(T data){
            this.data = data;
        }
    void settForrige(Node forrige){
         this.forrige = forrige;
    }
    
    void settNeste(Node neste){
        this.neste = neste;
        neste.settForrige(this);
    }

    Node hentNeste(){
        return neste;
    }

    Node hentForrige(){
        return forrige;
    }

    T hentData(){
        return data;
    }
}

    public void settInn(T x){
        Node nyNode = new Node(x);
        if (forste == null){
            forste = nyNode;
        }
        else{
            Node node = forste;
            while(node.hentNeste() != null){
                node = node.hentNeste();
            }
            node.settNeste(nyNode);
            nyNode.settForrige(node);
        }
    }
    public void skrivUt(){
        Node node = forste;
        while(node != null){
            System.out.println(node.hentData());
            node = node.hentNeste();
        }
    }
}



