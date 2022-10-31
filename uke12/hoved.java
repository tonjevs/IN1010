class Hovedprogram {

    void rekusjonsmetode(String n){   
        if(n.hentNeste(n) == null){
            System.out.println(n);
        }
        else{
            System.out.println(n);
            rekusjonsmetode(n.hentNeste(n));

        }
    }
    public static void main(String[] args) {
        FIFOListe<String> liste = new FIFOListe<>();

        System.out.println("Er liste tom? " + liste.erTom());
        liste.leggTil("H");
        liste.leggTil("E");
        liste.leggTil("I");

        rekusjonsmetode(liste.hentHode());
        
    }
}