class Millitarresept extends Hvite{
    private int pris;
    private int tell = id;
    Millitarresept(Legemiddler legemiddel, Lege lege, int tell, int reit){
        super(legemiddel,lege,teller,reit);
        id = teller++;
    }
    public int vernepliktrabatt(){
        return pris = 0;
    }

    public String farge(){
        return "Hvit";
    }

    public int prisAaBetale(){
        return vernepliktrabatt();
    }
    @Override
    public String toString(Legemiddler legemiddel, Lege lege){
         return ("Legemiddel: " + hentLegemiddel(legemiddel) + " Lege: " + hentLege(lege) +
                    " reit: " + hentReit() + " ID: " + hentId() + " Farge: "+ farge());
    }
}
