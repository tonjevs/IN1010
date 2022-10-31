class Spesialist extends Lege implements Godkjenningsfritak{
    protected String kontrollID;
    Spesialist(String navn, String kontrollID){
        super(navn);
        this.navn = navn;
        this.kontrollID = kontrollID;
    }
    public String hentKontrollID(){
        return kontrollID;
    }
    @Override
    public String toString(){
         return ("Lege: " + navn + " KontrollID " + kontrollID);

    }
}
