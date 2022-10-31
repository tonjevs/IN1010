class Bil{
    int regNr;
    int seter;

    Bil(int regNr, int seter){
        this.regNr = regNr;
        this.seter = seter;
    }
}

class Motorsykkel{
    int regNr;
    int motorStr;

    Motorsykkel(int regNr, int motorStr){
        this.regNr = regNr;
        this.motorStr = motorStr;
    }
}

class Parkeringsplass <P> {
    private P kjoretoy;

    void parker(P kjoretoy){
        this.kjoretoy = kjoretoy;
    }
    P kjørUt(P kjoretoy){
        P tmp = this.kjoretoy;
        this.kjoretoy = null;
        return tmp;
    }
}
class Parkeringshus{
    static Parkeringsplass[] etasje1 = new Parkeringsplass[10];
    static Parkeringsplass[] etasje2 = new Parkeringsplass[10];

    public static void main(String[] args){

    Bil bil1 = new Bil(12321,5);
    Bil bil2 = new Bil(12321,5);
    Bil bil3 = new Bil(33321,2);
    Motorsykkel mot1 = new Motorsykkel(12345,50);
    Motorsykkel mot2 = new Motorsykkel(99898,100);
    Motorsykkel mot2 = new Motorsykkel(66473,299);

    etasje1[0] = new Parkeringsplass();
    etasje1[0].parker(bil1);

    etasje2[1] = new Parkeringsplass();
    etasje2[1].parker(mot1);

    etasje1[4] = new Parkeringsplass();
    etasje1[4].parker(bil2);

    etasje2[0] = new Parkeringsplass();
    etasje2[0].parker(mot2);

    etasje2[0].kjørUt(mot1);
    etasje2[0].kjørUt(mot2);

    for (int i = 0; i < 10; i++){
        if(etasje1[i] != null){
            etasje1[i].kjørUt();
            etasje1[i] = null;
        }
        if(etasje2[i] != null){
            etasje2[i].kjørUt();
            etasje2[i] = null;
        }
      }
    }
}
