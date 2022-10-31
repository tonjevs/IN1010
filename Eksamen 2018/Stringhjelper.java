class Stringhjelper{

    static int inneholder(String s, String t){
        String heleTeksten = s;
        String delen = t;

        int sLen = heleTeksten.length();
        int tLen = dele.length();

        for (int i = 0; i <= sLen-tLen; i++){
            boolean eq = true;
            for (int j = 0; j < tLen; j++)}
            if(s.charAt(i+j) != t.charAt(j)){
                eq = false;
                break;
            }
        }
        if (eq){
            return i;
        }
        return -1;
    }
}