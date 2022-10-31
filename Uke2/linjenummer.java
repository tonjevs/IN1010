import java.io.File;
import java.util.Scanner;

class linjeLeser{

    public static void main(String[] args)throws Exception{

        Scanner fil = new Scanner(new File("mary.txt"));
        int teller = 0;

        while (fil.hasNextLine()){
            String yas = fil.nextLine();
            teller++;
            System.out.println("# " + teller + ":" + yas);

        }
    }
}
