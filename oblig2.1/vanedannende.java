class Vanedannende extends Legemiddler{
    protected int styrke;
    private int tell = id;

    Vanedannende(String n,int pris,double mg,int tell, int styrke){
        super(n,pris,mg,teller);
        this.styrke = styrke;
        id = teller++;

    }
    public int hentVanedannendeStyrke(){
        return styrke;
    }
    @Override
    public String toString(){
         return ("Legemiddel: " + hentNavn() + " Pris: " + hentPris() +
                    " mg: " + hentVirkestoff() + " ID: " + hentId() + " Styrke: "
                    + styrke);
    }
}
