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
            Kryss stoppKryss;
            Kryss startKryss;
            boolean ok = true;
            int forsok = 0;
            while(ok){
                if(forsok == 100){
                    System.out.println("Programmet avsluttet pga en feil...");
                    System.exit(1);
                }
                forsok++;
                startKryss = hentTilfeldigKryss();
                stoppKryss = hentTilfeldigKryss();
                ok = startKryss.finnesVeiTilKryss(stoppKryss);
            }
            startKryss.naboKryss = stoppKryss;
            stoppKryss.naboKryss = startKryss;

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