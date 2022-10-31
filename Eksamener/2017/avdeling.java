class Avdeling{
    PasientAdm denne; 

    @Override
    final void settInnPasient(Pasient p){
        denne.settInnPasient(p);
    }

    @Override
    final Pasient hentUt(Pasient p){
        return denne.hentUt(p);
    }
    
    @Override
    final Pasient hentUt(int i){
        return denne.hentUt(i);
    }
}
