class Mannligpas extends Pasient{

    Mannligpas(String n,String f,int p){
        super(n,f,p);
    }
    @Override
    boolean iFaresonen(){
        return Sykehus.iFaresonenMann(this);
    }
    @Override
    void kanHaSykdom(){
        SykeHus.kanHaSykdomMann(this);
    }
}
