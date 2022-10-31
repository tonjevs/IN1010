class GodBenplassSete extends Seter{

    public GodBenplassSete(Passasjer pas, String radNr,String bokstav, boolean sant, boolean venstreMidtgang, boolean hoyreMidtgang){
        super(pas, radNr, bokstav, sant, venstreMidtgang, hoyreMidtgang);
    }

    @Override
    public void skrivUt(){
        System.out.println("Bokstav: " + bokstav + " Vindussete: " + erVindussete() +
        " Midtgang: " + erVedMidtgang() + " Setet har god benplass");
    }
}
