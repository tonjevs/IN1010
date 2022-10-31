import java.util.concurrent.CountDownLatch; //F

class Main{
    public static void main(String[] args) {
        Sykehus hospitalet = new Sykehus();

        hospitalet.akutten = new Akutten();
        hospitalet.senger = new Sengepost(100);

        Pasient p1 = new Pasient("Ola", "04122001", 2);
        Pasient p2 = new Pasient("Monika", "03021993", 4);

        hospitalet.skrivInn(p1,hospitalet.akutten);
        hospitalet.skrivInn(p2,hospitalet.akutten);

        hospitalet.overfoer(p1,hospitalet.akutten,hospitalet.senger);
        hospitalet.skrivUt(p2, hospitalet.akutten);
    }
}

class Sykehus{

    static boolean iFaresonenKvinne (Pasient pas) { return true; }
    static boolean iFaresonenMann (Pasient pas) { return true; }
    static void kanHaSykdomKvinne (Pasient pas) {}
    static void kanHaSykdomMann (Pasient pas) {}

    Avdelinger akutten, senger;

    void skrivInn(Pasient p, Avdeling a){
        a.settInn(p);
    }

    void overfoer(Pasient p, Avdeling a1, Avdeling a2){
        if(a1.hentUt(p) != null) a2.settInn(p);
    }

    void skrivUt(Pasient p, Avdeling a){
        a.hentUt(p);
    }
    void utforAnalyse(PasientPrio p, int ant){
        AnalyseBuffer buf = new AnalyseBuffer();
        CountDownLatch ventPas = new CountDownLatch(Pasient.MAXPASPRIO+1);
        CountDownLatch ventAna = new CountDownLatch(ant);

        for(int i = 0; i < Pasient.MAXPASPRIO; i++){
            Thread traad = new Thread(new Sil(p,i,buf,ventPas/*F*/)).start();
        }
        for(int i = 1; i <Pasient.MAXPASPRIO;i++){
            Thread traad2 = new Thread(new Analyse(buf,ventAna/*F*/)).start();
        }
        try{ //F
            ventPas.await();
            buf.kommerFlere = false;
            ventAna.await();
        }
        catch(InterruptedException e){
            System.err.println(e);
        }//F
    }
}