class GodUtsiktNaturSti extends Natursti implements GodUtsikt{
    int utsiktVerdi;

    GodUtsiktNaturSti(int lengde, Kryss kryssStart, Kryss kryssSlutt,int utsiktVerdi){
        super(lengde, kryssStart, kryssSlutt);
        this.utsiktVerdi = utsiktVerdi;
        if(utsiktVerdi < 1 || utsiktVerdi > 6){
            throw new UgyldigVerdi(utsiktVerdi);
        }
    }
    public String toString(){
        return "Dette er en sti med utsiktsverdi: " + utsiktVerdi;
    }
}
