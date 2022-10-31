class Blaa extends Resepter{
    private int tell = id;
    Blaa(Legemiddler legemiddel, Lege lege, int tell,int reit){
        super(legemiddel,lege,teller,reit);
        id = teller++;
    }

    public String farge(){
        return "Blaa";
    }

    public int prisAaBetale(){
        int pris = this.legemiddel.hentPris();
        int rabattpris = pris/4;
        return rabattpris;
    }
    @Override
    public String toString(Legemiddler legemiddel, Lege lege){
         return ("Legemiddel: " + hentLegemiddel(legemiddel) + " Lege: " + hentLege(lege) +
                    " reit: " + hentReit() + " ID: " + hentId() + " Farge: "+ farge());
    }
}
