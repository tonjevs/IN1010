class EnkelListe {
    private Node start;

    public void settInnForan(String nyttInnhold) {
        Node ny = new Node(nyttInnhold);
        ny.neste = start;
        start = ny;
    }

    public void skrivUt() {
        skrivUtBaklengs(start.neste);// den vil ikke skrive ut siste elementet
    }

    private void skrivUtBaklengs(Node n){
        if (n == null){
            return;
        }
        skrivUtBaklengs(n.neste);
        System.out.println(n.innhold);
    }

    private class Node {
        private String innhold;
        private Node neste;

        Node(String s) {
            innhold = s;
        }
    }
}