class PasientTabell extends PasientAdm{
    Pasient forste = null;
    Pasient[] liste;
    int lengde;

    public PasientTabell(int l){
        lengde = l;
        liste = new Pasient[lengde];
        
    }
    @Override
    void settPasient(Pasient p){

        if (forste == null){
            forste = liste[0] = p;
            brukt.sengNr = 0;
        }

        else{
            int indeksen = forste.sengNr + 1;

            for (int i = indeksen; i < lengde ; i++){

                if(i == lengde){
                    i = -1;
                }

                if(liste[i] == null){
                    liste[i] = p;
                    forste = liste[i];
                    forste.sengNr = i;
                }
            }
        }
    }
    @Override
    Pasient hentUt(Pasient p){
        int nr = p.sengNr;
        Pasient tmp = liste[nr];
        liste[nr] = null;
        tmp.sengNr = -1;
        return tmp;
    }
    @Override
    Pasient hentUt(int i){
        
        for(int indeks = 0; indeks < liste.length; indeks++){
            if(liste[i].prioritet == i){
                Pasient tmp = liste[i];
                liste[i].sengNr = -1;
                liste[i] = null;
                return tmp;
            }
        }
        return null;
    }
}