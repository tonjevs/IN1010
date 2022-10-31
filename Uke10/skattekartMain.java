import java.io.*;
import java.util.Scanner;

class SkattekartMain {
    
    public static void main(String[] args) {
        Skattekart skattekart = null;
        try{
            File fil = new File(args[0]);
            skattekart = Skattekart.lesInn(fil);
        }
        catch(FileNotFoundException e){
            System.out.println("Kunne ikke finne filen...");
        }
        skattekart.skrivUt();
        Scanner brukerinput = new Scanner(System.in);
        System.out.println("\n For aa finne skatten tast inn koordinater paa format\n (kol rad) a for aa avslutte");
        String inn = brukerinput.nextLine();

        int antForsoek = 0;

        while (!inn.equals("a")){
            String[] l = inn.split("");

            try{
                int kol = Integer.parseInt(l[0]);
                int rad = Integer.parseInt(l[1]);
                
                if (skattekart.sjekk(rad, kol)){
                    System.out.println("Du fant skatten!");
                    inn = "a";
                }
                else{
                    antForsoek++;
                    System.out.println("Du fant dessverre ingen skatt. Proev paa nytt");
                    inn = brukerinput.nextLine();
                }
                skattekart.skrivUt();
            }
            catch (NumberFormatException e){
                System.out.println("Ugyldige koordinater");
            }
        }
    }
}
