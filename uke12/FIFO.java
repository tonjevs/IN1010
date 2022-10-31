
class FIFOListe<T>{

	private Node hode;
	private Node hale;

	private class Node {
        Node neste;
        Node forrige;
        T data;

        public Node(T data){
            this.data = data;
        }
    }

    public void leggTil(T t) {
        Node nyNode = new Node(t);
        if(hode == null){
            hode = nyNode;
            hale = nyNode;
            return;
        }
        hale.neste = nyNode;
        nyNode.forrige = hale;
        hale = nyNode;

    }
    public T hentHode(){
        return hode.data;
    }
    public T hentNeste(Node n){
        return n.neste.data;
    }


    public T pop() {
        if(hode == null){
            return null;
        }
        T data = hode.data;
        if(hode.neste == null){
            hode = null;
            hale = null;
            return data;
        }
        hode = hode.neste;
        hode.forrige = null;
        return data;
    }

	public int storrelse() {
        Node tmp = hode;
        int antall = 0;

        while(tmp != null){
            tmp = tmp.neste;
            antall++;
        }

        return antall;
    }

	public boolean erTom() {
        return hode == null;
    }

	public void fjernAlt() {
        hode = null;
        hale = null;
    }

	public void skrivUtListe() {
        Node tmp = hode;
        String tekst = "";

        while(tmp != null){
            tekst += tmp.data + " --> ";
            tmp = tmp.neste;
        }

        System.out.print(tekst);
    }
}
