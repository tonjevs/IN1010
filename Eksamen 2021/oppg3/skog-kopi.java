class Skog{
    final int ANTSTIER;
    final int ANTKRYSS;
    Kryss[] kryssListe;

    Skog(int ANTSTIER, int ANTKRYSS){
        this.ANTKRYSS = ANTKRYSS;
        this.ANTSTIER = ANTKRYSS;
        kryssListe = new Kryss[ANTKRYSS];
        for(int i = 0; i < ANTKRYSS; i++){
            Kryss kryss = new Kryss();
            kryssListe[i] = kryss;
        }
        for(int i = 0; i < ANTSTIER; i++){
            Kryss startKryss = hentTilfeldigKryss();
            Kryss stoppKryss = hentTilfeldigKryss();
            int lengde = trekkLengde();

            int tall = Trekk.trekkInt(1, 4);
            if(tall == 1){
                Kjerrevei sti = new Kjerrevei(lengde, startKryss, stoppKryss);
                startKryss.stiListe.add(sti);
                stoppKryss.stiListe.add(sti);
            }
            else if(tall == 2){
                NaturSti sti = new Natursti(lengde, startKryss, stoppKryss);
                startKryss.stiListe.add(sti);
                stoppKryss.stiListe.add(sti);
            }
            else if(tall == 3){
                int verdi = Trekk.trekkInt(1, 6);
                GodUtsiktKjerreSti sti = new GodUtsiktKjerreSti(lengde, startKryss, stoppKryss, verdi);
                startKryss.stiListe.add(sti);
                stoppKryss.stiListe.add(sti);
            }
            else if (tall == 4){
                int verdi = Trekk.trekkInt(1, 6);
                GodUtsiktNaturSti sti = new GodUtsiktNaturSti(lengde, startKryss, stoppKryss, verdi);
                startKryss.stiListe.add(sti);
                stoppKryss.stiListe.add(sti);
            }
        }

    }
    Kryss hentTilfeldigKryss(){
        int tall = Trekk.trekkInt(0,ANTKRYSS);
        return kryssListe[tall];
    }

    Kryss hentTilfeldigStart(){
        Kryss kryss = hentTilfeldigKryss();
        if(kryss.stiListe.length >= 1){
            return kryss;
        }
        return null; 
    }
    int trekkLengde(){
        int tall = Trekk.trekkInt(220,2500);
        return tall;
    }
}