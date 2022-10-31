public class Binaer {
    static void skrivUtBinaer(int n){
        if (n == 0){
            System.out.println(null);
        }else{
            if (n > 1){
                skrivUtBinaer(n/2);
            }
            System.out.println(n%2);
        }
    }   
}
