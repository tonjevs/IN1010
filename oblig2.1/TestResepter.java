class TestResepter{
    public static void main(String[] args){

        Narkotisk narko = new Narkotisk("benzol", 220,3.8,0,3);
        Vanedannende vaner = new Vanedannende("tirralac",100,350.0,0,2);
        Legemiddler vanlige = new Vanlig("paracetamol",50,500.0,0);
        Lege dr = new Lege("Tonje");
        Resepter resept1 = new Millitarresept(vanlige,dr,0,4);
        Resepter resept2 = new Presept(narko,dr,0);
        Resepter resept3 = new Blaa(vaner,dr,0,4);


        System.out.println("Tester Resept 1:");

        if (resept1.hentId() == 1) {
            System.out.println("Riktig 1");
            System.out.println(resept1.hentId());
        } else {
            System.out.println("Feil 1");
        }

        if (resept1.hentLege(dr) == "Tonje") {
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        if (resept1.hentLegemiddel(vanlige) == "paracetamol") {
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        if (resept1.hentReit() == 4) {
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        if (resept1.prisAaBetale() == 0) {
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        if (resept1.farge() == "Hvit") {
            System.out.println("Riktig 6");
        } else {
            System.out.println("Feil 6");
        }

        System.out.println("Tester resept 2:");
        if (resept2.prisAaBetale() == 112) {
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        if (resept2.hentId() == 2) {
            System.out.println("Riktig 2");
            System.out.println(resept2.hentId());
        } else {
            System.out.println("Feil 2");
        }

        if (resept2.farge() == "Hvit") {
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        System.out.println("Tester resept3:");

        if (resept3.prisAaBetale() == 25) {
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        if (resept3.farge() == "Blaa") {
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        if (resept3.hentId() == 3) {
            System.out.println("Riktig 3");
            System.out.println(resept3.hentId());
        } else {
            System.out.println("Feil 3");
        }

        System.out.println(resept1.toString(vanlige,dr));


    }
}
