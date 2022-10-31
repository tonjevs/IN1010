class Hund implements Comparable<Hund> {
    String navn;
    Kull mittKull;
    Tidspunkt minFodselstid;
    Hund neste = null;
    
    Hund(Kull k, String navn, Tidspunkt fodt) {
        this.navn = navn;
        mittKull = k;
        minFodselstid = fodt;
    }

    @Override
    public int compareTo(Hund h) {
        return minFodselstid.compareTo(h.minFodselstid);
    }

    public Hund mor() {
        return mittKull.mor;
    }

    public Hund far() {
        return mittKull.far;
    }

    public boolean erHelsosken(Hund h) {
        if(mor()== null || far() == null || h.mor()== null || h.far()== null){
            return null;
        }

        if(mor().equals(h.mor()) && far().equals(h.far())){
            return true;
        }
        return false;   
    }

    public boolean erHalvsosken(Hund h) {
        if(erHelsosken(h) != false){
            return false;
        }
        if((mor().equals(h.mor()) && !(far().equals(h.far()))) || (!(mor().equals(h.mor())) && far().equals(h.far()))){
            return true;
        }
    }   
    public Hund finnEldsteKjenteOpphav() {

        if(mor() == null || far() == null){
            return null;
        }
        Hund morEldst = mor().finnEldsteKjenteOpphav();
        Hund farEldst = far(). finnEldsteKjenteOpphav();

        if(morEldst.compareTo(farEldst) < 0){
            return morEldst;
        }
        return farEldst;
    }   
}