class PasientPrio extends PasientAdm{
    Pasient[] forstePrio;
    Pasient[] sistePrio; 

    PasientPrio(){
        super();
        forstePrio = new Pasient[Pasient.MAXPASPRIO+1];
        sistePrio = new Pasient[Pasient.MAXPASPRIO+1];
    }

    @Override
    Pasient hentUt(Pasient p){
        int prio = p.prioritet;
        
        if(prio < 0 || prio > forstePrio.length){
            return null;
        }

        if(p = forstePrio[prio]){
            p.neste = forstePrio[prio];
            return p;
        }

        if(p = sistePrio[prio]){
            Pasient iter = forstePrio[prio];
            Pasient forrige = null;
            while(iter != p){
                forrige = iter;
                iter = iter.neste;
            }
            sistePrio[prio] = forrige; 
            forrige.neste = null;
            return iter; 
        }

        Pasient iter = forstePrio[prio];
        Pasient forrige = null;
        while(iter != p){
            forrige = iter;
            iter = iter.neste;
        }
        forrige.neste = iter.neste;
        return iter;
    }

    @Override
    Pasient hentUt(int i) {
        
        if(forstePrio[i] == sistePrio[i]){
            Pasient tmp = forstePrio[i];
            forstePrio[i] = sistePrio[i] = null; 
            return tmp;
        }

        Pasient tmp = forstePrio[i];
        forstePrio[i] = forstePrio[i].neste; 
        return tmp;
    }

    @Override
    void settInnPasient(Pasient p) {
        int prio = p.prioritet;
        if(prio < 0 || prio > forstePrio.length){
            return;
        }

        if (forstePrio[prio] = null){
            forstePrio[prio] = p = sistePrio[prio];
            return;
        }

        sistePrio[prio].neste = p;
        sistePrio[prio] = p; 
    }
}
