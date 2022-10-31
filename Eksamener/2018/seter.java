class Seter implements MidtgangSete{
    Passasjer passasjer = null; 
    int radNr;
    String bokstav;
    boolean sant;
    boolean hoyreMidtgang;
    boolean venstreMidtgang;

    public Seter(Passasjer pas, String radNr,String bokstav, boolean sant, boolean venstreMidtgang, boolean hoyreMidtgang){
        this.passasjer = pas; 
        this.radNr = radNr;
        this.bokstav = bokstav;
        this.sant = sant; 
        this.hoyreMidtgang = hoyreMidtgang;
        this.venstreMidtgang = venstreMidtgang;
    }

    public boolean erVindussete(){
        return sant; 
    }

    public boolean erVedMidtgang(){
        if(hoyreMidtgang || venstreMidtgang){
            return true;
        }
        return false;
    }

    @Override
    public void skrivUt(){
        System.out.println("Bokstav: " + bokstav + " Vindussete: " + erVindussete() +
        " Midtgang: " + erVedMidtgang());
    }

}
