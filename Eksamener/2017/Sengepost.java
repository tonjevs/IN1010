class Sengepost extends Avdeling{
    int senger;
    PasientAdm denne;

    Sengepost(int senger){
        super();
        this.senger = senger;
        denne = new PasientTabell(senger);
    }
}
