class Presept extends Hvite{
    private int pris;
    private int tell = id;
    Presept(Legemiddler legemiddel, Lege lege, int tell){
        super(legemiddel,lege,teller,3);
        id = teller++;
    }
    static int preseptrabatt(int pris){
        if (pris - 108 < 0){
            pris = 0;
        } else{
            pris = pris - 108;
        }
        return pris;
    }

    public String farge(){
        return "Hvit";
    }

    public int prisAaBetale(){
        int pris = this.legemiddel.hentPris();
        return preseptrabatt(pris);
    }

    @Override
    public String toString(Legemiddler legemiddel, Lege lege){
         return ("Legemiddel: " + hentLegemiddel(legemiddel) + " Lege: "
          + hentLege(lege) + " ID: " + hentId() + " Farge: "+ farge());
    }
}
