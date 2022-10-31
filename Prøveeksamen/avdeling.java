import java.util.ArrayList;
class Avdeling{
    PasientAdm pasienter;
    
    final void settInn(Pasient p){
        pasienter.settInn(p);
    }

    final Pasient hentUt(Pasient p){
        return pasienter.hentUt(p);
    }

    final Pasient hentUt(int i){
        return pasienter.hentUt(i);
    }
}

class Akutten extends Avdeling{

    Akutten(){
        pasienter = new PasientPrio();
    }
}

class Sengepost extends Avdeling{
    int antSenger;

    SengePost(int ant){
        antSenger = ant;
        pasienter = new PasientTabell(antSenger);
    }
}