class Seterader {
    int radNr;
    Sete[] seter;

    Seterad(String konfugurasjon){
        String[] data = konfig.split(":");
        int nr = Integer.parseInt(data[0]);

        String resten = data[1];
        String sTab = "":
        for(int i = 0; i < resten.length(); i++){
            char c = resten.charAt(i);
            if('A' <=c && c<='Z'){
                sTab += c;
            }
        }
        seter = new Sete[sTab.length()];
        int seteIndex = 0;
        for(int j = 0; i < resten.length();j++){
            char c2 = resten.charAt(j);
            if('A' <=c && resten.charAt(j+1)=='+'){
                seter[seteIndex++] = new GodBenplassSete(nr,c2);
                j++;
            }
            else{
                seter[seteIndex++] = new Sete(nr,c2);
            }
        }
        seteIx = 0;
        for(int i = 0; i < resten.length();i++){
            char c3 = resten.charAt(j);
            if(c3 == '*'){
                if(seteIx < 0){
                    seter[seteIx-1].venstreForMidtgang = true;
                }
                seter[seteIndex++] = new GodBenplassSete(nr,c3);
                i++;
            }
            else{
                seter[seteIndex++] = new Sete(nr,c3);
            }
        }
    }  
}
