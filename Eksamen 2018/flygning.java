class Flygning {
    String spesString;
    String flightNummer; 
    Seterad[] seterader;
    
    Flygning(String spesifikasjon, String flightNo){
        spesString = spesifikasjon;
        flightNummer = flightNo;

        String[] biter = spesString.split("|");
        seterader = new seterader[biter.length];

        for(int i = 0; i < biter.length; i++){
            seterader[i] = biter[i];
        } 
    }

    @Override
    boolean book(Passasjer pas){
        for (Seterad seterad : seterader) {
            for(Sete denne : seterad){
                if (denne.passasjer == null){
                    denne.passasjer = pas;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    boolean book(Passasjer pas, boolean foretrekkerVindu, boolean foretrekkerMidtgang){
        for (Seterad seterad : seterader) {
            for(Sete denne : seterad){
                boolean midtgang = denne instanceof MidtgangSetet;
                if (denne.passasjer == null && denne.erVindussete() == foretrekkerVindu && midtgang == foretrekkerMidtgang){
                    denne.passasjer = pas;
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    boolean book(Passasjer pas1, Passasjer pas2){
        for (Seterad seterad : seterader) {
            for(Sete denne : seterad){
                if(denne)
            }
        }
        return false;
    }
    void skriv(){
        for (Seterad seterad : seterader) {
            for (Sete sete : seterad) {
                if (sete instanceof MidtgangSetet){
                    if (sete instanceof GodBenplassSete){
                        System.out.println(sete.passasjer + " Midtgangsete med god benplass" + sete.plass);
                        return;
                    }
                    System.out.println(sete.passasjer + " Midtgangsete" + sete.plass);
                    return;
                }
                if(sete.erVindussete()){
                    if (sete instanceof GodBenplassSete){
                        System.out.println(sete.passasjer + " Vinduseete med god benplass" + sete.plass);
                        return;
                    }
                    System.out.println(sete.passasjer + "Vindussete" + sete.plass); 
                    return; 
                }
                if (sete instanceof GodBenplassSete){
                    System.out.println(sete.passasjer + " Vinduseete med god benplass" + sete.plass);
                    return;
                }
            }
        }
    }
}
