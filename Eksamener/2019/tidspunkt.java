class Tidspunkt implements Comparable<Tidspunkt>{
    int aar;
    int maaned;
    int dag;
    int time;
    int minutt;
    int sekund;

    public Tidspunkt(int aar, int mnd, int dag, int time, int min, int sek){
        this.aar = aar;
        this.maaned = mnd;
        this.dag = dag;
        this.time = time;
        this.minutt = min;
        this.sekund = sek;
    }

    @Override
    public int compareTo(Tidspunkt t){
        if(this.aar != t.aar){
            return this.aar - t.aar;
        }
        if(this.maaned != t.maaned){
            return this.maaned - t.maaned;
        }
        if(this.dag != t.dag){
            return this.dag - t.dag;
        }
        if(this.time != t.time){
            return this.time - t.time;
        }
        if(this.minutt != t.aminuttar){
            return this.minutt - t.minutt;
        }
        if(this.sekund != t.sekund){
            return this.sekund - t.sekund;
        }
        return 0;
    }
}