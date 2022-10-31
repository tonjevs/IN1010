class Integrasjonstest{
    public static void main(String[] args){
        Lege dr1 = new Lege("Tonje");
        Lege dr2 = new Spesialist("Per","1234");
        Legemiddler narko = new Narkotisk("benzol", 220,3.8,1,3);
        Legemiddler vaner = new Vanedannende("tirralac",100,350.0,2,2);
        Legemiddler vanlige = new Vanlig("paracetamol",50,500.0,3);
        Resepter resept1 = new Millitarresept(vanlige,dr1,3323,4);
        Resepter resept2 = new Presept(narko,dr1,55123);
        Resepter resept3 = new Blaa(vaner,dr2,7765,6);
        Resepter resept4 = new Blaa(vaner,dr2,3323,0);

        System.out.println(dr1);
        System.out.println(dr2);
        System.out.println(narko);
        System.out.println(vaner);
        System.out.println(vanlige);
        System.out.println(resept1.toString(vanlige,dr1));
        System.out.println(resept2.toString(vanlige,dr1));
        System.out.println(resept3.toString(vanlige,dr2));
        System.out.println(resept1.bruk());
        System.out.println(resept4.bruk());
        System.out.println(resept1.prisAaBetale());
        System.out.println(resept2.prisAaBetale());
        System.out.println(resept3.prisAaBetale());
        System.out.println(resept4.prisAaBetale());

    }
}
