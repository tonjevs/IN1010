import java.util.Scanner;

class Differanse{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Oppgi verdien til x: ");
        x = in.nextInt();

        System.out.print("Oppgi verdien til y: ");
        y = in.nextInt();

        if (x > y){
            System.out.println("differansen mellom x og y er " + (x-y));
        }
        else{
            System.out.println("Differansen mellom x og y er " + (y-x));
        }
    }
}
