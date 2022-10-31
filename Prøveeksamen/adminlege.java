class Adminlege extends Overlege implements Administrator{

    final String ansvarsKode;

    Adminlege(final String ans,final String n,int ln,String s, Sting ansK){
        super(ans,n,ln,s);
        this.ansvarsKode = andK;
    }
    public String hentAnsKode(){
        return ansvarsKode;
    }
}
