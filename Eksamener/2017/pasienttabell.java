class PasientTabell extends PasientAdm{
    Pasient[] pasientArray;
    private Pasient forrigeInsetting = null; 
    int lengde;

    PasientTabell(int lengde){
        super();
        this.lengde = lengde;
        pasientArray = new Pasient[lengde];
    }

    @Override
    Pasient hentUt(Pasient p) {
        if(p == null){
            return null;
        }
        if(p.sengNr > lengde|| p.sengNr < 0){
            return null; 
        }

        Pasient a = pasientArray[p.sengNr];
        p.sengNr = -1; 
        pasientArray[p.sengNr] = null; 
        return a; 
    }

    @Override
    Pasient hentUt(int i) {
        int teller = 0; 
        while(pasientArray[teller].prioritet != i){
            teller++;
        }
        Pasient p = pasientArray[teller];
        p.sengNr = -1;
        pasientArray[teller] = null; 
        return p; 
        
    }

    @Override
    void settInnPasient(Pasient p) {
        if(forrigeInsetting == null){
            for(int i = 0; i < lengde; i++){
                if(pasientArray[i] == null){
                    pasientArray[i] = p; 
                    p = forrigeInsetting; 
                    p.sengNr = i;
                    return; 
                }   
            }
        }
        int indeks = forrigeInsetting.sengNr;

        for(int i = indeks; i < lengde+1; i++){
            if (indeks = lengde){
                indeks = 0;                    
                break;  
            }
            if(pasientArray[i] == null){
                pasientArray[i] = p; 
                p = forrigeInsetting; 
                p.sengNr = i;
                return; 
            }   
        }
    }
}
