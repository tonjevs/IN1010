class Lege{
    protected String navn;
    Lege(String navn){
        this.navn = navn;
    }
    String hentNavn(){
        return navn;
    }

    public String toString(){
         return ("Lege: " + navn);
    }
}
