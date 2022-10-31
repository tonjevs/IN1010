class Sete{
    Passasher passasjer = null;
    char plass;

    Sete(char pl, Passasjer p){
        this.passasjer = p;
        this.plass = pl;

    }
    boolean erVindussete(){
        if(this.plass == 'A' || this.plass == 'F'){
            return true;
        }
        return false;
    }

}
class GodBenplassSete extends Sete{

    GodBenplassSete(char pl, Passasjer p){
        super(pl,p);
    }
}

class MidtgangSetet extends Sete implements MidtgangSete{
    MidtgangSetet(char pl, Passasjer p){
        super(pl,p);
        this.passasjer = p;
        this.plass = pl;
    }
    public boolean erVedMidtgang(){
        return true;
    }
}
