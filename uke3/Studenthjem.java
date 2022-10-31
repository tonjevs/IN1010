import java.util.Scanner;
import java.io.File;
import java.util.HashMap;

class Studenthjem{
    public static void main(String[] args){
        HashMap<Fag> fagliste = new HashMap<>();
        HashMap<Student> studentliste = new HashMap<>();


        public lesFraFil(String filnavn){
            Scanner fil = new Scanner(new File(filnavn));

            while (fil.hasNextLine()){
                String linje = fil.nextLine();

                if (linje.contains('*')){
                  Fag fag = new Fag(linje);
                  fagliste.add(Fag(linje));

                else{
                    Student nyStud = new Student(linje);
                    studentliste.add(nyStud)
                }
                nyStud.leggtilFag(fag)
                fag.leggTilStudent(nyStud);
                }
            }
        }
    }
}
