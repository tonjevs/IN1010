class Oppover implements Runnable{
    private Monitor monitor;
    private int tall;
    private boolean minMindreEnnStorst = true;

    public Oppover(Monitor monitor){
        this.monitor = monitor;
        tall = Integer.MIN_VALUE;
    }

    public void run(){
        while(monitor.settStorste(tall) == true){
            tall++;
        }
        System.out.println("STOPP! Tallet er ikke lenger storst: " + tall);
    }
}

class Nedover implements Runnable{
    private Monitor monitor;
    private int tall;
    private boolean minMindreEnnStorst = true;

    public Nedover(Monitor monitor){
        this.monitor = monitor;
        tall = Integer.MAX_VALUE;
    }

    public void run(){
        while(monitor.settMinste(tall) == true){
            tall--;
        }
        System.out.println("STOPP! Tallet er ikke lenger minst: " + tall);
    }
}

class TestTallmonitor{
    public static void main(String[] args) {
        Monitor tm = new Monitor();
        Thread traad1 = new Thread(new Nedover(tm));
        Thread traad2 = new Thread(new Oppover(tm));
        traad1.start();
        traad2.start();
    }
}

