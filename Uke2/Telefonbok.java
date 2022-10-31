import java.util.HashMap;
import java.util.Scanner;

class Telefonbok{

    public static void main(String[] args){

        HashMap <String, String> telefonbok = new HashMap<>();
        telefonbok.put("Arne", "22334455");
        telefonbok.put("Lisa", "95959595");
        telefonbok.put("Jonas", "97959795");
        telefonbok.put("Peder", "12345678");

        Scanner in = new Scanner(System.in);
        
        int input = 0;
        while (input != 1){
            System.out.println("0 : Søk etter person\n1 : Avslutt");
            input = in.nextInt();

            if (input == 0){
                System.out.println("Skriv inn ett navn: ");
                String navn = in.nextLine();

                if (telefonbok.containsKey(navn)){
                    String tlf = telefonbok.get(navn);
                    System.out.println("Navn: " + navn + "\nTlf: " + tlf);
                }
                 else{
                    System.out.println("Kunne ikke finne navnet i systemet...");
                }

            }
        }
            System.out.println("Oversikt: ");
            for (String navnekey : telefonbok.keySet()){
                System.out.println("Navn: " + navnekey + "\nTlf: " +
                telefonbok.get(navnekey));
            }
    }
}
