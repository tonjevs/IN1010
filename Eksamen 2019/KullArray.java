
class KullArray extends Kull{
    KullArray(Hund mor, Hund far){
        super(mor,far);
    }
    Hund[] kullArray = new Hund[58];

    public void settInn(Hund h){
        int sek = h.minFodselstid.sekund;
        h.neste = kullArray[sek];
        hundene[sek] = h;
    }
    public void skrivUtAlle(){
        for (Hund hund : this) {
            System.out.println(hund.navn);
        }
    }
}
