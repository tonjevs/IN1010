class Mainnte {

    public static void main(String[] args) {

        Nte hei = new Nte(10,10000);
        for(int i = 0; i < 10; i++){
            Thread traad = new Thread(hei);
            traad.start();
        }
    }  
}
