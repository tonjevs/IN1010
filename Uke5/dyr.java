interface Rovdyr{
    public void Jakte();
}

interface Planteeter{
    public void Beskytt();
}

class Dyr{
    public static void main(String[] args){
        Rovdyr[] rovdyrliste = new Rovdyr[2];
        rovdyrliste[0] = new Bjorn();
        rovdyrliste[1] = new Ulv();

        Planteeter[] planteeterliste = new Planteeter[2];
        planteeterliste[0] = new Elg();
        planteeterliste[1] = new Sau();

        rovdyrliste[0].Jakte();
        rovdyrliste[1].Jakte();
        planteeterliste[0].Beskytt();
        planteeterliste[1].Beskytt();
    }
}

class Bjorn implements Rovdyr{
    public void Bjorn(){
        System.out.println("Bjørn");
    }
    public void Jakte(){
        System.out.println("Jeg jakter");
    }
}
class Ulv implements Rovdyr{
    public void Bjorn(){
        System.out.println("Ulv");
    }
    public void Jakte(){
        System.out.println("Jeg jakter");
    }
}
class Elg implements Planteeter{
    public void Bjorn(){
        System.out.println("Elg");
    }
    public void Beskytt(){
        System.out.println("Jeg beskytter meg");
    }
}
class Sau implements Planteeter{
    public void Bjorn(){
        System.out.println("Sau");
    }
    public void Beskytt(){
        System.out.println("Jeg beskytter meg");
    }
}
