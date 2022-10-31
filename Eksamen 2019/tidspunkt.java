class Tidspunk implements Comparable<Tidspunkt> {
    int aar;
    int maaned;
    int dag;
    int time;
    int minutt;
    int sekund;

    Tidspunk(int a, int mnd, int d, int t, int min, int sek){
        this.aar = a;
        this.maaned = mnd;
        this.dag = d;
        this.time = t;
        this.minutt = min;
        this.sekund = sek;
    }
    int compareTo(Tidspunk t){
        if(this.aar < t.aar) return this.aar - t.aar;
        if(this.maaned < t.maanes) return this.maaned - t.maaned;
        if(this.dag < t.dag) return this.dag - t.dag;
        if(this.time < t.time) return this.time - t.time;
        if(this.minutt < t.minutt) return this.minutt - t.minutt;
        if(this.sekund < t.sekund) return this.sekund - t.sekund;
        return 0;
        

    }
}