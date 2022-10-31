class Katter implements Comparable<Katter> {
    private String navn;
    private int alder;

    public Katter(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }

    public String toString(){
        return "Navn: " + navn + "\nAlder: " + alder;
    }

    @Override
    public int compareTo(Katter x){
        if (x.alder > this.alder){
            return -1;
        }

        else if (x.alder < this.alder){
            return 1;
        }

        else {
            return 0;
        }
    }
}
