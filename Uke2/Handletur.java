import java.util.Scanner;

class Handletur{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Hei! Velkommen til IFI-butikken");
        System.out.println("Varer: ");
        System.out.println("Broed: 20 kr\nMelk: 15 kr\nOst: 40 kr\nYoughurt: 12 kr");

        System.out.println("Hvor mange brød vil du ha? ");
        int svar1 = in.nextInt();

        System.out.println("Hvor mange melk vil du ha? ");
        int svar2 = in.nextInt();

        System.out.println("Hvor mange oster vil du ha? ");
        int svar3 = in.nextInt();

        System.out.println("Hvor mange youghurter vil du ha? ");
        int svar4 = in.nextInt();

        int totalsum = (20*svar1) + (15*svar2) + (20*svar3) + (12*svar4);
        System.out.println("Du skal betale: " + totalsum + "kr");
    }
}
