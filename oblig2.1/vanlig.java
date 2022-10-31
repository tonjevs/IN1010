class Vanlig extends Legemiddler{
    private int tell = id;
    Vanlig(String n,int pris,double mg,int tell){
        super(n,pris,mg,teller);
        id = teller++;
    }
    @Override
    public String toString(){
         return ("Legemiddel: " + hentNavn() + " Pris: " + hentPris() +
                    " mg: " + hentVirkestoff() + " ID: " + hentId());
    }
}
