class Stringhjelper{
    
    static int inneholder(String s, String t){
        int sLen = s.length();
        int tLen = t.length();

        for(int i = 0; i < sLen-tLen; i++){
            boolean riktig = true;
            for(int j = 0; j < tLen; j++){
                if(s.charAt(i+j) != t.charAt(j)){
                    riktig = false;
                    break;
                }
            }
            if(riktig) return i;
        }
        return -1;
    }
}