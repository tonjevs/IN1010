class Hvite extends Resepter{
    Hvite(Legemiddler legemiddel, Lege lege, int id,int reit){
        super(legemiddel,lege,teller,reit);
    }

    public String farge(){
        return "Hvit";
    }

    public int prisAaBetale(){
        return this.legemiddel.hentPris();
    }
    @Override
    public String toString(Legemiddler legemiddel, Lege lege){
         return ("Legemiddel: " + hentLegemiddel(legemiddel) + " Lege: " + hentLege(lege) +
                    " reit: " + hentReit() + " ID: " + hentId() + " Farge: "+ farge());
    }
}
