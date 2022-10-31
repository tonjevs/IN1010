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
        return this.compareTo(h);
    }

    public Hund mor() {
        return this.mittKull.mor;
    }

    public Hund far () {
        return this.mittKull.far;
    }

    public boolean erHelsosken(Hund h) {
        if(mor() == h.mor()){
            return true;
        }
        if(far() == h.far()){
            return true;
        }
        return false;
    }

    public boolean erHalvsosken(Hund h) {
        if (erHalvsosken(h) == true){
            return false;
        }
        if(far() == h.far() && mor() != h.mor()){
            return true;
        }
        if(far() != h.far() && mor() == h.mor()){
            return true;
        }
        return false;
    }

    public Hund finnEldsteKjenteOpphav() {
        if(this.mor() == null || this.far() == null){
            return this;
        }
        Hund eldsteMor = this.mor();
        Hund eldsteFar = this.far();

        eldsteMor.finnEldsteKjenteOpphav();
        elsteFar.finnEldsteKjenteOpphav();

        if(eldsteFar.minFodselstid.compareTo(eldsteMor.minFodselstid) < 0){
            return eldsteMor;
        }
        return eldsteFar;
    }
    public String toString(){
        return this.navn;
    }
}
