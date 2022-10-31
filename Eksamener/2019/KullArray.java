public class KullArray extends Kull{
    Hund[] listen;
    KullArray(Hund mor, Hund far){
        super(mor,far);
        listen = new Hund[59];
    }

    public void settInn(Hund h){
        int indeks = h.minFodselstid.sekund;
        if(listen[indeks] = null){
            listen[indeks] = h;
        }
        else{
            listen[indeks].neste = h; 
        }
    }
    public Iterator<Hund> iterator(){
    }

    void skrivUtAlle(){
        for (Hund hund : listen) {
            System.out.println(hund);
        }
    }
}
