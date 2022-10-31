class Seterad {
    int seteNr;
    String radInfo;
    Seter[] alle; 

    public Seterad(int nr, String radInfo){
        this.seteNr = nr;
        this.radInfo = radInfo;

        //Her antar jeg at maks plass per rad er F slik det er 
        //på vanlige fly
        int lengde = radinfor.length;
        for(int i = 0; i < lengde; i++){
            char ch = radInfo.charAt(i);
            if ((ch >= 'A' && ch <= 'F')){
                if(radInfo.charAt(i-1) == '*'){
                    if(inneholder(radInfo,ch) == 0 || inneholder(radInfo,ch) == lengde-1){
                        alle[i] = new Seter(null, nr, ch, true, false, true);
                        break;
                    }
                    if(inneholder(radInfo,ch) == 0 || inneholder(radInfo,'+') == lengde-1){
                        alle[i] = new GodBenplassSete(null, nr, ch, true, false, true);
                        break;
                    }
                    alle[i] = new Seter(null, nr, ch, false, false, true);
                    break;
                }

                else if(radInfo.charAt(i+1) == '*'){
                    if(inneholder(radInfo,ch) == 0 || inneholder(radInfo,ch) == lengde-1){
                        alle[i] = new Seter(null, nr, ch, true, true, false);
                        break;
                    }
                    if(inneholder(radInfo,ch) == 0 || inneholder(radInfo,'+') == lengde-1){
                        alle[i] = new GodBenplassSete(null, nr, ch, true, true, false);
                        break;
                    }
                    alle[i] = new Seter(null, nr, ch, false, true, false, false);
                    break;
                }

                else if(radInfo.charAt(i+1) == '+'){
                    if(inneholder(radInfo,ch) == 0 || inneholder(radInfo,ch) == lengde-1){
                        alle[i] = new GodBenplassSete(null, nr, ch, true, false);
                        break; 
                    }
                    alle[i] = new GodBenplassSete(null, nr, ch, false, false); 
                    break; 
                }
                else if(inneholder(radInfo,ch) == 0 || inneholder(radInfo,ch) == lengde-1){
                    alle[i] = new Seter(null, seteNr, ch, true, false);
                    break; 
                }
                alle[i] = new Seter(null, seteNr, ch, false, false);
            }
        }
    }
    public Seter[] hentAlleSeter(){
        return alle;
    }

    @Override
    public void skrivUt(){
        System.out.println("Rad: " + seteNr);
    }
}
