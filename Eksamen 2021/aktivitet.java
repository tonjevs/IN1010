abstract class Aktivitet implements Comparable<Aktivitet>{
    public Aktivitet neste;
    public Aktivitet forrige;
    public int tid = 0; 

    abstract void handling();

    @Override
    public int compareTo(Aktivitet a){
        if(tid != a.tid){
            return tid - a.tid;
        }
        return 0;
    }
}   
