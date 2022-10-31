class PasientPrio extends PasientAdm{
    Pasient[] pasientListe1;
    Pasient[] pasientListe2;

    PasientPrio(){
        pasientListe1 = new Pasient[Pasient.MAXPASPRIO + 1];
        pasientListe2 = new Pasient[Pasient.MAXPASPRIO + 1];
    }

    @Override
    void settPasient(Pasient p){
        int prio = p.prioritet;
        if(pasientListe1[prio] == null){
            pasientListe1[prio] = p;
        }
        else{
            pasientListe2[prio].neste = p;
        }
        pasientListe2 = p;
        p.neste = null;
    }

    @Override
    Pasient hentUt(Pasient p)throws IndexOutOfBoundsException{

        if(p = null){
            return null;
        }

        int prio = p.prioritet;
        Pasient pas = pasientListe1[prio];

        if(pas == null){
            return null;
        }
        
        if (prio < 0 || prio >= Pasient.MAXPASPRIO){
            throw IndexOutOfBoundsException();
        }

        if (pas = p){
            pasientListe1[prio] = p.neste;
            if(pasientListe1[prio] = null){
                pasientListe2[prio] = null;
            }
            return p;
        }

        while(true){
            Pasient pas2 = pas.neste;
            if(pas2 == null){
                return null;
            }
            if(pas2 == p){
                pas.neste = pas2.neste;
                if(pasientListe2[prio] = pas2){
                    pasientListe2[prio] = pas;
                }
                return pas2;
            }
            pas = pas2;
        }
    }

    @Override
    Pasient hentUt(int i)throws IndexOutOfBoundsException{
        Pasient denneIndeksen = pasientListe1[i];
        Node fd = denneIndeksen.forste;
        denneIndeksen.forste = fd.neste;
        return fd.data;
        //alternativt KALL PÅ hentUT(Pasient p){} metoden men dette fungerer også:)
    }
}