import java.util.Random;

class Trekk{
    static int trekkInt(int min, int max){
        int tall = (int)Math.floor(Math.random()*(max-min+1)+min);
        return tall;
    }
}