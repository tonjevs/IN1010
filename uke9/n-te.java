class Nte implements Runnable{
    
    int nte;
    int maks;

    Nte(int nte, int maks){
        this.nte = nte;
        this.maks = maks;
    }
    
    public void run(){
        
        for(int teller = 0; teller <= maks; teller+=nte){
            System.out.println(teller);
        }
    }
}
