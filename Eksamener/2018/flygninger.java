import java.util.Iterator;

class Flygninger implements Iterable<Seter> {
    String seteInfo; 
    String flightNo;
    Seter[] denne; 
    String[] info;

    Flygninger(String seteInfo, String flightNo, Seter[] denne){
        this.seteInfo = seteInfo;
        this.flightNo = flightNo;
        String[] rader = seteInfo.split("|");
        int j = 0; 
        for (String string : rader) {
            int i = string.charAt(0);
            info = string.split(":");
            new Seterad(info[0], info[1]);
            denne[j++] = hentAlleSeter();
        }
    }

    boolean book(Passasjer pas){
        for (Seter seter : denne) {
            if(seter.passasjer == null){
                seter.passasjer = pas; 
                return true; 
            }
        }
        return false; 
    }

    public boolean book(Passasjer pas, boolean foretrekkerVindu, boolean foretrekkerMidtgang){
        for (Seter seter : denne) {
            if(seter.midtgang == foretrekkerMidtgang && seter.erVindussete == foretrekkerMidtgang){
                if(pas.harLangeBen() == true && seter instanceof GodBenplassSete){
                    seter.passasjer = pas;
                    return true; 
                }
            }
        }
        return false;
    }
    //her antar jeg at vi har laget en metode som kan hente neste setet etter ett kjendt sete
    public boolean book(Passasjer pas1, Passasjer pas2){
        for (Seter seter : denne) {
            if(seter.hoyreMidtgang == true || seter.hentNeste().hoyreMidtgang == true){
                if (seter.passasjer == null || seter.hentNeste().passasjer == null){
                    seter.passasjer = pas1;
                    seter.hentNeste().passasjer = pas2;
                    return true;
                }
            }
            if(seter.venstreMidtgang == true || seter.hentNeste().venstreMidtgang == true){
                if (seter.passasjer == null || seter.hentNeste().passasjer == null){
                    seter.passasjer = pas1;
                    seter.hentNeste().passasjer = pas2;
                    return true;
                }
            }
        }
        return false;
    }

    public void skrivUt(){
        System.out.println("Flightnummer" + flightNo);
        for (Seter seter : denne) {
            System.out.println(seter);
        }
    }

    public Iterator<Seter> iterator(){
        return new SeteIterator(this);
    }

}

class SeteIterator{
    Flygning flygningen;
    int radIndex;
    int seteIndex;

    SeteIterator(Flygning f){
        flygningen = f;
    }
    public boolean hasNext(){
        int i = String.parseString(flygningen.info[0]);
        return radIndex < i;
    }
    public Seter next(){
        Sete s = flygning.denne[radIndex].seter[seteIndex];
        seteIndex++;
        if (seteIndex >= flygning.denne[radIndex].seter.length) {
            radIndex++;  seteIndex = 0;
        }
        return s; 
    }
}
