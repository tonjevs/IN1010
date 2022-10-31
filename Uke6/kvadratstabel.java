class TestGeneriskStabel {
    public static void main(String[] args) {
        GeneriskStabel<String> stabel = new GeneriskStabel<String>();
        stabel.leggPaa("foobar");
        stabel.leggPaa("bazar");
        stabel.leggPaa("baz");
        stabel.leggPaa("bar");
        stabel.leggPaa("Foo");
        String resultat = "";
        while (!stabel.erTom())
            resultat += stabel.taAv() + " ";
        System.out.printf("Resultatet er: '%s'\n", resultat);
    }
}

class Kvadrat{
    double lengde;

    public Kvadrat(double lengde){
        this.lengde = lengde;
    }
    public double areal(){
        return lengde*2;
    }
    public double omkrets(){
        return lengde*4;
    }
}

class GeneriskStabel<T>{
    private Node start = null;
    class Node{
        private T data;
        private Node neste;

        private Node(T data){
            this.data = data;
        }

    }
    void leggPaa(T k){
        if (erTom()){
            start = new Node(k);
        }else{
            Node midl = start;
            start = new Node(k);
            start.neste = midl;
        }
    }

    T taAv(){
        if (erTom()){
            return null;
        }else{
            Node midl = start;
            start = start.neste;
            return midl.data;

        }
    }

    boolean erTom(){
        return start == null;
        }
}
