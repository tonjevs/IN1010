class Tuppel {
    int koordinat1;
    int koordinat2;
    
    public Tuppel(int koordinat1, int koordinat2){
        this.koordinat1 = koordinat1;
        this.koordinat2 = koordinat2;
    }

    @Override
    public String toString(){
        return "(" + koordinat2 + "," + koordinat1 + ")";
    }
}
