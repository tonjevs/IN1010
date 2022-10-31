class Passasjer {
    String navn;
    double hoyde;
    
    Passasjer(String n, double h){
        this.navn = n;
        this.hoyde = h;
    }

    boolean harLangeBen(){
        if(hoyde > 190){
            return true;
        }
        return false;
    }
    public String toString(){
        return navn;
    }
}
