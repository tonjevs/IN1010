import java.util.Scanner;

class MindreStorre{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int tall_inn;
        System.out.println("Tast inn et tall: ");
        tall_inn = in.nextInt();
        if (tall_inn < 10){
            System.out.println("Tallet er under 10");
        }
        else if(tall_inn >= 10 && tall_inn <= 20){
            System.out.println("Tallet er mellom 10 og 20");
        }
        else{
            System.out.println("Tallet er over 20");
        }

        }

}
