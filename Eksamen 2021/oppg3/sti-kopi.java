class Sti {
    int lengde;
    Kryss kryssStart;
    Kryss kryssSlutt;

    Sti(int lengde, Kryss kryssStart, Kryss kryssSlutt){
        this.lengde = lengde;
        this.kryssStart = kryssStart;
        this.kryssSlutt = kryssSlutt;
    }
    Kryss finnAndreEnde(Kryss start){
        if (start == kryssStart){
            return kryssSlutt;
        }
        if (start == kryssSlutt){
            return kryssStart;
        }
        return null;
    }
    int beregnGaaTid(int fart){
        return lengde/fart;
    }
}
