import java.util.Scanner;

class HeiVerden{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Hva heter du? ");
        String navn = in.nextLine();
        System.out.println("Hei " + navn + "Velkommen til IN1010");
    }
}
