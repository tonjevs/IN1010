public class TestKatteSortering {
    public static void main(String[] args){
        SortertArrayList<Katter> katter = new SortertArrayList<>();
        katter.settInn(new Katter("Morten", 5));
        katter.settInn(new Katter("Karoline", 3));
        katter.settInn(new Katter("Adam", 1));
        katter.settInn(new Katter("Suzi", 10));

        for (int i = 0; i < 4; i++){
            System.out.println(katter.hentUtForste());
        }
    }
    
}
