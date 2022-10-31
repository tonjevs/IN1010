import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        String monster = args[0];
        alleFlygninger();
        MistenkligePersoner mistenkelig = new MistenkligePersoner();
        Iterator<Flygninger> flyIterator = alleFlygninger();

        while(flyIterator.hasNext()){
            Flygninger fly = flyIterator.next();
            Forstelinjevokter forste = new Forstelinjevokter(fly, monster, mistenkelig);
            Thread traad = new Thread(forste);
            traad.start();  
        }

        for(int i = 0; i < 100; i++){
            Andrelinjevokter andre = new Andrelinjevokter(mistenkelig);
            Thread traad2 = new Thread(andre);
            traad2.start();
        }
    }
    void mistenkelig(){
        return;
    }
    static Flygninger alleFlygninger(){
        return null;
    }
}
