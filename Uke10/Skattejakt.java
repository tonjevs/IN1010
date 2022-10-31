import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Skattekart {
    private char[][] kart;
    private boolean funnet = false;
    private int hoyde;
    private int bredde;
    
    private Skattekart(char[][] kart, int hoyde, int bredde){
        this.kart = kart;
        this.hoyde = hoyde;
        this.bredde = bredde;
    }

    static Skattekart lesInn(File fil) throws FileNotFoundException{
        Scanner in;
        try{
            in = new Scanner(fil);
        }
        catch(FileNotFoundException e){
            throw new FileNotFoundException();
        }
        
        String[] arr = in.nextLine().split(" ");
        int antR = Integer.parseInt(arr[0]);
        int antK = Integer.parseInt(arr[0]);

        char[][] kart = new char[antR][antK];
        
        for (int rad = 0; rad < antR; rad++){
            String linje = in.nextLine();
            for (int kol = 0; kol < antK; kol++){
                kart[rad][kol] = linje.charAt(kol);

            }
        }
        return new Skattekart(kart, antR, antK);
        
    }
    public void skrivUt(){
        for (int i = 0; i < kart.length; i++){
            for (int j = 0; j < kart[i].length; j++){
                if (funnet){
                    System.out.println(kart[i][j]);
                }
                else{
                    System.out.println("X");
                }
            }
            System.out.println();
        }
    }
    
    public boolean sjekk(int rad, int kol){
        if (kart[rad][kol] == 'X'){
            funnet = true;
        }
        return funnet;
    }
}
