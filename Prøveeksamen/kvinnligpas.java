class Kvinnligpas extends Pasient{
    Kvinnligpas(String n,String f,int p){
        super(n,f,p);
    }

    @Override
    boolean iFaresonen(){
        return Sykehus.iFaresonenKvinne(this);
    }

    @Override
    void kanHaSykdom(){
        SykeHus.kanHaSykdomKvinne(this);
    }
    
}
