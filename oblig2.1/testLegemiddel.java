class Testlegemiddel{

    public static void main(String[] args){

        Narkotisk narko = new Narkotisk("benzol", 20,3.8,0,3);
        Vanedannende vaner = new Vanedannende("tirralac",100,350.0,0,2);
        Legemiddler vanlige = new Vanlig("paracetamol",50,500.0,0);


        System.out.println("Tester Narkotisk:");

        if (narko.hentNavn() == "benzol") {
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        if (narko.hentPris() == 20) {
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        if (narko.hentVirkestoff() == 3.8) {
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        if (narko.hentId() == 1) {
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        if (narko.hentNarkotiskStyrke() == 3) {
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        System.out.println("Tester Vanedannende:");

        if (vaner.hentNavn() == "tirralac") {
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        if (vaner.hentPris() == 100) {
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        if (vaner.hentVirkestoff() == 350.0) {
            System.out.println("Riktig 3");
        } else {
            System.out.println("Feil 3");
        }

        if (vaner.hentId() == 2) {
            System.out.println("Riktig 4");
        } else {
            System.out.println("Feil 4");
        }

        if (vaner.hentVanedannendeStyrke() == 2) {
            System.out.println("Riktig 5");
        } else {
            System.out.println("Feil 5");
        }

        System.out.println("Tester Vanlige:");

        if (vanlige.hentNavn() == "paracetamol") {
            System.out.println("Riktig 1");
        } else {
            System.out.println("Feil 1");
        }

        if (vanlige.hentPris() == 50) {
            System.out.println("Riktig 2");
        } else {
            System.out.println("Feil 2");
        }

        if (vanlige.hentVirkestoff() == 500.0) {
            System.out.println("Riktig 3");

        } else {
            System.out.println("Feil 3");
        }

        if (vanlige.hentId() == 3) {
            System.out.println("Riktig 4");

        } else {
            System.out.println("Feil 4");
        }

    }
}
