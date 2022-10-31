class OverlegeAdmin extends Overlege implements Admin{
    private final String ansvarsKode;

    OverlegeAdmin(String a, String n, int h, String s, String an){
        super(a, n, h, s);
        this.ansvarsKode = an;
    }

    public String hentKode(){
        return ansvarsKode;
    }   
}
