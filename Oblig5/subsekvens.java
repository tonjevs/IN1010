class Subsekvens {
    private String sub;
    private int antall = 1;

    Subsekvens(String sub){
        this.sub = sub;
    }
    public int hent(){
        return antall; 
    }
    public String hentNavn(){
        return sub;
    }

    public void settAntall(int ant){
        antall = ant + antall;
    }
}
