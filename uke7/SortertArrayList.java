import java.util.ArrayList;

class SortertArrayList<T extends Comparable<T>>{
    ArrayList<T> arr = new ArrayList<>(); 
    void settInn(T data){
        for (int i = 0; i < arr.size();i++){
            if(arr.get(i).compareTo(data) > 0){
                arr.add(i, data);
                return;
            }
        }
        arr.add(data);
    }
    T hentUtForste(){
        T fjernet = arr.get(0);
        arr.remove(0);
        return fjernet;
    }
    
}
