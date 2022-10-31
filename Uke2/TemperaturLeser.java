import java.util.Scanner;
import java.io.File;

class TemperaturLeser{

    public static void main(String[] args) throws Exception{

        Scanner fil = new Scanner(new File("temp.txt"));
        String[] temperaturer = new String[12];

        int index = 0;
        while (fil.hasNextInt()){
            temperaturer[index] = fil.nextLine();
            index++;

        for (i = 0;i<temperaturer.length;i++){
            System.out.println(temperaturer[i]);
        }
        }
    }
}
