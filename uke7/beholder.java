class TestBeholder<T> extends Beholder<T>{
    public static void main(String[] args){
    int i = 3;
    sett(i);
    hentUt();
    int a = 9;
    sett(a);
    hentUt();
    }
}

class Beholder <T extends Comparable<T>> {
    T mittElement;

    public T sett(T ny){
        if (mittElement == null){
            mittElement = ny;
            return null;
        }
        else if(ny.compareTo(mittElement) >= 0){
            T temp = mittElement;
            mittElement = ny;
            return temp;
        }
        else{
            return null;
        }

    }
    public T hentUt(){
        return mittElement;
    }

}
