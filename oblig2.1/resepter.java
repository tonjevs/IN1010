abstract class Resepter{
    protected Legemiddler legemiddel;
    protected Lege lege;
    protected int reit;
    protected int id = 1;
    protected static int teller = 1;

    Resepter(Legemiddler legemiddel, Lege lege, int id, int reit){
        this.legemiddel = legemiddel;
        this.lege = lege;
        this.id = id;
        this.reit = reit;
    }

    public int hentId(){
        return this.id;
    }

    public String hentLegemiddel(Legemiddler legemiddel){
        String navn = legemiddel.hentNavn();
        return navn;
    }

    public String hentLege(Lege lege){
        String navn = lege.hentNavn();
        return navn;
    }

    public int hentReit(){
        return this.reit;
    }
    public boolean bruk​(){
        if(reit-1 == -1){
            return false;
        } else {
            return true;
        }
    }

    public abstract String farge();

    public abstract int prisAaBetale();

    public String toString(Legemiddler legemiddel, Lege lege){
         return ("Legemiddel: " + hentLegemiddel(legemiddel) + " Lege: " + hentLege(lege) +
                    " reit: " + hentReit() + " ID: " + hentId() + " Farge: "+ farge());
    }
}
