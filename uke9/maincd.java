import java.util.*;
import java.io.*;

class Maincd {
    
    public static void main(String[] args) {
        ArrayList<CDAlbum> albumliste = new ArrayList<>();
        lesFraFil(args[0], albumliste);

        for (CDAlbum sang : albumliste) {
            System.out.println(sang);
        }

    }

    public static void lesFraFil(String filnavn, ArrayList<CDAlbum> albumliste){
        try{
            Scanner scan = new Scanner(new File(filnavn));
        
            while(scan.hasNextLine()){
                String linje = scan.nextLine();
                String[] arr = linje.trim().split(",");
                CDAlbum nyArtist = new CDAlbum(arr[0],arr[1],Integer.parseInt(arr[2]));
            
                boolean sattInn = false;
                int teller = 0;
    
                while (teller < albumliste.size() && !sattInn) {
                    if (nyArtist.compareTo(albumliste.get(teller)) < 0) {
                        albumliste.add(teller, nyArtist);
                        sattInn = true;
                    }
                    teller++;
                }
    
                if (!sattInn) {
                    albumliste.add(nyArtist);
                }
            }
                
        }
        catch(FileNotFoundException e){
            System.out.println("Fant ikke filen...");
        }
    }
}

