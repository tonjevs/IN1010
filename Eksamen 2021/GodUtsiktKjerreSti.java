class GodUtsiktKjerreSti extends Kjerrevei implements GodUtsikt{
    int utsiktVerdi;

    GodUtsiktKjerreSti(int lengde, Kryss kryssStart, Kryss kryssSlutt,int utsiktVerdi){
        super(lengde, kryssStart, kryssSlutt);
        this.utsiktVerdi = utsiktVerdi;
        if(utsiktVerdi <= 1 || utsiktVerdi >= 6){
            throw new UgyldigVerdi(utsiktVerdi);
        }
    }
    
    @Override
    public String toString(){
        return "Dette er en Kjerrevei med utsiktsverdi: " + utsiktVerdi;
    }
}