abstract class Legemiddler{
    protected String n;
    protected int pris;
    protected double mg;
    protected int id = 1;
    protected static int teller = 1;

    Legemiddler(String n, int pris, double mg,int id){
        this.n = n;
        this.id = id;
        this.pris = pris;
        this.mg = mg;
    }
    public int hentId(){
        return this.id;
    }

    public String hentNavn(){
        return n;
    }

    public int hentPris(){
        return pris;
    }

    public double hentVirkestoff(){
        return mg;
    }
    public int settNyPris(int nyPris){
         pris = nyPris;
         return pris;
    }

    public String toString(){
         return ("Legemiddel: " + hentNavn() + " Pris: " + hentPris() +
         " mg: " + hentVirkestoff() + " ID: " + hentId());

    }
}
